package com.revolut.feature.freelancer.impl.ui.prompt.post_activation;

import com.revolut.feature.freelancer.impl.ui.prompt.post_activation.ProPostActivationScreenContract$Action;
import com.revolut.retail.core.navigation.NaviCommand;
import fjd.g0;
import g0f.f;
import g17.h;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wi0.b;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ h u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, Continuation continuation) {
        super(1, continuation);
        this.u = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = this.u;
        ProPostActivationScreenContract$InputData proPostActivationScreenContract$InputData = hVar.f139555r;
        ProPostActivationScreenContract$Action proPostActivationScreenContract$Action = proPostActivationScreenContract$InputData.f74094b;
        if (proPostActivationScreenContract$Action instanceof ProPostActivationScreenContract$Action.DoNothing) {
            return hVar.C1(u0.b(proPostActivationScreenContract$InputData.f74095c));
        }
        if (!(proPostActivationScreenContract$Action instanceof ProPostActivationScreenContract$Action.IssueVirtualCard)) {
            if (proPostActivationScreenContract$Action instanceof ProPostActivationScreenContract$Action.SelectPlan) {
                return hVar.C1(u0.b(((ProPostActivationScreenContract$Action.SelectPlan) proPostActivationScreenContract$Action).f74092a));
            }
            throw new NoWhenBranchMatchedException();
        }
        ProPostActivationScreenContract$Action.IssueVirtualCard issueVirtualCard = (ProPostActivationScreenContract$Action.IssueVirtualCard) proPostActivationScreenContract$Action;
        NaviCommand naviCommand = issueVirtualCard.f74090a;
        b bVar = issueVirtualCard.f74091b;
        hVar.n2(new g0(hVar, bVar, null, 28), new f(hVar, naviCommand, 3));
        return Unit.f186387a;
    }
}
