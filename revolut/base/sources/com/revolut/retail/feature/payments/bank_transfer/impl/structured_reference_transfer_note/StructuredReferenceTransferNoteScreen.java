package com.revolut.retail.feature.payments.bank_transfer.impl.structured_reference_transfer_note;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c0d.e;
import c1i.f;
import c4k.b;
import c4k.c;
import c4k.d;
import c4k.g;
import c4k.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$id;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$layout;
import com.revolut.retail.feature.payments.bank_transfer.impl.structured_reference_transfer_note.StructuredReferenceTransferNoteScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.structured_reference_transfer_note.StructuredReferenceTransferNoteScreenContract$InputData;
import com.revolut.retail.feature.payments.core.R$string;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p2k.d0;
import p2k.n;
import p2k.p;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/structured_reference_transfer_note/StructuredReferenceTransferNoteScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc4k/g;", "Ldli/a;", "Lc4k/i;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StructuredReferenceTransferNoteScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(StructuredReferenceTransferNoteScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/payments/bank_transfer/impl/databinding/ScreenStructuredReferenceTransferNoteBinding;", 0))};
    public final StructuredReferenceTransferNoteScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final InputTextDelegate Q;
    public final Object R;

    public StructuredReferenceTransferNoteScreen(StructuredReferenceTransferNoteScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_structured_reference_transfer_note;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: c4k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StructuredReferenceTransferNoteScreen f21304b;

            {
                this.f21304b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StructuredReferenceTransferNoteScreen structuredReferenceTransferNoteScreen = this.f21304b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StructuredReferenceTransferNoteScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(structuredReferenceTransferNoteScreen.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f232406h0;
                        StructuredReferenceTransferNoteScreenContract$InputData structuredReferenceTransferNoteScreenContract$InputData = structuredReferenceTransferNoteScreen.K;
                        structuredReferenceTransferNoteScreenContract$InputData.getClass();
                        return new p(nVar, structuredReferenceTransferNoteScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = StructuredReferenceTransferNoteScreen.S;
                        return (h) ((p) structuredReferenceTransferNoteScreen.N.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = StructuredReferenceTransferNoteScreen.S;
                        StructuredReferenceTransferNoteScreen structuredReferenceTransferNoteScreen2 = this.f21304b;
                        return dli.f.a(structuredReferenceTransferNoteScreen2, structuredReferenceTransferNoteScreen2.R2(), v.k((FixedTabsDelegate) structuredReferenceTransferNoteScreen2.P.getValue(), structuredReferenceTransferNoteScreen2.Q), R$id.structuredReferenceTransferNote_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: c4k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StructuredReferenceTransferNoteScreen f21304b;

            {
                this.f21304b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StructuredReferenceTransferNoteScreen structuredReferenceTransferNoteScreen = this.f21304b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StructuredReferenceTransferNoteScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(structuredReferenceTransferNoteScreen.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f232406h0;
                        StructuredReferenceTransferNoteScreenContract$InputData structuredReferenceTransferNoteScreenContract$InputData = structuredReferenceTransferNoteScreen.K;
                        structuredReferenceTransferNoteScreenContract$InputData.getClass();
                        return new p(nVar, structuredReferenceTransferNoteScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = StructuredReferenceTransferNoteScreen.S;
                        return (h) ((p) structuredReferenceTransferNoteScreen.N.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = StructuredReferenceTransferNoteScreen.S;
                        StructuredReferenceTransferNoteScreen structuredReferenceTransferNoteScreen2 = this.f21304b;
                        return dli.f.a(structuredReferenceTransferNoteScreen2, structuredReferenceTransferNoteScreen2.R2(), v.k((FixedTabsDelegate) structuredReferenceTransferNoteScreen2.P.getValue(), structuredReferenceTransferNoteScreen2.Q), R$id.structuredReferenceTransferNote_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new e(11));
        this.Q = new InputTextDelegate(new bwd.a(this, 18));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: c4k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StructuredReferenceTransferNoteScreen f21304b;

            {
                this.f21304b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StructuredReferenceTransferNoteScreen structuredReferenceTransferNoteScreen = this.f21304b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StructuredReferenceTransferNoteScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(structuredReferenceTransferNoteScreen.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f232406h0;
                        StructuredReferenceTransferNoteScreenContract$InputData structuredReferenceTransferNoteScreenContract$InputData = structuredReferenceTransferNoteScreen.K;
                        structuredReferenceTransferNoteScreenContract$InputData.getClass();
                        return new p(nVar, structuredReferenceTransferNoteScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = StructuredReferenceTransferNoteScreen.S;
                        return (h) ((p) structuredReferenceTransferNoteScreen.N.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = StructuredReferenceTransferNoteScreen.S;
                        StructuredReferenceTransferNoteScreen structuredReferenceTransferNoteScreen2 = this.f21304b;
                        return dli.f.a(structuredReferenceTransferNoteScreen2, structuredReferenceTransferNoteScreen2.R2(), v.k((FixedTabsDelegate) structuredReferenceTransferNoteScreen2.P.getValue(), structuredReferenceTransferNoteScreen2.Q), R$id.structuredReferenceTransferNote_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f221653b.setEnabled(uiState.f21311b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f221654c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.payments_bank_transfer_reference_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.payments_bank_transfer_reference_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f221653b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f221654c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f221653b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FixedTabsDelegate) this.P.getValue()).f52339c.f121375b), null, new f(this, (Continuation) null, 10), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.e.f121375b), null, new d(this, null), 3);
    }

    public final o2k.b d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o2k.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final c4k.h R2() {
        return (c4k.h) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
