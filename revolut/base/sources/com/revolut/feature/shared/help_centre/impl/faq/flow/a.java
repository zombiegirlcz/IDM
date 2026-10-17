package com.revolut.feature.shared.help_centre.impl.faq.flow;

import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.feature.shared.help_centre.impl.faq.flow.SharedFaqLazyFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import gim.i;
import k18.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
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
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            c cVar = bVar.f86212p;
            SharedFaqLazyFlowContract$InputData sharedFaqLazyFlowContract$InputData = bVar.o;
            String str = sharedFaqLazyFlowContract$InputData.f86207a;
            boolean z = sharedFaqLazyFlowContract$InputData.f86208b;
            this.u = 1;
            obj2 = cVar.K(this, str, z);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        FaqNodeBase faqNodeBase = (FaqNodeBase) obj2;
        if (faqNodeBase != null) {
            h.u2(bVar, bVar.f86214r, new SharedFaqLazyFlowContract$Step.Faq(faqNodeBase), TransitionAnimation.FADE.f98392a, 4);
        } else {
            bVar.f86213q.getClass();
            h.u2(bVar, bVar.f86214r, SharedFaqLazyFlowContract$Step.HelpCenter.f86210a, TransitionAnimation.FADE.f98392a, 4);
        }
        return Unit.f186387a;
    }
}
