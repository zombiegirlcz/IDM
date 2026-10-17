package ie0;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f160595a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SerialDescriptor f160596b = h.Companion.serializer().getDescriptor();

    private e() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        h hVar = (h) decoder.b(h.Companion.serializer());
        BigDecimal bigDecimalI = y.i(hVar.f160598a);
        if (bigDecimalI == null) {
            throw new SerializationException(a0.d.r(hVar.f160598a, " can't be parsed as a number"));
        }
        xi0.a aVar = xi0.b.Companion;
        String str = hVar.f160599b;
        aVar.getClass();
        return new ej0.b(bigDecimalI, xi0.a.a(str));
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f160596b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        ej0.b value = (ej0.b) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        String plainString = value.f126703a.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        encoder.encodeSerializableValue(h.Companion.serializer(), new h(plainString, value.f126704b.f306286a));
    }
}
