package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class e0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f247634a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f247635b = new n1("kotlin.Float", olm.e.f);

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Float.valueOf(decoder.decodeFloat());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f247635b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        float fFloatValue = ((Number) obj2).floatValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeFloat(fFloatValue);
    }
}
