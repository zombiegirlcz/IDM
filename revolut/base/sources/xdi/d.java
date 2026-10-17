package xdi;

import com.revolut.feature_rev_points_pocket_impl.ui.screen.onboarding.RevPointsPocketOnboardingScreen;
import ip0.gs;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsPocketOnboardingScreen f304450w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RevPointsPocketOnboardingScreen revPointsPocketOnboardingScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f304450w = revPointsPocketOnboardingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f304450w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f304450w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f304450w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((gs) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Integer) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsPocketOnboardingScreen revPointsPocketOnboardingScreen = this.f304450w;
        switch (i) {
            case 0:
                gs progressChange = (gs) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE3 = revPointsPocketOnboardingScreen.d();
                Intrinsics.h(progressChange);
                u uVar = (u) mVarE3;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(progressChange, "progressChange");
                uVar.H2(uVar.f304477y, new x8h.d(progressChange, 27));
                break;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE32 = revPointsPocketOnboardingScreen.d();
                Intrinsics.h(clickData);
                u uVar2 = (u) mVarE32;
                uVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                String str = clickData.f275445a;
                Continuation continuation = null;
                if (Intrinsics.f(str, "REV_POINTS_POCKET_TERMS_LINK_ITEM_ID")) {
                    uVar2.l2(new s(2, continuation, uVar2), new yi5.b(26));
                } else if (Intrinsics.f(str, "REV_POINTS_POCKET_PLAN_TERMS_LINK_ITEM_ID")) {
                    uVar2.l2(new s(1, continuation, uVar2), new yi5.b(26));
                }
                break;
            default:
                Integer num = (Integer) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE33 = revPointsPocketOnboardingScreen.d();
                Intrinsics.h(num);
                u uVar3 = (u) mVarE33;
                uVar3.H2(uVar3.f304477y, new wk4.k(num.intValue(), 3));
                break;
        }
        return Unit.f186387a;
    }
}
