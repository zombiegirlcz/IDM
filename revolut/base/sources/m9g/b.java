package m9g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f203782a;

    public b(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f203782a = languageProvider;
    }

    public final String a(DateTime dateTime, String pattern) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        String strPrint = DateTimeFormat.forPattern(pattern).withLocale(((s80.b) this.f203782a).b()).withZone(dateTime.getZone()).print(dateTime.getMillis());
        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
        return strPrint;
    }
}
