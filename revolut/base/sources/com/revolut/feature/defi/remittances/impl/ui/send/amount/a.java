package com.revolut.feature.defi.remittances.impl.ui.send.amount;

import cli.y;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreenContract$ModalStep;
import com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$ExtraConfiguration;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k18.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.j2;
import vkm.q;
import wo2.l;
import x66.d;
import yhm.o;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DeFiBalance f71830w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ DeFiAssetDetails f71831x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, DeFiBalance deFiBalance, DeFiAssetDetails deFiAssetDetails, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f71830w = deFiBalance;
        this.f71831x = deFiAssetDetails;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f71830w, this.f71831x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar = this.v;
        y yVar = bVar.z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            d dVar = bVar.f71837w;
            wk5.a chain = ((s56.o) ((j2) yVar.f22677a).getValue()).e;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(chain, "chain");
            jhi.b bVarG = mo3.a.g(xam.a.h(new l(dVar, chain, (Continuation) null, 3), c.G(dVar.f303048a)), null, null, 3);
            this.u = 1;
            obj2 = q.x(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.A;
        DeFiBalance deFiBalance = this.f71830w;
        String str = deFiBalance.f71638g;
        xi0.b currency = this.f71831x.f71665a.getCurrency();
        k1j.d dVar2 = k1j.d.RETAIL;
        Set setB = y0.b(k1j.a.DEFI);
        List list = (List) obj2;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((xi0.b) it8.next()).f306286a);
        }
        h.v2(aVar2, new DeFiSendAmountScreenContract$ModalStep.DualChooser(new DualChooserContract$InputData(str, currency, dVar2, (io3.l) null, setB, new SupportedTargetCurrencies.Ordered(arrayList), CurrencyFilteringPolicy.IncludeAll.f92235a, (Set) null, y0.b(new DualChooserContract$ExtraConfiguration.DeFiCurrencies(((s56.o) ((j2) yVar.f22677a).getValue()).e)), 272), ((s56.o) ((j2) yVar.f22677a).getValue()).e, deFiBalance), ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
