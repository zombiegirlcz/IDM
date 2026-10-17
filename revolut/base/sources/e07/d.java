package e07;

import com.revolut.feature.freelancer.impl.ui.profile.details.FreelancerProfileScreen;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FreelancerProfileScreen f121439w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(FreelancerProfileScreen freelancerProfileScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f121439w = freelancerProfileScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f121439w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f121439w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        FreelancerProfileScreen freelancerProfileScreen = this.f121439w;
        switch (i) {
            case 0:
                um0 um0Var = (um0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarG3 = freelancerProfileScreen.T2();
                String listId = um0Var.f166695a;
                j jVar = (j) gVarG3;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "ITEM_ID_ACCOUNT_CLOSURE_TWIN_BUTTON")) {
                    j60.a.v(jVar.f121448q, false, null, 3);
                }
                break;
            default:
                um0 um0Var2 = (um0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarG32 = freelancerProfileScreen.T2();
                String listId2 = um0Var2.f166695a;
                j jVar2 = (j) gVarG32;
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                if (Intrinsics.f(listId2, "ITEM_ID_ACCOUNT_CLOSURE_TWIN_BUTTON")) {
                    jVar2.l2(new i(jVar2, continuation, 2), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
