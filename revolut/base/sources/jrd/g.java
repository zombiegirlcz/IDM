package jrd;

import abf.n;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.picker.date_picker.DatePickerBottomSheetController;
import ip0.a10;
import ip0.c10;
import ip0.re;
import ip0.ue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DatePickerBottomSheetController f177999w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(DatePickerBottomSheetController datePickerBottomSheetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f177999w = datePickerBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f177999w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f177999w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            default:
                g gVar3 = new g(this.f177999w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Pair pair = (Pair) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(pair, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 15;
        DatePickerBottomSheetController datePickerBottomSheetController = this.f177999w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                a10 a10Var = (a10) pair.f186385a;
                Object obj3 = ((c10) a10Var.f163364b.get(((Number) pair.f186386b).intValue())).f163673b;
                Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj3).intValue();
                j jVarD3 = datePickerBottomSheetController.R2();
                jVarD3.H2(jVarD3.f178001q, new n(jVarD3, iIntValue, i2));
                break;
            case 1:
                Pair pair2 = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                re reVar = (re) pair2.f186385a;
                Object obj4 = ((ue) reVar.f166162b.f166510b.get(((Number) pair2.f186386b).intValue())).f166647b;
                Intrinsics.i(obj4, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) obj4).intValue();
                j jVarD32 = datePickerBottomSheetController.R2();
                jVarD32.H2(jVarD32.f178001q, new a5g.i(iIntValue2, 29));
                break;
            default:
                Pair pair3 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                re reVar2 = (re) pair3.f186385a;
                Object obj5 = ((ue) reVar2.f166163c.f166510b.get(((Number) pair3.f186386b).intValue())).f166647b;
                Intrinsics.i(obj5, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue3 = ((Integer) obj5).intValue();
                j jVarD33 = datePickerBottomSheetController.R2();
                jVarD33.H2(jVarD33.f178001q, new n(jVarD33, iIntValue3, i2));
                break;
        }
        return Unit.f186387a;
    }
}
