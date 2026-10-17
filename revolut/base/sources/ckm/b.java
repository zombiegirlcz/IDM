package ckm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MemberDeserializer f24895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProtoBuf.Property f24896c;
    public final DeserializedPropertyDescriptor d;

    public /* synthetic */ b(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor, int i) {
        this.f24894a = i;
        this.f24895b = memberDeserializer;
        this.f24896c = property;
        this.d = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24894a) {
            case 0:
                MemberDeserializer memberDeserializer = this.f24895b;
                return memberDeserializer.f187692a.getStorageManager().createNullableLazyValue(new b(memberDeserializer, this.f24896c, this.d, 2));
            case 1:
                MemberDeserializer memberDeserializer2 = this.f24895b;
                return memberDeserializer2.f187692a.getStorageManager().createNullableLazyValue(new b(memberDeserializer2, this.f24896c, this.d, 3));
            case 2:
                MemberDeserializer memberDeserializer3 = this.f24895b;
                ProtoContainer protoContainerA = memberDeserializer3.a(memberDeserializer3.f187692a.getContainingDeclaration());
                Intrinsics.h(protoContainerA);
                AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = memberDeserializer3.f187692a.getComponents().getAnnotationAndConstantLoader();
                KotlinType returnType = this.d.getReturnType();
                Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                return annotationAndConstantLoader.loadPropertyConstant(protoContainerA, this.f24896c, returnType);
            default:
                MemberDeserializer memberDeserializer4 = this.f24895b;
                ProtoContainer protoContainerA2 = memberDeserializer4.a(memberDeserializer4.f187692a.getContainingDeclaration());
                Intrinsics.h(protoContainerA2);
                AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader2 = memberDeserializer4.f187692a.getComponents().getAnnotationAndConstantLoader();
                KotlinType returnType2 = this.d.getReturnType();
                Intrinsics.checkNotNullExpressionValue(returnType2, "getReturnType(...)");
                return annotationAndConstantLoader2.loadAnnotationDefaultValue(protoContainerA2, this.f24896c, returnType2);
        }
    }
}
