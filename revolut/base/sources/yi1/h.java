package yi1;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import kotlin.text.d0;
import kotlin.text.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f314219a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Regex f314220b = new Regex("\\s*");

    private h() {
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i, int i2, Spanned dest, int i3, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        StringBuilder sbJ0 = d0.j0(dest, i3, i5, f0.T0(source, kotlin.ranges.f.o(i, i2)));
        CharSequence charSequenceT0 = f0.T0(dest, kotlin.ranges.f.o(i3, i5));
        m70.a.c(t0.f186434a);
        if (f314220b.replace(sbJ0, "").length() <= 7) {
            return null;
        }
        return charSequenceT0;
    }
}
