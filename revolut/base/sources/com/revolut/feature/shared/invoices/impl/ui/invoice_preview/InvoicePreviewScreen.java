package com.revolut.feature.shared.invoices.impl.ui.invoice_preview;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PdfDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.feature.shared.invoices.impl.R$id;
import com.revolut.feature.shared.invoices.impl.R$layout;
import com.revolut.feature.shared.invoices.impl.ui.invoice_preview.InvoicePreviewScreen;
import com.revolut.feature.shared.invoices.impl.ui.invoice_preview.InvoicePreviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ea4.d;
import ead.b;
import ead.k;
import java.util.List;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/invoices/impl/ui/invoice_preview/InvoicePreviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lead/k;", "feature_shared_invoices_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoicePreviewScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(InvoicePreviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/shared/invoices/impl/databinding/ScreenInvoicePreviewBinding;", 0))};
    public final InvoicePreviewScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final FullScreenStateDelegate P;
    public final Object Q;

    public InvoicePreviewScreen(InvoicePreviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_invoice_preview;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ead.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicePreviewScreen f124190b;

            {
                this.f124190b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoicePreviewScreen invoicePreviewScreen = this.f124190b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoicePreviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(invoicePreviewScreen.m2()).a().get(cad.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", cad.d.class, " is not found"));
                        }
                        cad.d dVar = ((cad.d) aVar2.b()).e;
                        InvoicePreviewScreenContract$InputData invoicePreviewScreenContract$InputData = invoicePreviewScreen.K;
                        invoicePreviewScreenContract$InputData.getClass();
                        return new cad.b(dVar, invoicePreviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoicePreviewScreen.R;
                        return (o) ((cad.b) invoicePreviewScreen.N.getValue()).f22603c.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoicePreviewScreen.R;
                        InvoicePreviewScreen invoicePreviewScreen2 = this.f124190b;
                        return dli.f.a(invoicePreviewScreen2, (o) invoicePreviewScreen2.O.getValue(), v.k(invoicePreviewScreen2.P, new PdfDelegate(), new RowLoadingDelegate(), new WebViewDelegate()), R$id.invoicePreview_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ead.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicePreviewScreen f124190b;

            {
                this.f124190b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoicePreviewScreen invoicePreviewScreen = this.f124190b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoicePreviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(invoicePreviewScreen.m2()).a().get(cad.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", cad.d.class, " is not found"));
                        }
                        cad.d dVar = ((cad.d) aVar2.b()).e;
                        InvoicePreviewScreenContract$InputData invoicePreviewScreenContract$InputData = invoicePreviewScreen.K;
                        invoicePreviewScreenContract$InputData.getClass();
                        return new cad.b(dVar, invoicePreviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoicePreviewScreen.R;
                        return (o) ((cad.b) invoicePreviewScreen.N.getValue()).f22603c.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoicePreviewScreen.R;
                        InvoicePreviewScreen invoicePreviewScreen2 = this.f124190b;
                        return dli.f.a(invoicePreviewScreen2, (o) invoicePreviewScreen2.O.getValue(), v.k(invoicePreviewScreen2.P, new PdfDelegate(), new RowLoadingDelegate(), new WebViewDelegate()), R$id.invoicePreview_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new FullScreenStateDelegate();
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ead.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicePreviewScreen f124190b;

            {
                this.f124190b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoicePreviewScreen invoicePreviewScreen = this.f124190b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoicePreviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(invoicePreviewScreen.m2()).a().get(cad.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", cad.d.class, " is not found"));
                        }
                        cad.d dVar = ((cad.d) aVar2.b()).e;
                        InvoicePreviewScreenContract$InputData invoicePreviewScreenContract$InputData = invoicePreviewScreen.K;
                        invoicePreviewScreenContract$InputData.getClass();
                        return new cad.b(dVar, invoicePreviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoicePreviewScreen.R;
                        return (o) ((cad.b) invoicePreviewScreen.N.getValue()).f22603c.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoicePreviewScreen.R;
                        InvoicePreviewScreen invoicePreviewScreen2 = this.f124190b;
                        return dli.f.a(invoicePreviewScreen2, (o) invoicePreviewScreen2.O.getValue(), v.k(invoicePreviewScreen2.P, new PdfDelegate(), new RowLoadingDelegate(), new WebViewDelegate()), R$id.invoicePreview_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f2801b.setTitle(uiState.f124201b);
        List list = uiState.f124202c;
        boolean z = list.size() > 1;
        FixedTabs invoicePreviewTabs = d3().f2802c;
        Intrinsics.checkNotNullExpressionValue(invoicePreviewTabs, "invoicePreviewTabs");
        invoicePreviewTabs.setVisibility(z ? 0 : 8);
        FixedTabs fixedTabs = d3().f2802c;
        List list2 = list;
        String str = uiState.d;
        if (!z) {
            str = null;
        }
        fixedTabs.setItems(list2, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (cad.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ead.o) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f2801b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, vkm.q.J(new dmj.k(rd0.e.b(d3().f2801b.f59211b), 19), new dmj.k(rd0.e.b(d3().f2802c.f), 20), new dmj.k(rd0.e.b(this.P.f52371h.f121375b), 21)), new d(this, null, 2), 3);
    }

    public final aad.a d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aad.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
