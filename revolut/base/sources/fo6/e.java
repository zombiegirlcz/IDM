package fo6;

import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.branches.CrossBorderBranchesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CrossBorderBranchesScreen f136826w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CrossBorderBranchesScreen crossBorderBranchesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f136826w = crossBorderBranchesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f136826w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f136826w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((se6.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CrossBorderBranchesScreen crossBorderBranchesScreen = this.f136826w;
        switch (i) {
            case 0:
                se6.h branch = (se6.h) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar = (p) crossBorderBranchesScreen.d3();
                pVar.getClass();
                Intrinsics.checkNotNullParameter(branch, "branch");
                pVar.C2(new l(branch));
                break;
            default:
                String query = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarD3 = crossBorderBranchesScreen.d3();
                Intrinsics.h(query);
                p pVar2 = (p) mVarD3;
                pVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                pVar2.H2(pVar2.f136836q, new f9g.l(query, 15));
                break;
        }
        return Unit.f186387a;
    }
}
