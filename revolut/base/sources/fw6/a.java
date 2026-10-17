package fw6;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f138584a = new Regex("^$|^[0-9]{1,2}(\\.[0-9]{0,4})?$|^(100)$");

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i5) {
        CharSequence charSequenceSubSequence;
        CharSequence charSequenceSubSequence2;
        CharSequence charSequenceSubSequence3;
        CharSequence charSequenceSubSequence4;
        if (charSequence == null || (charSequenceSubSequence = charSequence.subSequence(i, i2)) == null) {
            m70.a.c(t0.f186434a);
            charSequenceSubSequence = "";
        }
        StringBuilder sb6 = new StringBuilder();
        if (i3 > 0) {
            if (spanned == null || (charSequenceSubSequence4 = spanned.subSequence(0, i3)) == null) {
                m70.a.c(t0.f186434a);
                charSequenceSubSequence4 = "";
            }
            sb6.append(charSequenceSubSequence4);
        }
        sb6.append(charSequenceSubSequence);
        if (spanned == null || (charSequenceSubSequence2 = spanned.subSequence(i5, spanned.length())) == null) {
            m70.a.c(t0.f186434a);
            charSequenceSubSequence2 = "";
        }
        sb6.append(charSequenceSubSequence2);
        if (this.f138584a.f(sb6)) {
            return null;
        }
        if (spanned != null && (charSequenceSubSequence3 = spanned.subSequence(i3, i5)) != null) {
            return charSequenceSubSequence3;
        }
        m70.a.c(t0.f186434a);
        return "";
    }
}
