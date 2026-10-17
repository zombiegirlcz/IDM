package kem;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes23.dex */
public final class s0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f183237a = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f183238b = com.bumptech.glide.c.a("io.ktor.http.Url", olm.e.f226474j);

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return a1m.e.b(decoder.decodeString());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f183238b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        q0 value = (q0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.f);
    }
}
