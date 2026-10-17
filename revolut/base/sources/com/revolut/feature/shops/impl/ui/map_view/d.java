package com.revolut.feature.shops.impl.ui.map_view;

import com.revolut.feature.shops.impl.ui.map_view.ShopsMapViewScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import fjd.d0;
import gim.i;
import jid.t;
import jid.v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            v vVar = eVar.f87235q;
            this.u = 1;
            obj2 = vVar.a(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        t tVar = (t) obj2;
        if (tVar instanceof t.b) {
            h.w2(eVar.f87238t, ShopsMapViewScreenContract$Step.LocationPermissions.f87221a, ModalDestination.Style.POPUP.f98311a);
        } else {
            eVar.H2(eVar.u, new d0(tVar, 1));
        }
        return Unit.f186387a;
    }
}
