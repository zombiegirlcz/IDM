package ay4;

import aw0.n6;
import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ActionsBottomSheetController f11068w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ActionsBottomSheetController actionsBottomSheetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f11068w = actionsBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f11068w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f11068w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            default:
                g gVar3 = new g(this.f11068w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ActionsBottomSheetController actionsBottomSheetController = this.f11068w;
        switch (i) {
            case 0:
                yx4.b event = (yx4.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                a aVar2 = actionsBottomSheetController.T;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                aVar2.C2(new zx4.a(event.f317544a));
                break;
            case 1:
                n6 n6Var = (n6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                a aVar4 = actionsBottomSheetController.T;
                Object obj3 = n6Var.k;
                aVar4.C2(zx4.b.f326040a);
                break;
            default:
                n6 n6Var2 = (n6) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                a aVar6 = actionsBottomSheetController.T;
                Object obj4 = n6Var2.k;
                aVar6.C2(zx4.c.f326041a);
                break;
        }
        return Unit.f186387a;
    }
}
