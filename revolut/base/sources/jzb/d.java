package jzb;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.feature.rev_points.models.RevPointsEarningRateCardAction;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import d9.t0;
import dx4.d1;
import ft3.g1;
import ft3.j1;
import ft3.q0;
import grl.r2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements b {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bm4.a f179707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fub.d f179708b;

    public d(bm4.a creditCardEntryPointUiInteractor, fub.d revPointsEarningRateItemMapper) {
        Intrinsics.checkNotNullParameter(creditCardEntryPointUiInteractor, "creditCardEntryPointUiInteractor");
        Intrinsics.checkNotNullParameter(revPointsEarningRateItemMapper, "revPointsEarningRateItemMapper");
        this.f179707a = creditCardEntryPointUiInteractor;
        this.f179708b = revPointsEarningRateItemMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.revolut.core.ui_kit.models.badge.CircleBadgeModel] */
    /* JADX WARN: Type inference failed for: r13v3 */
    public final List a(al4.i iVar, RevPointsEarningRate revPointsEarningRate, do3.n user) {
        Iterator it8;
        TextLocalisedClause textLocalisedClause;
        it3.k kVar;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(user, "user");
        Style style = null;
        if (!(iVar instanceof al4.f)) {
            List listC = revPointsEarningRate != null ? zhm.u.c(RowDelegate.Model.x(((pyb.e) this.f179708b).a(revPointsEarningRate, RevPointsEarningRateCardAction.OrderCard.f83980a, user, true, false), "REV_POINTS_CREDIT_CARD_ENTRY_POINT_FRONTEND_DRIVEN", null, null, null, null, 0, null, false, null, new ft3.g(null, null, 3), 0, 0, 0, 0, null, -4194306, 15)) : null;
            return listC == null ? zhm.f0.f322471a : listC;
        }
        List list = ((al4.f) iVar).f6141a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            wp3.e entryPoint = (wp3.e) it9.next();
            it4.b bVar = (it4.b) this.f179707a;
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            mx4.u uVar = bVar.d;
            d1 d1Var = entryPoint.f;
            j1 j1Var = entryPoint.f299021c;
            gt3.f fVar = entryPoint.d;
            it3.k kVar2 = entryPoint.e;
            String str = entryPoint.f299024j;
            Image image = uVar.a(d1Var);
            dx4.j1 j1Var2 = entryPoint.f299022g;
            ?? P = j1Var2 != null ? t0.p(j1Var2) : style;
            TextLocalisedClause title = new TextLocalisedClause(R$string.credit_application_entry_points_rev_points_earn_hub_title, zhm.u.c(entryPoint.f299019a), style, 12);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_application_entry_points_rev_points_earn_hub_subtitle, zhm.u.c(entryPoint.f299020b), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            CreditApplicationCommonContext creditApplicationCommonContextC = zr3.b.c(r2.REV_POINTS_EARN_HUB, j1Var, fVar);
            companion.getClass();
            w0 w0VarA = AnalyticsContext.Companion.a(creditApplicationCommonContextC);
            String str2 = entryPoint.f299023h;
            if (str2 != null) {
                it8 = it9;
                textLocalisedClause = textLocalisedClause3;
                kVar = null;
                textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_entry_points_rev_points_earn_hub_button, zhm.u.c(str2), null, 12);
            } else {
                it8 = it9;
                textLocalisedClause = textLocalisedClause3;
                kVar = null;
                textLocalisedClause2 = null;
            }
            ArrayList tags = pm4.b.a(entryPoint.i);
            q0 q0VarC = g1.c(new ft3.d1(j1Var, fVar, kVar), str, kVar2);
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tags, "tags");
            arrayList.add(new RowDelegate.Model(zhm.d0.k0(zhm.v.k(j1Var.name(), fVar != null ? fVar.toString() : null, kVar2 != null ? kVar2.name() : null, str), "_", "REV_POINTS_CREDIT_CARD_ENTRY_POINT_", null, 0, new jud.d(this, 21), 28), new RowDelegate.Model.MainImage.Image40(image, P, null, false, null, false, 60), title, null, 0, textLocalisedClause, null, null, 0, textLocalisedClause2 != null ? new pf(textLocalisedClause2, null, null, false, q0VarC, null, 478) : null, false, null, false, null, tags, null, null, null, null, q0VarC, new AnalyticsContext(w0VarA), 0, 0, 0, 0, 524254168));
            it9 = it8;
            style = null;
        }
        return arrayList;
    }
}
