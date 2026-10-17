package com.revolut.feature.instruments.trend.collections.impl.ui.launcher;

import akg.n;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.feature.instruments.trend.collections.impl.ui.launcher.InstrumentsTrendCollectionsLauncherFlowContract$Step;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import gim.i;
import klf.l1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l9j.j;
import lfg.z;
import oki.h;
import rd0.e;
import tzg.m;
import vkm.q;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            m mVar = bVar.f74924p;
            InstrumentsTrendCollectionId instrumentsTrendCollectionId = bVar.o.f74920a;
            if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.MostTraded.f74902a) || (instrumentsTrendCollectionId instanceof InstrumentsTrendCollectionId.Bonds) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.IndexEtfs.f74900a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.TechnologyEtfs.f74906a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.EtnsCryptoExposure.f74897a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.EtcsCommodityExposure.f74896a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.PreciousMetalsEtcs.f74904a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.EtpsLeveraged.f74898a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.DividendLeaders.f74895a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.RecommendedBuy.f74905a)) {
                n nVarC = m.c(mVar, null, null, 3);
                h0 h0Var = h0.f322473a;
                obj2 = q.x(e.e(mo3.a.g(nim.a.v(e.n(nVarC, h0Var), new z(22)), null, new j(24), 1), h0Var, new l1(3, 14, null)), this);
            } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.CfdsPnlDrivers.f74894a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.PopularStarterCfds.f74903a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.MostShortedCfds.f74901a)) {
                n nVarA = m.a(mVar, WealthAccountType.MARGIN);
                h0 h0Var2 = h0.f322473a;
                obj2 = q.x(e.e(mo3.a.g(nim.a.v(e.n(nVarA, h0Var2), new z(21)), null, new j(23), 1), h0Var2, new l1(3, 13, null)), this);
            } else {
                if (!Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.FreeStocks.f74899a)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj2 = Boolean.FALSE;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            h.u2(bVar, bVar.f74925q, InstrumentsTrendCollectionsLauncherFlowContract$Step.InstrumentsTrendCollection.f74923a, null, 6);
        } else {
            h.D2(bVar.f74925q);
        }
        return Unit.f186387a;
    }
}
