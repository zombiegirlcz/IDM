package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kkm.a;
import kkm.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class CapturedTypeApproximationKt {

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType a(kotlin.reflect.jvm.internal.impl.types.KotlinType r7, java.util.ArrayList r8) {
        /*
            java.util.List r0 = r7.getArguments()
            r0.size()
            r8.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = zhm.w.t(r8, r0)
            r2.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L19:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r8.next()
            kkm.b r0 = (kkm.b) r0
            r0.getClass()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r0.f185139c
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r0.f185138b
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r0 = r0.f185137a
            kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker r4 = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT
            r4.isSubtypeOf(r3, r1)
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
            if (r4 != 0) goto L83
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = r0.getVariance()
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r4 != r5) goto L42
            goto L83
        L42:
            boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isNothing(r3)
            if (r4 == 0) goto L5e
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = r0.getVariance()
            if (r4 == r5) goto L5e
            kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl r3 = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r0.getVariance()
            if (r4 != r0) goto L5a
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
        L5a:
            r3.<init>(r4, r1)
            goto L89
        L5e:
            boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isNullableAny(r1)
            if (r4 == 0) goto L73
            kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl r1 = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r0.getVariance()
            if (r5 != r0) goto L6e
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
        L6e:
            r1.<init>(r5, r3)
            r3 = r1
            goto L89
        L73:
            kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl r3 = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r0.getVariance()
            if (r4 != r0) goto L7f
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
        L7f:
            r3.<init>(r4, r1)
            goto L89
        L83:
            kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl r0 = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl
            r0.<init>(r3)
            r3 = r0
        L89:
            r2.add(r3)
            goto L19
        L8d:
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            kotlin.reflect.jvm.internal.impl.types.KotlinType r7 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.a(kotlin.reflect.jvm.internal.impl.types.KotlinType, java.util.ArrayList):kotlin.reflect.jvm.internal.impl.types.KotlinType");
    }

    @NotNull
    public static final ApproximationBounds<KotlinType> approximateCapturedTypes(@NotNull KotlinType type) {
        Object objA;
        b bVar;
        Intrinsics.checkNotNullParameter(type, "type");
        if (FlexibleTypesKt.isFlexible(type)) {
            ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes = approximateCapturedTypes(FlexibleTypesKt.lowerIfFlexible(type));
            ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes2 = approximateCapturedTypes(FlexibleTypesKt.upperIfFlexible(type));
            return new ApproximationBounds<>(TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(approximationBoundsApproximateCapturedTypes.getLower()), FlexibleTypesKt.upperIfFlexible(approximationBoundsApproximateCapturedTypes2.getLower())), type), TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(approximationBoundsApproximateCapturedTypes.getUpper()), FlexibleTypesKt.upperIfFlexible(approximationBoundsApproximateCapturedTypes2.getUpper())), type));
        }
        TypeConstructor constructor = type.getConstructor();
        if (CapturedTypeConstructorKt.isCaptured(type)) {
            Intrinsics.i(constructor, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            TypeProjection projection = ((CapturedTypeConstructor) constructor).getProjection();
            KotlinType type2 = projection.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            KotlinType kotlinTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(type2, type.isMarkedNullable());
            Intrinsics.checkNotNullExpressionValue(kotlinTypeMakeNullableIfNeeded, "makeNullableIfNeeded(...)");
            int i = WhenMappings.$EnumSwitchMapping$0[projection.getProjectionKind().ordinal()];
            if (i == 2) {
                return new ApproximationBounds<>(kotlinTypeMakeNullableIfNeeded, TypeUtilsKt.getBuiltIns(type).getNullableAnyType());
            }
            if (i != 3) {
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + projection);
            }
            SimpleType nothingType = TypeUtilsKt.getBuiltIns(type).getNothingType();
            Intrinsics.checkNotNullExpressionValue(nothingType, "getNothingType(...)");
            KotlinType kotlinTypeMakeNullableIfNeeded2 = TypeUtils.makeNullableIfNeeded((KotlinType) nothingType, type.isMarkedNullable());
            Intrinsics.checkNotNullExpressionValue(kotlinTypeMakeNullableIfNeeded2, "makeNullableIfNeeded(...)");
            return new ApproximationBounds<>(kotlinTypeMakeNullableIfNeeded2, kotlinTypeMakeNullableIfNeeded);
        }
        if (type.getArguments().isEmpty() || type.getArguments().size() != constructor.getParameters().size()) {
            return new ApproximationBounds<>(type, type);
        }
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<TypeProjection> arguments = type.getArguments();
        List<TypeParameterDescriptor> parameters = constructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        Iterator it8 = d0.l1(arguments, parameters).iterator();
        while (true) {
            boolean z = true;
            if (!it8.hasNext()) {
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    for (b bVar2 : arrayList) {
                        bVar2.getClass();
                        if (!KotlinTypeChecker.DEFAULT.isSubtypeOf(bVar2.f185138b, bVar2.f185139c)) {
                            break;
                        }
                    }
                    z = false;
                }
                if (z) {
                    objA = TypeUtilsKt.getBuiltIns(type).getNothingType();
                    Intrinsics.checkNotNullExpressionValue(objA, "getNothingType(...)");
                } else {
                    objA = a(type, arrayList);
                }
                return new ApproximationBounds<>(objA, a(type, arrayList2));
            }
            Pair pair = (Pair) it8.next();
            TypeProjection typeProjection = (TypeProjection) pair.f186385a;
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.f186386b;
            Intrinsics.h(typeParameterDescriptor);
            int i2 = WhenMappings.$EnumSwitchMapping$0[TypeSubstitutor.combine(typeParameterDescriptor.getVariance(), typeProjection).ordinal()];
            if (i2 == 1) {
                KotlinType type3 = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                KotlinType type4 = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                bVar = new b(typeParameterDescriptor, type3, type4);
            } else if (i2 == 2) {
                KotlinType type5 = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                SimpleType nullableAnyType = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNullableAnyType();
                Intrinsics.checkNotNullExpressionValue(nullableAnyType, "getNullableAnyType(...)");
                bVar = new b(typeParameterDescriptor, type5, nullableAnyType);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                SimpleType nothingType2 = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType();
                Intrinsics.checkNotNullExpressionValue(nothingType2, "getNothingType(...)");
                KotlinType type6 = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                bVar = new b(typeParameterDescriptor, nothingType2, type6);
            }
            if (typeProjection.isStarProjection()) {
                arrayList.add(bVar);
                arrayList2.add(bVar);
            } else {
                ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes3 = approximateCapturedTypes(bVar.f185138b);
                KotlinType kotlinTypeComponent1 = approximationBoundsApproximateCapturedTypes3.component1();
                KotlinType kotlinTypeComponent2 = approximationBoundsApproximateCapturedTypes3.component2();
                ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes4 = approximateCapturedTypes(bVar.f185139c);
                KotlinType kotlinTypeComponent12 = approximationBoundsApproximateCapturedTypes4.component1();
                KotlinType kotlinTypeComponent22 = approximationBoundsApproximateCapturedTypes4.component2();
                TypeParameterDescriptor typeParameterDescriptor2 = bVar.f185137a;
                ApproximationBounds approximationBounds = new ApproximationBounds(new b(typeParameterDescriptor2, kotlinTypeComponent2, kotlinTypeComponent12), new b(typeParameterDescriptor2, kotlinTypeComponent1, kotlinTypeComponent22));
                b bVar3 = (b) approximationBounds.component1();
                b bVar4 = (b) approximationBounds.component2();
                arrayList.add(bVar3);
                arrayList2.add(bVar4);
            }
        }
    }

    public static final TypeProjection approximateCapturedTypesIfNecessary(TypeProjection typeProjection, boolean z) {
        if (typeProjection == null) {
            return null;
        }
        if (!typeProjection.isStarProjection()) {
            KotlinType type = typeProjection.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (TypeUtils.contains(type, a.f185136a)) {
                Variance projectionKind = typeProjection.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
                if (projectionKind == Variance.OUT_VARIANCE) {
                    return new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getUpper());
                }
                if (z) {
                    return new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getLower());
                }
                TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(new CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1());
                Intrinsics.checkNotNullExpressionValue(typeSubstitutorCreate, "create(...)");
                return typeSubstitutorCreate.substituteWithoutApproximation(typeProjection);
            }
        }
        return typeProjection;
    }
}
