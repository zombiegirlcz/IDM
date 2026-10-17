package com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput;

import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import eq5.x0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xi0.b f71263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ wk5.a f71264x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, xi0.b bVar, wk5.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f71263w = bVar;
        this.f71264x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f71263w, this.f71264x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j jVar = this.v;
        if (i == 0) {
            o.b(obj2);
            x0 x0Var = jVar.f71278q;
            this.u = 1;
            obj2 = x0Var.r(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        wk5.a aVar2 = this.f71264x;
        if (zBooleanValue) {
            oki.h.v2(jVar.G, new CryptoSendAmountInputScreenContract$ModalStep.MindTheNetwork(aVar2, this.f71263w), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            jVar.H2(jVar.F, new bcj.i(aVar2, 6));
        }
        return Unit.f186387a;
    }
}
