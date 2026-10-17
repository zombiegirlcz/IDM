package cy4;

import com.revolut.feature.credit.core.ui.bottom_sheet.list.CreditBottomSheetListItemsController;
import gim.i;
import koi.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import qv0.p;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditBottomSheetListItemsController f110043w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CreditBottomSheetListItemsController creditBottomSheetListItemsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f110043w = creditBottomSheetListItemsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f110043w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f110043w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditBottomSheetListItemsController creditBottomSheetListItemsController = this.f110043w;
        switch (i) {
            case 0:
                Object obj3 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                creditBottomSheetListItemsController.c3(new b(((j) obj3).getF53056a(), (p) obj3));
                break;
            default:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                creditBottomSheetListItemsController.c3(new b(aVar2.f275445a, null));
                break;
        }
        return Unit.f186387a;
    }
}
