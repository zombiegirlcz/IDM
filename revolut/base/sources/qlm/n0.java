package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class n0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f247680a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f247681b = new n1("kotlin.Int", olm.e.f226472g);

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Integer.valueOf(decoder.decodeInt());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f247681b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInt(iIntValue);
    }
}
