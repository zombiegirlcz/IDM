package f90;

import android.icu.text.MessageFormat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f132809a;

    public b(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f132809a = languageProvider;
    }

    public final String a(String pattern, Number number) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(number, "number");
        String str = new MessageFormat(pattern, ((s80.b) this.f132809a).b()).format(new Number[]{number});
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
