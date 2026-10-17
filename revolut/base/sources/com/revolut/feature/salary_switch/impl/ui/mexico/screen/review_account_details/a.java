package com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details;

import com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.ReviewAccountDetailsContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import krc.j;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
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
            j jVar = new j(bVar, null);
            this.u = 1;
            obj2 = bVar.p2(this, jVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.v2(bVar.f85329r, new ReviewAccountDetailsContract$ModalStep.ViewTerms((String) obj2), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        return Unit.f186387a;
    }
}
