package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details;

import aqb.s;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsContract$InputData;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterParams;
import do3.n;
import gim.i;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rqd.k;
import vkm.v1;
import vkm.y;
import yhm.o;
import yhm.r;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IncomeSortersDetailsContract$InputData.Mode f87755w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, IncomeSortersDetailsContract$InputData.Mode mode, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f87755w = mode;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, this.f87755w, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowH;
        r rVar = (r) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        io3.d dVar = (io3.d) rVar.f314201a;
        List list = (List) rVar.f314202b;
        n nVar = (n) rVar.f314203c;
        String str = dVar.f163146b;
        d dVar2 = this.v;
        dVar2.getClass();
        IncomeSortersDetailsContract$InputData.Mode mode = this.f87755w;
        if (mode instanceof IncomeSortersDetailsContract$InputData.Mode.Create) {
            String groupId = ((IncomeSortersDetailsContract$InputData.Mode.Create) mode).f87743a;
            k kVar = dVar2.e;
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            flowH = nim.a.v(xam.a.h(new ap7.k(dVar2, null, 4), new y(new v1(new rhl.b(kVar, groupId, null, 6)), new pc2.d(3, 13, null))), new s(7));
        } else {
            if (!(mode instanceof IncomeSortersDetailsContract$InputData.Mode.Update)) {
                throw new NoWhenBranchMatchedException();
            }
            flowH = xam.a.h(new c(dVar2, str, null), ((etj.o) dVar2.d).k(str, new IncomeSorterParams.ForId(((IncomeSortersDetailsContract$InputData.Mode.Update) mode).f87745a), w4l.i.f294643c));
        }
        return xam.a.h(new a(this.v, this.f87755w, list, dVar, nVar, null), flowH);
    }
}
