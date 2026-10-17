package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class q implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f247694a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f247695b = new n1("kotlin.Char", olm.e.d);

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Character.valueOf(decoder.decodeChar());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f247695b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        char cCharValue = ((Character) obj2).charValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeChar(cCharValue);
    }
}
