package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class v1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1 f247718a = new v1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f247719b = new n1("kotlin.String", olm.e.f226474j);

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.decodeString();
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f247719b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        String value = (String) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value);
    }
}
