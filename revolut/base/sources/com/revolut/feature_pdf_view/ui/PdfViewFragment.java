package com.revolut.feature_pdf_view.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au0.b2;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenDocumentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core_ui_custom_font.TypefaceTextView;
import com.revolut.feature_pdf_view.R$id;
import com.revolut.feature_pdf_view.R$layout;
import com.revolut.feature_pdf_view.R$string;
import com.revolut.retail.core.ui.activity.BaseDelegatesFragment;
import com.revolut.ui_kit_pdf.PdfView;
import e9i.d;
import e9i.f;
import g9i.l;
import g9i.n;
import g9i.o;
import g9i.u;
import j90.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import le.u1;
import no.k;
import od0.h;
import od0.i;
import te0.e;
import te0.w;
import yp0.y;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature_pdf_view/ui/PdfViewFragment;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesFragment;", "Lg9i/l;", "Lg9i/o;", "Lno/m;", "Lno/k;", "Ldri/a;", "<init>", "()V", "feature_pdf_view_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfViewFragment extends BaseDelegatesFragment<l, o> implements o, k, dri.a {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f97459h0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final c f97460b0 = u1.x(this, R$id.preview_unavailable_section);
    public final c c0 = u1.x(this, R$id.open_in_browser);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final c f97461d0 = u1.x(this, R$id.recyclerView);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final c f97462e0 = u1.x(this, R$id.pdfView);
    public final FullScreenStateDelegate f0;
    public final j g0;

    static {
        h0 h0Var = new h0(PdfViewFragment.class, "previewUnavailableSection", "getPreviewUnavailableSection()Landroid/widget/LinearLayout;", 0);
        p0 p0Var = o0.f186429a;
        f97459h0 = new KProperty[]{p0Var.j(h0Var), p.a.y(PdfViewFragment.class, "openInBrowser", "getOpenInBrowser()Lcom/revolut/core_ui_custom_font/TypefaceTextView;", 0, p0Var), p.a.y(PdfViewFragment.class, "loadingScreenState", "getLoadingScreenState()Landroidx/recyclerview/widget/RecyclerView;", 0, p0Var), p.a.y(PdfViewFragment.class, "pdfView", "getPdfView()Lcom/revolut/ui_kit_pdf/PdfView;", 0, p0Var)};
    }

    public PdfViewFragment() {
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f0 = fullScreenStateDelegate;
        this.g0 = new j(7, v.k(new FullScreenDocumentLoadingDelegate(), fullScreenStateDelegate), false);
    }

    @Override // dri.a
    public final boolean D0() {
        if (getActivity() != null) {
            return ((Boolean) ((u) F()).z0().get()).booleanValue();
        }
        return true;
    }

    public final RecyclerView E() {
        return (RecyclerView) this.f97461d0.getValue(this, f97459h0[2]);
    }

    public final n F() {
        return (n) ((d) ((f) jb3.l.q(this))).f124011b.f124023g.get();
    }

    public final LinearLayout G() {
        return (LinearLayout) this.f97460b0.getValue(this, f97459h0[0]);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        if (getActivity() != null) {
            e eVarW0 = ((u) F()).w0();
            i.Companion.getClass();
            eVarW0.set(h.a(analyticsContext));
        }
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getF82762b0() {
        u uVar = (u) F();
        return (AnalyticsProduct) w.O(uVar.f141904h.getValue(uVar, u.f141900l[6]));
    }

    @Override // no.k
    /* JADX INFO: renamed from: R */
    public final AnalyticsContext getD0() {
        i iVar;
        if (getActivity() == null || (iVar = (i) w.O(((u) F()).w0())) == null) {
            return null;
        }
        return (AnalyticsContext) iVar.f224257a;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return getLayoutInflater().inflate(R$layout.fragment_pdf_viewer, viewGroup, false);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        w01.k.a(G());
        G().setOnClickListener(new b2(this, 27));
        RecyclerView recyclerViewE = E();
        y.h(recyclerViewE, this.g0, new LinearLayoutManager(recyclerViewE.getContext()));
        pd.b.p(view, new TextLocalisedClause(R$string.pdf_title, zhm.u.c(""), null, 12));
    }

    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        w01.k.d(E());
        KProperty[] kPropertyArr = f97459h0;
        w01.k.d((PdfView) this.f97462e0.getValue(this, kPropertyArr[3]));
        w01.k.a(G());
        w01.k.a((TypefaceTextView) this.c0.getValue(this, kPropertyArr[1]));
        this.g0.c(items);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final pri.e z() {
        return (l) ((d) ((f) jb3.l.q(this))).o.get();
    }
}
