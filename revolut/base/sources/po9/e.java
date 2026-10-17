package po9;

import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatSmartTileSendMoneyDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatSmartTileSendMoneyLoadingDelegate;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements y50.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.payments.air.widget.impl.ui.chat.b f237913a;

    public e(com.revolut.feature.payments.air.widget.impl.ui.chat.b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f237913a = model;
    }

    @Override // y50.a
    public final void h1(fx.d dVar, koi.c delegatesManager) {
        CoroutineScope coroutineScope = dVar.f138715a;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        if (delegatesManager.c(ChatSmartTileSendMoneyLoadingDelegate.class) == null) {
            delegatesManager.a(new ChatSmartTileSendMoneyLoadingDelegate());
        }
        koi.k kVarC = delegatesManager.c(ChatSmartTileSendMoneyDelegate.class);
        if (kVarC == null) {
            kVarC = new ChatSmartTileSendMoneyDelegate(0);
            delegatesManager.a(kVarC);
        }
        ChatSmartTileSendMoneyDelegate chatSmartTileSendMoneyDelegate = (ChatSmartTileSendMoneyDelegate) kVarC;
        koi.k kVarC2 = delegatesManager.c(ChatItemsDelegate.class);
        if (kVarC2 == null) {
            throw new IllegalStateException(h30.l.r("No delegate found for class ", o0.f186429a.b(ChatItemsDelegate.class).e()));
        }
        ChatItemsDelegate chatItemsDelegate = (ChatItemsDelegate) kVarC2;
        Continuation continuation = null;
        e0.C(coroutineScope, null, null, new pnf.f(rd0.e.b(chatSmartTileSendMoneyDelegate.f53893l.f121375b), new a(this), continuation, 2), 3);
        e0.C(coroutineScope, null, null, new pnf.f(rd0.e.b(chatSmartTileSendMoneyDelegate.k.f121375b), new b(this), continuation, 3), 3);
        e0.C(coroutineScope, null, null, new pnf.f(rd0.e.b(chatItemsDelegate.f52045l.f121375b), new c(this), continuation, 4), 3);
        e0.C(coroutineScope, null, null, new pnf.f(rd0.e.b(chatItemsDelegate.f52047n.f121375b), new d(this), continuation, 5), 3);
    }
}
