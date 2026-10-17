package i06;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.customer_present.tips.impl.screen.tips_management.TipsManagementScreen;
import hul.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TipsManagementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TipsManagementScreen tipsManagementScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tipsManagementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.d();
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.customer_present.tips.impl.screen.tips_management.TipsManagementScreenContract.RateItemParcel");
        i parcel = (i) obj3;
        q qVar = (q) jVarE3;
        y yVar = qVar.f157307r;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int i = o.f157303a[parcel.f157295c.ordinal()];
        if (i == 1) {
            qVar.H2(yVar, new l(parcel, 0));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            qVar.H2(yVar, new v(qVar, parcel, 23));
        }
        return Unit.f186387a;
    }
}
