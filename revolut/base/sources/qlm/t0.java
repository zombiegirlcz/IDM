package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class t0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f247706a = new t0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f247707b = new n1("kotlin.Long", olm.e.f226473h);

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf(decoder.decodeLong());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f247707b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        long jLongValue = ((Number) obj2).longValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeLong(jLongValue);
    }
}
