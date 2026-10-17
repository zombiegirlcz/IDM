package ie0;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f160612a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DateTimeFormatter f160613b = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n1 f160614c = com.bumptech.glide.c.a("LocalDateTime", olm.e.f226474j);

    private n() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        LocalDateTime localDateTimeFrom = LocalDateTime.from(f160613b.parse(decoder.decodeString()));
        Intrinsics.checkNotNullExpressionValue(localDateTimeFrom, "from(...)");
        return localDateTimeFrom;
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f160614c;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        LocalDateTime value = (LocalDateTime) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        String str = value.format(f160613b);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        encoder.encodeString(str);
    }
}
