package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes14.dex */
public final class c1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer f247624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f247625b;

    public c1(KSerializer serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f247624a = serializer;
        this.f247625b = new q1(serializer.getDescriptor());
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.decodeNotNullMark() ? decoder.b(this.f247624a) : decoder.decodeNull();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return obj2 != null && c1.class == obj2.getClass() && Intrinsics.f(this.f247624a, ((c1) obj2).f247624a);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return this.f247625b;
    }

    public final int hashCode() {
        return this.f247624a.hashCode();
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (obj2 != null) {
            encoder.encodeSerializableValue(this.f247624a, obj2);
        } else {
            encoder.encodeNull();
        }
    }
}
