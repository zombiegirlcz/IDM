package com.revolut.feature.external_accounts.impl.ui.flow.link_external;

import com.revolut.feature.external_accounts.api.CrossBorderOpenBankingApi$Toggles;
import com.revolut.feature.external_accounts.impl.ui.flow.link_external.LinkExternalAccountFlowContract$Step;
import e7l.f;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import jm6.e;
import jm6.k;
import jm6.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import rd0.c;
import rd0.d;
import we6.p0;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar = this.v;
        LinkExternalAccountFlowContract$InputData linkExternalAccountFlowContract$InputData = bVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            k kVar = new k(bVar, null);
            this.u = 1;
            obj2 = bVar.p2(this, kVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        e eVar = (e) obj2;
        boolean z = eVar.f176478a;
        f fVar = eVar.f176479b;
        p0.c cVar = p0.c.f296663a;
        if (!z) {
            IllegalStateException illegalStateException = new IllegalStateException("Account Linking requested, but feature is not enabled");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, illegalStateException, h0Var);
            bVar.C2(cVar);
            return Unit.f186387a;
        }
        e7l.a aVar2 = fVar != null ? fVar.C0 : null;
        int i2 = aVar2 == null ? -1 : l.f176486a[aVar2.ordinal()];
        if (i2 == -1) {
            bVar.C2(cVar);
        } else if (i2 == 1) {
            h.u2(bVar, bVar.u, LinkExternalAccountFlowContract$Step.Plaid.f72917a, null, 6);
        } else if (i2 == 2) {
            if (((jte.d) bVar.f72921r).c(CrossBorderOpenBankingApi$Toggles.CrossBorderOpenBankingEnabled.f72201c) && linkExternalAccountFlowContract$InputData.f72914c) {
                h.t2(bVar, bVar.u, new LinkExternalAccountFlowContract$Step.CrossBorderLinking(zm6.a.b(linkExternalAccountFlowContract$InputData.f72912a)), true, null, false, 12);
            } else {
                h.t2(bVar, bVar.u, new LinkExternalAccountFlowContract$Step.OpenBanking(zm6.a.c(linkExternalAccountFlowContract$InputData.f72912a, false)), true, null, false, 12);
            }
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            h.t2(bVar, bVar.u, new LinkExternalAccountFlowContract$Step.OpenBanking(zm6.a.c(linkExternalAccountFlowContract$InputData.f72912a, true)), true, null, false, 12);
        }
        return Unit.f186387a;
    }
}
