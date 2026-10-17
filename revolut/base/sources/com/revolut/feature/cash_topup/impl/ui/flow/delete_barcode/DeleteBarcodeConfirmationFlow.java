package com.revolut.feature.cash_topup.impl.ui.flow.delete_barcode;

import android.view.View;
import cbf.c;
import cc3.d;
import cc3.f;
import cc3.h;
import cc3.j;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.cash_topup.impl.ui.flow.delete_barcode.DeleteBarcodeConfirmationFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import j60.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mb3.p;
import mb3.y;
import qji.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/delete_barcode/DeleteBarcodeConfirmationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcc3/f;", "Lyki/f;", "Lin0/g;", "<init>", "()V", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeleteBarcodeConfirmationFlow extends ViewController<f> implements yki.f, g {
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final int K = R$layout.screen_transparent;
    public final TwinHorizontalButtonDelegate P = new TwinHorizontalButtonDelegate();

    public DeleteBarcodeConfirmationFlow() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: cc3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeleteBarcodeConfirmationFlow f22923b;

            {
                this.f22923b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        DeleteBarcodeConfirmationFlow deleteBarcodeConfirmationFlow = this.f22923b;
                        phm.a aVar = (phm.a) ue0.e.j(deleteBarcodeConfirmationFlow.m2()).a().get(bb3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bb3.a.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).i;
                        y yVar = new y();
                        yVar.f204115a = e4m.b.b(e4m.c.a(deleteBarcodeConfirmationFlow));
                        yVar.f204116b = e4m.b.b(new lzk.b(pVar, yVar, 2, 28));
                        yVar.f204117c = e4m.b.b(new lzk.b(pVar, yVar, 1, 28));
                        yVar.d = e4m.b.b(new lzk.b(pVar, yVar, 0, 28));
                        yVar.e = e4m.b.b(new lzk.b(pVar, yVar, 3, 28));
                        return yVar;
                    case 1:
                        return (e) ((y) this.f22923b.L.getValue()).e.get();
                    case 2:
                        DeleteBarcodeConfirmationFlow deleteBarcodeConfirmationFlow2 = this.f22923b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, deleteBarcodeConfirmationFlow2, deleteBarcodeConfirmationFlow2.d());
                    default:
                        return (j60.a) ((y) this.f22923b.L.getValue()).f204117c.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: cc3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeleteBarcodeConfirmationFlow f22923b;

            {
                this.f22923b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        DeleteBarcodeConfirmationFlow deleteBarcodeConfirmationFlow = this.f22923b;
                        phm.a aVar = (phm.a) ue0.e.j(deleteBarcodeConfirmationFlow.m2()).a().get(bb3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bb3.a.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).i;
                        y yVar = new y();
                        yVar.f204115a = e4m.b.b(e4m.c.a(deleteBarcodeConfirmationFlow));
                        yVar.f204116b = e4m.b.b(new lzk.b(pVar, yVar, 2, 28));
                        yVar.f204117c = e4m.b.b(new lzk.b(pVar, yVar, 1, 28));
                        yVar.d = e4m.b.b(new lzk.b(pVar, yVar, 0, 28));
                        yVar.e = e4m.b.b(new lzk.b(pVar, yVar, 3, 28));
                        return yVar;
                    case 1:
                        return (e) ((y) this.f22923b.L.getValue()).e.get();
                    case 2:
                        DeleteBarcodeConfirmationFlow deleteBarcodeConfirmationFlow2 = this.f22923b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, deleteBarcodeConfirmationFlow2, deleteBarcodeConfirmationFlow2.d());
                    default:
                        return (j60.a) ((y) this.f22923b.L.getValue()).f204117c.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: cc3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeleteBarcodeConfirmationFlow f22923b;

            {
                this.f22923b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        DeleteBarcodeConfirmationFlow deleteBarcodeConfirmationFlow = this.f22923b;
                        phm.a aVar = (phm.a) ue0.e.j(deleteBarcodeConfirmationFlow.m2()).a().get(bb3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bb3.a.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).i;
                        y yVar = new y();
                        yVar.f204115a = e4m.b.b(e4m.c.a(deleteBarcodeConfirmationFlow));
                        yVar.f204116b = e4m.b.b(new lzk.b(pVar, yVar, 2, 28));
                        yVar.f204117c = e4m.b.b(new lzk.b(pVar, yVar, 1, 28));
                        yVar.d = e4m.b.b(new lzk.b(pVar, yVar, 0, 28));
                        yVar.e = e4m.b.b(new lzk.b(pVar, yVar, 3, 28));
                        return yVar;
                    case 1:
                        return (e) ((y) this.f22923b.L.getValue()).e.get();
                    case 2:
                        DeleteBarcodeConfirmationFlow deleteBarcodeConfirmationFlow2 = this.f22923b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, deleteBarcodeConfirmationFlow2, deleteBarcodeConfirmationFlow2.d());
                    default:
                        return (j60.a) ((y) this.f22923b.L.getValue()).f204117c.get();
                }
            }
        });
        final int i5 = 3;
        this.O = w.y0(new Function0(this) { // from class: cc3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeleteBarcodeConfirmationFlow f22923b;

            {
                this.f22923b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        DeleteBarcodeConfirmationFlow deleteBarcodeConfirmationFlow = this.f22923b;
                        phm.a aVar = (phm.a) ue0.e.j(deleteBarcodeConfirmationFlow.m2()).a().get(bb3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bb3.a.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).i;
                        y yVar = new y();
                        yVar.f204115a = e4m.b.b(e4m.c.a(deleteBarcodeConfirmationFlow));
                        yVar.f204116b = e4m.b.b(new lzk.b(pVar, yVar, 2, 28));
                        yVar.f204117c = e4m.b.b(new lzk.b(pVar, yVar, 1, 28));
                        yVar.d = e4m.b.b(new lzk.b(pVar, yVar, 0, 28));
                        yVar.e = e4m.b.b(new lzk.b(pVar, yVar, 3, 28));
                        return yVar;
                    case 1:
                        return (e) ((y) this.f22923b.L.getValue()).e.get();
                    case 2:
                        DeleteBarcodeConfirmationFlow deleteBarcodeConfirmationFlow2 = this.f22923b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, deleteBarcodeConfirmationFlow2, deleteBarcodeConfirmationFlow2.d());
                    default:
                        return (j60.a) ((y) this.f22923b.L.getValue()).f204117c.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        j jVar = (j) d();
        a.v(jVar.o, false, new h(jVar, 0), 1);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (y) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackgroundColor(0);
        ((a) this.O.getValue()).d(u.c(this.P));
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new c(rd0.e.b(((a) this.O.getValue()).E()), 2), null, new d(this, null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final cc3.e d() {
        return (cc3.e) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
