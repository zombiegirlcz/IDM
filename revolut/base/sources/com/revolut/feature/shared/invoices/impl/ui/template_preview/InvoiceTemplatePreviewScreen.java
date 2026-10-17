package com.revolut.feature.shared.invoices.impl.ui.template_preview;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cad.c;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PdfDelegate;
import com.revolut.feature.shared.invoices.api.ui.contract.InvoiceTemplatePreviewContract$InputData;
import com.revolut.feature.shared.invoices.impl.R$id;
import com.revolut.feature.shared.invoices.impl.R$layout;
import com.revolut.feature.shared.invoices.impl.ui.template_preview.InvoiceTemplatePreviewScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import hwi.l0;
import iad.b;
import iad.f;
import iad.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/invoices/impl/ui/template_preview/InvoiceTemplatePreviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Liad/f;", "feature_shared_invoices_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceTemplatePreviewScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(InvoiceTemplatePreviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/shared/invoices/impl/databinding/ScreenInvoiceTemplatePreviewBinding;", 0))};
    public final InvoiceTemplatePreviewContract$InputData K;
    public final int L;
    public final h M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public InvoiceTemplatePreviewScreen(InvoiceTemplatePreviewContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_invoice_template_preview;
        this.M = s.t(this, b.f);
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: iad.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceTemplatePreviewScreen f159989b;

            {
                this.f159989b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoiceTemplatePreviewScreen invoiceTemplatePreviewScreen = this.f159989b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceTemplatePreviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(invoiceTemplatePreviewScreen.m2()).a().get(cad.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", cad.d.class, " is not found"));
                        }
                        cad.d dVar = ((cad.d) aVar2.b()).e;
                        InvoiceTemplatePreviewContract$InputData invoiceTemplatePreviewContract$InputData = invoiceTemplatePreviewScreen.K;
                        invoiceTemplatePreviewContract$InputData.getClass();
                        return new cad.c(dVar, invoiceTemplatePreviewContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceTemplatePreviewScreen.R;
                        return (g) ((cad.c) invoiceTemplatePreviewScreen.O.getValue()).f22605b.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceTemplatePreviewScreen.R;
                        InvoiceTemplatePreviewScreen invoiceTemplatePreviewScreen2 = this.f159989b;
                        return dli.f.a(invoiceTemplatePreviewScreen2, (g) invoiceTemplatePreviewScreen2.P.getValue(), v.k(invoiceTemplatePreviewScreen2.N, new FullScreenStateLoadingDelegate(), new PdfDelegate()), R$id.templatePreview_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: iad.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceTemplatePreviewScreen f159989b;

            {
                this.f159989b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoiceTemplatePreviewScreen invoiceTemplatePreviewScreen = this.f159989b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceTemplatePreviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(invoiceTemplatePreviewScreen.m2()).a().get(cad.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", cad.d.class, " is not found"));
                        }
                        cad.d dVar = ((cad.d) aVar2.b()).e;
                        InvoiceTemplatePreviewContract$InputData invoiceTemplatePreviewContract$InputData = invoiceTemplatePreviewScreen.K;
                        invoiceTemplatePreviewContract$InputData.getClass();
                        return new cad.c(dVar, invoiceTemplatePreviewContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceTemplatePreviewScreen.R;
                        return (g) ((cad.c) invoiceTemplatePreviewScreen.O.getValue()).f22605b.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceTemplatePreviewScreen.R;
                        InvoiceTemplatePreviewScreen invoiceTemplatePreviewScreen2 = this.f159989b;
                        return dli.f.a(invoiceTemplatePreviewScreen2, (g) invoiceTemplatePreviewScreen2.P.getValue(), v.k(invoiceTemplatePreviewScreen2.N, new FullScreenStateLoadingDelegate(), new PdfDelegate()), R$id.templatePreview_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: iad.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceTemplatePreviewScreen f159989b;

            {
                this.f159989b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoiceTemplatePreviewScreen invoiceTemplatePreviewScreen = this.f159989b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceTemplatePreviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(invoiceTemplatePreviewScreen.m2()).a().get(cad.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", cad.d.class, " is not found"));
                        }
                        cad.d dVar = ((cad.d) aVar2.b()).e;
                        InvoiceTemplatePreviewContract$InputData invoiceTemplatePreviewContract$InputData = invoiceTemplatePreviewScreen.K;
                        invoiceTemplatePreviewContract$InputData.getClass();
                        return new cad.c(dVar, invoiceTemplatePreviewContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceTemplatePreviewScreen.R;
                        return (g) ((cad.c) invoiceTemplatePreviewScreen.O.getValue()).f22605b.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceTemplatePreviewScreen.R;
                        InvoiceTemplatePreviewScreen invoiceTemplatePreviewScreen2 = this.f159989b;
                        return dli.f.a(invoiceTemplatePreviewScreen2, (g) invoiceTemplatePreviewScreen2.P.getValue(), v.k(invoiceTemplatePreviewScreen2.N, new FullScreenStateLoadingDelegate(), new PdfDelegate()), R$id.templatePreview_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f2804b.setTitle(uiState.f159992a.f159991a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f2804b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f2804b.f59211b), new l0(this, null, 29), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new iad.c(this, null), 3);
    }

    public final aad.b d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aad.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
