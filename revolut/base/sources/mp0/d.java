package mp0;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements InputFilter {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f207715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f207716b;

    public d(int i, b countMode) {
        Intrinsics.checkNotNullParameter(countMode, "countMode");
        this.f207715a = i;
        this.f207716b = countMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || !d.class.equals(obj2.getClass())) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f207715a == dVar.f207715a && this.f207716b == dVar.f207716b;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i, int i2, Spanned dest, int i3, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        int i6 = c.f207714a[this.f207716b.ordinal()];
        int i21 = this.f207715a;
        if (i6 == 1) {
            int length = i21 - (dest.length() - (i5 - i3));
            if (length <= 0) {
                return "";
            }
            if (length >= i2 - i) {
                return null;
            }
            int i22 = length + i;
            return (Character.isHighSurrogate(source.charAt(i22 + (-1))) && (i22 = i22 + (-1)) == i) ? "" : source.subSequence(i, i22);
        }
        if (i6 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (i == i2) {
            return null;
        }
        int i32 = 0;
        int i33 = 0;
        for (int i43 = 0; i43 < i3; i43++) {
            if (Character.isDigit(dest.charAt(i43))) {
                i33++;
            }
        }
        int length2 = dest.length();
        int i59 = 0;
        while (i5 < length2) {
            if (Character.isDigit(dest.charAt(i5))) {
                i59++;
            }
            i5++;
        }
        int i66 = i21 - (i33 + i59);
        int i74 = 0;
        for (int i92 = i; i92 < i2; i92++) {
            if (Character.isDigit(source.charAt(i92))) {
                i74++;
            }
        }
        if (i74 <= i66) {
            return null;
        }
        if (i66 <= 0) {
            return "";
        }
        int i96 = i;
        int i99 = i96;
        while (i96 < i2) {
            if (Character.isDigit(source.charAt(i96))) {
                if (i32 == i66) {
                    return source.subSequence(i, i99);
                }
                i32++;
                i99 = i96 + 1;
            }
            i96++;
        }
        return null;
    }

    public final int hashCode() {
        return this.f207716b.hashCode() + (this.f207715a * 31);
    }

    public /* synthetic */ d(int i) {
        this(i, b.ALL);
    }
}
