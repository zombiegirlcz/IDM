package yr5;

import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.i3;
import com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_price.CryptoPriceChartChatWidgetParcel$Retry;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f316127a;

    public a(e eVar) {
        this.f316127a = eVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        i3 i3Var = (i3) obj2;
        ChatItemsDelegate.Model model = i3Var.f54273a;
        e eVar = this.f316127a;
        if (!e.a(eVar, model)) {
            return Unit.f186387a;
        }
        if (Intrinsics.f(((FullScreenStateDelegate.Model) i3Var.f54274b).k, CryptoPriceChartChatWidgetParcel$Retry.f71358a)) {
            n nVar = eVar.f316131a;
            if (((f) ((j2) nVar.d3().f22677a).getValue()).f316133b != null) {
                nVar.f3(new ypd.i(13));
                nVar.f316146q.a();
            }
        }
        return Unit.f186387a;
    }
}
