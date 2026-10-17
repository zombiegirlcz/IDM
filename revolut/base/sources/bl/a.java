package bl;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16438a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f16439b = com.bumptech.glide.c.a("Color", olm.e.f226474j);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SimpleDateFormat f16440c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Date date = f16440c.parse(decoder.decodeString(), new ParsePosition(0));
        Intrinsics.h(date);
        return date;
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f16439b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Date value = (Date) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        String str = f16440c.format(value);
        Intrinsics.h(str);
        encoder.encodeString(str);
    }
}
