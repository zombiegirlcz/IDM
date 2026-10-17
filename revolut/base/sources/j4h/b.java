package j4h;

import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.delegates.g3;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fn2.c f171379a;

    public b(fn2.c cVar) {
        this.f171379a = cVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        ChatContextualChartDelegate.Model model = ((g3) obj2).f54177a;
        fn2.c cVar = this.f171379a;
        if (!fn2.c.a(cVar, model)) {
            return Unit.f186387a;
        }
        l lVar = (l) cVar.f136517b;
        lVar.A2(new AssetDetailsDestination(((h) lVar.c3().f310975b).f171388c, null, false, null, null, ((e) ((j2) lVar.d3().f22677a).getValue()).e, 30));
        return Unit.f186387a;
    }
}
