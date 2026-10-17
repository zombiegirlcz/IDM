package com.revolut.feature.kyc_documents_scan.ui.onfido;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.onfido.android.sdk.capture.Onfido;
import com.onfido.workflow.OnfidoWorkflow;
import com.onfido.workflow.WorkflowConfig;
import com.revolut.feature.kyc_documents_scan.api.externalkyc.ExternalKycProviderContract$Configuration;
import com.revolut.feature.kyc_documents_scan.api.models.WorkflowDocumentScanCofiguration;
import com.revolut.feature.kyc_documents_scan.ui.onfido.OnfidoScreen;
import com.revolut.feature.kyc_documents_scan.ui.onfido.OnfidoScreenContract$InputData;
import com.revolut.feature.kyc_documents_scan.ui.onfido.b;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yuc.p;
import yv8.j;
import yy8.d;
import yy8.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/ui/onfido/OnfidoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyy8/c;", "Lcli/w;", "Lcom/revolut/feature/kyc_documents_scan/ui/onfido/b;", "Companion", "a", "feature_kyc_documents_scan_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnfidoScreen extends ViewController<yy8.c> implements w {
    public final OnfidoScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;
    public final boolean P;

    public OnfidoScreen(OnfidoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: yy8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnfidoScreen f317863b;

            {
                this.f317863b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (d) ((qy8.c) ((zy8.a) this.f317863b.M.getValue())).f250257h.get();
                    case 1:
                        OnfidoScreen onfidoScreen = this.f317863b;
                        qji.b bVarU2 = onfidoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc_documents_scan.ui.onfido.di.OnfidoScreenInjector");
                        qy8.b bVar = (qy8.b) bVarU2;
                        qy8.a aVar = bVar.f250251b;
                        qy8.b bVar2 = bVar.f250252c;
                        OnfidoScreenContract$InputData onfidoScreenContract$InputData = onfidoScreen.K;
                        onfidoScreenContract$InputData.getClass();
                        return new qy8.c(aVar, bVar2, onfidoScreen, onfidoScreenContract$InputData);
                    default:
                        OnfidoScreen onfidoScreen2 = this.f317863b;
                        return n14.e.a(onfidoScreen2, (d) onfidoScreen2.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = te0.w.y0(new Function0(this) { // from class: yy8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnfidoScreen f317863b;

            {
                this.f317863b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (d) ((qy8.c) ((zy8.a) this.f317863b.M.getValue())).f250257h.get();
                    case 1:
                        OnfidoScreen onfidoScreen = this.f317863b;
                        qji.b bVarU2 = onfidoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc_documents_scan.ui.onfido.di.OnfidoScreenInjector");
                        qy8.b bVar = (qy8.b) bVarU2;
                        qy8.a aVar = bVar.f250251b;
                        qy8.b bVar2 = bVar.f250252c;
                        OnfidoScreenContract$InputData onfidoScreenContract$InputData = onfidoScreen.K;
                        onfidoScreenContract$InputData.getClass();
                        return new qy8.c(aVar, bVar2, onfidoScreen, onfidoScreenContract$InputData);
                    default:
                        OnfidoScreen onfidoScreen2 = this.f317863b;
                        return n14.e.a(onfidoScreen2, (d) onfidoScreen2.L.getValue());
                }
            }
        });
        this.N = R$layout.screen_transparent;
        final int i3 = 2;
        this.O = te0.w.y0(new Function0(this) { // from class: yy8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnfidoScreen f317863b;

            {
                this.f317863b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (d) ((qy8.c) ((zy8.a) this.f317863b.M.getValue())).f250257h.get();
                    case 1:
                        OnfidoScreen onfidoScreen = this.f317863b;
                        qji.b bVarU2 = onfidoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc_documents_scan.ui.onfido.di.OnfidoScreenInjector");
                        qy8.b bVar = (qy8.b) bVarU2;
                        qy8.a aVar = bVar.f250251b;
                        qy8.b bVar2 = bVar.f250252c;
                        OnfidoScreenContract$InputData onfidoScreenContract$InputData = onfidoScreen.K;
                        onfidoScreenContract$InputData.getClass();
                        return new qy8.c(aVar, bVar2, onfidoScreen, onfidoScreenContract$InputData);
                    default:
                        OnfidoScreen onfidoScreen2 = this.f317863b;
                        return n14.e.a(onfidoScreen2, (d) onfidoScreen2.L.getValue());
                }
            }
        });
        this.P = true;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (!(uiState instanceof e)) {
            if (!(uiState instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            N2(((e) uiState).f317866a, ConnectionsStatusCodes.STATUS_ALREADY_DISCOVERING, null);
            c cVar = (c) ((d) this.L.getValue());
            cVar.H2(cVar.u, new j(28));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (zy8.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        if (i == 8002) {
            c cVar = (c) ((d) this.L.getValue());
            OnfidoScreenContract$InputData onfidoScreenContract$InputData = cVar.o;
            if (onfidoScreenContract$InputData instanceof OnfidoScreenContract$InputData.Onfido) {
                Onfido onfido = (Onfido) cVar.f77958p.get();
                Object obj2 = cVar.f77961s.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                onfido.handleActivityResult(i2, intent, (Onfido.OnfidoResultListener) obj2);
                return;
            }
            if (!(onfidoScreenContract$InputData instanceof OnfidoScreenContract$InputData.OnfidoStudio)) {
                throw new NoWhenBranchMatchedException();
            }
            OnfidoWorkflow onfidoWorkflow = (OnfidoWorkflow) cVar.f77959q.get();
            Object obj3 = cVar.f77962t.get();
            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            onfidoWorkflow.handleActivityResult(i2, intent, (OnfidoWorkflow.ResultListener) obj3);
        }
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intent intentCreateIntent;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d dVar = (d) this.L.getValue();
        Activity activity = m2();
        c cVar = (c) dVar;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        OnfidoScreenContract$InputData onfidoScreenContract$InputData = cVar.o;
        if (onfidoScreenContract$InputData instanceof OnfidoScreenContract$InputData.Onfido) {
            Onfido onfido = (Onfido) cVar.f77958p.get();
            sy8.c cVar2 = cVar.f77960r;
            WorkflowDocumentScanCofiguration.Onfido onfido2 = ((OnfidoScreenContract$InputData.Onfido) onfidoScreenContract$InputData).f77954a;
            String str = onfido2.f77930a;
            List list = onfido2.f77931b;
            sy8.b bVar = (sy8.b) cVar2;
            intentCreateIntent = onfido.createIntent(bVar.a(new ExternalKycProviderContract$Configuration.Onfido(onfido2.f77932c, str, onfido2.f77933g, list, onfido2.d, onfido2.f, onfido2.e, onfido2.f77934h), activity));
        } else {
            if (!(onfidoScreenContract$InputData instanceof OnfidoScreenContract$InputData.OnfidoStudio)) {
                throw new NoWhenBranchMatchedException();
            }
            WorkflowDocumentScanCofiguration.OnfidoStudio onfidoStudio = ((OnfidoScreenContract$InputData.OnfidoStudio) onfidoScreenContract$InputData).f77955a;
            intentCreateIntent = ((OnfidoWorkflow) cVar.f77959q.get()).createIntent(new WorkflowConfig.Builder(onfidoStudio.f77935a, onfidoStudio.f77936b).build());
        }
        cVar.H2(cVar.u, new p(intentCreateIntent, 21));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
