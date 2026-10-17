package bmb;

import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.revamp.SavingsOptionSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SavingsOptionSelectionScreen f16784w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(SavingsOptionSelectionScreen savingsOptionSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f16784w = savingsOptionSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f16784w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            default:
                b bVar2 = new b(this.f16784w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SavingsOptionSelectionScreen savingsOptionSelectionScreen = this.f16784w;
        switch (i) {
            case 0:
                Object obj3 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVar = (h) savingsOptionSelectionScreen.K.getValue();
                Object f55862c = ((qv0.p) obj3).getF55862c();
                String listId = ((koi.j) obj3).getF55277b();
                u uVar = (u) hVar;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                uVar.l2(new b96.d(f55862c, uVar, listId, null, 19), new bhl.g(uVar, 12));
                break;
            default:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVar2 = (h) savingsOptionSelectionScreen.K.getValue();
                Object obj4 = aVar2.d;
                String listId2 = aVar2.f275445a;
                u uVar2 = (u) hVar2;
                uVar2.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                uVar2.l2(new b96.d(obj4, uVar2, listId2, null, 19), new bhl.g(uVar2, 12));
                break;
        }
        return Unit.f186387a;
    }
}
