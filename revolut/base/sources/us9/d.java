package us9;

import aim.e;
import aw0.t0;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.payments.groups.api.R$string;
import ip0.ej;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements n {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f282843a;

    public d(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f282843a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        b bVar = this.f282843a;
        lw0.a aVar = new lw0.a(bVar.f282840a, null, null, null, false, 30);
        e eVarB = u.b();
        ArrayList<a> arrayList = bVar.f282841b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (a aVar2 : arrayList) {
            xi0.b bVar2 = aVar2.f282837a;
            xi0.b bVar3 = aVar2.f282837a;
            String strQ = j6.a.q("GROUP_SPENDING_BREAKDOWN_CURRENCY_ROW_", bVar2.f306286a);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(bVar3.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62);
            CurrencyClause currencyClause = new CurrencyClause(bVar3, null, null, 6);
            MoneyClause moneyClause = new MoneyClause(aVar2.f282838b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            dj0.d dVar = aVar2.f282839c;
            arrayList2.add(new RowDelegate.Model(strQ, image40, currencyClause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(moneyClause, dVar != null ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, null, false, 124), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867832));
        }
        if (!arrayList2.isEmpty()) {
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayList2);
        }
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("GROUP_SPENDING_BREAKDOWN_TOTAL_ROW", new t0((Clause) new TextLocalisedClause(R$string.payments_groups_details_analytics_total_sum, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(bVar.f282842c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        eVarB.add(new ej("GROUP_SPENDING_BREAKDOWN_FOOTER_NOTE", new c7(new TextLocalisedClause(R$string.payments_groups_details_analytics_breakdown_disclaimer, null, null, 14), false, null, 6)));
        return new cii.b(null, u.a(eVarB), aVar);
    }
}
