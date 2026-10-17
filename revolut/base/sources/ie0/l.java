package ie0;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f160606a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DateTimeFormatter f160607b = DateTimeFormatter.ISO_ZONED_DATE_TIME;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n1 f160608c = com.bumptech.glide.c.a("ZonedDateTime", olm.e.f226474j);

    private l() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        ZonedDateTime zonedDateTimeFrom = ZonedDateTime.from(f160607b.parse(decoder.decodeString()));
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeFrom, "from(...)");
        return zonedDateTimeFrom;
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f160608c;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        ZonedDateTime value = (ZonedDateTime) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        String str = value.format(f160607b);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        encoder.encodeString(str);
    }
}
