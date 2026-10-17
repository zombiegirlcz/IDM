package com.revolut.feature_retail_user_declarations.email.flow;

import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowContract$Step;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowOutputData;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;
import zlg.e;
import zlg.f;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EmailFlowOutputData.EmailData f97569w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, EmailFlowOutputData.EmailData emailData, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f97569w = emailData;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f97569w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        EmailFlowOutputData.EmailData emailData = this.f97569w;
        if (i == 0) {
            o.b(obj2);
            b bVar = new b(dVar, emailData, null);
            this.u = 1;
            obj2 = dVar.p2(this, bVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        f fVar = (f) obj2;
        if (fVar instanceof e) {
            h.w2(dVar.u, new EmailFlowContract$Step.EmailVerificationScreen(emailData.f97565a, ((e) fVar).f323254a), ModalDestination.Style.POPUP.f98311a);
        } else {
            if (!Intrinsics.f(fVar, zlg.d.f323253a)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.I2(emailData);
        }
        return Unit.f186387a;
    }
}
