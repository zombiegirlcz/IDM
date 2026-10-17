package ckm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MemberDeserializer f24904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProtoContainer f24905c;
    public final MessageLite d;
    public final AnnotatedCallableKind e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProtoBuf.ValueParameter f24906g;

    public /* synthetic */ e(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter, int i2) {
        this.f24903a = i2;
        this.f24904b = memberDeserializer;
        this.f24905c = protoContainer;
        this.d = messageLite;
        this.e = annotatedCallableKind;
        this.f = i;
        this.f24906g = valueParameter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24903a) {
            case 0:
                return d0.d1(this.f24904b.f187692a.getComponents().getAnnotationAndConstantLoader().loadValueParameterAnnotations(this.f24905c, this.d, this.e, this.f, this.f24906g));
            default:
                return d0.d1(this.f24904b.f187692a.getComponents().getAnnotationAndConstantLoader().loadContextParameterAnnotations(this.f24905c, this.d, this.e, this.f, this.f24906g));
        }
    }
}
