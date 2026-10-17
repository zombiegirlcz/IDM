package qpb;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.home_feed.api.widget.VaultWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppg.b f248338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f248339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc7.a f248340c;

    public h(ppg.b vaultsInteractor, a0 widgetsUiInteractor, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        this.f248338a = vaultsInteractor;
        this.f248339b = widgetsUiInteractor;
        this.f248340c = homeFeedWidgetsEventDispatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r7 == r9) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
    
        if (r7 == r9) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011a, code lost:
    
        if (r7 == r9) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0145, code lost:
    
        if (r7 == r9) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:
    
        if (r7 == r9) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019b, code lost:
    
        if (r7 == r9) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(qpb.h r7, com.revolut.feature.home_feed.api.widget.VaultWidgetContext r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qpb.h.b(qpb.h, com.revolut.feature.home_feed.api.widget.VaultWidgetContext, gim.c):java.lang.Object");
    }

    @Override // csh.f
    public final Class j() {
        return VaultWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        VaultWidgetContext widgetContext2 = (VaultWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof q0) {
            pfm.h hVar = new pfm.h(new ly2.d(this, 25, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        if (event instanceof i3) {
            return pd.b.n(p0.f264003c, new f(this, widgetContext2, event, null));
        }
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
