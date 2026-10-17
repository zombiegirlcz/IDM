package e2j;

import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.balance.picker.api.R$string;
import com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserInputData;
import e7l.g;
import efm.d0;
import efm.r;
import efm.w;
import et6.h1;
import et6.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends oki.h implements g {

    @NotNull
    public static final k Companion = new k();
    public final CurrencyChooserInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t70.b f122132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fk3.a f122133q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wsg.n f122134r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1 f122135s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n60.a f122136t;
    public final y u;

    public o(cli.n stateMapper, CurrencyChooserInputData inputData, t70.b currenciesLocalization, fk3.a configurationInteractor, wsg.n walletInteractor, h1 freelancerInteractor, n60.a keyboardExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        this.o = inputData;
        this.f122132p = currenciesLocalization;
        this.f122133q = configurationInteractor;
        this.f122134r = walletInteractor;
        this.f122135s = freelancerInteractor;
        this.f122136t = keyboardExtension;
        m70.a.c(t0.f186434a);
        Data data = new Data(null, null, true, 3, null);
        Clause clause = inputData.e;
        this.u = mra.d.b(this, new f("", data, clause == null ? new TextLocalisedClause(R$string.balance_picker_currency_title, null, null, 14) : clause), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        w wVarW;
        SupportedTargetCurrencies supportedTargetCurrencies = this.o.d;
        Continuation continuation = null;
        if (supportedTargetCurrencies == null) {
            d0 d0VarFirstOrError = m70.a.g(((ik3.c) this.f122133q).l(g.b.f123407a, w4l.h.f294642c), null, new e07.k(13), 1).firstOrError();
            e0f.k kVar = new e0f.k(new e1d.h(6), 27);
            d0VarFirstOrError.getClass();
            ufm.i iVar = new ufm.i(d0VarFirstOrError, kVar, 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            wVarW = new sfm.b(iVar, new e0f.k(new j(this, 0), 26), 2);
            Intrinsics.checkNotNullExpressionValue(wVarW, "flatMapObservable(...)");
        } else if (supportedTargetCurrencies instanceof SupportedTargetCurrencies.Unordered) {
            Set set = ((SupportedTargetCurrencies.Unordered) supportedTargetCurrencies).f99459a;
            xi0.a aVar = xi0.b.Companion;
            ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                t61.a.A(aVar, (String) it8.next(), arrayList);
            }
            wVarW = nim.a.w(I2(), new e1.b(this, arrayList, 9));
        } else {
            if (!(supportedTargetCurrencies instanceof SupportedTargetCurrencies.Ordered)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = ((SupportedTargetCurrencies.Ordered) supportedTargetCurrencies).f99458a;
            xi0.a aVar2 = xi0.b.Companion;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                t61.a.A(aVar2, (String) it9.next(), arrayList2);
            }
            wVarW = nim.a.w(I2(), new e1.b(this, arrayList2, 10));
        }
        yji.l.a1(this, rd0.e.b(wVarW), null, null, new e0b.c(this, continuation, 7), 3);
    }

    public final r I2() {
        CurrencyChooserInputData currencyChooserInputData = this.o;
        int i = l.f122130a[currencyChooserInputData.f99483a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            h1 h1Var = this.f122135s;
            h1Var.getClass();
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            return rd0.e.c(((i2) h1Var.e).c(loadingStrategy), kotlin.coroutines.g.f186406a);
        }
        io3.l lVar = io3.l.CURRENT;
        io3.j jVar = io3.j.PERSONAL;
        io3.i iVar = io3.i.INTERNAL;
        return this.f122134r.N(false, lVar, io3.k.ACTIVE, iVar, jVar, qsg.a.RECENT_FIRST, currencyChooserInputData.f99484b);
    }

    public final ArrayList J2(List list, List list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            io3.d dVar = (io3.d) it8.next();
            xi0.a aVar = xi0.b.Companion;
            String str = dVar.f163147c;
            aVar.getClass();
            linkedHashMap.put(xi0.a.a(str), dVar);
        }
        List<xi0.b> list3 = list2;
        ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
        for (xi0.b bVar : list3) {
            String strA = this.f122132p.a(bVar);
            io3.d dVar2 = (io3.d) linkedHashMap.get(bVar);
            arrayList.add(new e(new dj0.d(dVar2 != null ? dVar2.i : 0L, bVar), strA));
        }
        return arrayList;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
