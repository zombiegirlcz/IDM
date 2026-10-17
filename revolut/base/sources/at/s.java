package at;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class s {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final IntRange f8976a = new IntRange(1000, 9999, 1);

    public static final class a {
        private a() {
        }
    }

    public static boolean a(String str) {
        if (str.length() == 4) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if ('0' <= cCharAt && cCharAt < ':') {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(String expiryYear, String securityCode) {
        Integer numM;
        Intrinsics.checkNotNullParameter(expiryYear, "expiryYear");
        Intrinsics.checkNotNullParameter(securityCode, "securityCode");
        if (!a(expiryYear) || (numM = z.m(expiryYear)) == null) {
            return false;
        }
        int iIntValue = numM.intValue();
        IntRange intRange = f8976a;
        return iIntValue <= intRange.f186449b && intRange.f186448a <= iIntValue && a(securityCode);
    }
}
