package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jx.e;
import kotlin.collections.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import rjm.c;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class JavaTypeEnhancement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaResolverSettings f187025a;

    public JavaTypeEnhancement(@NotNull JavaResolverSettings javaResolverSettings) {
        Intrinsics.checkNotNullParameter(javaResolverSettings, "javaResolverSettings");
        this.f187025a = javaResolverSettings;
    }

    public final e a(SimpleType simpleType, Function1 function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z3) {
        ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor;
        TypeConstructor constructor;
        boolean z4;
        Boolean bool;
        ClassifierDescriptor classifierDescriptor;
        a80.e eVar;
        TypeProjection typeProjectionMakeStarProjection;
        boolean zShouldEnhance = TypeComponentPositionKt.shouldEnhance(typeComponentPosition);
        boolean z6 = (z3 && z) ? false : true;
        Object obj2 = null;
        if ((zShouldEnhance || !simpleType.getArguments().isEmpty()) && (classifierDescriptorMo3795getDeclarationDescriptor = simpleType.getConstructor().mo3795getDeclarationDescriptor()) != null) {
            JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) function1.invoke(Integer.valueOf(i));
            ClassifierDescriptor classifierDescriptorAccess$enhanceMutability = TypeEnhancementKt.access$enhanceMutability(classifierDescriptorMo3795getDeclarationDescriptor, javaTypeQualifiers, typeComponentPosition);
            Boolean boolAccess$getEnhancedNullability = TypeEnhancementKt.access$getEnhancedNullability(javaTypeQualifiers, typeComponentPosition);
            if (classifierDescriptorAccess$enhanceMutability == null || (constructor = classifierDescriptorAccess$enhanceMutability.getTypeConstructor()) == null) {
                constructor = simpleType.getConstructor();
            }
            TypeConstructor typeConstructor = constructor;
            int i2 = i + 1;
            List<TypeProjection> arguments = simpleType.getArguments();
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            List<TypeParameterDescriptor> list = parameters;
            Iterator<T> it8 = arguments.iterator();
            Iterator<T> it9 = list.iterator();
            ArrayList arrayList = new ArrayList(Math.min(w.t(arguments, 10), w.t(list, 10)));
            while (it8.hasNext() && it9.hasNext()) {
                Object next = it8.next();
                TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it9.next();
                TypeProjection typeProjection = (TypeProjection) next;
                if (z6) {
                    bool = boolAccess$getEnhancedNullability;
                    classifierDescriptor = classifierDescriptorAccess$enhanceMutability;
                    if (!typeProjection.isStarProjection()) {
                        eVar = b(typeProjection.getType().unwrap(), function1, i2, z3);
                    } else if (((JavaTypeQualifiers) function1.invoke(Integer.valueOf(i2))).getNullability() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                        UnwrappedType unwrappedTypeUnwrap = typeProjection.getType().unwrap();
                        eVar = new a80.e(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(unwrappedTypeUnwrap).makeNullableAsSpecified(false), FlexibleTypesKt.upperIfFlexible(unwrappedTypeUnwrap).makeNullableAsSpecified(true)), 1, 6);
                    } else {
                        eVar = new a80.e(null, 1, 6);
                    }
                } else {
                    bool = boolAccess$getEnhancedNullability;
                    classifierDescriptor = classifierDescriptorAccess$enhanceMutability;
                    eVar = new a80.e(obj2, 0, 6);
                }
                i2 += eVar.i();
                if (eVar.j() != null) {
                    KotlinType kotlinTypeJ = eVar.j();
                    Variance projectionKind = typeProjection.getProjectionKind();
                    Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
                    typeProjectionMakeStarProjection = TypeUtilsKt.createProjection(kotlinTypeJ, projectionKind, typeParameterDescriptor);
                } else if (classifierDescriptor == null || typeProjection.isStarProjection()) {
                    typeProjectionMakeStarProjection = classifierDescriptor != null ? TypeUtils.makeStarProjection(typeParameterDescriptor) : null;
                } else {
                    KotlinType type = typeProjection.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    Variance projectionKind2 = typeProjection.getProjectionKind();
                    Intrinsics.checkNotNullExpressionValue(projectionKind2, "getProjectionKind(...)");
                    typeProjectionMakeStarProjection = TypeUtilsKt.createProjection(type, projectionKind2, typeParameterDescriptor);
                }
                arrayList.add(typeProjectionMakeStarProjection);
                boolAccess$getEnhancedNullability = bool;
                classifierDescriptorAccess$enhanceMutability = classifierDescriptor;
                obj2 = null;
            }
            Boolean bool2 = boolAccess$getEnhancedNullability;
            ClassifierDescriptor classifierDescriptor2 = classifierDescriptorAccess$enhanceMutability;
            int i3 = i2 - i;
            if (classifierDescriptor2 == null && bool2 == null) {
                if (!arrayList.isEmpty()) {
                    Iterator it10 = arrayList.iterator();
                    while (it10.hasNext()) {
                        if (((TypeProjection) it10.next()) == null) {
                        }
                    }
                }
                return new e((SimpleType) null, i3, false);
            }
            Annotations annotations = simpleType.getAnnotations();
            c cVar = TypeEnhancementKt.f187046b;
            if (classifierDescriptor2 == null) {
                cVar = null;
            }
            Annotations[] elements = {annotations, cVar, bool2 != null ? TypeEnhancementKt.getENHANCED_NULLABILITY_ANNOTATIONS() : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            TypeAttributes defaultAttributes = TypeAttributesKt.toDefaultAttributes(TypeEnhancementKt.access$compositeAnnotationsOrSingle(d.L(elements)));
            List<TypeProjection> arguments2 = simpleType.getArguments();
            Iterator it11 = arrayList.iterator();
            Iterator<T> it12 = arguments2.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(w.t(arrayList, 10), w.t(arguments2, 10)));
            while (it11.hasNext() && it12.hasNext()) {
                Object next2 = it11.next();
                TypeProjection typeProjection2 = (TypeProjection) it12.next();
                TypeProjection typeProjection3 = (TypeProjection) next2;
                if (typeProjection3 != null) {
                    typeProjection2 = typeProjection3;
                }
                arrayList2.add(typeProjection2);
            }
            SimpleType simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(defaultAttributes, typeConstructor, arrayList2, bool2 != null ? bool2.booleanValue() : simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
            if (!javaTypeQualifiers.getDefinitelyNotNull()) {
                z4 = true;
            } else if (this.f187025a.getCorrectNullabilityForNotNullTypeParameter()) {
                z4 = true;
                simpleTypeSimpleType$default = SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleTypeSimpleType$default, true);
            } else {
                z4 = true;
                simpleTypeSimpleType$default = new NotNullTypeParameterImpl(simpleTypeSimpleType$default);
            }
            if (bool2 == null || !javaTypeQualifiers.isNullabilityQualifierForWarning()) {
                z4 = false;
            }
            return new e(simpleTypeSimpleType$default, i3, z4);
        }
        return new e((SimpleType) null, 1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a80.e b(kotlin.reflect.jvm.internal.impl.types.UnwrappedType r19, kotlin.jvm.functions.Function1 r20, int r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.b(kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.jvm.functions.Function1, int, boolean):a80.e");
    }

    public final KotlinType enhance(@NotNull KotlinType kotlinType, @NotNull Function1<? super Integer, JavaTypeQualifiers> qualifiers, boolean z) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        return b(kotlinType.unwrap(), qualifiers, 0, z).j();
    }
}
