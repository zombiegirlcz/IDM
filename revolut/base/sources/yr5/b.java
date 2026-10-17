package yr5;

import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.delegates.g3;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f316128a;

    public b(e eVar) {
        this.f316128a = eVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        ChatContextualChartDelegate.Model model = ((g3) obj2).f54177a;
        e eVar = this.f316128a;
        if (!e.a(eVar, model)) {
            return Unit.f186387a;
        }
        n nVar = eVar.f316131a;
        xi0.b bVar = ((f) ((j2) nVar.d3().f22677a).getValue()).f316133b;
        if (bVar != null) {
            nVar.A2(new CryptoAssetDetailsFeatureConfig.AssetDetailsDestination(bVar, (BuyFundingCurrencyPrefill) null, 6));
        }
        return Unit.f186387a;
    }
}
