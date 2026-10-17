package ckm;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import zhm.d0;
import zhm.f0;
import zim.b0;
import zim.e0;
import zim.o2;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f24899c;
    public final Object d;

    public /* synthetic */ c(Object obj2, int i, Object obj3, Object obj4) {
        this.f24897a = i;
        this.f24898b = obj2;
        this.f24899c = obj3;
        this.d = obj4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24897a) {
            case 0:
                MemberDeserializer memberDeserializer = (MemberDeserializer) this.f24898b;
                MessageLite messageLite = (MessageLite) this.f24899c;
                AnnotatedCallableKind annotatedCallableKind = (AnnotatedCallableKind) this.d;
                ProtoContainer protoContainerA = memberDeserializer.a(memberDeserializer.f187692a.getContainingDeclaration());
                List listD1 = protoContainerA != null ? d0.d1(memberDeserializer.f187692a.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(protoContainerA, messageLite, annotatedCallableKind)) : null;
                return listD1 == null ? f0.f322471a : listD1;
            case 1:
                MemberDeserializer memberDeserializer2 = (MemberDeserializer) this.f24898b;
                MessageLite messageLite2 = (MessageLite) this.f24899c;
                AnnotatedCallableKind annotatedCallableKind2 = (AnnotatedCallableKind) this.d;
                ProtoContainer protoContainerA2 = memberDeserializer2.a(memberDeserializer2.f187692a.getContainingDeclaration());
                List<AnnotationDescriptor> listLoadExtensionReceiverParameterAnnotations = protoContainerA2 != null ? memberDeserializer2.f187692a.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(protoContainerA2, messageLite2, annotatedCallableKind2) : null;
                return listLoadExtensionReceiverParameterAnnotations == null ? f0.f322471a : listLoadExtensionReceiverParameterAnnotations;
            default:
                KotlinType kotlinType = (KotlinType) this.f24898b;
                b0 b0Var = (b0) this.f24899c;
                e0 e0Var = (e0) this.d;
                ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = kotlinType.getConstructor().mo3795getDeclarationDescriptor();
                if (!(classifierDescriptorMo3795getDeclarationDescriptor instanceof ClassDescriptor)) {
                    throw new KotlinReflectionInternalError("Supertype not a class: " + classifierDescriptorMo3795getDeclarationDescriptor);
                }
                Class clsJ = o2.j((ClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor);
                if (clsJ == null) {
                    throw new KotlinReflectionInternalError("Unsupported superclass of " + b0Var + ": " + classifierDescriptorMo3795getDeclarationDescriptor);
                }
                Class cls = e0Var.f322627b;
                if (Intrinsics.f(cls.getSuperclass(), clsJ)) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    Intrinsics.h(genericSuperclass);
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
                int iY = kotlin.collections.d.Y(interfaces, clsJ);
                if (iY >= 0) {
                    Type type = cls.getGenericInterfaces()[iY];
                    Intrinsics.h(type);
                    return type;
                }
                throw new KotlinReflectionInternalError("No superclass of " + b0Var + " in Java reflection for " + classifierDescriptorMo3795getDeclarationDescriptor);
        }
    }
}
