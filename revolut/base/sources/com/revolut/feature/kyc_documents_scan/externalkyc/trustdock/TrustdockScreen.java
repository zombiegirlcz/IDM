package com.revolut.feature.kyc_documents_scan.externalkyc.trustdock;

import aii.q;
import android.view.View;
import android.webkit.WebSettings;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc_documents_scan.R$layout;
import com.revolut.feature.kyc_documents_scan.externalkyc.trustdock.TrustdockScreen;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import frl.a;
import grl.k9;
import java.util.concurrent.CopyOnWriteArrayList;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nii.l0;
import nii.y0;
import nii.z;
import no.m;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import te0.w;
import ty8.b;
import ty8.d;
import ty8.e;
import ty8.f;
import ty8.g;
import ty8.p;
import ty8.r;
import ulm.w0;
import ulm.x0;
import vc.s;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00062\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/externalkyc/trustdock/TrustdockScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lty8/g;", "Lcom/revolut/feature/kyc_documents_scan/externalkyc/trustdock/TrustdockScreenContract$InputData;", "Laii/q;", "Lno/m;", "Companion", "a", "feature_kyc_documents_scan_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrustdockScreen extends BaseScreen<g, TrustdockScreenContract$InputData, q> implements m {
    public final h M;
    public final Object N;
    public final Object O;
    public final AnalyticsProduct.Retail P;
    public final Object Q;
    public final Object R;
    public final int S;
    public final boolean T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TrustdockScreen.class, "binding", "getBinding()Lcom/revolut/feature/kyc_documents_scan/databinding/TrustdockScreenBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.kyc_documents_scan.externalkyc.trustdock.TrustdockScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustdockScreen(TrustdockScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ty8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustdockScreen f275514b;

            {
                this.f275514b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TrustdockScreen trustdockScreen = this.f275514b;
                switch (i2) {
                    case 0:
                        TrustdockScreen.Companion companion = TrustdockScreen.INSTANCE;
                        qy8.d dVar = (qy8.d) trustdockScreen.Q.getValue();
                        dVar.getClass();
                        return new s((d) dVar.f250260c.get());
                    case 1:
                        TrustdockScreen.Companion companion2 = TrustdockScreen.INSTANCE;
                        qy8.d dVar2 = (qy8.d) trustdockScreen.Q.getValue();
                        dVar2.getClass();
                        return new r((d) dVar2.f250260c.get());
                    default:
                        TrustdockScreen.Companion companion3 = TrustdockScreen.INSTANCE;
                        return (d) ((qy8.d) trustdockScreen.Q.getValue()).f250260c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ty8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustdockScreen f275514b;

            {
                this.f275514b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TrustdockScreen trustdockScreen = this.f275514b;
                switch (i22) {
                    case 0:
                        TrustdockScreen.Companion companion = TrustdockScreen.INSTANCE;
                        qy8.d dVar = (qy8.d) trustdockScreen.Q.getValue();
                        dVar.getClass();
                        return new s((d) dVar.f250260c.get());
                    case 1:
                        TrustdockScreen.Companion companion2 = TrustdockScreen.INSTANCE;
                        qy8.d dVar2 = (qy8.d) trustdockScreen.Q.getValue();
                        dVar2.getClass();
                        return new r((d) dVar2.f250260c.get());
                    default:
                        TrustdockScreen.Companion companion3 = TrustdockScreen.INSTANCE;
                        return (d) ((qy8.d) trustdockScreen.Q.getValue()).f250260c.get();
                }
            }
        });
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137499j;
        this.P = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.Q = w.y0(new tml.a(this, inputData, 27));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ty8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustdockScreen f275514b;

            {
                this.f275514b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TrustdockScreen trustdockScreen = this.f275514b;
                switch (i22) {
                    case 0:
                        TrustdockScreen.Companion companion2 = TrustdockScreen.INSTANCE;
                        qy8.d dVar = (qy8.d) trustdockScreen.Q.getValue();
                        dVar.getClass();
                        return new s((d) dVar.f250260c.get());
                    case 1:
                        TrustdockScreen.Companion companion22 = TrustdockScreen.INSTANCE;
                        qy8.d dVar2 = (qy8.d) trustdockScreen.Q.getValue();
                        dVar2.getClass();
                        return new r((d) dVar2.f250260c.get());
                    default:
                        TrustdockScreen.Companion companion3 = TrustdockScreen.INSTANCE;
                        return (d) ((qy8.d) trustdockScreen.Q.getValue()).f250260c.get();
                }
            }
        });
        this.S = R$layout.trustdock_screen;
        this.T = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        p pVar = (p) ((d) this.R.getValue());
        pVar.f275527q.getClass();
        l.a1(pVar, pVar.X1(new y0("TRUSTDOCK_CANCEL_DIALOG_ID", new l0(new TextLocalisedClause(R$string.cancel_flow_alert_title, null, null, 14), new TextLocalisedClause(R$string.cancel_flow_alert_message, null, null, 14), null, new TextLocalisedClause(R.string.common_action_quit, null, null, 14), new TextLocalisedClause(R$string.cancel_flow_alert_back, null, null, 14), null, false, null, 996), false, 4)), null, null, new tna.p(pVar, null, 29), 3);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        g uiState = (g) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (!uiState.f275518a && uiState.f275519b) {
            w0 w0Var = x0.Companion;
            String str = uiState.f275520c;
            w0Var.getClass();
            x0 x0VarD = w0.d(str);
            if (x0VarD == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Z2().f240699b.loadUrl(x0VarD.g().b().i);
            Z2().f240699b.postVisualStateCallback(1337L, new ey8.b(this, 1));
        }
        f fVar = uiState.d;
        if (fVar instanceof e) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(c.WARNING, "Trustdock", j6.a.q("Trustdock SubmissionError: ", ((e) fVar).name()), null, null, 16);
            p pVar = (p) ((d) this.R.getValue());
            pVar.f275527q.getClass();
            l.a1(pVar, pVar.X1(new y0("TRUSTDOCK_ERROR_DIALOG_ID", new z(vw8.a.a(), null, new TextLocalisedClause(R$string.common_action_retry, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, null, new ty8.o(pVar, null), 3);
            return;
        }
        if (fVar instanceof ty8.h) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.b(c.WARNING, "Trustdock", a0.d.n("Trustdock WebViewError, code: ", ((ty8.h) fVar).f275521a), null, null, 16);
        } else if (fVar != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (qy8.d) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (d) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        WebView webView = Z2().f240699b;
        webView.setOverScrollMode(2);
        webView.setFocusableInTouchMode(true);
        webView.setWebViewClient((ty8.s) this.N.getValue());
        webView.setWebChromeClient((r) this.O.getValue());
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
    }

    public final py8.a Z2() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (py8.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.S;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.T);
    }
}
