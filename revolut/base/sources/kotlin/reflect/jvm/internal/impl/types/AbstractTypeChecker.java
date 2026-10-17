package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes14.dex */
public final class AbstractTypeChecker {

    @NotNull
    public static final AbstractTypeChecker INSTANCE = new AbstractTypeChecker();
    public static boolean RUN_SLOW_ASSERTIONS;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypeVariance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypeVariance.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean a(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        KotlinTypeMarker type;
        RigidTypeMarker rigidTypeMarkerUpperBoundIfFlexible;
        return TypeSystemContextContextualKt.isIntegerLiteralType(typeSystemContext, rigidTypeMarker) || ((rigidTypeMarker instanceof CapturedTypeMarker) && (type = TypeSystemContextContextualKt.getType(typeSystemContext, TypeSystemContextContextualKt.projection(typeSystemContext, TypeSystemContextContextualKt.typeConstructor(typeSystemContext, (CapturedTypeMarker) rigidTypeMarker)))) != null && (rigidTypeMarkerUpperBoundIfFlexible = TypeSystemContextContextualKt.upperBoundIfFlexible(typeSystemContext, type)) != null && TypeSystemContextContextualKt.isIntegerLiteralType(typeSystemContext, rigidTypeMarkerUpperBoundIfFlexible));
    }

    public static final boolean b(TypeSystemContext typeSystemContext, TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2, boolean z) {
        TypeCheckerState typeCheckerState2;
        RigidTypeMarker rigidTypeMarker3;
        Collection<KotlinTypeMarker> collectionPossibleIntegerTypes = TypeSystemContextContextualKt.possibleIntegerTypes(typeSystemContext, rigidTypeMarker);
        if ((collectionPossibleIntegerTypes instanceof Collection) && collectionPossibleIntegerTypes.isEmpty()) {
            return false;
        }
        for (KotlinTypeMarker kotlinTypeMarker : collectionPossibleIntegerTypes) {
            if (Intrinsics.f(TypeSystemContextContextualKt.typeConstructor(typeSystemContext, kotlinTypeMarker), TypeSystemContextContextualKt.typeConstructor(typeSystemContext, rigidTypeMarker2))) {
                return true;
            }
            if (z) {
                typeCheckerState2 = typeCheckerState;
                rigidTypeMarker3 = rigidTypeMarker2;
                if (isSubtypeOf$default(INSTANCE, typeCheckerState2, rigidTypeMarker3, kotlinTypeMarker, false, 8, null)) {
                    return true;
                }
            } else {
                typeCheckerState2 = typeCheckerState;
                rigidTypeMarker3 = rigidTypeMarker2;
            }
            typeCheckerState = typeCheckerState2;
            rigidTypeMarker2 = rigidTypeMarker3;
        }
        return false;
    }

