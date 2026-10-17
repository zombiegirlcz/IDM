package ts1;

import com.revolut.feature.apm.bizum.impl.ui.area.homescreen.BizumAreaHomescreenScreen;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BizumAreaHomescreenScreen f273930w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(BizumAreaHomescreenScreen bizumAreaHomescreenScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f273930w = bizumAreaHomescreenScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f273930w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(this.f273930w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            case 2:
                j jVar3 = new j(this.f273930w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
            default:
                j jVar4 = new j(this.f273930w, continuation, 3);
                jVar4.v = obj2;
                return jVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((BizumContact) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BizumAreaHomescreenScreen bizumAreaHomescreenScreen = this.f273930w;
        switch (i) {
            case 0:
                a aVar = (a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVarH3 = bizumAreaHomescreenScreen.T2();
                Intrinsics.h(aVar);
                ((u) dVarH3).z2(aVar);
                return Unit.f186387a;
            case 1:
                a aVar3 = (a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVarH32 = bizumAreaHomescreenScreen.T2();
                Intrinsics.h(aVar3);
                ((u) dVarH32).z2(aVar3);
                return Unit.f186387a;
            case 2:
                com.revolut.core.ui_kit.delegates.t clickData = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVarH33 = bizumAreaHomescreenScreen.T2();
                Intrinsics.h(clickData);
                u uVar = (u) dVarH33;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                h12.k kVarB = ((u12.a) uVar.f273937s).b(clickData);
                if (Intrinsics.f(kVarB, h12.i.f148450a)) {
                    ((pn3.b) uVar.f273938t).c(uVar, new tpl.o(uVar, 9));
                } else if (Intrinsics.f(kVarB, h12.j.f148451a)) {
                    uVar.l2(new s(uVar, null, 0), new yi5.b(26));
                } else if (kVarB != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                BizumContact bizumContact = (BizumContact) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) bizumAreaHomescreenScreen.T2()).A2(bizumContact);
                return Unit.f186387a;
        }
    }
}
