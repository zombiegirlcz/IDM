package o2m;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f221668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f221669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f221670c;
    public final Regex d;

    public f(List format) {
        int size = format.size();
        Intrinsics.checkNotNullParameter(format, "format");
        this.f221668a = format;
        this.f221669b = size;
        this.f221670c = format.size();
        this.d = new Regex("[^A-Za-z0-9]");
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i5) {
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        String string = charSequence.toString();
        Locale locale = Locale.ROOT;
        String strReplace = this.d.replace(v0.a.j(locale, "ROOT", string, locale, "toUpperCase(...)"), "");
        String strSubstring = strReplace.substring(0, Math.min(this.f221670c, strReplace.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        if (Intrinsics.f(strSubstring, charSequence.toString())) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return strSubstring;
        }
        SpannableString spannableString = new SpannableString(strSubstring);
        TextUtils.copySpansFrom((Spanned) charSequence, i, strSubstring.length(), null, spannableString, 0);
        return spannableString;
    }
}
