package oi8;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function1 {
    public com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a f225463w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f225463w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.f225463w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a aVar3 = this.f225463w;
            q78.e eVar = aVar3.f77071s;
            String str = aVar3.o.f76968a;
            this.u = aVar3;
            this.v = 1;
            Object objB = u68.b.b(eVar, str, null, null, this, 14);
            if (objB == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.u;
            o.b(obj2);
        }
        return aVar.C1(u0.b((NaviCommand) obj2));
    }
}
