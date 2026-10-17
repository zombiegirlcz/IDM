package pgg;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import oc.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements InputFilter {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f235946a;

    public b(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f235946a = c.k(((s80.b) languageProvider).b());
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i, int i2, Spanned spanned, int i3, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        Companion.getClass();
        Intrinsics.checkNotNullParameter(source, "source");
        while (i < i2) {
            char cCharAt = source.charAt(i);
            if (cCharAt == this.f235946a || Character.isLetter(cCharAt)) {
                m70.a.c(t0.f186434a);
                return "";
            }
            i++;
        }
        return null;
    }
}
