package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class k implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f247670a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f247671b = new n1("kotlin.Byte", olm.e.f226471c);

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Byte.valueOf(decoder.decodeByte());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f247671b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        byte bByteValue = ((Number) obj2).byteValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeByte(bByteValue);
    }
}
