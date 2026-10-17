package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class u1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u1 f247712a = new u1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f247713b = new n1("kotlin.Short", olm.e.i);

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Short.valueOf(decoder.decodeShort());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f247713b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        short sShortValue = ((Number) obj2).shortValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeShort(sShortValue);
    }
}
