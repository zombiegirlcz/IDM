package com.revolut.feature.retail.salary_account.impl.salary_promotion;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.salary_account.impl.salary_promotion.SalaryPromotionControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import egb.c;
import egb.q0;
import gim.i;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import oki.h;
import retrofit2.HttpException;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f83021w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f83021w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f83021w, continuation);
        aVar.v = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar = this.f83021w;
        y yVar = bVar.u;
        Pair pair = (Pair) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            Data data = (Data) pair.f186385a;
            boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
            c cVar = (c) data.getContent();
            Throwable error = data.getError();
            HttpException httpException = error instanceof HttpException ? (HttpException) error : null;
            boolean z = false;
            if (httpException != null && httpException.code() == 404) {
                z = true;
            }
            if (cVar != null) {
                q0 q0Var = cVar.d;
                if (q0Var == null) {
                    bVar.H2(yVar, new w56.o(data, 28));
                } else if (data.getError() != null) {
                    bVar.H2(yVar, new w56.o(data, 27));
                } else if (!data.getLoading()) {
                    this.v = null;
                    this.u = 1;
                    if (b.I2(bVar, data, q0Var, zBooleanValue, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (z) {
                h.v2(bVar.f83027w, SalaryPromotionControllerContract$ModalStep.InactivePrompt.f83018a, ModalDestination.Style.POPUP.f98311a);
            } else {
                bVar.H2(yVar, new w56.o(data, 29));
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
