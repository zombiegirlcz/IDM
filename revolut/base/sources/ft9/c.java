package ft9;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.groups.api.R$string;
import do3.n;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import oq9.c0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements p {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq9.d f137963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nq9.c f137964b;

    public c(nq9.d settlementsMapper, nq9.c membersMapper) {
        Intrinsics.checkNotNullParameter(settlementsMapper, "settlementsMapper");
        Intrinsics.checkNotNullParameter(membersMapper, "membersMapper");
        this.f137963a = settlementsMapper;
        this.f137964b = membersMapper;
    }

    public static CellDetailsChevronDelegate.Model b() {
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("ITEM_ID_ISSUE_REPORT", new TextLocalisedClause(R$string.payments_groups_details_bill_report_issue, null, null, 14), 0, true, null, null, null, 2036);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        PlainTextDelegate.Model model;
        List listK;
        LayeredImage layeredImage;
        Clause compositeClause;
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        c0 settlement = domainState.f137965a;
        n user = domainState.f137966b;
        int i = b.f137962a[settlement.k().ordinal()];
        if (i == 1) {
            if (oi0.d.G(settlement.b(), user)) {
                model = new PlainTextDelegate.Model("ITEM_ID_DISCLAIMER", (UrlImage) null, new TextLocalisedClause(R$string.payments_groups_details_settlement_marked_as_paid_disclaimer_title_you, null, null, 14), new TextLocalisedClause(R$string.payments_groups_details_settlement_marked_as_paid_disclaimer_text_common, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
            } else {
                boolean zG = oi0.d.G(settlement.f(), user);
                nq9.c cVar = this.f137964b;
                model = zG ? new PlainTextDelegate.Model("ITEM_ID_DISCLAIMER", (UrlImage) null, new TextLocalisedClause(R$string.payments_groups_details_settlement_marked_as_paid_disclaimer_title, u.c(((tr9.e) cVar).l(settlement.b(), user)), null, 12), new TextLocalisedClause(R$string.payments_groups_details_settlement_marked_as_paid_disclaimer_text_common, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746) : new PlainTextDelegate.Model("ITEM_ID_DISCLAIMER", (UrlImage) null, new TextLocalisedClause(R$string.payments_groups_details_settlement_marked_as_paid_disclaimer_title, u.c(((tr9.e) cVar).l(settlement.b(), user)), null, 12), new TextLocalisedClause(R$string.payments_groups_details_settlement_marked_as_paid_disclaimer_text_common, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
            }
            yp0.b.l(model, R$attr.uikit_dp24, 0, 0, 0, null, false, 62);
            listK = v.k(model, b());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            CellDetailsChevronDelegate.Model modelB = b();
            yp0.b.l(modelB, R$attr.uikit_dp24, 0, 0, 0, null, false, 62);
            listK = u.c(modelB);
        }
        tr9.g gVar = (tr9.g) this.f137963a;
        Intrinsics.checkNotNullParameter(settlement, "settlement");
        Intrinsics.checkNotNullParameter(user, "user");
        Image imageE = ((tr9.e) gVar.f273771a).e(settlement.h(), user);
        LayeredImage layeredImageA = gVar.a(settlement);
        MoneyClause moneyClause = new MoneyClause(settlement.a().l(), new MoneyClause.Format.Headers(null, null, null, false, false, 31), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8);
        TimeClause timeClause = new TimeClause(settlement.c().getMillis(), new TimeClause.Format.Pretty(0), null, null, 12);
        Intrinsics.checkNotNullParameter(settlement, "settlement");
        Intrinsics.checkNotNullParameter(user, "user");
        int i2 = tr9.f.f273770a[settlement.k().ordinal()];
        if (i2 == 1) {
            layeredImage = layeredImageA;
            compositeClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.payments_groups_details_settlement_marked_as_paid, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), new DotDividerClause((Integer) null), gVar.b(settlement, user)), null, null, null, 14);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            layeredImage = layeredImageA;
            compositeClause = gVar.b(settlement, user);
        }
        return new h(listK, new g(imageE, layeredImage, moneyClause, timeClause, compositeClause));
    }
}
