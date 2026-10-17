package mic;

import com.revolut.feature.rewards.impl.ui.details.screen.PerkDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PerkDetailsScreen f205657w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(PerkDetailsScreen perkDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f205657w = perkDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f205657w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f205657w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PerkDetailsScreen perkDetailsScreen = this.f205657w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarD3 = perkDetailsScreen.d3();
                String url2 = aVar.f275445a;
                g0 g0Var = (g0) xVarD3;
                g0Var.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                g0Var.C2(new s(url2));
                break;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = aVar3.f275445a;
                Object obj3 = aVar3.d;
                if (Intrinsics.f(str, "TERMS_AND_CONS_CLAUSE_ID") && (obj3 instanceof String)) {
                    String url3 = (String) obj3;
                    g0 g0Var2 = (g0) perkDetailsScreen.d3();
                    g0Var2.getClass();
                    Intrinsics.checkNotNullParameter(url3, "url");
                    g0Var2.C2(new t(url3));
                }
                break;
        }
        return Unit.f186387a;
    }
}
