package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ckm.b;
import ckm.c;
import ckm.d;
import ckm.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class MemberDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeserializationContext f187692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnnotationDeserializer f187693b;

    public MemberDeserializer(@NotNull DeserializationContext c2) {
        Intrinsics.checkNotNullParameter(c2, "c");
        this.f187692a = c2;
        this.f187693b = new AnnotationDeserializer(c2.getComponents().getModuleDescriptor(), c2.getComponents().getNotFoundClasses());
    }

    public static /* synthetic */ PropertyDescriptor loadProperty$default(MemberDeserializer memberDeserializer, ProtoBuf.Property property, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        return memberDeserializer.loadProperty(property, z);
    }

    public final ProtoContainer a(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            FqName fqName = ((PackageFragmentDescriptor) declarationDescriptor).getFqName();
            DeserializationContext deserializationContext = this.f187692a;
            return new ProtoContainer.Package(fqName, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), deserializationContext.getContainerSource());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }

    public final ArrayList b(List list, List list2, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind) {
        MemberDeserializer memberDeserializer = this;
        DeserializationContext deserializationContext = memberDeserializer.f187692a;
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        Intrinsics.i(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        DeclarationDescriptor containingDeclaration2 = callableDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "getContainingDeclaration(...)");
        ProtoContainer protoContainerA = memberDeserializer.a(containingDeclaration2);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            ProtoBuf.Type type = (ProtoBuf.Type) obj2;
            ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) d0.e0(i, list2);
            ReceiverParameterDescriptor receiverParameterDescriptorCreateContextReceiverParameterForCallable = DescriptorFactory.createContextReceiverParameterForCallable(callableDescriptor, deserializationContext.getTypeDeserializer().type(type), null, (protoContainerA == null || !Flags.HAS_ANNOTATIONS.get((valueParameter == null || !valueParameter.hasFlags()) ? 0 : valueParameter.getFlags()).booleanValue()) ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(deserializationContext.getStorageManager(), new e(memberDeserializer, protoContainerA, extendableMessage, annotatedCallableKind, i, valueParameter, 1)), i);
            if (receiverParameterDescriptorCreateContextReceiverParameterForCallable != null) {
                arrayList.add(receiverParameterDescriptorCreateContextReceiverParameterForCallable);
            }
            memberDeserializer = this;
            i = i2;
        }
        return arrayList;
    }

    public final Annotations c(GeneratedMessageLite.ExtendableMessage extendableMessage, int i, AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.HAS_ANNOTATIONS.get(i).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f187692a.getStorageManager(), new c(this, 0, extendableMessage, annotatedCallableKind));
    }

    public final Annotations d(ProtoBuf.Property property, boolean z) {
        return !Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f187692a.getStorageManager(), new d(this, z, property));
    }

    public final List e(List list, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind) {
        MemberDeserializer memberDeserializer = this;
        DeserializationContext deserializationContext = memberDeserializer.f187692a;
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        Intrinsics.i(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        DeclarationDescriptor containingDeclaration2 = callableDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "getContainingDeclaration(...)");
        ProtoContainer protoContainerA = memberDeserializer.a(containingDeclaration2);
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            KotlinType kotlinTypeType = null;
            if (i < 0) {
                v.s();
                throw null;
            }
            ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj2;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            Annotations empty = (protoContainerA == null || !Flags.HAS_ANNOTATIONS.get(flags).booleanValue()) ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(deserializationContext.getStorageManager(), new e(memberDeserializer, protoContainerA, extendableMessage, annotatedCallableKind, i, valueParameter, 0));
            Name name = NameResolverUtilKt.getName(deserializationContext.getNameResolver(), valueParameter.getName());
            KotlinType kotlinTypeType2 = deserializationContext.getTypeDeserializer().type(ProtoTypeTableUtilKt.type(valueParameter, deserializationContext.getTypeTable()));
            Boolean bool = Flags.DECLARES_DEFAULT_VALUE.get(flags);
            Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
            boolean zBooleanValue = bool.booleanValue();
            Boolean bool2 = Flags.IS_CROSSINLINE.get(flags);
            Intrinsics.checkNotNullExpressionValue(bool2, "get(...)");
            boolean zBooleanValue2 = bool2.booleanValue();
            Boolean bool3 = Flags.IS_NOINLINE.get(flags);
            Intrinsics.checkNotNullExpressionValue(bool3, "get(...)");
            boolean zBooleanValue3 = bool3.booleanValue();
            ProtoBuf.Type typeVarargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, deserializationContext.getTypeTable());
            if (typeVarargElementType != null) {
                kotlinTypeType = deserializationContext.getTypeDeserializer().type(typeVarargElementType);
            }
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ValueParameterDescriptorImpl(callableDescriptor, null, i, empty, name, kotlinTypeType2, zBooleanValue, zBooleanValue2, zBooleanValue3, kotlinTypeType, NO_SOURCE));
            memberDeserializer = this;
            arrayList = arrayList2;
            i = i2;
        }
        return d0.d1(arrayList);
    }

    @NotNull
    public final ClassConstructorDescriptor loadConstructor(@NotNull ProtoBuf.Constructor proto, boolean z) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        DeserializationContext deserializationContext = this.f187692a;
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        Intrinsics.i(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        int flags = proto.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, c(proto, flags, annotatedCallableKind), z, CallableMemberDescriptor.Kind.DECLARATION, proto, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), deserializationContext.getVersionRequirementTable(), deserializationContext.getContainerSource(), null, 1024, null);
        MemberDeserializer memberDeserializer = DeserializationContext.childContext$default(this.f187692a, deserializedClassConstructorDescriptor, f0.f322471a, null, null, null, null, 60, null).getMemberDeserializer();
        List valueParameterList = proto.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
        deserializedClassConstructorDescriptor.initialize(memberDeserializer.e(valueParameterList, proto, annotatedCallableKind), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())));
        deserializedClassConstructorDescriptor.setReturnType(classDescriptor.getDefaultType());
        deserializedClassConstructorDescriptor.setExpect(classDescriptor.isExpect());
        deserializedClassConstructorDescriptor.setHasStableParameterNames(!Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.get(proto.getFlags()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    @NotNull
    public final SimpleFunctionDescriptor loadFunction(@NotNull ProtoBuf.Function proto) {
        int flags;
        KotlinType kotlinTypeType;
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (proto.hasFlags()) {
            flags = proto.getFlags();
        } else {
            int oldFlags = proto.getOldFlags();
            flags = ((oldFlags >> 8) << 6) + (oldFlags & 63);
        }
        int i = flags;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotationsC = c(proto, i, annotatedCallableKind);
        boolean zHasReceiver = ProtoTypeTableUtilKt.hasReceiver(proto);
        DeserializationContext deserializationContext = this.f187692a;
        Annotations deserializedAnnotations = zHasReceiver ? new DeserializedAnnotations(deserializationContext.getStorageManager(), new c(this, 1, proto, annotatedCallableKind)) : Annotations.Companion.getEMPTY();
        VersionRequirementTable empty = Intrinsics.f(DescriptorUtilsKt.getFqNameSafe(deserializationContext.getContainingDeclaration()).child(NameResolverUtilKt.getName(deserializationContext.getNameResolver(), proto.getName())), SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? VersionRequirementTable.Companion.getEMPTY() : deserializationContext.getVersionRequirementTable();
        Annotations annotations = deserializedAnnotations;
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        Name name = NameResolverUtilKt.getName(deserializationContext.getNameResolver(), proto.getName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(containingDeclaration, null, annotationsC, name, ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags, Flags.MEMBER_KIND.get(i)), proto, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), empty, deserializationContext.getContainerSource(), null, 1024, null);
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(this.f187692a, deserializedSimpleFunctionDescriptor, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(proto, deserializationContext.getTypeTable());
        ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, kotlinTypeType, annotations);
        DeclarationDescriptor containingDeclaration2 = deserializationContext.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration2 instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration2 : null;
        ReceiverParameterDescriptor thisAsReceiverParameter = classDescriptor != null ? classDescriptor.getThisAsReceiverParameter() : null;
        MemberDeserializer memberDeserializer = deserializationContextChildContext$default.getMemberDeserializer();
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(proto, deserializationContext.getTypeTable());
        List<ProtoBuf.ValueParameter> contextParameterList = proto.getContextParameterList();
        Intrinsics.checkNotNullExpressionValue(contextParameterList, "getContextParameterList(...)");
        ArrayList arrayListB = memberDeserializer.b(listContextReceiverTypes, contextParameterList, proto, annotatedCallableKind);
        List<TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        MemberDeserializer memberDeserializer2 = deserializationContextChildContext$default.getMemberDeserializer();
        List valueParameterList = proto.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
        deserializedSimpleFunctionDescriptor.initialize(receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, thisAsReceiverParameter, arrayListB, ownTypeParameters, memberDeserializer2.e(valueParameterList, proto, annotatedCallableKind), deserializationContextChildContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(proto, deserializationContext.getTypeTable())), protoEnumFlags.modality(Flags.MODALITY.get(i)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(i)), r0.g());
        Boolean bool = Flags.IS_OPERATOR.get(i);
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        deserializedSimpleFunctionDescriptor.setOperator(bool.booleanValue());
        Boolean bool2 = Flags.IS_INFIX.get(i);
        Intrinsics.checkNotNullExpressionValue(bool2, "get(...)");
        deserializedSimpleFunctionDescriptor.setInfix(bool2.booleanValue());
        Boolean bool3 = Flags.IS_EXTERNAL_FUNCTION.get(i);
        Intrinsics.checkNotNullExpressionValue(bool3, "get(...)");
        deserializedSimpleFunctionDescriptor.setExternal(bool3.booleanValue());
        Boolean bool4 = Flags.IS_INLINE.get(i);
        Intrinsics.checkNotNullExpressionValue(bool4, "get(...)");
        deserializedSimpleFunctionDescriptor.setInline(bool4.booleanValue());
        Boolean bool5 = Flags.IS_TAILREC.get(i);
        Intrinsics.checkNotNullExpressionValue(bool5, "get(...)");
        deserializedSimpleFunctionDescriptor.setTailrec(bool5.booleanValue());
        Boolean bool6 = Flags.IS_SUSPEND.get(i);
        Intrinsics.checkNotNullExpressionValue(bool6, "get(...)");
        deserializedSimpleFunctionDescriptor.setSuspend(bool6.booleanValue());
        Boolean bool7 = Flags.IS_EXPECT_FUNCTION.get(i);
        Intrinsics.checkNotNullExpressionValue(bool7, "get(...)");
        deserializedSimpleFunctionDescriptor.setExpect(bool7.booleanValue());
        deserializedSimpleFunctionDescriptor.setHasStableParameterNames(!Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.get(i).booleanValue());
        Pair<CallableDescriptor.UserDataKey<?>, Object> pairDeserializeContractFromFunction = deserializationContext.getComponents().getContractDeserializer().deserializeContractFromFunction(proto, deserializedSimpleFunctionDescriptor, deserializationContext.getTypeTable(), deserializationContextChildContext$default.getTypeDeserializer());
        if (pairDeserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap((CallableDescriptor.UserDataKey) pairDeserializeContractFromFunction.f186385a, pairDeserializeContractFromFunction.f186386b);
        }
        return deserializedSimpleFunctionDescriptor;
    }

    @NotNull
    public final PropertyDescriptor loadProperty(@NotNull ProtoBuf.Property proto, boolean z) {
        int flags;
        Annotations annotationsC;
        Flags.FlagField<ProtoBuf.Visibility> flagField;
        Flags.FlagField<ProtoBuf.Modality> flagField2;
        ProtoEnumFlags protoEnumFlags;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        boolean z3;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        KotlinType kotlinTypeType;
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (proto.hasFlags()) {
            flags = proto.getFlags();
        } else {
            int oldFlags = proto.getOldFlags();
            flags = ((oldFlags >> 8) << 6) + (oldFlags & 63);
        }
        DeserializationContext deserializationContext = this.f187692a;
        if (z) {
            Annotations.Companion companion = Annotations.Companion;
            List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
            Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
            List<ProtoBuf.Annotation> list = annotationList;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (ProtoBuf.Annotation annotation : list) {
                Intrinsics.h(annotation);
                arrayList.add(this.f187693b.deserializeAnnotation(annotation, deserializationContext.getNameResolver()));
            }
            annotationsC = companion.create(arrayList);
        } else {
            annotationsC = null;
        }
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        if (annotationsC == null) {
            annotationsC = c(proto, flags, AnnotatedCallableKind.PROPERTY);
        }
        ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.INSTANCE;
        Flags.FlagField<ProtoBuf.Modality> flagField3 = Flags.MODALITY;
        Modality modality = protoEnumFlags2.modality(flagField3.get(flags));
        Flags.FlagField<ProtoBuf.Visibility> flagField4 = Flags.VISIBILITY;
        DescriptorVisibility descriptorVisibility = ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField4.get(flags));
        Boolean bool = Flags.IS_VAR.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        boolean zBooleanValue = bool.booleanValue();
        Name name = NameResolverUtilKt.getName(deserializationContext.getNameResolver(), proto.getName());
        CallableMemberDescriptor.Kind kindMemberKind = ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags2, Flags.MEMBER_KIND.get(flags));
        Boolean bool2 = Flags.IS_LATEINIT.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool2, "get(...)");
        boolean zBooleanValue2 = bool2.booleanValue();
        Boolean bool3 = Flags.IS_CONST.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool3, "get(...)");
        boolean zBooleanValue3 = bool3.booleanValue();
        Boolean bool4 = Flags.IS_EXTERNAL_PROPERTY.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool4, "get(...)");
        boolean zBooleanValue4 = bool4.booleanValue();
        Boolean bool5 = Flags.IS_DELEGATED.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool5, "get(...)");
        boolean zBooleanValue5 = bool5.booleanValue();
        Boolean bool6 = Flags.IS_EXPECT_PROPERTY.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool6, "get(...)");
        int i = flags;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor = new DeserializedPropertyDescriptor(containingDeclaration, null, annotationsC, modality, descriptorVisibility, zBooleanValue, name, kindMemberKind, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, bool6.booleanValue(), proto, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), deserializationContext.getVersionRequirementTable(), deserializationContext.getContainerSource());
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(this.f187692a, deserializedPropertyDescriptor, typeParameterList, null, null, null, null, 60, null);
        Boolean bool7 = Flags.HAS_GETTER.get(i);
        Intrinsics.checkNotNullExpressionValue(bool7, "get(...)");
        boolean zBooleanValue6 = bool7.booleanValue();
        Annotations deserializedAnnotations = (zBooleanValue6 && ProtoTypeTableUtilKt.hasReceiver(proto)) ? new DeserializedAnnotations(deserializationContext.getStorageManager(), new c(this, 1, proto, AnnotatedCallableKind.PROPERTY_GETTER)) : Annotations.Companion.getEMPTY();
        KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(proto, deserializationContext.getTypeTable()));
        List<TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        DeclarationDescriptor containingDeclaration2 = deserializationContext.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration2 instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration2 : null;
        ReceiverParameterDescriptor thisAsReceiverParameter = classDescriptor != null ? classDescriptor.getThisAsReceiverParameter() : null;
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(proto, deserializationContext.getTypeTable());
        ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor, kotlinTypeType, deserializedAnnotations);
        MemberDeserializer memberDeserializer = deserializationContextChildContext$default.getMemberDeserializer();
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(proto, deserializationContext.getTypeTable());
        List<ProtoBuf.ValueParameter> contextParameterList = proto.getContextParameterList();
        Intrinsics.checkNotNullExpressionValue(contextParameterList, "getContextParameterList(...)");
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_GETTER;
        deserializedPropertyDescriptor.setType(kotlinTypeType2, ownTypeParameters, thisAsReceiverParameter, receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, memberDeserializer.b(listContextReceiverTypes, contextParameterList, proto, annotatedCallableKind));
        Boolean bool8 = Flags.HAS_ANNOTATIONS.get(i);
        Intrinsics.checkNotNullExpressionValue(bool8, "get(...)");
        int accessorFlags = Flags.getAccessorFlags(bool8.booleanValue(), flagField4.get(i), flagField3.get(i), false, false, false);
        if (zBooleanValue6) {
            int getterFlags = proto.hasGetterFlags() ? proto.getGetterFlags() : accessorFlags;
            Boolean bool9 = Flags.IS_NOT_DEFAULT.get(getterFlags);
            Intrinsics.checkNotNullExpressionValue(bool9, "get(...)");
            boolean zBooleanValue7 = bool9.booleanValue();
            Boolean bool10 = Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags);
            Intrinsics.checkNotNullExpressionValue(bool10, "get(...)");
            boolean zBooleanValue8 = bool10.booleanValue();
            Boolean bool11 = Flags.IS_INLINE_ACCESSOR.get(getterFlags);
            Intrinsics.checkNotNullExpressionValue(bool11, "get(...)");
            boolean zBooleanValue9 = bool11.booleanValue();
            Annotations annotationsC2 = c(proto, getterFlags, annotatedCallableKind);
            if (zBooleanValue7) {
                protoEnumFlags = protoEnumFlags2;
                flagField = flagField4;
                flagField2 = flagField3;
                propertyGetterDescriptorImplCreateDefaultGetter = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotationsC2, protoEnumFlags2.modality(flagField3.get(getterFlags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField4.get(getterFlags)), !zBooleanValue7, zBooleanValue8, zBooleanValue9, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
            } else {
                flagField = flagField4;
                flagField2 = flagField3;
                protoEnumFlags = protoEnumFlags2;
                propertyGetterDescriptorImplCreateDefaultGetter = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotationsC2);
                Intrinsics.h(propertyGetterDescriptorImplCreateDefaultGetter);
            }
            propertyGetterDescriptorImplCreateDefaultGetter.initialize(deserializedPropertyDescriptor.getReturnType());
        } else {
            flagField = flagField4;
            flagField2 = flagField3;
            protoEnumFlags = protoEnumFlags2;
            propertyGetterDescriptorImplCreateDefaultGetter = null;
        }
        if (Flags.HAS_SETTER.get(i).booleanValue()) {
            if (proto.hasSetterFlags()) {
                accessorFlags = proto.getSetterFlags();
            }
            int i2 = accessorFlags;
            Boolean bool12 = Flags.IS_NOT_DEFAULT.get(i2);
            Intrinsics.checkNotNullExpressionValue(bool12, "get(...)");
            boolean zBooleanValue10 = bool12.booleanValue();
            Boolean bool13 = Flags.IS_EXTERNAL_ACCESSOR.get(i2);
            Intrinsics.checkNotNullExpressionValue(bool13, "get(...)");
            boolean zBooleanValue11 = bool13.booleanValue();
            Boolean bool14 = Flags.IS_INLINE_ACCESSOR.get(i2);
            Intrinsics.checkNotNullExpressionValue(bool14, "get(...)");
            boolean zBooleanValue12 = bool14.booleanValue();
            AnnotatedCallableKind annotatedCallableKind2 = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotationsC3 = c(proto, i2, annotatedCallableKind2);
            if (zBooleanValue10) {
                ProtoEnumFlags protoEnumFlags3 = protoEnumFlags;
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
                z3 = true;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotationsC3, protoEnumFlags3.modality(flagField2.get(i2)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags3, flagField.get(i2)), !zBooleanValue10, zBooleanValue11, zBooleanValue12, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
                propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) d0.K0(DeserializationContext.childContext$default(deserializationContextChildContext$default, propertySetterDescriptorImpl2, f0.f322471a, null, null, null, null, 60, null).getMemberDeserializer().e(u.c(proto.getSetterValueParameter()), proto, annotatedCallableKind2)));
            } else {
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
                z3 = true;
                PropertySetterDescriptorImpl propertySetterDescriptorImplCreateDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotationsC3, Annotations.Companion.getEMPTY());
                Intrinsics.h(propertySetterDescriptorImplCreateDefaultSetter);
                propertySetterDescriptorImpl = propertySetterDescriptorImplCreateDefaultSetter;
            }
        } else {
            propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
            z3 = true;
            propertySetterDescriptorImpl = null;
        }
        if (Flags.HAS_CONSTANT.get(i).booleanValue()) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new b(this, proto, deserializedPropertyDescriptor, 0));
        }
        DeclarationDescriptor containingDeclaration3 = deserializationContext.getContainingDeclaration();
        ClassDescriptor classDescriptor2 = containingDeclaration3 instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration3 : null;
        if ((classDescriptor2 != null ? classDescriptor2.getKind() : null) == ClassKind.ANNOTATION_CLASS) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new b(this, proto, deserializedPropertyDescriptor, 1));
        }
        deserializedPropertyDescriptor.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, new FieldDescriptorImpl(d(proto, false), deserializedPropertyDescriptor), new FieldDescriptorImpl(d(proto, z3), deserializedPropertyDescriptor));
        return deserializedPropertyDescriptor;
    }

    @NotNull
    public final TypeAliasDescriptor loadTypeAlias(@NotNull ProtoBuf.TypeAlias proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Annotations.Companion companion = Annotations.Companion;
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
        List<ProtoBuf.Annotation> list = annotationList;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator<T> it8 = list.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            DeserializationContext deserializationContext = this.f187692a;
            if (!zHasNext) {
                DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(deserializationContext.getStorageManager(), deserializationContext.getContainingDeclaration(), companion.create(arrayList), NameResolverUtilKt.getName(deserializationContext.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())), proto, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), deserializationContext.getVersionRequirementTable(), deserializationContext.getContainerSource());
                List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
                Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
                DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(this.f187692a, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
                deserializedTypeAliasDescriptor.initialize(deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters(), deserializationContextChildContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.underlyingType(proto, deserializationContext.getTypeTable()), false), deserializationContextChildContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.expandedType(proto, deserializationContext.getTypeTable()), false));
                return deserializedTypeAliasDescriptor;
            }
            ProtoBuf.Annotation annotation = (ProtoBuf.Annotation) it8.next();
            Intrinsics.h(annotation);
            arrayList.add(this.f187693b.deserializeAnnotation(annotation, deserializationContext.getNameResolver()));
        }
    }
}