    public static List c(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicySubstitutionSupertypePolicy;
        List<SimpleTypeMarker> listFastCorrespondingSupertypes = TypeSystemContextContextualKt.fastCorrespondingSupertypes(typeSystemContext, rigidTypeMarker, typeConstructorMarker);
        if (listFastCorrespondingSupertypes != null) {
            return listFastCorrespondingSupertypes;
        }
        if (!TypeSystemContextContextualKt.isClassTypeConstructor(typeSystemContext, typeConstructorMarker) && TypeSystemContextContextualKt.isClassType(typeSystemContext, rigidTypeMarker)) {
            return f0.f322471a;
        }
        if (TypeSystemContextContextualKt.isCommonFinalClassConstructor(typeSystemContext, typeConstructorMarker)) {
            if (!typeSystemContext.areEqualTypeConstructors(TypeSystemContextContextualKt.typeConstructor(typeSystemContext, rigidTypeMarker), typeConstructorMarker)) {
                return f0.f322471a;
            }
            RigidTypeMarker rigidTypeMarkerCaptureFromArguments = typeSystemContext.captureFromArguments(rigidTypeMarker, CaptureStatus.FOR_SUBTYPING);
            if (rigidTypeMarkerCaptureFromArguments != null) {
                rigidTypeMarker = rigidTypeMarkerCaptureFromArguments;
            }
            return u.c(rigidTypeMarker);
        }
        SmartList smartList = new SmartList();
        typeCheckerState.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        Intrinsics.h(supertypesDeque);
        Set<RigidTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        Intrinsics.h(supertypesSet);
        supertypesDeque.push(rigidTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
            Intrinsics.h(rigidTypeMarkerPop);
            if (supertypesSet.add(rigidTypeMarkerPop)) {
                RigidTypeMarker rigidTypeMarkerCaptureFromArguments2 = typeSystemContext.captureFromArguments(rigidTypeMarkerPop, CaptureStatus.FOR_SUBTYPING);
                if (rigidTypeMarkerCaptureFromArguments2 == null) {
                    rigidTypeMarkerCaptureFromArguments2 = rigidTypeMarkerPop;
                }
                if (typeSystemContext.areEqualTypeConstructors(TypeSystemContextContextualKt.typeConstructor(typeSystemContext, rigidTypeMarkerCaptureFromArguments2), typeConstructorMarker)) {
                    smartList.add(rigidTypeMarkerCaptureFromArguments2);
                    supertypesPolicySubstitutionSupertypePolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    supertypesPolicySubstitutionSupertypePolicy = TypeSystemContextContextualKt.argumentsCount(typeSystemContext, rigidTypeMarkerCaptureFromArguments2) == 0 ? TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE : typeCheckerState.getTypeSystemContext().substitutionSupertypePolicy(rigidTypeMarkerCaptureFromArguments2);
                }
                if (Intrinsics.f(supertypesPolicySubstitutionSupertypePolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicySubstitutionSupertypePolicy = null;
                }
                if (supertypesPolicySubstitutionSupertypePolicy != null) {
                    TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it8 = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(rigidTypeMarkerPop)).iterator();
                    while (it8.hasNext()) {
                        supertypesDeque.add(supertypesPolicySubstitutionSupertypePolicy.mo3797transformType(typeCheckerState, it8.next()));
                    }
                }
            }
        }
        typeCheckerState.clear();
        return smartList;
    }

