package zng;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f323816a = new Regex("[^\\p{L}-` '\\s]");

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return a.class.equals(obj2 != null ? obj2.getClass() : null);
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i5) {
        if (charSequence != null && i2 != 0) {
            String string = charSequence.subSequence(i, i2).toString();
            String strReplace = this.f323816a.replace(string, "");
            if (!Intrinsics.f(string, strReplace)) {
                return strReplace;
            }
        }
        return null;
    }

    public final int hashCode() {
        return 31;
    }
}
