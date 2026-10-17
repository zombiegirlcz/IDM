package ie0;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f160587a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f160588b = com.bumptech.glide.c.a("BigDecimal", olm.e.f226474j);

    private a() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder instanceof rlm.i ? new BigDecimal(rlm.j.l(((rlm.i) decoder).c()).a()) : new BigDecimal(decoder.decodeString());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f160588b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        BigDecimal value = (BigDecimal) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (encoder instanceof rlm.m) {
            ((rlm.m) encoder).b(rlm.j.b(value));
            return;
        }
        String plainString = value.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        encoder.encodeString(plainString);
    }
}
