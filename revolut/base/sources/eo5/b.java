package eo5;

import ch.qos.logback.core.CoreConstants;
import com.google.common.primitives.UnsignedBytes;
import com.revolut.feature.crypto.validation.impl.validators.address.ton.TonAddressException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f127864a;

    public b(String rawAddress) {
        boolean z;
        Intrinsics.checkNotNullParameter(rawAddress, "rawAddress");
        boolean z3 = d0.S(rawAddress, CoreConstants.COLON_CHAR, 0, 6) != -1;
        if (!z3 && (d0.S(rawAddress, CoreConstants.DASH_CHAR, 0, 6) != -1 || d0.S(rawAddress, '_', 0, 6) != -1)) {
            a((byte) 16, true);
            rawAddress = a0.E(a0.E(rawAddress, CoreConstants.DASH_CHAR, '+'), '_', '/');
        }
        if (z3) {
            Intrinsics.checkNotNullParameter("Provided Address is raw", "message");
            throw new TonAddressException("Provided Address is raw");
        }
        a((byte) 2, true);
        if (rawAddress.length() != 48) {
            Intrinsics.checkNotNullParameter("User-friendly address should contain strictly 48 characters", "message");
            throw new TonAddressException("User-friendly address should contain strictly 48 characters");
        }
        Base64.Decoder decoder = Base64.getDecoder();
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = rawAddress.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDecode = decoder.decode(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        if (bArrDecode.length != 36) {
            Intrinsics.checkNotNullParameter("Unknown address type: byte length is not equal to 36", "message");
            throw new TonAddressException("Unknown address type: byte length is not equal to 36");
        }
        byte[] bArr = new byte[34];
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArrDecode, 0, bArr, 0, 34);
        System.arraycopy(bArrDecode, 34, bArr2, 0, 2);
        int i = 0;
        for (int i2 = 0; i2 < 34; i2++) {
            byte b4 = bArr[i2];
            for (int i3 = 0; i3 < 8; i3++) {
                boolean z4 = ((b4 >> (7 - i3)) & 1) == 1;
                boolean z6 = ((i >> 15) & 1) == 1;
                i <<= 1;
                if (z4 ^ z6) {
                    i ^= 4129;
                }
            }
        }
        int i5 = 65535 & i;
        byte[] bArr3 = {(byte) (i5 >>> 8), (byte) i5};
        if (bArr3[0] != bArr2[0] || bArr3[1] != bArr2[1]) {
            Intrinsics.checkNotNullParameter("Wrong crc16 checksum", "message");
            throw new TonAddressException("Wrong crc16 checksum");
        }
        byte b5 = bArr[0];
        int i6 = b5 & UnsignedBytes.MAX_VALUE;
        if ((b5 & 128) != 0) {
            i6 ^= 128;
            z = true;
        } else {
            z = false;
        }
        byte b7 = (byte) i6;
        if (b7 != 17 && b7 != 81) {
            Intrinsics.checkNotNullParameter("Unknown address tag", "message");
            throw new TonAddressException("Unknown address tag");
        }
        boolean z11 = b7 == 17;
        byte b13 = bArr[1];
        b13 = (b13 & UnsignedBytes.MAX_VALUE) == 255 ? (byte) -1 : b13;
        if (b13 == 0 || b13 == -1) {
            System.arraycopy(bArr, 2, new byte[32], 0, 32);
            a((byte) 1, z);
            a((byte) 4, z11);
            a((byte) 8, !z11);
            return;
        }
        String message = "Invalid address workChain: " + ((int) b13);
        Intrinsics.checkNotNullParameter(message, "message");
        throw new TonAddressException(message);
    }

    public final void a(byte b4, boolean z) {
        int i;
        if (z) {
            i = b4 | this.f127864a;
        } else {
            i = ((byte) (~b4)) & this.f127864a;
        }
        this.f127864a = (byte) i;
    }
}
