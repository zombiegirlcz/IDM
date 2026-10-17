package com.revolut.feature.credit.application.close.ui.screen;

import android.os.Parcelable;
import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.credit.application.plugins.impl.models.CreditOnboardingClosePayload;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import grl.k9;
import hl6.b;
import hp3.r;
import hq1.f;
import hq3.d;
import hq3.e;
import hq3.j;
import hq3.o;
import in0.g;
import iq3.c;
import j60.a;
import jki.h;
import jki.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/application/close/ui/screen/CreditApplicationCloseScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Ljki/k;", "Lcom/revolut/feature/credit/application/close/ui/screen/CreditApplicationCloseScreenContract$InputData;", "Lhq3/d;", "Lin0/g;", "Lno/k;", "Lno/m;", "feature_credit_application_close_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditApplicationCloseScreen extends BaseScreen<k, CreditApplicationCloseScreenContract$InputData, d> implements g, no.k, m {
    public AnalyticsContext M;
    public final int N;
    public final Object O;
    public final Object P;
    public final LargeActionButtonDelegate Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditApplicationCloseScreen(CreditApplicationCloseScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = ((CreditOnboardingClosePayload) inputData.f66220a).f66908b;
        this.N = R$layout.screen_transparent;
        this.O = w.y0(new b(this, inputData, 7));
        this.P = w.y0(new f(this, 1));
        this.Q = new LargeActionButtonDelegate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        o oVar = (o) ((e) this.P.getValue());
        a aVar = oVar.f154601q;
        Continuation continuation = null;
        if (aVar.j()) {
            a.v(aVar, false, null, 3);
            return true;
        }
        oVar.n2(new j(oVar, continuation, 0), new whi.b(6));
        return true;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.M = analyticsContext;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, jki.o oVar) {
        k uiState = (k) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.Q.d.f121375b, new r(24))), null, new hp2.d(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((c) this.O.getValue()).b().d(u.c(this.Q));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
