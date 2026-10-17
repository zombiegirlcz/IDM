package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class DefinitelyNotNullType extends DelegatingSimpleType implements CustomTypeParameter, DefinitelyNotNullTypeMarker {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SimpleType f187766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f187767c;

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ DefinitelyNotNullType makeDefinitelyNotNull$default(Companion companion, UnwrappedType unwrappedType, boolean z, boolean z3, int i, Object obj2) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z3 = false;
            }
            return companion.makeDefinitelyNotNull(unwrappedType, z, z3);
        }

        public final DefinitelyNotNullType makeDefinitelyNotNull(@NotNull UnwrappedType type, boolean z, boolean z3) {
            boolean zIsNullableType;
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof DefinitelyNotNullType) {
                return (DefinitelyNotNullType) type;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!z3) {
                if (!(type.getConstructor() instanceof NewTypeVariableConstructor) && !(type.getConstructor().mo3795getDeclarationDescriptor() instanceof TypeParameterDescriptor) && !(type instanceof NewCapturedType) && !(type instanceof StubTypeForBuilderInference)) {
                    zIsNullableType = false;
                } else if (type instanceof StubTypeForBuilderInference) {
                    zIsNullableType = TypeUtils.isNullableType(type);
                } else {
                    ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = type.getConstructor().mo3795getDeclarationDescriptor();
                    TypeParameterDescriptorImpl typeParameterDescriptorImpl = classifierDescriptorMo3795getDeclarationDescriptor instanceof TypeParameterDescriptorImpl ? (TypeParameterDescriptorImpl) classifierDescriptorMo3795getDeclarationDescriptor : null;
                    zIsNullableType = (typeParameterDescriptorImpl == null || typeParameterDescriptorImpl.isInitialized()) ? (z && (type.getConstructor().mo3795getDeclarationDescriptor() instanceof TypeParameterDescriptor)) ? TypeUtils.isNullableType(type) : !NullabilityChecker.INSTANCE.isSubtypeOfAny(type) : true;
                }
                if (!zIsNullableType) {
                    return null;
                }
            }
            if (type instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) type;
                Intrinsics.f(flexibleType.getLowerBound().getConstructor(), flexibleType.getUpperBound().getConstructor());
            }
            return new DefinitelyNotNullType(FlexibleTypesKt.lowerIfFlexible(type).makeNullableAsSpecified(false), z, defaultConstructorMarker);
        }
    }

    public /* synthetic */ DefinitelyNotNullType(SimpleType simpleType, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(simpleType, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType getDelegate() {
        return this.f187766b;
    }

    @NotNull
    public final SimpleType getOriginal() {
        return this.f187766b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean isTypeParameter() {
        SimpleType simpleType = this.f187766b;
        return (simpleType.getConstructor() instanceof NewTypeVariableConstructor) || (simpleType.getConstructor().mo3795getDeclarationDescriptor() instanceof TypeParameterDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    @NotNull
    public KotlinType substitutionResult(@NotNull KotlinType replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return SpecialTypesKt.makeDefinitelyNotNullOrNotNull(replacement.unwrap(), this.f187767c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        return this.f187766b + " & Any";
    }

    public DefinitelyNotNullType(SimpleType simpleType, boolean z) {
        this.f187766b = simpleType;
        this.f187767c = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z) {
        return z ? this.f187766b.makeNullableAsSpecified(z) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new DefinitelyNotNullType(this.f187766b.replaceAttributes(newAttributes), this.f187767c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public DefinitelyNotNullType replaceDelegate(@NotNull SimpleType delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new DefinitelyNotNullType(delegate, this.f187767c);
    }
}
