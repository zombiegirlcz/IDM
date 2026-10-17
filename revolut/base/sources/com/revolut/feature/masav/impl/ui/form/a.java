package com.revolut.feature.masav.impl.ui.form;

import c69.k;
import com.revolut.feature.masav.impl.model.DirectDebitData;
import com.revolut.feature.masav.impl.ui.form.MasavDirectDebitFormScreenContract$InputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DirectDebitData f78116w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, DirectDebitData directDebitData, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f78116w = directDebitData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f78116w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            ugc.a aVar2 = cVar.f78119q;
            String str = ((MasavDirectDebitFormScreenContract$InputData.Edit) cVar.o).f78112a.f61992a;
            this.u = 1;
            obj2 = aVar2.s(str, this.f78116w, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        cVar.C2(new k((String) obj2));
        return Unit.f186387a;
    }
}
