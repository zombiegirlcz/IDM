package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class TypeSystemContextContextualKt {
    public static final int argumentsCount(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.argumentsCount(kotlinTypeMarker);
    }

    @NotNull
    public static final TypeArgumentListMarker asArgumentList(@NotNull TypeSystemContext c2, @NotNull RigidTypeMarker rigidTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return c2.asArgumentList(rigidTypeMarker);
    }

    public static final CapturedTypeMarker asCapturedTypeUnwrappingDnn(@NotNull TypeSystemContext c2, @NotNull RigidTypeMarker rigidTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return c2.asCapturedTypeUnwrappingDnn(rigidTypeMarker);
    }

    public static final FlexibleTypeMarker asFlexibleType(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.asFlexibleType(kotlinTypeMarker);
    }

    public static final RigidTypeMarker asRigidType(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.asRigidType(kotlinTypeMarker);
    }

    @NotNull
    public static final TypeArgumentMarker asTypeArgument(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.asTypeArgument(kotlinTypeMarker);
    }

    @NotNull
    public static final CaptureStatus captureStatus(@NotNull TypeSystemContext c2, @NotNull CapturedTypeMarker capturedTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(capturedTypeMarker, "<this>");
        return c2.captureStatus(capturedTypeMarker);
    }

    public static final List<SimpleTypeMarker> fastCorrespondingSupertypes(@NotNull TypeSystemContext c2, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull TypeConstructorMarker constructor) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        return c2.fastCorrespondingSupertypes(rigidTypeMarker, constructor);
    }

    @NotNull
    public static final TypeArgumentMarker get(@NotNull TypeSystemContext c2, @NotNull TypeArgumentListMarker typeArgumentListMarker, int i) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeArgumentListMarker, "<this>");
        return c2.get(typeArgumentListMarker, i);
    }

    @NotNull
    public static final TypeArgumentMarker getArgument(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker, int i) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.getArgument(kotlinTypeMarker, i);
    }

    public static final TypeArgumentMarker getArgumentOrNull(@NotNull TypeSystemContext c2, @NotNull RigidTypeMarker rigidTypeMarker, int i) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return c2.getArgumentOrNull(rigidTypeMarker, i);
    }

    @NotNull
    public static final TypeParameterMarker getParameter(@NotNull TypeSystemContext c2, @NotNull TypeConstructorMarker typeConstructorMarker, int i) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeConstructorMarker, "<this>");
        return c2.getParameter(typeConstructorMarker, i);
    }

    public static final KotlinTypeMarker getType(@NotNull TypeSystemContext c2, @NotNull TypeArgumentMarker typeArgumentMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeArgumentMarker, "<this>");
        return c2.getType(typeArgumentMarker);
    }

    public static final TypeParameterMarker getTypeParameter(@NotNull TypeSystemContext c2, @NotNull TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeVariableTypeConstructorMarker, "<this>");
        return c2.getTypeParameter(typeVariableTypeConstructorMarker);
    }

    @NotNull
    public static final TypeVariance getVariance(@NotNull TypeSystemContext c2, @NotNull TypeArgumentMarker typeArgumentMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeArgumentMarker, "<this>");
        return c2.getVariance(typeArgumentMarker);
    }

    public static final boolean hasRecursiveBounds(@NotNull TypeSystemContext c2, @NotNull TypeParameterMarker typeParameterMarker, TypeConstructorMarker typeConstructorMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeParameterMarker, "<this>");
        return c2.hasRecursiveBounds(typeParameterMarker, typeConstructorMarker);
    }

    public static final boolean isAnyConstructor(@NotNull TypeSystemContext c2, @NotNull TypeConstructorMarker typeConstructorMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeConstructorMarker, "<this>");
        return c2.isAnyConstructor(typeConstructorMarker);
    }

    public static final boolean isCapturedType(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.isCapturedType(kotlinTypeMarker);
    }

    public static final boolean isClassType(@NotNull TypeSystemContext c2, @NotNull RigidTypeMarker rigidTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return c2.isClassType(rigidTypeMarker);
    }

    public static final boolean isClassTypeConstructor(@NotNull TypeSystemContext c2, @NotNull TypeConstructorMarker typeConstructorMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeConstructorMarker, "<this>");
        return c2.isClassTypeConstructor(typeConstructorMarker);
    }

    public static final boolean isCommonFinalClassConstructor(@NotNull TypeSystemContext c2, @NotNull TypeConstructorMarker typeConstructorMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeConstructorMarker, "<this>");
        return c2.isCommonFinalClassConstructor(typeConstructorMarker);
    }

    public static final boolean isDefinitelyNotNullType(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.isDefinitelyNotNullType(kotlinTypeMarker);
    }

    public static final boolean isDenotable(@NotNull TypeSystemContext c2, @NotNull TypeConstructorMarker typeConstructorMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeConstructorMarker, "<this>");
        return c2.isDenotable(typeConstructorMarker);
    }

    public static final boolean isDynamic(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.isDynamic(kotlinTypeMarker);
    }

    public static final boolean isError(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.isError(kotlinTypeMarker);
    }

    public static final boolean isFlexible(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.isFlexible(kotlinTypeMarker);
    }

    public static final boolean isFlexibleWithDifferentTypeConstructors(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.isFlexibleWithDifferentTypeConstructors(kotlinTypeMarker);
    }

    public static final boolean isIntegerLiteralType(@NotNull TypeSystemContext c2, @NotNull RigidTypeMarker rigidTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return c2.isIntegerLiteralType(rigidTypeMarker);
    }

    public static final boolean isIntegerLiteralTypeConstructor(@NotNull TypeSystemContext c2, @NotNull TypeConstructorMarker typeConstructorMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeConstructorMarker, "<this>");
        return c2.isIntegerLiteralTypeConstructor(typeConstructorMarker);
    }

    public static final boolean isIntersection(@NotNull TypeSystemContext c2, @NotNull TypeConstructorMarker typeConstructorMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeConstructorMarker, "<this>");
        return c2.isIntersection(typeConstructorMarker);
    }

    public static final boolean isMarkedNullable(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.isMarkedNullable(kotlinTypeMarker);
    }

    public static final boolean isNotNullTypeParameter(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.isNotNullTypeParameter(kotlinTypeMarker);
    }

    public static final boolean isNothingConstructor(@NotNull TypeSystemContext c2, @NotNull TypeConstructorMarker typeConstructorMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeConstructorMarker, "<this>");
        return c2.isNothingConstructor(typeConstructorMarker);
    }

    public static final boolean isOldCapturedType(@NotNull TypeSystemContext c2, @NotNull CapturedTypeMarker capturedTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(capturedTypeMarker, "<this>");
        return c2.isOldCapturedType(capturedTypeMarker);
    }

    public static final boolean isSingleClassifierType(@NotNull TypeSystemContext c2, @NotNull RigidTypeMarker rigidTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return c2.isSingleClassifierType(rigidTypeMarker);
    }

    public static final boolean isStarProjection(@NotNull TypeSystemContext c2, @NotNull TypeArgumentMarker typeArgumentMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeArgumentMarker, "<this>");
        return c2.isStarProjection(typeArgumentMarker);
    }

    public static final boolean isStubType(@NotNull TypeSystemContext c2, @NotNull RigidTypeMarker rigidTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return c2.isStubType(rigidTypeMarker);
    }

    public static final boolean isStubTypeForBuilderInference(@NotNull TypeSystemContext c2, @NotNull RigidTypeMarker rigidTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return c2.isStubTypeForBuilderInference(rigidTypeMarker);
    }

    @NotNull
    public static final RigidTypeMarker lowerBound(@NotNull TypeSystemContext c2, @NotNull FlexibleTypeMarker flexibleTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(flexibleTypeMarker, "<this>");
        return c2.lowerBound(flexibleTypeMarker);
    }

    @NotNull
    public static final RigidTypeMarker lowerBoundIfFlexible(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.lowerBoundIfFlexible(kotlinTypeMarker);
    }

    public static final KotlinTypeMarker lowerType(@NotNull TypeSystemContext c2, @NotNull CapturedTypeMarker capturedTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(capturedTypeMarker, "<this>");
        return c2.lowerType(capturedTypeMarker);
    }

    @NotNull
    public static final KotlinTypeMarker makeDefinitelyNotNullOrNotNull(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.makeDefinitelyNotNullOrNotNull(kotlinTypeMarker);
    }

    @NotNull
    public static final SimpleTypeMarker originalIfDefinitelyNotNullable(@NotNull TypeSystemContext c2, @NotNull RigidTypeMarker rigidTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return c2.originalIfDefinitelyNotNullable(rigidTypeMarker);
    }

    public static final int parametersCount(@NotNull TypeSystemContext c2, @NotNull TypeConstructorMarker typeConstructorMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeConstructorMarker, "<this>");
        return c2.parametersCount(typeConstructorMarker);
    }

    @NotNull
    public static final Collection<KotlinTypeMarker> possibleIntegerTypes(@NotNull TypeSystemContext c2, @NotNull RigidTypeMarker rigidTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return c2.possibleIntegerTypes(rigidTypeMarker);
    }

    @NotNull
    public static final TypeArgumentMarker projection(@NotNull TypeSystemContext c2, @NotNull CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(capturedTypeConstructorMarker, "<this>");
        return c2.projection(capturedTypeConstructorMarker);
    }

    public static final int size(@NotNull TypeSystemContext c2, @NotNull TypeArgumentListMarker typeArgumentListMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeArgumentListMarker, "<this>");
        return c2.size(typeArgumentListMarker);
    }

    @NotNull
    public static final Collection<KotlinTypeMarker> supertypes(@NotNull TypeSystemContext c2, @NotNull TypeConstructorMarker typeConstructorMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeConstructorMarker, "<this>");
        return c2.supertypes(typeConstructorMarker);
    }

    @NotNull
    public static final TypeConstructorMarker typeConstructor(@NotNull TypeSystemContext c2, @NotNull RigidTypeMarker rigidTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return c2.typeConstructor(rigidTypeMarker);
    }

    @NotNull
    public static final RigidTypeMarker upperBoundIfFlexible(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.upperBoundIfFlexible(kotlinTypeMarker);
    }

    @NotNull
    public static final RigidTypeMarker withNullability(@NotNull TypeSystemContext c2, @NotNull RigidTypeMarker rigidTypeMarker, boolean z) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return c2.withNullability(rigidTypeMarker, z);
    }

    @NotNull
    public static final TypeVariance getVariance(@NotNull TypeSystemContext c2, @NotNull TypeParameterMarker typeParameterMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeParameterMarker, "<this>");
        return c2.getVariance(typeParameterMarker);
    }

    public static final boolean isDefinitelyNotNullType(@NotNull TypeSystemContext c2, @NotNull RigidTypeMarker rigidTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return c2.isDefinitelyNotNullType(rigidTypeMarker);
    }

    @NotNull
    public static final CapturedTypeConstructorMarker typeConstructor(@NotNull TypeSystemContext c2, @NotNull CapturedTypeMarker capturedTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(capturedTypeMarker, "<this>");
        return c2.typeConstructor(capturedTypeMarker);
    }

    @NotNull
    public static final KotlinTypeMarker withNullability(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker, boolean z) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.withNullability(kotlinTypeMarker, z);
    }

    @NotNull
    public static final TypeConstructorMarker typeConstructor(@NotNull TypeSystemContext c2, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return c2.typeConstructor(kotlinTypeMarker);
    }
}
