package ie0;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f160589a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f160590b = com.bumptech.glide.c.a("java.math.BigInteger", olm.e.f226474j);

    private b() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder instanceof rlm.i ? new BigInteger(rlm.j.l(((rlm.i) decoder).c()).a()) : new BigInteger(decoder.decodeString());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f160590b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        BigInteger value = (BigInteger) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (encoder instanceof rlm.m) {
            ((rlm.m) encoder).b(rlm.j.d(value.toString()));
            return;
        }
        String string = value.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        encoder.encodeString(string);
    }
}
