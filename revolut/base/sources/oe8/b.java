package oe8;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f224563a = new Regex("[^\\p{L}-` '\\s]");

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return b.class.equals(obj2 != null ? obj2.getClass() : null);
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i5) {
        String strReplace = charSequence != null ? this.f224563a.replace(charSequence, "") : null;
        if (Intrinsics.f(charSequence, strReplace)) {
            return null;
        }
        return strReplace;
    }

    public final int hashCode() {
        return 31;
    }
}
