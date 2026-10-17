package xn;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final String a(String deeplink, String utmSource, String str) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        Uri.Builder builderAppendQueryParameter = Uri.parse(deeplink).buildUpon().appendQueryParameter("utm_source", utmSource);
        if (str != null) {
            builderAppendQueryParameter.appendQueryParameter("analytics_ref", str);
        }
        String string = builderAppendQueryParameter.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
