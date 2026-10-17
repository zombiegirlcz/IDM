package com.revolut.retail.feature.balance.picker.impl.balance_picker_v2;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.BalancePickerScreenContract$ModalStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import n1j.p;
import oki.h;
import p1j.l;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f99506w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Object obj2, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f99506w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f99506w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            l lVar = cVar.A;
            p pVar = (p) this.f99506w;
            this.u = 1;
            obj2 = lVar.a(pVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.v2(cVar.F, new BalancePickerScreenContract$ModalStep.AddNewCurrencyAccount((BalancePickerScreenContract$NonExistingAccountsInfo) obj2), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        return Unit.f186387a;
    }
}