    public static List d(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        int i;
        List listC = c(typeCheckerState, typeSystemContext, rigidTypeMarker, typeConstructorMarker);
        if (listC.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listC) {
                TypeArgumentListMarker typeArgumentListMarkerAsArgumentList = TypeSystemContextContextualKt.asArgumentList(typeSystemContext, (RigidTypeMarker) obj2);
                int size = typeSystemContext.size(typeArgumentListMarkerAsArgumentList);
                while (true) {
                    if (i >= size) {
                        arrayList.add(obj2);
                        break;
                    }
                    KotlinTypeMarker type = TypeSystemContextContextualKt.getType(typeSystemContext, typeSystemContext.get(typeArgumentListMarkerAsArgumentList, i));
                    i = (type != null ? TypeSystemContextContextualKt.asFlexibleType(typeSystemContext, type) : null) == null ? i + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getParameter(r6, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(r6, r7), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker f(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext r6, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r7, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r8) {
        /*
            int r0 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.argumentsCount(r6, r7)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L5e
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker r4 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getArgument(r6, r7, r2)
            boolean r5 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isStarProjection(r6, r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L5b
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r3 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getType(r6, r3)
            if (r3 != 0) goto L1d
            goto L5b
        L1d:
            kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker r4 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.lowerBoundIfFlexible(r6, r3)
            boolean r4 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isCapturedType(r6, r4)
            if (r4 == 0) goto L33
            kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker r4 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.lowerBoundIfFlexible(r6, r8)
            boolean r4 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isCapturedType(r6, r4)
            if (r4 == 0) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = r1
        L34:
            boolean r5 = r3.equals(r8)
            if (r5 != 0) goto L52
            if (r4 == 0) goto L4b
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r4 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(r6, r3)
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r5 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(r6, r8)
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r5)
            if (r4 == 0) goto L4b
            goto L52
        L4b:
            kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker r3 = f(r6, r3, r8)
            if (r3 == 0) goto L5b
            return r3
        L52:
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r7 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(r6, r7)
            kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker r6 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getParameter(r6, r7, r2)
            return r6
        L5b:
            int r2 = r2 + 1
            goto L6
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.f(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker):kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker");
    }

    public static boolean g(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
        return (!TypeSystemContextContextualKt.isDenotable(typeSystemContext, TypeSystemContextContextualKt.typeConstructor(typeSystemContext, kotlinTypeMarker)) || TypeSystemContextContextualKt.isDynamic(typeSystemContext, kotlinTypeMarker) || TypeSystemContextContextualKt.isDefinitelyNotNullType(typeSystemContext, kotlinTypeMarker) || TypeSystemContextContextualKt.isNotNullTypeParameter(typeSystemContext, kotlinTypeMarker) || TypeSystemContextContextualKt.isFlexibleWithDifferentTypeConstructors(typeSystemContext, kotlinTypeMarker)) ? false : true;
    }

    public static boolean h(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, TypeConstructorMarker typeConstructorMarker) {
        TypeParameterMarker typeParameter;
        RigidTypeMarker rigidTypeMarkerAsRigidType = TypeSystemContextContextualKt.asRigidType(typeSystemContext, kotlinTypeMarker);
        if (!(rigidTypeMarkerAsRigidType instanceof CapturedTypeMarker)) {
            return false;
        }
        CapturedTypeMarker capturedTypeMarker = (CapturedTypeMarker) rigidTypeMarkerAsRigidType;
        if (TypeSystemContextContextualKt.isOldCapturedType(typeSystemContext, capturedTypeMarker) || !TypeSystemContextContextualKt.isStarProjection(typeSystemContext, TypeSystemContextContextualKt.projection(typeSystemContext, TypeSystemContextContextualKt.typeConstructor(typeSystemContext, capturedTypeMarker))) || TypeSystemContextContextualKt.captureStatus(typeSystemContext, capturedTypeMarker) != CaptureStatus.FOR_SUBTYPING) {
            return false;
        }
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = TypeSystemContextContextualKt.typeConstructor(typeSystemContext, kotlinTypeMarker2);
        TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker = typeConstructorMarkerTypeConstructor instanceof TypeVariableTypeConstructorMarker ? (TypeVariableTypeConstructorMarker) typeConstructorMarkerTypeConstructor : null;
        return (typeVariableTypeConstructorMarker == null || (typeParameter = TypeSystemContextContextualKt.getTypeParameter(typeSystemContext, typeVariableTypeConstructorMarker)) == null || !TypeSystemContextContextualKt.hasRecursiveBounds(typeSystemContext, typeParameter, typeConstructorMarker)) ? false : true;
    }

    public static /* synthetic */ boolean isSubtypeOf$default(AbstractTypeChecker abstractTypeChecker, TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        return abstractTypeChecker.isSubtypeOf(typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a5 A[EDGE_INSN: B:297:0x02a5->B:166:0x02a5 BREAK  A[LOOP:6: B:157:0x0286->B:298:0x0286]] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a4  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.Collection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r19, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext r20, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r21, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 1227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.e(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker, boolean):boolean");
    }

    public final TypeVariance effectiveVariance(@NotNull TypeVariance declared, @NotNull TypeVariance useSite) {
        Intrinsics.checkNotNullParameter(declared, "declared");
        Intrinsics.checkNotNullParameter(useSite, "useSite");
        TypeVariance typeVariance = TypeVariance.INV;
        if (declared == typeVariance) {
            return useSite;
        }
        if (useSite == typeVariance || declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean equalTypes(@NotNull TypeCheckerState state, @NotNull KotlinTypeMarker a7, @NotNull KotlinTypeMarker b4) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        if (a7 == b4) {
            return true;
        }
        AbstractTypeChecker abstractTypeChecker = INSTANCE;
        abstractTypeChecker.getClass();
        if (g(typeSystemContext, a7) && g(typeSystemContext, b4)) {
            KotlinTypeMarker kotlinTypeMarkerPrepareType = state.prepareType(state.refineType(a7));
            KotlinTypeMarker kotlinTypeMarkerPrepareType2 = state.prepareType(state.refineType(b4));
            RigidTypeMarker rigidTypeMarkerLowerBoundIfFlexible = typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType);
            if (!typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(kotlinTypeMarkerPrepareType), typeSystemContext.typeConstructor(kotlinTypeMarkerPrepareType2))) {
                return false;
            }
            if (typeSystemContext.argumentsCount(rigidTypeMarkerLowerBoundIfFlexible) == 0) {
                return typeSystemContext.hasFlexibleNullability(kotlinTypeMarkerPrepareType) || typeSystemContext.hasFlexibleNullability(kotlinTypeMarkerPrepareType2) || typeSystemContext.isMarkedNullable(rigidTypeMarkerLowerBoundIfFlexible) == typeSystemContext.isMarkedNullable(typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType2));
            }
        }
        return isSubtypeOf$default(abstractTypeChecker, state, a7, b4, false, 8, null) && isSubtypeOf$default(abstractTypeChecker, state, b4, a7, false, 8, null);
    }

    @NotNull
    public final List<RigidTypeMarker> findCorrespondingSupertypes(@NotNull TypeCheckerState state, @NotNull RigidTypeMarker subType, @NotNull TypeConstructorMarker superConstructor) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superConstructor, "superConstructor");
        return INSTANCE.findCorrespondingSupertypes(state, state.getTypeSystemContext(), subType, superConstructor);
    }

    public final boolean isSubtypeForSameConstructor(@NotNull TypeCheckerState typeCheckerState, @NotNull TypeSystemContext c2, @NotNull TypeArgumentListMarker capturedSubArguments, @NotNull RigidTypeMarker superType) {
        boolean zEqualTypes;
        TypeCheckerState state = typeCheckerState;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(capturedSubArguments, "capturedSubArguments");
        Intrinsics.checkNotNullParameter(superType, "superType");
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = TypeSystemContextContextualKt.typeConstructor(c2, superType);
        int size = TypeSystemContextContextualKt.size(c2, capturedSubArguments);
        int iParametersCount = TypeSystemContextContextualKt.parametersCount(c2, typeConstructorMarkerTypeConstructor);
        if (size == iParametersCount && size == TypeSystemContextContextualKt.argumentsCount(c2, superType)) {
            for (int i = 0; i < iParametersCount; i++) {
                TypeArgumentMarker argument = TypeSystemContextContextualKt.getArgument(c2, superType, i);
                KotlinTypeMarker type = TypeSystemContextContextualKt.getType(c2, argument);
                if (type != null) {
                    TypeArgumentMarker typeArgumentMarker = TypeSystemContextContextualKt.get(c2, capturedSubArguments, i);
                    TypeSystemContextContextualKt.getVariance(c2, typeArgumentMarker);
                    TypeVariance typeVariance = TypeVariance.INV;
                    KotlinTypeMarker type2 = TypeSystemContextContextualKt.getType(c2, typeArgumentMarker);
                    Intrinsics.h(type2);
                    TypeVariance typeVarianceEffectiveVariance = effectiveVariance(TypeSystemContextContextualKt.getVariance(c2, TypeSystemContextContextualKt.getParameter(c2, typeConstructorMarkerTypeConstructor, i)), TypeSystemContextContextualKt.getVariance(c2, argument));
                    if (typeVarianceEffectiveVariance == null) {
                        return state.isErrorTypeEqualsToAnything();
                    }
                    if (typeVarianceEffectiveVariance != typeVariance || (!h(c2, type2, type, typeConstructorMarkerTypeConstructor) && !h(c2, type, type2, typeConstructorMarkerTypeConstructor))) {
                        if (state.f187803h > 100) {
                            throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + type2).toString());
                        }
                        state.f187803h++;
                        int i2 = WhenMappings.$EnumSwitchMapping$0[typeVarianceEffectiveVariance.ordinal()];
                        if (i2 == 1) {
                            zEqualTypes = INSTANCE.equalTypes(state, type2, type);
                        } else if (i2 == 2) {
                            state = typeCheckerState;
                            zEqualTypes = isSubtypeOf$default(INSTANCE, state, type2, type, false, 8, null);
                        } else {
                            if (i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            zEqualTypes = isSubtypeOf$default(INSTANCE, state, type, type2, false, 8, null);
                            state = typeCheckerState;
                        }
                        state.f187803h--;
                        if (!zEqualTypes) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean isSubtypeOf(@NotNull TypeCheckerState state, @NotNull KotlinTypeMarker subType, @NotNull KotlinTypeMarker superType) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return isSubtypeOf$default(this, state, subType, superType, false, 8, null);
    }

    public final boolean isSubtypeOf(@NotNull TypeCheckerState state, @NotNull KotlinTypeMarker subType, @NotNull KotlinTypeMarker superType, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (!state.customIsSubtypeOf(subType, superType)) {
            return false;
        }
        return INSTANCE.e(state, state.getTypeSystemContext(), subType, superType, z);
    }

    @NotNull
    public final List<RigidTypeMarker> findCorrespondingSupertypes(@NotNull TypeCheckerState state, @NotNull TypeSystemContext c2, @NotNull RigidTypeMarker subType, @NotNull TypeConstructorMarker superConstructor) {
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superConstructor, "superConstructor");
        if (TypeSystemContextContextualKt.isClassType(c2, subType)) {
            return d(state, c2, subType, superConstructor);
        }
        if (!TypeSystemContextContextualKt.isClassTypeConstructor(c2, superConstructor) && !TypeSystemContextContextualKt.isIntegerLiteralTypeConstructor(c2, superConstructor)) {
            return c(state, c2, subType, superConstructor);
        }
        SmartList<RigidTypeMarker> smartList = new SmartList();
        state.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = state.getSupertypesDeque();
        Intrinsics.h(supertypesDeque);
        Set<RigidTypeMarker> supertypesSet = state.getSupertypesSet();
        Intrinsics.h(supertypesSet);
        supertypesDeque.push(subType);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
            Intrinsics.h(rigidTypeMarkerPop);
            if (supertypesSet.add(rigidTypeMarkerPop)) {
                if (TypeSystemContextContextualKt.isClassType(c2, rigidTypeMarkerPop)) {
                    smartList.add(rigidTypeMarkerPop);
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                }
                if (Intrinsics.f(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy != null) {
                    TypeSystemContext typeSystemContext = state.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it8 = typeSystemContext.supertypes(typeSystemContext.typeConstructor(rigidTypeMarkerPop)).iterator();
                    while (it8.hasNext()) {
                        supertypesDeque.add(supertypesPolicy.mo3797transformType(state, it8.next()));
                    }
                }
            }
        }
        state.clear();
        ArrayList arrayList = new ArrayList();
        for (RigidTypeMarker rigidTypeMarker : smartList) {
            AbstractTypeChecker abstractTypeChecker = INSTANCE;
            Intrinsics.h(rigidTypeMarker);
            abstractTypeChecker.getClass();
            a0.x(d(state, c2, rigidTypeMarker, superConstructor), arrayList);
        }
        return arrayList;
    }
}
