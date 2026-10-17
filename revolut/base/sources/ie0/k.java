package ie0;

import java.time.DateTimeException;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f160604a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f160605b = com.bumptech.glide.c.a("Instant", olm.e.f226474j);

    private k() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        try {
            Instant instant = Instant.parse(strDecodeString);
            Intrinsics.h(instant);
            return instant;
        } catch (DateTimeException e) {
            throw new SerializationException(p.a.p("Invalid ISO-8601 format: '", strDecodeString, "'"), e);
        }
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f160605b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Instant value = (Instant) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        String string = value.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        encoder.encodeString(string);
    }
}
