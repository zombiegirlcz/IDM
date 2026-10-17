package mn5;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import kn5.e;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageDigest f207364a;

    public b(c baseXCodec) {
        Intrinsics.checkNotNullParameter(baseXCodec, "baseXCodec");
        this.f207364a = MessageDigest.getInstance("SHA-256");
    }

    public final byte[] a(String input, String dictionary) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dictionary, "dictionary");
        if (input.length() == 0) {
            return null;
        }
        for (int i = 0; i < input.length(); i++) {
            if (!d0.K(dictionary, input.charAt(i))) {
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(input.length());
        for (int i2 = 0; i2 < input.length(); i2++) {
            arrayList.add(Byte.valueOf((byte) d0.S(dictionary, input.charAt(i2), 0, 6)));
        }
        return c.a(58, zhm.d0.Y0(arrayList));
    }

    public final byte[] b(String address, String dictionary) {
        byte[] bArrA;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(dictionary, "dictionary");
        if (address.length() == 0 || (bArrA = a(address, dictionary)) == null || bArrA.length < 4) {
            return null;
        }
        byte[] bArrL0 = d.l0(bArrA, f.o(0, bArrA.length - 4));
        byte[] bArrL02 = d.l0(bArrA, f.o(bArrA.length - 4, bArrA.length));
        byte[] bArrC = c(bArrL0);
        if (bArrC != null && Arrays.equals(bArrL02, d.l0(bArrC, f.o(0, 4)))) {
            return bArrL0;
        }
        return null;
    }

    public final byte[] c(byte[] bArr) {
        byte[] bArrDigest;
        if (bArr == null) {
            return null;
        }
        MessageDigest messageDigest = this.f207364a;
        Intrinsics.checkNotNullExpressionValue(messageDigest, "messageDigest");
        synchronized (messageDigest) {
            this.f207364a.reset();
            this.f207364a.update(bArr, 0, bArr.length);
            MessageDigest messageDigest2 = this.f207364a;
            bArrDigest = messageDigest2.digest(messageDigest2.digest());
        }
        return bArrDigest;
    }

    public final kn5.f d(String address, String dictionary) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(dictionary, "dictionary");
        return b(address, dictionary) != null ? kn5.c.f186000a : new e(null);
    }
}
