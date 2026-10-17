package rx0;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements InputFilter {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f258008a;

    public static final class a {
        private a() {
        }
    }

    static {
        Pattern patternCompile = Pattern.compile("[\r\n]+", 0);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        f258008a = patternCompile;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i, int i2, Spanned dest, int i3, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        Matcher matcher = f258008a.matcher(source.subSequence(i, i2));
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(new Pair(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end())));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(source, i, i2);
        vim.f it8 = kotlin.ranges.f.m(v.i(arrayList)).iterator();
        boolean z = false;
        while (it8.f289625c) {
            Pair pair = (Pair) arrayList.get(it8.nextInt());
            spannableStringBuilder.replace(((Number) pair.f186385a).intValue(), ((Number) pair.f186386b).intValue(), (CharSequence) " ");
            z = true;
        }
        if (z) {
            return spannableStringBuilder;
        }
        return null;
    }
}
