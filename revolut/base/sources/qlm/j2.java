package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes14.dex */
public final class j2 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j2 f247668a = new j2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f247669b = new n1("kotlin.uuid.Uuid", olm.e.f226474j);

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String string;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qkm.a aVar = qkm.b.Companion;
        String hexString = decoder.decodeString();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(hexString, "uuidString");
        int length = hexString.length();
        qkm.b bVar = qkm.b.f247030c;
        if (length == 32) {
            Intrinsics.checkNotNullParameter(hexString, "hexString");
            Intrinsics.checkNotNullParameter(hexString, "hexString");
            long jD = kotlin.text.e.d(0, 16, hexString);
            long jD2 = kotlin.text.e.d(16, 32, hexString);
            return (jD == 0 && jD2 == 0) ? bVar : new qkm.b(jD, jD2);
        }
        if (length != 36) {
            StringBuilder sb6 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
            if (hexString.length() <= 64) {
                string = hexString;
            } else {
                StringBuilder sb9 = new StringBuilder();
                String strSubstring = hexString.substring(0, 64);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                sb9.append(strSubstring);
                sb9.append("...");
                string = sb9.toString();
            }
            sb6.append(string);
            sb6.append("\" of length ");
            sb6.append(hexString.length());
            throw new IllegalArgumentException(sb6.toString());
        }
        Intrinsics.checkNotNullParameter(hexString, "hexDashString");
        Intrinsics.checkNotNullParameter(hexString, "hexDashString");
        long jD3 = kotlin.text.e.d(0, 8, hexString);
        hx7.i.a(8, hexString);
        long jD4 = kotlin.text.e.d(9, 13, hexString);
        hx7.i.a(13, hexString);
        long jD5 = kotlin.text.e.d(14, 18, hexString);
        hx7.i.a(18, hexString);
        long jD6 = kotlin.text.e.d(19, 23, hexString);
        hx7.i.a(23, hexString);
        long j2 = (jD3 << 32) | (jD4 << 16) | jD5;
        long jD7 = kotlin.text.e.d(24, 36, hexString) | (jD6 << 48);
        return (j2 == 0 && jD7 == 0) ? bVar : new qkm.b(j2, jD7);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f247669b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        qkm.b value = (qkm.b) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.toString());
    }
}
