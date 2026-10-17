package com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.popup;

import android.view.View;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreen;
import com.revolut.kompot.common.R$layout;
import dw3.v6;
import jki.k;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.x8;
import nhl.s;
import ni1.a;
import ni4.d;
import ni4.e;
import ni4.f;
import ni4.h;
import ni4.n;
import sji.b;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/popup/SpousalConsentInitiatorPopupScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreen;", "Ljki/k;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/popup/SpousalConsentInitiatorPopupScreenContract$InputData;", "Lni4/d;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SpousalConsentInitiatorPopupScreen extends PluginScreen<k, SpousalConsentInitiatorPopupScreenContract$InputData, d> {
    public static final /* synthetic */ int R = 0;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpousalConsentInitiatorPopupScreen(SpousalConsentInitiatorPopupScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = R$layout.screen_transparent;
        this.O = w.y0(new a(this, inputData, 1));
        this.P = w.y0(new x8(this, 28));
        this.Q = w.y0(new s(11));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        n nVar = (n) ((e) this.P.getValue());
        int i = h.f215641a[nVar.f215648q.f68446b.ordinal()];
        if (i == 1) {
            nVar.f215652w = new f(nVar, 2);
            j60.a.v(nVar.f215649r, false, null, 3);
            return true;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        nVar.s1();
        nVar.y2(nVar.v.e);
        return true;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        k uiState = (k) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (v6) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.Q.getValue()).d.f121375b), null, new ni4.a(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((v6) this.O.getValue()).d.get()).d(u.c((LargeActionButtonDelegate) this.Q.getValue()));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }
}
