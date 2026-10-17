package tqh;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.i3;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerResultDestination;
import com.revolut.feature.wealth_discovery.impl.screener.widget.chat_instrument_list.ScreenerChatWidgetParcel$SeeAll;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedSorting;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f273595a;

    public l(n nVar) {
        this.f273595a = nVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        i3 i3Var = (i3) obj2;
        String str = i3Var.f54273a.f52049b;
        i iVar = this.f273595a.f273597a;
        if (!Intrinsics.f(str, iVar.c3().f310974a)) {
            return Unit.f186387a;
        }
        if (((LargeActionButtonDelegate.Model) i3Var.f54274b).i instanceof ScreenerChatWidgetParcel$SeeAll) {
            e eVar = (e) iVar.c3().f310975b;
            zel.f fVarA = iVar.f273588p.a(eVar.getSecurityTypes());
            ArrayList arrayListC = eVar.c();
            String title = eVar.getTitle();
            zel.g sortingMetric = eVar.getSortingMetric();
            iVar.A2(new ScreenerResultDestination(fVarA, arrayListC, title, sortingMetric != null ? new ScreenerSelectedSorting(sortingMetric, eVar.getSortOrder()) : null, false));
        }
        return Unit.f186387a;
    }
}
