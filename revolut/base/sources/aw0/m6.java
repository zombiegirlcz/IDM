package aw0;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m6 {
    private m6() {
    }

    public static n6 a() {
        return new n6(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58737s, null, null, null, "", true, null, null, null, null);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static n6 b(m6 m6Var, yy0.h imageUiElement, LargeActionButton.ButtonStyle.DefaultFilledButton style, String str, boolean z, Object obj2, int i) {
        String tag2 = (i & 8) != 0 ? "" : str;
        boolean z3 = (i & 16) != 0 ? true : z;
        Object obj3 = (i & 256) != 0 ? null : obj2;
        m6Var.getClass();
        Intrinsics.checkNotNullParameter(imageUiElement, "imageUiElement");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        return new n6(null, style, imageUiElement.f317752a, imageUiElement.f317753b, null, tag2, z3, null, null, null, obj3);
    }

    public static n6 c(m6 m6Var, Clause title, LargeActionButton.ButtonStyle style, yy0.j jVar, String str, boolean z, AnalyticsContext analyticsContext, k3 k3Var, Object obj2, int i) {
        yy0.j jVar2 = (i & 4) != 0 ? null : jVar;
        String tag2 = (i & 16) != 0 ? "" : str;
        boolean z3 = (i & 32) != 0 ? true : z;
        AnalyticsContext analyticsContext2 = (i & 64) != 0 ? null : analyticsContext;
        k3 k3Var2 = (i & 128) != 0 ? null : k3Var;
        String str2 = (i & 256) != 0 ? null : "GetTradingProButton";
        Object obj3 = (i & 512) != 0 ? null : obj2;
        m6Var.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        return new n6(title, style, jVar2 != null ? jVar2.f317755a : null, null, null, tag2, z3, analyticsContext2, k3Var2, str2, obj3);
    }
}
