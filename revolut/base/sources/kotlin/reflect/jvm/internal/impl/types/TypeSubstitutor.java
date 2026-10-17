package kotlin.reflect.jvm.internal.impl.types;

import gkm.k;
import gkm.l;
import gkm.m;
import gkm.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class TypeSubstitutor implements TypeSubstitutorMarker {
    public static final TypeSubstitutor EMPTY = create(TypeSubstitution.EMPTY);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeSubstitution f187816a;

    public TypeSubstitutor(TypeSubstitution typeSubstitution) {
        if (typeSubstitution != null) {
            this.f187816a = typeSubstitution;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.a(int):void");
    }

    public static n b(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        return (variance == variance3 && variance2 == Variance.OUT_VARIANCE) ? n.OUT_IN_IN_POSITION : (variance == Variance.OUT_VARIANCE && variance2 == variance3) ? n.IN_IN_OUT_POSITION : n.NO_CONFLICT;
    }

    public static String c(Object obj2) {
        try {
            return obj2.toString();
        } catch (Throwable th10) {
            if (ExceptionUtilsKt.isProcessCanceledException(th10)) {
                throw th10;
            }
            return "[Exception while computing toString(): " + th10 + "]";
        }
    }

    @NotNull
    public static Variance combine(@NotNull Variance variance, @NotNull TypeProjection typeProjection) {
        if (variance == null) {
            a(35);
            throw null;
        }
        if (typeProjection == null) {
            a(36);
            throw null;
        }
        if (!typeProjection.isStarProjection()) {
            return combine(variance, typeProjection.getProjectionKind());
        }
        Variance variance2 = Variance.OUT_VARIANCE;
        if (variance2 != null) {
            return variance2;
        }
        a(37);
        throw null;
    }

    @NotNull
    public static TypeSubstitutor create(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution != null) {
            return new TypeSubstitutor(typeSubstitution);
        }
        a(0);
        throw null;
    }

    @NotNull
    public static TypeSubstitutor createChainedSubstitutor(@NotNull TypeSubstitution typeSubstitution, @NotNull TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            a(3);
            throw null;
        }
        if (typeSubstitution2 != null) {
            return create(DisjointKeysUnionTypeSubstitution.create(typeSubstitution, typeSubstitution2));
        }
        a(4);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final TypeProjection d(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor, int i) throws m {
        if (typeProjection == null) {
            a(18);
            throw null;
        }
        TypeSubstitution typeSubstitution = this.f187816a;
        if (i > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + c(typeProjection) + "; substitution: " + c(typeSubstitution));
        }
        if (!typeProjection.isStarProjection()) {
            KotlinType type = typeProjection.getType();
            if (type instanceof TypeWithEnhancement) {
                TypeWithEnhancement typeWithEnhancement = (TypeWithEnhancement) type;
                UnwrappedType origin = typeWithEnhancement.getOrigin();
                KotlinType enhancement = typeWithEnhancement.getEnhancement();
                TypeProjection typeProjectionD = d(new TypeProjectionImpl(typeProjection.getProjectionKind(), origin), typeParameterDescriptor, i + 1);
                return typeProjectionD.isStarProjection() ? typeProjectionD : new TypeProjectionImpl(typeProjectionD.getProjectionKind(), TypeWithEnhancementKt.wrapEnhancement(typeProjectionD.getType().unwrap(), substitute(enhancement, typeProjection.getProjectionKind())));
            }
            if (!DynamicTypesKt.isDynamic(type) && !(type.unwrap() instanceof RawType)) {
                TypeProjection typeProjectionMo3798get = typeSubstitution.mo3798get(type);
                if (typeProjectionMo3798get == null) {
                    typeProjectionMo3798get = null;
                } else if (type.getAnnotations().hasAnnotation(StandardNames.FqNames.unsafeVariance)) {
                    TypeConstructor constructor = typeProjectionMo3798get.getType().getConstructor();
                    if (constructor instanceof NewCapturedTypeConstructor) {
                        TypeProjection projection = ((NewCapturedTypeConstructor) constructor).getProjection();
                        Variance projectionKind = projection.getProjectionKind();
                        n nVarB = b(typeProjection.getProjectionKind(), projectionKind);
                        n nVar = n.OUT_IN_IN_POSITION;
                        if (nVarB == nVar) {
                            typeProjectionMo3798get = new TypeProjectionImpl(projection.getType());
                        } else if (typeParameterDescriptor != null && b(typeParameterDescriptor.getVariance(), projectionKind) == nVar) {
                            typeProjectionMo3798get = new TypeProjectionImpl(projection.getType());
                        }
                    }
                }
                Variance projectionKind2 = typeProjection.getProjectionKind();
                if (typeProjectionMo3798get == null && FlexibleTypesKt.isFlexible(type) && !TypeCapabilitiesKt.isCustomTypeParameter(type)) {
                    FlexibleType flexibleTypeAsFlexibleType = FlexibleTypesKt.asFlexibleType(type);
                    int i2 = i + 1;
                    TypeProjection typeProjectionD2 = d(new TypeProjectionImpl(projectionKind2, flexibleTypeAsFlexibleType.getLowerBound()), typeParameterDescriptor, i2);
                    TypeProjection typeProjectionD3 = d(new TypeProjectionImpl(projectionKind2, flexibleTypeAsFlexibleType.getUpperBound()), typeParameterDescriptor, i2);
                    Variance projectionKind3 = typeProjectionD2.getProjectionKind();
                    if (typeProjectionD2.getType() != flexibleTypeAsFlexibleType.getLowerBound() || typeProjectionD3.getType() != flexibleTypeAsFlexibleType.getUpperBound()) {
                        return new TypeProjectionImpl(projectionKind3, KotlinTypeFactory.flexibleType(TypeSubstitutionKt.asSimpleType(typeProjectionD2.getType()), TypeSubstitutionKt.asSimpleType(typeProjectionD3.getType())));
                    }
                } else if (!KotlinBuiltIns.isNothing(type) && !KotlinTypeKt.isError(type)) {
                    if (typeProjectionMo3798get != null) {
                        n nVarB2 = b(projectionKind2, typeProjectionMo3798get.getProjectionKind());
                        if (!CapturedTypeConstructorKt.isCaptured(type)) {
                            int i3 = l.f144528a[nVarB2.ordinal()];
                            if (i3 == 1) {
                                throw new m("Out-projection in in-position");
                            }
                            if (i3 == 2) {
                                return new TypeProjectionImpl(Variance.OUT_VARIANCE, type.getConstructor().getBuiltIns().getNullableAnyType());
                            }
                        }
                        CustomTypeParameter customTypeParameter = TypeCapabilitiesKt.getCustomTypeParameter(type);
                        if (typeProjectionMo3798get.isStarProjection()) {
                            return typeProjectionMo3798get;
                        }
                        KotlinType kotlinTypeSubstitutionResult = customTypeParameter != null ? customTypeParameter.substitutionResult(typeProjectionMo3798get.getType()) : TypeUtils.makeNullableIfNeeded(typeProjectionMo3798get.getType(), type.isMarkedNullable());
                        if (!type.getAnnotations().isEmpty()) {
                            Annotations annotationsFilterAnnotations = typeSubstitution.filterAnnotations(type.getAnnotations());
                            if (annotationsFilterAnnotations == null) {
                                a(33);
                                throw null;
                            }
                            if (annotationsFilterAnnotations.hasAnnotation(StandardNames.FqNames.unsafeVariance)) {
                                annotationsFilterAnnotations = new FilteredAnnotations(annotationsFilterAnnotations, new k());
                            }
                            kotlinTypeSubstitutionResult = TypeUtilsKt.replaceAnnotations(kotlinTypeSubstitutionResult, new CompositeAnnotations(kotlinTypeSubstitutionResult.getAnnotations(), annotationsFilterAnnotations));
                        }
                        if (nVarB2 == n.NO_CONFLICT) {
                            projectionKind2 = combine(projectionKind2, typeProjectionMo3798get.getProjectionKind());
                        }
                        return new TypeProjectionImpl(projectionKind2, kotlinTypeSubstitutionResult);
                    }
                    KotlinType type2 = typeProjection.getType();
                    Variance projectionKind4 = typeProjection.getProjectionKind();
                    if (!(type2.getConstructor().mo3795getDeclarationDescriptor() instanceof TypeParameterDescriptor)) {
                        SimpleType abbreviation = SpecialTypesKt.getAbbreviation(type2);
                        KotlinType kotlinTypeSubstitute = abbreviation != null ? replaceWithNonApproximatingSubstitution().substitute(abbreviation, Variance.INVARIANT) : null;
                        List<TypeParameterDescriptor> parameters = type2.getConstructor().getParameters();
                        List<TypeProjection> arguments = type2.getArguments();
                        ArrayList arrayList = new ArrayList(parameters.size());
                        boolean z = false;
                        for (int i5 = 0; i5 < parameters.size(); i5++) {
                            TypeParameterDescriptor typeParameterDescriptor2 = parameters.get(i5);
                            TypeProjection typeProjection2 = arguments.get(i5);
                            TypeProjection typeProjectionD4 = d(typeProjection2, typeParameterDescriptor2, i + 1);
                            int i6 = l.f144528a[b(typeParameterDescriptor2.getVariance(), typeProjectionD4.getProjectionKind()).ordinal()];
                            if (i6 == 1 || i6 == 2) {
                                typeProjectionD4 = TypeUtils.makeStarProjection(typeParameterDescriptor2);
                            } else if (i6 == 3) {
                                Variance variance = typeParameterDescriptor2.getVariance();
                                Variance variance2 = Variance.INVARIANT;
                                if (variance != variance2 && !typeProjectionD4.isStarProjection()) {
                                    typeProjectionD4 = new TypeProjectionImpl(variance2, typeProjectionD4.getType());
                                }
                            }
                            if (typeProjectionD4 != typeProjection2) {
                                z = true;
                            }
                            arrayList.add(typeProjectionD4);
                        }
                        if (z) {
                            arguments = arrayList;
                        }
                        KotlinType kotlinTypeReplace = TypeSubstitutionKt.replace(type2, arguments, typeSubstitution.filterAnnotations(type2.getAnnotations()));
                        if ((kotlinTypeReplace instanceof SimpleType) && (kotlinTypeSubstitute instanceof SimpleType)) {
                            kotlinTypeReplace = SpecialTypesKt.withAbbreviation((SimpleType) kotlinTypeReplace, (SimpleType) kotlinTypeSubstitute);
                        }
                        return new TypeProjectionImpl(projectionKind4, kotlinTypeReplace);
                    }
                }
            }
        }
        return typeProjection;
    }

    @NotNull
    public TypeSubstitution getSubstitution() {
        TypeSubstitution typeSubstitution = this.f187816a;
        if (typeSubstitution != null) {
            return typeSubstitution;
        }
        a(8);
        throw null;
    }

    public boolean isEmpty() {
        return this.f187816a.isEmpty();
    }

    @NotNull
    public TypeSubstitutor replaceWithNonApproximatingSubstitution() {
        TypeSubstitution typeSubstitution = this.f187816a;
        return ((typeSubstitution instanceof IndexedParametersSubstitution) && typeSubstitution.approximateContravariantCapturedTypes()) ? new TypeSubstitutor(new IndexedParametersSubstitution(((IndexedParametersSubstitution) typeSubstitution).getParameters(), ((IndexedParametersSubstitution) typeSubstitution).getArguments(), false)) : this;
    }

    @NotNull
    public KotlinType safeSubstitute(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        if (kotlinType == null) {
            a(9);
            throw null;
        }
        if (variance == null) {
            a(10);
            throw null;
        }
        if (isEmpty()) {
            if (kotlinType != null) {
                return kotlinType;
            }
            a(11);
            throw null;
        }
        try {
            KotlinType type = d(new TypeProjectionImpl(variance, kotlinType), null, 0).getType();
            if (type != null) {
                return type;
            }
            a(12);
            throw null;
        } catch (m e) {
            ErrorType errorTypeCreateErrorType = ErrorUtils.createErrorType(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
            if (errorTypeCreateErrorType != null) {
                return errorTypeCreateErrorType;
            }
            a(13);
            throw null;
        }
    }

    public KotlinType substitute(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        if (kotlinType == null) {
            a(14);
            throw null;
        }
        if (variance == null) {
            a(15);
            throw null;
        }
        TypeProjection typeProjectionSubstitute = substitute(new TypeProjectionImpl(variance, getSubstitution().prepareTopLevelType(kotlinType, variance)));
        if (typeProjectionSubstitute == null) {
            return null;
        }
        return typeProjectionSubstitute.getType();
    }

    public TypeProjection substituteWithoutApproximation(@NotNull TypeProjection typeProjection) {
        if (typeProjection == null) {
            a(17);
            throw null;
        }
        if (isEmpty()) {
            return typeProjection;
        }
        try {
            return d(typeProjection, null, 0);
        } catch (m unused) {
            return null;
        }
    }

    @NotNull
    public static TypeSubstitutor create(@NotNull Map<TypeConstructor, TypeProjection> map) {
        if (map != null) {
            return create(TypeConstructorSubstitution.createByConstructorsMap(map));
        }
        a(5);
        throw null;
    }

    @NotNull
    public static Variance combine(@NotNull Variance variance, @NotNull Variance variance2) {
        if (variance == null) {
            a(38);
            throw null;
        }
        if (variance2 != null) {
            Variance variance3 = Variance.INVARIANT;
            if (variance == variance3) {
                if (variance2 != null) {
                    return variance2;
                }
                a(40);
                throw null;
            }
            if (variance2 == variance3) {
                if (variance != null) {
                    return variance;
                }
                a(41);
                throw null;
            }
            if (variance == variance2) {
                if (variance2 != null) {
                    return variance2;
                }
                a(42);
                throw null;
            }
            throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
        }
        a(39);
        throw null;
    }

    @NotNull
    public static TypeSubstitutor create(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return create(TypeConstructorSubstitution.create(kotlinType.getConstructor(), kotlinType.getArguments()));
        }
        a(6);
        throw null;
    }

    public TypeProjection substitute(@NotNull TypeProjection typeProjection) {
        if (typeProjection != null) {
            TypeProjection typeProjectionSubstituteWithoutApproximation = substituteWithoutApproximation(typeProjection);
            TypeSubstitution typeSubstitution = this.f187816a;
            return (typeSubstitution.approximateCapturedTypes() || typeSubstitution.approximateContravariantCapturedTypes()) ? CapturedTypeApproximationKt.approximateCapturedTypesIfNecessary(typeProjectionSubstituteWithoutApproximation, typeSubstitution.approximateContravariantCapturedTypes()) : typeProjectionSubstituteWithoutApproximation;
        }
        a(16);
        throw null;
    }
}
