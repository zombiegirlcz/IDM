package u4b;

import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.impl.R$string;
import com.revolut.feature.retail.cfd.impl.screens.withdraw.CfdWithdrawScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.f3;
import mx0.h3;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CfdWithdrawScreenContract$InputData f277304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f277305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4b.a f277306c;
    public final w4b.c d;
    public final d1h.h e;

    public k(CfdWithdrawScreenContract$InputData inputData, w80.b amountFormatter, w4b.a buildSubtitle, w4b.c buildWithdrawButtonEnabled, d1h.h wealthRemoteDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(buildSubtitle, "buildSubtitle");
        Intrinsics.checkNotNullParameter(buildWithdrawButtonEnabled, "buildWithdrawButtonEnabled");
        Intrinsics.checkNotNullParameter(wealthRemoteDisclaimersMapper, "wealthRemoteDisclaimersMapper");
        this.f277304a = inputData;
        this.f277305b = amountFormatter;
        this.f277306c = buildSubtitle;
        this.d = buildWithdrawButtonEnabled;
        this.e = wealthRemoteDisclaimersMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        qv0.i iVar;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data availableToWithdraw = domainState.f277290a;
        Data validation = domainState.f277292c;
        w4b.b bVar = (w4b.b) this.f277306c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(availableToWithdraw, "availableToWithdraw");
        Intrinsics.checkNotNullParameter(validation, "validation");
        Clause clause = (Clause) iii.c.f(availableToWithdraw, new w29.a(18), new w2.d(19), new vh2.o(bVar, validation, 13));
        long j2 = domainState.f277291b;
        CfdWithdrawScreenContract$InputData cfdWithdrawScreenContract$InputData = this.f277304a;
        xi0.b bVar2 = cfdWithdrawScreenContract$InputData.f82284b;
        String str = bVar2.f306286a;
        w80.b bVar3 = this.f277305b;
        String strD = bVar3.d(j2, str);
        String strJ = cp5.d.J(bVar2);
        boolean z = j2 > 0;
        boolean z3 = domainState.f;
        Boolean bool = z3 ? Boolean.TRUE : null;
        bw0.e eVar = bw0.e.SuggestionsElseCalculator;
        List listK = v.k(2000L, 5000L, 10000L, Long.valueOf(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT));
        ArrayList arrayList = new ArrayList(w.t(listK, 10));
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            arrayList.add(new dj0.d(((Number) it8.next()).longValue(), bVar2));
            bVar3 = bVar3;
        }
        w80.b bVar4 = bVar3;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            dj0.d dVar = (dj0.d) it9.next();
            w80.b bVar5 = bVar4;
            arrayList2.add(new bw0.d(4, new TextClause(bVar5.e(dVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(dVar, new MoneyClause.Format.Shorts(false, 63), null, null, 12)));
            it9 = it9;
            z3 = z3;
            CenteredAmountDelegate.Model model = model;
            bVar4 = bVar5;
        }
        CenteredAmountDelegate.Model model2 = new CenteredAmountDelegate.Model("withdraw-amount-input", null, new bw0.h(strD, strJ, (TextClause) null, z, (List) null, bool, (List) arrayList2, false, false, z3, false, eVar, (Clause) null, false, 30100), new f3(new CurrencyImage(bVar2.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), new TextLocalisedClause(R$string.wealth_margin_withdraw_to_main, u.c(new CurrencyClause(bVar2, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12), null, false, h3.ACTIVE_NOT_CLICKABLE, false), null, null, null, false, false, cfdWithdrawScreenContract$InputData.f82284b, null, 1522);
        d1h.g gVar = domainState.d;
        if (gVar != null) {
            Data data = gVar.f110649a;
            iVar = data != null ? (qv0.i) iii.c.f(data, new u3a.g(29), new tw8.g(28), new tch.c(this, 19)) : null;
        } else {
            iVar = null;
        }
        koi.j[] elements = {model2, iVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_margin_withdraw_title, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        this.d.getClass();
        Intrinsics.checkNotNullParameter(validation, "validation");
        return new g(clause, listL, new aw0.e(false, null, null, new n6(textLocalisedClause, defaultFilledButton, null, null, ((Boolean) iii.c.f(validation, new w29.a(20), new w2.d(21), new w2a.o(3))).booleanValue(), null, null, 732), null, null, 55));
    }
}
