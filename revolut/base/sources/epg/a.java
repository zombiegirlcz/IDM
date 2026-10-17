package epg;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f128176a;

    public a(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f128176a = locale;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!a.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.username.ui.LowercaseFilter");
        return Intrinsics.f(this.f128176a, ((a) obj2).f128176a);
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i5) {
        if (charSequence != null && i2 != 0) {
            while (i < i2) {
                if (Character.isUpperCase(charSequence.charAt(i)) || Character.isTitleCase(charSequence.charAt(i))) {
                    boolean z = charSequence instanceof Spanned;
                    Locale locale = this.f128176a;
                    if (!z) {
                        String lowerCase = charSequence.toString().toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        return lowerCase;
                    }
                    Spanned spanned2 = (Spanned) charSequence;
                    String lowerCase2 = spanned2.toString().toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(lowerCase2);
                    TextUtils.copySpansFrom(spanned2, 0, spanned2.length(), null, spannableStringBuilder, 0);
                    return spannableStringBuilder;
                }
                i++;
            }
        }
        return null;
    }

    public final int hashCode() {
        return this.f128176a.hashCode();
    }
}
