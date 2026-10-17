package fz0;

import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class d {
    private d() {
    }

    public static int a(String illustrationName) {
        Intrinsics.checkNotNullParameter(illustrationName, "illustrationName");
        if (illustrationName.equals("rev_points_widget_image") || illustrationName.equals("rev_points_token_hero")) {
            return R$drawable.uikit_icn_24_rev_points;
        }
        return 0;
    }

    public static String b(int i, String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        if (!a0.G(i, url2, false, "mobile/rev_points")) {
            return null;
        }
        g.Companion.getClass();
        String strB = f.b(url2);
        if (Intrinsics.f(strB, "rev_points_token_hero") || Intrinsics.f(strB, "rev_points_widget_image")) {
            return strB;
        }
        return null;
    }
}
