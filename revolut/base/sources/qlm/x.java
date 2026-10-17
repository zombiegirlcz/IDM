package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class x implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f247723a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f247724b = new n1("kotlin.Double", olm.e.e);

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Double.valueOf(decoder.decodeDouble());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f247724b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        double dDoubleValue = ((Number) obj2).doubleValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeDouble(dDoubleValue);
    }
}
