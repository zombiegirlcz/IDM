package ij1;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.f;
import kotlin.text.Regex;
import kotlin.text.d0;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements InputFilter {

    @NotNull
    public static final C0926a Companion = new C0926a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f161669a = new Regex("\\s*");

    /* JADX INFO: renamed from: ij1.a$a, reason: collision with other inner class name */
    public static final class C0926a {
        private C0926a() {
        }
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i, int i2, Spanned dest, int i3, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        StringBuilder sbJ0 = d0.j0(dest, i3, i5, source);
        CharSequence charSequenceT0 = f0.T0(dest, f.o(i3, i5));
        m70.a.c(t0.f186434a);
        if (this.f161669a.replace(sbJ0, "").length() <= 7) {
            return null;
        }
        return charSequenceT0;
    }
}
