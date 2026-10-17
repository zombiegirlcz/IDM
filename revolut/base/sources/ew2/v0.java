package ew2;

import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v0 implements mm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f130061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f130062c;

    public v0(ln.a navigationCommandsDispatcher, f state, int i) {
        this.f130060a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
                Intrinsics.checkNotNullParameter(state, "state");
                this.f130061b = navigationCommandsDispatcher;
                this.f130062c = state;
                break;
            default:
                Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
                Intrinsics.checkNotNullParameter(state, "state");
                this.f130061b = navigationCommandsDispatcher;
                this.f130062c = state;
                break;
        }
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        switch (this.f130060a) {
            case 0:
                b action = (b) aVar;
                Intrinsics.checkNotNullParameter(action, "action");
                efm.d0 d0VarFirstOrError = ((v) ((f) this.f130062c)).x0().c(te0.s.f270018a).firstOrError();
                et6.m0 m0Var = new et6.m0(19, new eu7.c(this, 10));
                d0VarFirstOrError.getClass();
                pfm.a aVar2 = new pfm.a(d0VarFirstOrError, m0Var, 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2;
            case 1:
                c action2 = (c) aVar;
                Intrinsics.checkNotNullParameter(action2, "action");
                v vVar = (v) ((f) this.f130062c);
                efm.d0 d0VarFirstOrError2 = vVar.e.getValue(vVar, v.f130055j[3]).c(te0.s.f270018a).firstOrError();
                et6.m0 m0Var2 = new et6.m0(20, new eif.c(1, (ln.a) this.f130061b, ln.a.class, "dispatchNavigationAsync", "dispatchNavigationAsync(Lcom/revolut/retail/core/navigation/NaviCommand;)Lio/reactivex/Completable;", 0, 26));
                d0VarFirstOrError2.getClass();
                pfm.a aVar3 = new pfm.a(d0VarFirstOrError2, m0Var2, 4);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                return aVar3;
            default:
                qc0.d action3 = (qc0.d) aVar;
                Intrinsics.checkNotNullParameter(action3, "action");
                return ((mm.d) this.f130062c).c0(new j64.a((CreditApplicationPluginFlowContract$Configuration) ((qv3.a) this.f130061b).n0().get()));
        }
    }

    public v0(qv3.a state, mm.d actionsDispatcher) {
        this.f130060a = 2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        this.f130061b = state;
        this.f130062c = actionsDispatcher;
    }
}
