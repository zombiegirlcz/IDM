package i90;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import zhm.p;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private a() {
    }

    public static UUID a(UUID namespace, String name) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bArrArray = ByteBuffer.allocate(16).putLong(namespace.getMostSignificantBits()).putLong(namespace.getLeastSignificantBits()).array();
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = name.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            messageDigest.update(bArrArray);
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            bArrDigest[6] = (byte) (((byte) (bArrDigest[6] & 15)) | 80);
            bArrDigest[8] = (byte) ((bArrDigest[8] & 63) | 128);
            byte[] bArrM = p.m(bArrDigest, 0, 16);
            if (bArrM.length != 16) {
                throw new IllegalArgumentException(j6.a.l(bArrM.length, "Data size is wrong\nActual: ", " bytes\nExpected: 16 bytes").toString());
            }
            long j2 = 0;
            long j3 = 0;
            for (int i = 0; i < 8; i++) {
                j3 = (j3 << 8) | (255 & ((long) bArrM[i]));
            }
            for (int i2 = 8; i2 < 16; i2++) {
                j2 = (j2 << 8) | (((long) bArrM[i2]) & 255);
            }
            return new UUID(j3, j2);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("Can't generate UUID: SHA-1 is not supported", e);
        }
    }
}
