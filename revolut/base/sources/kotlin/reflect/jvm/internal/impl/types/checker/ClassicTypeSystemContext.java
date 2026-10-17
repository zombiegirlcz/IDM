package kotlin.reflect.jvm.internal.impl.types.checker;

import h30.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.DynamicType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextKt;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes14.dex */
public interface ClassicTypeSystemContext extends TypeSystemCommonBackendContext, TypeSystemInferenceExtensionContext {
    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    CapturedTypeMarker asCapturedType(@NotNull SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker asRigidType(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    KotlinTypeMarker createFlexibleType(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull RigidTypeMarker rigidTypeMarker2);

    @NotNull
    KotlinBuiltIns getBuiltIns();

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean isSingleClassifierType(@NotNull RigidTypeMarker rigidTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean isStarProjection(@NotNull TypeArgumentMarker typeArgumentMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker lowerBound(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    TypeConstructorMarker typeConstructor(@NotNull RigidTypeMarker rigidTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker upperBound(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker withNullability(@NotNull RigidTypeMarker rigidTypeMarker, boolean z);

    public static final class DefaultImpls {
        public static boolean areEqualTypeConstructors(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker c16, @NotNull TypeConstructorMarker c2) {
            Intrinsics.checkNotNullParameter(c16, "c1");
            Intrinsics.checkNotNullParameter(c2, "c2");
            if (!(c16 instanceof TypeConstructor)) {
                StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb6.append(c16);
                sb6.append(", ");
                throw new IllegalArgumentException(l.t(o0.f186429a, c16.getClass(), sb6).toString());
            }
            if (c2 instanceof TypeConstructor) {
                return c16.equals(c2);
            }
            StringBuilder sb9 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb9.append(c2);
            sb9.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, c2.getClass(), sb9).toString());
        }

        public static int argumentsCount(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getArguments().size();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static SimpleTypeMarker arrayType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker componentType) {
            Intrinsics.checkNotNullParameter(componentType, "componentType");
            if (componentType instanceof KotlinType) {
                SimpleType arrayType = classicTypeSystemContext.getBuiltIns().getArrayType(Variance.INVARIANT, (KotlinType) componentType);
                Intrinsics.checkNotNullExpressionValue(arrayType, "getArrayType(...)");
                return arrayType;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(classicTypeSystemContext);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, classicTypeSystemContext.getClass(), sb6).toString());
        }

        @NotNull
        public static TypeArgumentListMarker asArgumentList(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return (TypeArgumentListMarker) receiver;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static CapturedTypeMarker asCapturedType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                if (receiver instanceof SimpleTypeWithEnhancement) {
                    return classicTypeSystemContext.asCapturedType(((SimpleTypeWithEnhancement) receiver).getOrigin());
                }
                if (receiver instanceof NewCapturedType) {
                    return (NewCapturedType) receiver;
                }
                return null;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static DefinitelyNotNullTypeMarker asDefinitelyNotNullType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                if (receiver instanceof DefinitelyNotNullType) {
                    return (DefinitelyNotNullType) receiver;
                }
                return null;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static DynamicTypeMarker asDynamicType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof FlexibleType) {
                if (receiver instanceof DynamicType) {
                    return (DynamicType) receiver;
                }
                return null;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static FlexibleTypeMarker asFlexibleType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                UnwrappedType unwrappedTypeUnwrap = ((KotlinType) receiver).unwrap();
                if (unwrappedTypeUnwrap instanceof FlexibleType) {
                    return (FlexibleType) unwrappedTypeUnwrap;
                }
                return null;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static SimpleTypeMarker asRigidType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                UnwrappedType unwrappedTypeUnwrap = ((KotlinType) receiver).unwrap();
                if (unwrappedTypeUnwrap instanceof SimpleType) {
                    return (SimpleType) unwrappedTypeUnwrap;
                }
                return null;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static TypeArgumentMarker asTypeArgument(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return TypeUtilsKt.asTypeProjection((KotlinType) receiver);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static SimpleType captureFromArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker type, @NotNull CaptureStatus status) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(status, "status");
            if (type instanceof SimpleType) {
                return NewCapturedTypeKt.captureFromArguments((SimpleType) type, status);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(type);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, type.getClass(), sb6).toString());
        }

        @NotNull
        public static CaptureStatus captureStatus(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).getCaptureStatus();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static KotlinTypeMarker createFlexibleType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker lowerBound, @NotNull RigidTypeMarker upperBound) {
            Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
            Intrinsics.checkNotNullParameter(upperBound, "upperBound");
            if (!(lowerBound instanceof SimpleType)) {
                StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb6.append(classicTypeSystemContext);
                sb6.append(", ");
                throw new IllegalArgumentException(l.t(o0.f186429a, classicTypeSystemContext.getClass(), sb6).toString());
            }
            if (upperBound instanceof SimpleType) {
                return KotlinTypeFactory.flexibleType((SimpleType) lowerBound, (SimpleType) upperBound);
            }
            StringBuilder sb9 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb9.append(classicTypeSystemContext);
            sb9.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, classicTypeSystemContext.getClass(), sb9).toString());
        }

        @NotNull
        public static TypeArgumentMarker getArgument(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver, int i) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getArguments().get(i);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static List<TypeArgumentMarker> getArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getArguments();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static KotlinBuiltIns getBuiltIns(@NotNull ClassicTypeSystemContext classicTypeSystemContext) {
            throw new UnsupportedOperationException("Not supported");
        }

        @NotNull
        public static FqNameUnsafe getClassFqNameUnsafe(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = ((TypeConstructor) receiver).mo3795getDeclarationDescriptor();
                Intrinsics.i(classifierDescriptorMo3795getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return DescriptorUtilsKt.getFqNameUnsafe((ClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static TypeParameterMarker getParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver, int i) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                TypeParameterDescriptor typeParameterDescriptor = ((TypeConstructor) receiver).getParameters().get(i);
                Intrinsics.checkNotNullExpressionValue(typeParameterDescriptor, "get(...)");
                return typeParameterDescriptor;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static List<TypeParameterMarker> getParameters(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                List<TypeParameterDescriptor> parameters = ((TypeConstructor) receiver).getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                return parameters;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static PrimitiveType getPrimitiveArrayType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = ((TypeConstructor) receiver).mo3795getDeclarationDescriptor();
                Intrinsics.i(classifierDescriptorMo3795getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return KotlinBuiltIns.getPrimitiveArrayType((ClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static PrimitiveType getPrimitiveType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = ((TypeConstructor) receiver).mo3795getDeclarationDescriptor();
                Intrinsics.i(classifierDescriptorMo3795getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return KotlinBuiltIns.getPrimitiveType((ClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static KotlinTypeMarker getRepresentativeUpperBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                return TypeUtilsKt.getRepresentativeUpperBound((TypeParameterDescriptor) receiver);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static KotlinTypeMarker getType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (classicTypeSystemContext.isStarProjection(receiver)) {
                return null;
            }
            if (receiver instanceof TypeProjection) {
                return ((TypeProjection) receiver).getType().unwrap();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static TypeConstructorMarker getTypeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                TypeConstructor typeConstructor = ((TypeParameterDescriptor) receiver).getTypeConstructor();
                Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
                return typeConstructor;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static TypeParameterMarker getTypeParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeVariableTypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewTypeVariableConstructor) {
                return ((NewTypeVariableConstructor) receiver).getOriginalTypeParameter();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static TypeParameterMarker getTypeParameterClassifier(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = ((TypeConstructor) receiver).mo3795getDeclarationDescriptor();
                if (classifierDescriptorMo3795getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                    return (TypeParameterDescriptor) classifierDescriptorMo3795getDeclarationDescriptor;
                }
                return null;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static KotlinTypeMarker getUnsubstitutedUnderlyingType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return InlineClassesUtilsKt.unsubstitutedUnderlyingType((KotlinType) receiver);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static List<KotlinTypeMarker> getUpperBounds(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                List<KotlinType> upperBounds = ((TypeParameterDescriptor) receiver).getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                return upperBounds;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static TypeVariance getVariance(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeProjection) {
                Variance projectionKind = ((TypeProjection) receiver).getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
                return TypeSystemContextKt.convertVariance(projectionKind);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static boolean hasAnnotation(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver, @NotNull FqName fqName) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getAnnotations().hasAnnotation(fqName);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static boolean hasRecursiveBounds(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker receiver, TypeConstructorMarker typeConstructorMarker) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof TypeParameterDescriptor)) {
                StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb6.append(receiver);
                sb6.append(", ");
                throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
            }
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) receiver;
            if (typeConstructorMarker == null ? true : typeConstructorMarker instanceof TypeConstructor) {
                return TypeUtilsKt.hasTypeParameterRecursiveBounds$default(typeParameterDescriptor, (TypeConstructor) typeConstructorMarker, null, 4, null);
            }
            StringBuilder sb9 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb9.append(typeParameterDescriptor);
            sb9.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, typeParameterDescriptor.getClass(), sb9).toString());
        }

        public static boolean identicalArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker a7, @NotNull RigidTypeMarker b4) {
            Intrinsics.checkNotNullParameter(a7, "a");
            Intrinsics.checkNotNullParameter(b4, "b");
            if (!(a7 instanceof SimpleType)) {
                StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb6.append(a7);
                sb6.append(", ");
                throw new IllegalArgumentException(l.t(o0.f186429a, a7.getClass(), sb6).toString());
            }
            if (b4 instanceof SimpleType) {
                return ((SimpleType) a7).getArguments() == ((SimpleType) b4).getArguments();
            }
            StringBuilder sb9 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb9.append(b4);
            sb9.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, b4.getClass(), sb9).toString());
        }

        @NotNull
        public static KotlinTypeMarker intersectTypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull Collection<? extends KotlinTypeMarker> types) {
            Intrinsics.checkNotNullParameter(types, "types");
            return IntersectionTypeKt.intersectTypes(types);
        }

        public static boolean isAnyConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) receiver, StandardNames.FqNames.any);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static boolean isArrayOrNullableArray(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return KotlinBuiltIns.isArray((KotlinType) receiver);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static boolean isClassTypeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).mo3795getDeclarationDescriptor() instanceof ClassDescriptor;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static boolean isCommonFinalClassConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = ((TypeConstructor) receiver).mo3795getDeclarationDescriptor();
                ClassDescriptor classDescriptor = classifierDescriptorMo3795getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor : null;
                return (classDescriptor == null || !ModalityUtilsKt.isFinalClass(classDescriptor) || classDescriptor.getKind() == ClassKind.ENUM_ENTRY || classDescriptor.getKind() == ClassKind.ANNOTATION_CLASS) ? false : true;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static boolean isDenotable(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).isDenotable();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static boolean isError(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return KotlinTypeKt.isError((KotlinType) receiver);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static boolean isInlineClass(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = ((TypeConstructor) receiver).mo3795getDeclarationDescriptor();
                ClassDescriptor classDescriptor = classifierDescriptorMo3795getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor : null;
                return (classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null) instanceof InlineClassRepresentation;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static boolean isIntegerLiteralTypeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return receiver instanceof IntegerLiteralTypeConstructor;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static boolean isIntersection(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return receiver instanceof IntersectionTypeConstructor;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static boolean isK2(@NotNull ClassicTypeSystemContext classicTypeSystemContext) {
            return false;
        }

        public static boolean isMarkedNullable(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (receiver instanceof SimpleType) && ((SimpleType) receiver).isMarkedNullable();
        }

        public static boolean isNotNullTypeParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return receiver instanceof NotNullTypeParameter;
        }

        public static boolean isNothingConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) receiver, StandardNames.FqNames.nothing);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static boolean isNullableType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return TypeUtils.isNullableType((KotlinType) receiver);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static boolean isOldCapturedType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return receiver instanceof CapturedType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isPrimitiveType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return KotlinBuiltIns.isPrimitiveType((KotlinType) receiver);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static boolean isProjectionNotNull(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).isProjectionNotNull();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static boolean isRawType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return receiver instanceof RawType;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isSingleClassifierType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof SimpleType)) {
                StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb6.append(receiver);
                sb6.append(", ");
                throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
            }
            if (KotlinTypeKt.isError((KotlinType) receiver)) {
                return false;
            }
            SimpleType simpleType = (SimpleType) receiver;
            if (simpleType.getConstructor().mo3795getDeclarationDescriptor() instanceof TypeAliasDescriptor) {
                return false;
            }
            if (simpleType.getConstructor().mo3795getDeclarationDescriptor() != null || (receiver instanceof CapturedType) || (receiver instanceof NewCapturedType) || (receiver instanceof DefinitelyNotNullType) || (simpleType.getConstructor() instanceof IntegerLiteralTypeConstructor)) {
                return true;
            }
            SimpleTypeMarker simpleTypeMarker = (SimpleTypeMarker) receiver;
            return (simpleTypeMarker instanceof SimpleTypeWithEnhancement) && classicTypeSystemContext.isSingleClassifierType(((SimpleTypeWithEnhancement) simpleTypeMarker).getOrigin());
        }

