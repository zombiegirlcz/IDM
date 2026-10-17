package fbe;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import efm.r;
import i9e.f;
import ip0.z;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import org.jetbrains.annotations.NotNull;
import qua.u;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends abe.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f133547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f133548b;

    public c(a9e.b commonSubscriptionMapper, e dateProvider) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f133547a = commonSubscriptionMapper;
        this.f133548b = dateProvider;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        dbe.a model = (dbe.a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e3  */
    @Override // abe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fbe.c.b(java.lang.Object):java.util.List");
    }

    @Override // abe.a
    public final r c(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        hce.b bVar = subscriptionContent.f150886a;
        return w.h(new dbe.a(bVar.f150883a, bVar.f150884b, bVar.f150885c));
    }

    @Override // abe.a
    public final r d(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        MoneyClause moneyClauseU = ((f) this.f133547a).u(zae.c.b(subscriptionContent), u.i(zae.c.c(subscriptionContent), ((l80.f) this.f133548b).g()));
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        String str = subscriptionContent.f150886a.f150883a.f249325m;
        Clause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.recurring_payments_form_transfer, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_header_subtitle_one_off, null, null, 14);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_arrow_send;
        int i2 = R$attr.uikit_colorWidgetBackground;
        return w.h(new hce.a(moneyClauseU, textClause, textLocalisedClause, LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorColdBlue, 8.0f, Float.valueOf(24.0f), null, 32), companion.d(i, R$attr.uikit_colorAccent, i2, Integer.valueOf(i2), 4.0f, 2.0f, Float.valueOf(20.0f)), (Serializable) null, 96));
    }
}
