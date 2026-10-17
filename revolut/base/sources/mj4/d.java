package mj4;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting.WaitingPopupScreenContract$InputData;
import jki.g;
import jki.i;
import jki.j;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import m9d.y0;
import org.jetbrains.annotations.NotNull;
import rp0.m;
import rp0.t;
import wr3.f;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends g implements b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WaitingPopupScreenContract$InputData f205919p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f205920q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f205921r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wr3.e f205922s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f205923t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WaitingPopupScreenContract$InputData inputData, j60.a bottomDialogExtension, f notificationSettingsProvider, wr3.e notificationSettingsNavigationProvider, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(notificationSettingsProvider, "notificationSettingsProvider");
        Intrinsics.checkNotNullParameter(notificationSettingsNavigationProvider, "notificationSettingsNavigationProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f205919p = inputData;
        this.f205920q = bottomDialogExtension;
        this.f205921r = notificationSettingsProvider;
        this.f205922s = notificationSettingsNavigationProvider;
        this.f205923t = j.f175191a;
    }

    @Override // yji.l
    public final void I1() {
        j60.a aVar = this.f205920q;
        l.a1(this, rd0.e.b(aVar.E()), null, null, new y0(this, null, 15), 3);
        WaitingPopupScreenConfig waitingPopupScreenConfig = this.f205919p.f68516a;
        m.b bVar = m.Companion;
        t tVar = new t(waitingPopupScreenConfig.f66427a, waitingPopupScreenConfig.f66428b, null, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_BUTTON_PRIMARY", LargeActionButton.ButtonStyle.f58725a, null, this.f205921r.f299516a.areNotificationsEnabled() ? waitingPopupScreenConfig.f66429c : waitingPopupScreenConfig.d, false, null, null, null, null, 1000);
        yp0.b.r(model, 0, R$attr.uikit_dp24, 0, 0, 13);
        aVar.x(dy4.b.b(bVar, u.c(model), tVar, null, "WAITING_DELEGATES_KEY", null, null, 892));
    }

    @Override // jki.g
    public final i r2() {
        return this.f205923t;
    }
}
