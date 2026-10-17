package com.revolut.feature.pay_with_photo.impl.ui.preview;

import al9.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PdfDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.feature.pay_with_photo.api.PayWithPhotoPreviewControllerDescriptor$InputData;
import com.revolut.feature.pay_with_photo.impl.ui.preview.PayWithPhotoPreviewController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.i;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ml3.y;
import ml9.b;
import ml9.d;
import ml9.f;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_with_photo/impl/ui/preview/PayWithPhotoPreviewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lal9/g;", "Ldli/a;", "Lml9/b;", "feature_pay_with_photo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayWithPhotoPreviewController extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PayWithPhotoPreviewController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarActionFooterBinding;", 0))};
    public final PayWithPhotoPreviewControllerDescriptor$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public boolean P;
    public final Object Q;

    public PayWithPhotoPreviewController(PayWithPhotoPreviewControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_basic_navbar_action_footer;
        this.M = s.t(this, d.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ml9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithPhotoPreviewController f206654b;

            {
                this.f206654b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayWithPhotoPreviewController payWithPhotoPreviewController = this.f206654b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayWithPhotoPreviewController.R;
                        phm.a aVar = (phm.a) ue0.e.j(payWithPhotoPreviewController.m2()).a().get(fl9.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fl9.d.class, " is not found"));
                        }
                        fl9.a aVar3 = ((fl9.a) ((fl9.d) aVar2.b())).f135911g;
                        PayWithPhotoPreviewControllerDescriptor$InputData payWithPhotoPreviewControllerDescriptor$InputData = payWithPhotoPreviewController.K;
                        payWithPhotoPreviewControllerDescriptor$InputData.getClass();
                        return new fl9.b(aVar3, payWithPhotoPreviewControllerDescriptor$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PayWithPhotoPreviewController.R;
                        return (f) ((fl9.b) payWithPhotoPreviewController.N.getValue()).f135914b.get();
                    default:
                        KProperty[] kPropertyArr3 = PayWithPhotoPreviewController.R;
                        PayWithPhotoPreviewController payWithPhotoPreviewController2 = this.f206654b;
                        return dli.f.a(payWithPhotoPreviewController2, (f) payWithPhotoPreviewController2.O.getValue(), v.k(new PdfDelegate(), new SimpleMediaDelegate()), R$id.screenRecyclerBasicNavbarActionFooter_recyclerView, new y(payWithPhotoPreviewController2, 1), null, null, 48);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ml9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithPhotoPreviewController f206654b;

            {
                this.f206654b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayWithPhotoPreviewController payWithPhotoPreviewController = this.f206654b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayWithPhotoPreviewController.R;
                        phm.a aVar = (phm.a) ue0.e.j(payWithPhotoPreviewController.m2()).a().get(fl9.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fl9.d.class, " is not found"));
                        }
                        fl9.a aVar3 = ((fl9.a) ((fl9.d) aVar2.b())).f135911g;
                        PayWithPhotoPreviewControllerDescriptor$InputData payWithPhotoPreviewControllerDescriptor$InputData = payWithPhotoPreviewController.K;
                        payWithPhotoPreviewControllerDescriptor$InputData.getClass();
                        return new fl9.b(aVar3, payWithPhotoPreviewControllerDescriptor$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PayWithPhotoPreviewController.R;
                        return (f) ((fl9.b) payWithPhotoPreviewController.N.getValue()).f135914b.get();
                    default:
                        KProperty[] kPropertyArr3 = PayWithPhotoPreviewController.R;
                        PayWithPhotoPreviewController payWithPhotoPreviewController2 = this.f206654b;
                        return dli.f.a(payWithPhotoPreviewController2, (f) payWithPhotoPreviewController2.O.getValue(), v.k(new PdfDelegate(), new SimpleMediaDelegate()), R$id.screenRecyclerBasicNavbarActionFooter_recyclerView, new y(payWithPhotoPreviewController2, 1), null, null, 48);
                }
            }
        });
        this.P = true;
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ml9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithPhotoPreviewController f206654b;

            {
                this.f206654b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayWithPhotoPreviewController payWithPhotoPreviewController = this.f206654b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayWithPhotoPreviewController.R;
                        phm.a aVar = (phm.a) ue0.e.j(payWithPhotoPreviewController.m2()).a().get(fl9.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fl9.d.class, " is not found"));
                        }
                        fl9.a aVar3 = ((fl9.a) ((fl9.d) aVar2.b())).f135911g;
                        PayWithPhotoPreviewControllerDescriptor$InputData payWithPhotoPreviewControllerDescriptor$InputData = payWithPhotoPreviewController.K;
                        payWithPhotoPreviewControllerDescriptor$InputData.getClass();
                        return new fl9.b(aVar3, payWithPhotoPreviewControllerDescriptor$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PayWithPhotoPreviewController.R;
                        return (f) ((fl9.b) payWithPhotoPreviewController.N.getValue()).f135914b.get();
                    default:
                        KProperty[] kPropertyArr3 = PayWithPhotoPreviewController.R;
                        PayWithPhotoPreviewController payWithPhotoPreviewController2 = this.f206654b;
                        return dli.f.a(payWithPhotoPreviewController2, (f) payWithPhotoPreviewController2.O.getValue(), v.k(new PdfDelegate(), new SimpleMediaDelegate()), R$id.screenRecyclerBasicNavbarActionFooter_recyclerView, new y(payWithPhotoPreviewController2, 1), null, null, 48);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174527b.setModel(uiState.f206651b);
        this.P = uiState.f206652c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (fl9.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174528c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174527b.f), new ml9.e(this, continuation, 0), 3);
        int i = 1;
        ViewController.P2(this, rd0.e.b(d3().f174527b.f58955g), new ml9.e(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f174527b.e), new mkk.q(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f174528c.f59211b), new ml9.e(this, continuation, 2), 3);
    }

    public final i d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (i) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
