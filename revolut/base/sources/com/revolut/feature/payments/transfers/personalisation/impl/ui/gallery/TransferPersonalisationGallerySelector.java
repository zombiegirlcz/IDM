package com.revolut.feature.payments.transfers.personalisation.impl.ui.gallery;

import android.app.Activity;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aq0.d;
import aq0.e;
import aq0.f;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.delegates.gallery_picker.PersonalisationGalleryTileDelegate;
import com.revolut.core.ui_kit.gallery_picker.GalleryPickerView;
import com.revolut.core.ui_kit.internal.gallery_picker.GalleryGridLayoutManager;
import com.revolut.feature.payments.transfers.personalisation.api.TransfersPersonalisationToggles$GalleryZoom;
import com.revolut.feature.payments.transfers.personalisation.impl.R$layout;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.gallery.TransferPersonalisationGallerySelector;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.gallery.TransferPersonalisationGallerySelectorContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import g2a.f;
import gte.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import u2a.c;
import u2a.g;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/transfers/personalisation/impl/ui/gallery/TransferPersonalisationGallerySelector;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg2a/f;", "Lcli/w;", "Lu2a/e;", "feature_payments_transfers_personalisation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferPersonalisationGallerySelector extends ViewController<f> implements w {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TransferPersonalisationGallerySelector.class, "binding", "getBinding()Lcom/revolut/feature/payments/transfers/personalisation/impl/databinding/TransferPersonalisationGalleryScreenBinding;", 0))};
    public final TransferPersonalisationGallerySelectorContract$InputData K;
    public final h L;
    public final int M;
    public int N;
    public e O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public TransferPersonalisationGallerySelector(TransferPersonalisationGallerySelectorContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, c.f);
        this.M = R$layout.transfer_personalisation_gallery_screen;
        this.N = -1;
        final int i = 0;
        this.P = te0.w.y0(new Function0(this) { // from class: u2a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferPersonalisationGallerySelector f276587b;

            {
                this.f276587b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransferPersonalisationGallerySelector transferPersonalisationGallerySelector = this.f276587b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransferPersonalisationGallerySelector.S;
                        return n14.e.a(transferPersonalisationGallerySelector, (g) transferPersonalisationGallerySelector.R.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = TransferPersonalisationGallerySelector.S;
                        phm.a aVar = (phm.a) ue0.e.j(transferPersonalisationGallerySelector.m2()).a().get(o2a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o2a.b.class, " is not found"));
                        }
                        o2a.b bVar = ((o2a.b) aVar2.b()).e;
                        TransferPersonalisationGallerySelectorContract$InputData transferPersonalisationGallerySelectorContract$InputData = transferPersonalisationGallerySelector.K;
                        transferPersonalisationGallerySelectorContract$InputData.getClass();
                        Activity activityM2 = transferPersonalisationGallerySelector.m2();
                        activityM2.getClass();
                        return new o2a.d(bVar, activityM2, transferPersonalisationGallerySelectorContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TransferPersonalisationGallerySelector.S;
                        return (g) ((o2a.d) transferPersonalisationGallerySelector.Q.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = te0.w.y0(new Function0(this) { // from class: u2a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferPersonalisationGallerySelector f276587b;

            {
                this.f276587b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransferPersonalisationGallerySelector transferPersonalisationGallerySelector = this.f276587b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferPersonalisationGallerySelector.S;
                        return n14.e.a(transferPersonalisationGallerySelector, (g) transferPersonalisationGallerySelector.R.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = TransferPersonalisationGallerySelector.S;
                        phm.a aVar = (phm.a) ue0.e.j(transferPersonalisationGallerySelector.m2()).a().get(o2a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o2a.b.class, " is not found"));
                        }
                        o2a.b bVar = ((o2a.b) aVar2.b()).e;
                        TransferPersonalisationGallerySelectorContract$InputData transferPersonalisationGallerySelectorContract$InputData = transferPersonalisationGallerySelector.K;
                        transferPersonalisationGallerySelectorContract$InputData.getClass();
                        Activity activityM2 = transferPersonalisationGallerySelector.m2();
                        activityM2.getClass();
                        return new o2a.d(bVar, activityM2, transferPersonalisationGallerySelectorContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TransferPersonalisationGallerySelector.S;
                        return (g) ((o2a.d) transferPersonalisationGallerySelector.Q.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.R = te0.w.y0(new Function0(this) { // from class: u2a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferPersonalisationGallerySelector f276587b;

            {
                this.f276587b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransferPersonalisationGallerySelector transferPersonalisationGallerySelector = this.f276587b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferPersonalisationGallerySelector.S;
                        return n14.e.a(transferPersonalisationGallerySelector, (g) transferPersonalisationGallerySelector.R.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = TransferPersonalisationGallerySelector.S;
                        phm.a aVar = (phm.a) ue0.e.j(transferPersonalisationGallerySelector.m2()).a().get(o2a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o2a.b.class, " is not found"));
                        }
                        o2a.b bVar = ((o2a.b) aVar2.b()).e;
                        TransferPersonalisationGallerySelectorContract$InputData transferPersonalisationGallerySelectorContract$InputData = transferPersonalisationGallerySelector.K;
                        transferPersonalisationGallerySelectorContract$InputData.getClass();
                        Activity activityM2 = transferPersonalisationGallerySelector.m2();
                        activityM2.getClass();
                        return new o2a.d(bVar, activityM2, transferPersonalisationGallerySelectorContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TransferPersonalisationGallerySelector.S;
                        return (g) ((o2a.d) transferPersonalisationGallerySelector.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        u2a.e uiState = (u2a.e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().setItems(uiState.f276589a);
        Integer num = uiState.f276590b;
        if (num == null || this.N == num.intValue()) {
            return;
        }
        this.N = num.intValue();
        GalleryPickerView galleryPickerViewD3 = d3();
        int iIntValue = num.intValue();
        if (iIntValue >= 0) {
            d dVar = galleryPickerViewD3.i;
            if (dVar == null) {
                Intrinsics.r("galleryAdapter");
                throw null;
            }
            if (iIntValue < dVar.getItemCount()) {
                GalleryGridLayoutManager galleryGridLayoutManager = galleryPickerViewD3.f55807c;
                if (galleryGridLayoutManager == null) {
                    Intrinsics.r("galleryLayoutManager");
                    throw null;
                }
                galleryGridLayoutManager.o = num;
                galleryGridLayoutManager.requestLayout();
                return;
            }
        }
        d dVar2 = galleryPickerViewD3.i;
        if (dVar2 != null) {
            throw new IllegalArgumentException(a0.d.g(iIntValue, dVar2.getItemCount(), "Position ", " is out of bounds for item count ").toString());
        }
        Intrinsics.r("galleryAdapter");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (o2a.d) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        f.a aVar = f.a.f8217a;
        GalleryPickerView view2 = d3();
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.setup$ui_kit_components_release(aVar);
        this.O = new e();
        GalleryPickerView galleryPickerViewD3 = d3();
        a aVarB = ((o2a.d) this.Q.getValue()).f221605c.d.b();
        s.j(aVarB);
        galleryPickerViewD3.setZoomEnabled(((jte.d) aVarB).c(TransfersPersonalisationToggles$GalleryZoom.f79956c));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.O == null) {
            Intrinsics.r("galleryEvents");
            throw null;
        }
        PersonalisationGalleryTileDelegate personalisationGalleryTileDelegate = f.a.f8218b;
        ViewController.P2(this, rd0.e.b(personalisationGalleryTileDelegate.e), new tz6.e(this, (Continuation) null, 12), 3);
        if (this.O != null) {
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(personalisationGalleryTileDelegate.f.f121375b), null, new u07.b(this, null, 5), 3);
        } else {
            Intrinsics.r("galleryEvents");
            throw null;
        }
    }

    public final GalleryPickerView d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        GalleryPickerView galleryPickerView = ((l2a.a) value).f191721b;
        Intrinsics.checkNotNullExpressionValue(galleryPickerView, "galleryPickerView");
        return galleryPickerView;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}
