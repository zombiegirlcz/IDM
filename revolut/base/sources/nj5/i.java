package nj5;

import a9j.k;
import com.revolut.core.ui_kit.delegates.widgets.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QrCodeWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.core.ui_kit.delegates.widgets.z2;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositDestination;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import m1i.t;
import ne0.o;
import pfm.m;
import pfm.n;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ss5.a f216377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c70.a f216378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f216379c;
    public final r70.c d;

    public i(ss5.a cryptoFeedWidgetsEventDispatcher, c70.a clipboard, a0 widgetsUiInteractor, r70.c hapticEngine) {
        Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher, "cryptoFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        this.f216377a = cryptoFeedWidgetsEventDispatcher;
        this.f216378b = clipboard;
        this.f216379c = widgetsUiInteractor;
        this.d = hapticEngine;
    }

    @Override // csh.f
    public final Class j() {
        return CryptoWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        b bVar;
        CryptoWidgetContext widgetContext2 = (CryptoWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof com.revolut.core.ui_kit.delegates.widgets.i;
        m mVar = m.f235744a;
        if (z) {
            BaseDraggableWidgetDelegate.Model model = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
            if ((model instanceof QrCodeWidgetDelegate.Model) && (bVar = ((QrCodeWidgetDelegate.Model) model).f55214g) != null) {
                xi0.a aVar = xi0.b.Companion;
                String str = bVar.f216366b;
                aVar.getClass();
                pfm.h hVar = new pfm.h(new o(this, new CryptoDepositDestination(new CryptoDepositInput.Overview(xi0.a.a(str), (com.revolut.retail.feature.crypto_deposits.api.navigation.a) null, true, hbj.b.NONE, bVar.f216367c, 2)), 1), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            }
            if (model instanceof ActionWidgetDelegate.Model) {
                return new n(new k(this, 22, event, widgetContext2), 1);
            }
        } else {
            if (!(event instanceof z2)) {
                if (!(event instanceof q0)) {
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                pfm.h hVar2 = new pfm.h(new ly2.d(this, 12, event, widgetContext2), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
            }
            if (((z2) event).f55576c.f55214g != null) {
                return new n(new t(event, this, 10), 1);
            }
        }
        return mVar;
    }
}
