package gn0;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes.dex */
public final class e implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f144898a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f144899b = com.bumptech.glide.c.a("FormattedFingerprint", olm.e.f226474j);

    private e() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String strA;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (decoder.decodeNotNullMark()) {
            String strDecodeString = decoder.decodeString();
            f.Companion.getClass();
            strA = d.a(strDecodeString);
        } else {
            decoder.decodeNull();
            strA = null;
        }
        if (strA != null) {
            return new f(strA);
        }
        return null;
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f144899b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f fVar = (f) obj2;
        String str = fVar != null ? fVar.f144900a : null;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (str == null) {
            encoder.encodeNull();
        } else {
            encoder.encodeString(str);
        }
    }
}
