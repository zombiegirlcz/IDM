package xsi;

import android.view.View;
import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.retail.feature.adjust_analytics.impl.ui.AdjustAnalyticsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ View v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AdjustAnalyticsController f308536w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(View view, AdjustAnalyticsController adjustAnalyticsController, Continuation continuation) {
        super(2, continuation);
        this.v = view;
        this.f308536w = adjustAnalyticsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, this.f308536w, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!model.f51915c) {
            e0m.e.a(this.v);
        }
        p pVar = (p) this.f308536w.d();
        y yVar = pVar.u;
        b bVar = (b) ((c) ((j2) yVar.f22677a).getValue()).f308526a.getContent();
        if (bVar != null) {
            long j2 = bVar.f308524b;
            pVar.f308544w = true;
            boolean z = bVar.d;
            pVar.H2(yVar, new n(b.a(bVar, a.a(bVar.f308525c, z ? j2 : 0L, !z ? j2 : 0L, 4), !z), 0));
        }
        return Unit.f186387a;
    }
}