        public static boolean isStarProjection(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeProjection) {
                return ((TypeProjection) receiver).isStarProjection();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isStubType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return TypeUtilsKt.isStubType((KotlinType) receiver);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isStubTypeForBuilderInference(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return TypeUtilsKt.isStubTypeForBuilderInference((KotlinType) receiver);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static boolean isTypeVariableType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (receiver instanceof UnwrappedType) && (((UnwrappedType) receiver).getConstructor() instanceof NewTypeVariableConstructor);
        }

        public static boolean isUnderKotlinPackage(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = ((TypeConstructor) receiver).mo3795getDeclarationDescriptor();
                return classifierDescriptorMo3795getDeclarationDescriptor != null && KotlinBuiltIns.isUnderKotlinPackage(classifierDescriptorMo3795getDeclarationDescriptor);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static SimpleTypeMarker lowerBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof FlexibleType) {
                return ((FlexibleType) receiver).getLowerBound();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static KotlinTypeMarker lowerType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).getLowerType();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static KotlinTypeMarker makeDefinitelyNotNullOrNotNull(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver, boolean z) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof UnwrappedType) {
                return SpecialTypesKt.makeDefinitelyNotNullOrNotNull$default((UnwrappedType) receiver, false, 1, null);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static TypeCheckerState newTypeCheckerState(@NotNull ClassicTypeSystemContext classicTypeSystemContext, boolean z, boolean z3, boolean z4) {
            return ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(z, z3, classicTypeSystemContext, null, null, 24, null);
        }

        @NotNull
        public static SimpleTypeMarker nullableAnyType(@NotNull ClassicTypeSystemContext classicTypeSystemContext) {
            SimpleType nullableAnyType = classicTypeSystemContext.getBuiltIns().getNullableAnyType();
            Intrinsics.checkNotNullExpressionValue(nullableAnyType, "getNullableAnyType(...)");
            return nullableAnyType;
        }

        @NotNull
        public static SimpleTypeMarker original(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull DefinitelyNotNullTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof DefinitelyNotNullType) {
                return ((DefinitelyNotNullType) receiver).getOriginal();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        public static int parametersCount(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).getParameters().size();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static Collection<KotlinTypeMarker> possibleIntegerTypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            TypeConstructorMarker typeConstructorMarkerTypeConstructor = classicTypeSystemContext.typeConstructor(receiver);
            if (typeConstructorMarkerTypeConstructor instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) typeConstructorMarkerTypeConstructor).getPossibleTypes();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static TypeArgumentMarker projection(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) receiver).getProjection();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static KotlinTypeMarker safeSubstitute(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeSubstitutorMarker receiver, @NotNull KotlinTypeMarker type) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(type, "type");
            if (!(type instanceof UnwrappedType)) {
                StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb6.append(type);
                sb6.append(", ");
                throw new IllegalArgumentException(l.t(o0.f186429a, type.getClass(), sb6).toString());
            }
            if (receiver instanceof TypeSubstitutor) {
                KotlinType kotlinTypeSafeSubstitute = ((TypeSubstitutor) receiver).safeSubstitute((KotlinType) type, Variance.INVARIANT);
                Intrinsics.checkNotNullExpressionValue(kotlinTypeSafeSubstitute, "safeSubstitute(...)");
                return kotlinTypeSafeSubstitute;
            }
            StringBuilder sb9 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb9.append(receiver);
            sb9.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb9).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy(@NotNull final ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof SimpleType) {
                final TypeSubstitutor typeSubstitutorBuildSubstitutor = TypeConstructorSubstitution.Companion.create((KotlinType) type).buildSubstitutor();
                return new TypeCheckerState.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2
                    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
                    /* JADX INFO: renamed from: transformType */
                    public SimpleTypeMarker mo3797transformType(TypeCheckerState state, KotlinTypeMarker type2) {
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(type2, "type");
                        ClassicTypeSystemContext classicTypeSystemContext2 = classicTypeSystemContext;
                        Object objLowerBoundIfFlexible = classicTypeSystemContext2.lowerBoundIfFlexible(type2);
                        Intrinsics.i(objLowerBoundIfFlexible, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                        Variance variance = Variance.INVARIANT;
                        KotlinType kotlinTypeSafeSubstitute = typeSubstitutorBuildSubstitutor.safeSubstitute((KotlinType) objLowerBoundIfFlexible, variance);
                        Intrinsics.checkNotNullExpressionValue(kotlinTypeSafeSubstitute, "safeSubstitute(...)");
                        SimpleTypeMarker simpleTypeMarkerAsRigidType = classicTypeSystemContext2.asRigidType((KotlinTypeMarker) kotlinTypeSafeSubstitute);
                        Intrinsics.h(simpleTypeMarkerAsRigidType);
                        return simpleTypeMarkerAsRigidType;
                    }
                };
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(type);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, type.getClass(), sb6).toString());
        }

        @NotNull
        public static Collection<KotlinTypeMarker> supertypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                Collection<KotlinType> supertypes = ((TypeConstructor) receiver).getSupertypes();
                Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
                return supertypes;
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static TypeConstructorMarker typeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).getConstructor();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static TypeSubstitutorMarker typeSubstitutorForUnderlyingType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull Map<TypeConstructorMarker, ? extends KotlinTypeMarker> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<TypeConstructorMarker, ? extends KotlinTypeMarker> entry : map.entrySet()) {
                TypeConstructorMarker key = entry.getKey();
                KotlinTypeMarker value = entry.getValue();
                Intrinsics.i(key, "null cannot be cast to non-null type org.jetbrains.kotlin.types.TypeConstructor");
                Intrinsics.i(value, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                arrayList.add(new Pair((TypeConstructor) key, TypeUtilsKt.asTypeProjection((KotlinType) value)));
            }
            TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create((Map<TypeConstructor, TypeProjection>) r0.t(arrayList));
            Intrinsics.checkNotNullExpressionValue(typeSubstitutorCreate, "let(...)");
            return typeSubstitutorCreate;
        }

        @NotNull
        public static SimpleTypeMarker upperBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof FlexibleType) {
                return ((FlexibleType) receiver).getUpperBound();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static SimpleTypeMarker withNullability(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker receiver, boolean z) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).makeNullableAsSpecified(z);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static TypeVariance getVariance(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                Variance variance = ((TypeParameterDescriptor) receiver).getVariance();
                Intrinsics.checkNotNullExpressionValue(variance, "getVariance(...)");
                return TypeSystemContextKt.convertVariance(variance);
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static CapturedTypeConstructorMarker typeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).getConstructor();
            }
            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb6.append(receiver);
            sb6.append(", ");
            throw new IllegalArgumentException(l.t(o0.f186429a, receiver.getClass(), sb6).toString());
        }

        @NotNull
        public static KotlinTypeMarker withNullability(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver, boolean z) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof RigidTypeMarker) {
                return classicTypeSystemContext.withNullability((RigidTypeMarker) receiver, z);
            }
            if (!(receiver instanceof FlexibleTypeMarker)) {
                throw new IllegalStateException("sealed");
            }
            FlexibleTypeMarker flexibleTypeMarker = (FlexibleTypeMarker) receiver;
            return classicTypeSystemContext.createFlexibleType(classicTypeSystemContext.withNullability((RigidTypeMarker) classicTypeSystemContext.lowerBound(flexibleTypeMarker), z), classicTypeSystemContext.withNullability((RigidTypeMarker) classicTypeSystemContext.upperBound(flexibleTypeMarker), z));
        }
    }
}
