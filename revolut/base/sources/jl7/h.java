package jl7;

import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f175625a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f175626b = com.bumptech.glide.c.a("ZonedDateTime", olm.e.f226474j);

    private h() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        Intrinsics.checkNotNullParameter(strDecodeString, "<this>");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(strDecodeString);
        Intrinsics.checkNotNullExpressionValue(zonedDateTime, "toDateTime(...)");
        return zonedDateTime;
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f175626b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        ZonedDateTime value = (ZonedDateTime) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(cp5.c.R(value));
    }
}
