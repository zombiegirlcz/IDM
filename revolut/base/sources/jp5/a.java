package jp5;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements InputFilter {

    @NotNull
    public static final C1005a Companion = new C1005a();

    /* JADX INFO: renamed from: jp5.a$a, reason: collision with other inner class name */
    public static final class C1005a {
        private C1005a() {
        }
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i, int i2, Spanned dest, int i3, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        if (i == 0 && i2 == 0) {
            return null;
        }
        CharSequence charSequenceSubSequence = source.subSequence(i, i2);
        m70.a.c(t0.f186434a);
        String str = ((i3 > 0 ? "" + ((Object) dest.subSequence(0, i3)) : "") + ((Object) charSequenceSubSequence)) + ((Object) dest.subSequence(i5, dest.length()));
        for (int i6 = 0; i6 < str.length(); i6++) {
            if (!d0.K("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789:_+/-", str.charAt(i6))) {
                return dest.subSequence(i3, i5);
            }
        }
        return null;
    }
}
