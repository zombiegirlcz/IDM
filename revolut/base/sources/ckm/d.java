package ckm;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MemberDeserializer f24900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProtoBuf.Property f24902c;

    public d(MemberDeserializer memberDeserializer, boolean z, ProtoBuf.Property property) {
        this.f24900a = memberDeserializer;
        this.f24901b = z;
        this.f24902c = property;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listD1;
        MemberDeserializer memberDeserializer = this.f24900a;
        DeserializationContext deserializationContext = memberDeserializer.f187692a;
        ProtoContainer protoContainerA = memberDeserializer.a(deserializationContext.getContainingDeclaration());
        if (protoContainerA != null) {
            boolean z = this.f24901b;
            ProtoBuf.Property property = this.f24902c;
            listD1 = z ? d0.d1(deserializationContext.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(protoContainerA, property)) : d0.d1(deserializationContext.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(protoContainerA, property));
        } else {
            listD1 = null;
        }
        return listD1 == null ? f0.f322471a : listD1;
    }
}
