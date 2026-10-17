package tqh;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.i3;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignDestination;
import com.revolut.feature.wealth_discovery.impl.screener.widget.chat_instrument_list.ScreenerChatWidgetParcel$FilterManually;
import com.revolut.feature.wealth_discovery.impl.screener.widget.chat_instrument_list.ScreenerChatWidgetParcel$Retry;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f273596a;

    public m(n nVar) {
        this.f273596a = nVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        i3 i3Var = (i3) obj2;
        String str = i3Var.f54273a.f52049b;
        i iVar = this.f273596a.f273597a;
        if (!Intrinsics.f(str, iVar.c3().f310974a)) {
            return Unit.f186387a;
        }
        Object obj3 = ((FullScreenStateDelegate.Model) i3Var.f54274b).k;
        if (obj3 instanceof ScreenerChatWidgetParcel$Retry) {
            iVar.f273590r.k(Unit.f186387a);
        } else if (obj3 instanceof ScreenerChatWidgetParcel$FilterManually) {
            e eVar = (e) iVar.c3().f310975b;
            iVar.A2(new ScreenerRedesignDestination(iVar.f273588p.a(eVar.getSecurityTypes()), eVar.c()));
        }
        return Unit.f186387a;
    }
}
