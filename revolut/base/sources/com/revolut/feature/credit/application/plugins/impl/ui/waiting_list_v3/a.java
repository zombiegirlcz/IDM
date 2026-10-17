package com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3;

import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3FlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
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
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            c cVar = this.v;
            y80.a aVar2 = cVar.f68528q;
            if (!aVar2.f311613b.a(33) || aVar2.c("android.permission.POST_NOTIFICATIONS")) {
                this.u = 1;
                if (c.I2(cVar, this) == aVar) {
                    return aVar;
                }
            } else {
                h.t2(cVar, cVar.f68529r, WaitingListV3FlowContract$Step.RequestPermission.f68526a, false, null, false, 12);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
