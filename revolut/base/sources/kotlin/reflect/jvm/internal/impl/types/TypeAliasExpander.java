package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class TypeAliasExpander {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeAliasExpansionReportStrategy f187793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f187794b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final void access$assertRecursionDepth(Companion companion, int i, TypeAliasDescriptor typeAliasDescriptor) {
            companion.getClass();
            if (i <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + typeAliasDescriptor.getName());
        }
    }

    static {
        new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false);
    }

    public TypeAliasExpander(@NotNull TypeAliasExpansionReportStrategy reportStrategy, boolean z) {
        Intrinsics.checkNotNullParameter(reportStrategy, "reportStrategy");
        this.f187793a = reportStrategy;
        this.f187794b = z;
    }

    public final void a(Annotations annotations, Annotations annotations2) {
        HashSet hashSet = new HashSet();
        Iterator<AnnotationDescriptor> it8 = annotations.iterator();
        while (it8.hasNext()) {
            hashSet.add(it8.next().getFqName());
        }
        for (AnnotationDescriptor annotationDescriptor : annotations2) {
            if (hashSet.contains(annotationDescriptor.getFqName())) {
                this.f187793a.repeatedAnnotation(annotationDescriptor);
            }
        }
    }

    public final SimpleType b(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z, int i, boolean z3) {
        TypeProjection typeProjectionC = c(new TypeProjectionImpl(Variance.INVARIANT, typeAliasExpansion.getDescriptor().getUnderlyingType()), typeAliasExpansion, null, i);
        KotlinType type = typeProjectionC.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType(type);
        if (KotlinTypeKt.isError(simpleTypeAsSimpleType)) {
            return simpleTypeAsSimpleType;
        }
        typeProjectionC.getProjectionKind();
        a(simpleTypeAsSimpleType.getAnnotations(), AnnotationsTypeAttributeKt.getAnnotations(typeAttributes));
        if (!KotlinTypeKt.isError(simpleTypeAsSimpleType)) {
            simpleTypeAsSimpleType = TypeSubstitutionKt.replace$default(simpleTypeAsSimpleType, null, KotlinTypeKt.isError(simpleTypeAsSimpleType) ? simpleTypeAsSimpleType.getAttributes() : typeAttributes.add(simpleTypeAsSimpleType.getAttributes()), 1, null);
        }
        SimpleType simpleTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(simpleTypeAsSimpleType, z);
        Intrinsics.checkNotNullExpressionValue(simpleTypeMakeNullableIfNeeded, "let(...)");
        if (!z3) {
            return simpleTypeMakeNullableIfNeeded;
        }
        TypeConstructor typeConstructor = typeAliasExpansion.getDescriptor().getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return SpecialTypesKt.withAbbreviation(simpleTypeMakeNullableIfNeeded, KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes, typeConstructor, typeAliasExpansion.getArguments(), z, MemberScope.Empty.INSTANCE));
    }

    public final TypeProjection c(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, TypeParameterDescriptor typeParameterDescriptor, int i) {
        Variance variance;
        KotlinType kotlinTypeReplace$default;
        Variance variance2;
        Variance variance3;
        Companion.access$assertRecursionDepth(Companion, i, typeAliasExpansion.getDescriptor());
        if (typeProjection.isStarProjection()) {
            Intrinsics.h(typeParameterDescriptor);
            TypeProjection typeProjectionMakeStarProjection = TypeUtils.makeStarProjection(typeParameterDescriptor);
            Intrinsics.checkNotNullExpressionValue(typeProjectionMakeStarProjection, "makeStarProjection(...)");
            return typeProjectionMakeStarProjection;
        }
        KotlinType type = typeProjection.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        TypeProjection replacement = typeAliasExpansion.getReplacement(type.getConstructor());
        TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy = this.f187793a;
        if (replacement != null) {
            if (replacement.isStarProjection()) {
                Intrinsics.h(typeParameterDescriptor);
                TypeProjection typeProjectionMakeStarProjection2 = TypeUtils.makeStarProjection(typeParameterDescriptor);
                Intrinsics.checkNotNullExpressionValue(typeProjectionMakeStarProjection2, "makeStarProjection(...)");
                return typeProjectionMakeStarProjection2;
            }
            UnwrappedType unwrappedTypeUnwrap = replacement.getType().unwrap();
            Variance projectionKind = replacement.getProjectionKind();
            Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
            Variance projectionKind2 = typeProjection.getProjectionKind();
            Intrinsics.checkNotNullExpressionValue(projectionKind2, "getProjectionKind(...)");
            if (projectionKind2 != projectionKind && projectionKind2 != (variance3 = Variance.INVARIANT)) {
                if (projectionKind == variance3) {
                    projectionKind = projectionKind2;
                } else {
                    typeAliasExpansionReportStrategy.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrappedTypeUnwrap);
                }
            }
            if (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null) {
                variance = Variance.INVARIANT;
            }
            if (variance != projectionKind && variance != (variance2 = Variance.INVARIANT)) {
                if (projectionKind == variance2) {
                    projectionKind = variance2;
                } else {
                    typeAliasExpansionReportStrategy.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrappedTypeUnwrap);
                }
            }
            a(type.getAnnotations(), unwrappedTypeUnwrap.getAnnotations());
            if (unwrappedTypeUnwrap instanceof DynamicType) {
                DynamicType dynamicType = (DynamicType) unwrappedTypeUnwrap;
                kotlinTypeReplace$default = dynamicType.replaceAttributes(KotlinTypeKt.isError(dynamicType) ? dynamicType.getAttributes() : type.getAttributes().add(dynamicType.getAttributes()));
            } else {
                SimpleType simpleTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(TypeSubstitutionKt.asSimpleType(unwrappedTypeUnwrap), type.isMarkedNullable());
                Intrinsics.checkNotNullExpressionValue(simpleTypeMakeNullableIfNeeded, "makeNullableIfNeeded(...)");
                TypeAttributes attributes = type.getAttributes();
                boolean zIsError = KotlinTypeKt.isError(simpleTypeMakeNullableIfNeeded);
                kotlinTypeReplace$default = simpleTypeMakeNullableIfNeeded;
                if (!zIsError) {
                    kotlinTypeReplace$default = TypeSubstitutionKt.replace$default(simpleTypeMakeNullableIfNeeded, null, KotlinTypeKt.isError(simpleTypeMakeNullableIfNeeded) ? simpleTypeMakeNullableIfNeeded.getAttributes() : attributes.add(simpleTypeMakeNullableIfNeeded.getAttributes()), 1, null);
                }
            }
            return new TypeProjectionImpl(projectionKind, kotlinTypeReplace$default);
        }
        UnwrappedType unwrappedTypeUnwrap2 = typeProjection.getType().unwrap();
        if (!DynamicTypesKt.isDynamic(unwrappedTypeUnwrap2)) {
            SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType(unwrappedTypeUnwrap2);
            if (!KotlinTypeKt.isError(simpleTypeAsSimpleType) && TypeUtilsKt.requiresTypeAliasExpansion(simpleTypeAsSimpleType)) {
                TypeConstructor constructor = simpleTypeAsSimpleType.getConstructor();
                ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = constructor.mo3795getDeclarationDescriptor();
                constructor.getParameters().size();
                simpleTypeAsSimpleType.getArguments().size();
                if (!(classifierDescriptorMo3795getDeclarationDescriptor instanceof TypeParameterDescriptor)) {
                    int i2 = 0;
                    if (classifierDescriptorMo3795getDeclarationDescriptor instanceof TypeAliasDescriptor) {
                        TypeAliasDescriptor typeAliasDescriptor = (TypeAliasDescriptor) classifierDescriptorMo3795getDeclarationDescriptor;
                        if (typeAliasExpansion.isRecursion(typeAliasDescriptor)) {
                            typeAliasExpansionReportStrategy.recursiveTypeAlias(typeAliasDescriptor);
                            Variance variance4 = Variance.INVARIANT;
                            ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                            String string = typeAliasDescriptor.getName().toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            return new TypeProjectionImpl(variance4, ErrorUtils.createErrorType(errorTypeKind, string));
                        }
                        List<TypeProjection> arguments = simpleTypeAsSimpleType.getArguments();
                        ArrayList arrayList = new ArrayList(w.t(arguments, 10));
                        for (Object obj2 : arguments) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                v.s();
                                throw null;
                            }
                            arrayList.add(c((TypeProjection) obj2, typeAliasExpansion, constructor.getParameters().get(i2), i + 1));
                            i2 = i3;
                        }
                        SimpleType simpleTypeB = b(TypeAliasExpansion.Companion.create(typeAliasExpansion, typeAliasDescriptor, arrayList), simpleTypeAsSimpleType.getAttributes(), simpleTypeAsSimpleType.isMarkedNullable(), i + 1, false);
                        SimpleType simpleTypeD = d(simpleTypeAsSimpleType, typeAliasExpansion, i);
                        if (!DynamicTypesKt.isDynamic(simpleTypeB)) {
                            simpleTypeB = SpecialTypesKt.withAbbreviation(simpleTypeB, simpleTypeD);
                        }
                        return new TypeProjectionImpl(typeProjection.getProjectionKind(), simpleTypeB);
                    }
                    SimpleType simpleTypeD2 = d(simpleTypeAsSimpleType, typeAliasExpansion, i);
                    TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(simpleTypeD2);
                    Intrinsics.checkNotNullExpressionValue(typeSubstitutorCreate, "create(...)");
                    for (Object obj3 : simpleTypeD2.getArguments()) {
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            v.s();
                            throw null;
                        }
                        TypeProjection typeProjection2 = (TypeProjection) obj3;
                        if (!typeProjection2.isStarProjection()) {
                            KotlinType type2 = typeProjection2.getType();
                            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                            if (!TypeUtilsKt.containsTypeAliasParameters(type2)) {
                                TypeProjection typeProjection3 = simpleTypeAsSimpleType.getArguments().get(i2);
                                TypeParameterDescriptor typeParameterDescriptor2 = simpleTypeAsSimpleType.getConstructor().getParameters().get(i2);
                                if (this.f187794b) {
                                    KotlinType type3 = typeProjection3.getType();
                                    Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                                    KotlinType type4 = typeProjection2.getType();
                                    Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                                    Intrinsics.h(typeParameterDescriptor2);
                                    typeAliasExpansionReportStrategy.boundsViolationInSubstitution(typeSubstitutorCreate, type3, type4, typeParameterDescriptor2);
                                }
                            }
                        }
                        i2 = i5;
                    }
                    return new TypeProjectionImpl(typeProjection.getProjectionKind(), simpleTypeD2);
                }
            }
        }
        return typeProjection;
    }

    public final SimpleType d(SimpleType simpleType, TypeAliasExpansion typeAliasExpansion, int i) {
        TypeConstructor constructor = simpleType.getConstructor();
        List<TypeProjection> arguments = simpleType.getArguments();
        ArrayList arrayList = new ArrayList(w.t(arguments, 10));
        int i2 = 0;
        for (Object obj2 : arguments) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            TypeProjection typeProjection = (TypeProjection) obj2;
            TypeProjection typeProjectionC = c(typeProjection, typeAliasExpansion, constructor.getParameters().get(i2), i + 1);
            if (!typeProjectionC.isStarProjection()) {
                typeProjectionC = new TypeProjectionImpl(typeProjectionC.getProjectionKind(), TypeUtils.makeNullableIfNeeded(typeProjectionC.getType(), typeProjection.getType().isMarkedNullable()));
            }
            arrayList.add(typeProjectionC);
            i2 = i3;
        }
        return TypeSubstitutionKt.replace$default(simpleType, arrayList, null, 2, null);
    }

    @NotNull
    public final SimpleType expand(@NotNull TypeAliasExpansion typeAliasExpansion, @NotNull TypeAttributes attributes) {
        Intrinsics.checkNotNullParameter(typeAliasExpansion, "typeAliasExpansion");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return b(typeAliasExpansion, attributes, false, 0, true);
    }
}
