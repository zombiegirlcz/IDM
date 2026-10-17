package fhj;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import dej.i0;
import dej.k0;
import dej.o0;
import dej.o1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public b(ynj.e commonUiBuilder) {
        Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
    }

    public static boolean a(o0 o0Var) {
        if (o0Var instanceof i0) {
            return true;
        }
        return (o0Var instanceof k0) && ((k0) o0Var).f113579a.f100424b == o1.INSTALLED;
    }

    public static PlainTextDelegate.Model b(TextClause textClause) {
        return new PlainTextDelegate.Model("ID_ACTIVATION_INFO", (UrlImage) null, (Clause) null, TextClause.c(textClause, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), ISO781611.SMT_TAG), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp8, 0, 0, 0, 30568);
    }

    public static PlainTextDelegate.Model c(TextLocalisedClause textLocalisedClause) {
        return new PlainTextDelegate.Model("ID_ACTIVATION_INFO", (UrlImage) null, (Clause) null, TextLocalisedClause.c(textLocalisedClause, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 27), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp8, 0, 0, 0, 30568);
    }
}
