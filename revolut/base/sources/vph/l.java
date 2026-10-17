package vph;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f291216a = new Regex("[^\\p{L}0-9 -]+");

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i5) {
        String strReplace = charSequence != null ? this.f291216a.replace(charSequence, "") : null;
        if (Intrinsics.f(charSequence, strReplace)) {
            return null;
        }
        return strReplace;
    }
}
