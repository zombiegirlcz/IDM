package b8d;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final String a(String str, boolean z) {
        if (str != null && !kotlin.text.d0.W(str) && z) {
            Uri uri2 = Uri.parse(str);
            if (!uri2.getQueryParameterNames().contains("presentation_type")) {
                String string = uri2.buildUpon().appendQueryParameter("presentation_type", "inline").build().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
        }
        return str;
    }
}
