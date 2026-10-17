package ie0;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f160609a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DateTimeFormatter f160610b = DateTimeFormatter.ISO_LOCAL_DATE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n1 f160611c = com.bumptech.glide.c.a("LocalDate", olm.e.f226474j);

    private m() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        LocalDate localDateFrom = LocalDate.from(f160610b.parse(decoder.decodeString()));
        Intrinsics.checkNotNullExpressionValue(localDateFrom, "from(...)");
        return localDateFrom;
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f160611c;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        LocalDate value = (LocalDate) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        String str = value.format(f160610b);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        encoder.encodeString(str);
    }
}
