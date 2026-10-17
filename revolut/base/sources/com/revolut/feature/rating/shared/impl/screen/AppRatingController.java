package com.revolut.feature.rating.shared.impl.screen;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.feature.rating.shared.impl.screen.AppRatingController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.p3;
import eua.a;
import ft3.h0;
import fua.d;
import fua.g;
import fua.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rating/shared/impl/screen/AppRatingController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lfua/d;", "Lcli/k;", "<init>", "()V", "feature_rating_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppRatingController extends BaseBottomSheetRecyclerController<d, k> {
    public static final /* synthetic */ int U = 0;
    public final Object Q;
    public final Object R = w.y0(new h0(17));
    public final Object S;
    public final Object T;

    public AppRatingController() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: fua.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppRatingController f138162b;

            {
                this.f138162b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AppRatingController appRatingController = this.f138162b;
                switch (i2) {
                    case 0:
                        int i3 = AppRatingController.U;
                        phm.a aVar = (phm.a) ue0.e.j(appRatingController.m2()).a().get(eua.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", eua.b.class, " is not found"));
                        }
                        eua.b bVar = ((eua.b) aVar2.b()).f129538a;
                        eua.a aVar3 = new eua.a();
                        aVar3.f129537a = e4m.b.b(new p3(13));
                        return aVar3;
                    case 1:
                        int i5 = AppRatingController.U;
                        return (e) ((eua.a) appRatingController.Q.getValue()).f129537a.get();
                    default:
                        int i6 = AppRatingController.U;
                        return u.c((IconSelectorDelegate) appRatingController.R.getValue());
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: fua.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppRatingController f138162b;

            {
                this.f138162b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AppRatingController appRatingController = this.f138162b;
                switch (i22) {
                    case 0:
                        int i3 = AppRatingController.U;
                        phm.a aVar = (phm.a) ue0.e.j(appRatingController.m2()).a().get(eua.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", eua.b.class, " is not found"));
                        }
                        eua.b bVar = ((eua.b) aVar2.b()).f129538a;
                        eua.a aVar3 = new eua.a();
                        aVar3.f129537a = e4m.b.b(new p3(13));
                        return aVar3;
                    case 1:
                        int i5 = AppRatingController.U;
                        return (e) ((eua.a) appRatingController.Q.getValue()).f129537a.get();
                    default:
                        int i6 = AppRatingController.U;
                        return u.c((IconSelectorDelegate) appRatingController.R.getValue());
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: fua.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppRatingController f138162b;

            {
                this.f138162b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AppRatingController appRatingController = this.f138162b;
                switch (i22) {
                    case 0:
                        int i32 = AppRatingController.U;
                        phm.a aVar = (phm.a) ue0.e.j(appRatingController.m2()).a().get(eua.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", eua.b.class, " is not found"));
                        }
                        eua.b bVar = ((eua.b) aVar2.b()).f129538a;
                        eua.a aVar3 = new eua.a();
                        aVar3.f129537a = e4m.b.b(new p3(13));
                        return aVar3;
                    case 1:
                        int i5 = AppRatingController.U;
                        return (e) ((eua.a) appRatingController.Q.getValue()).f129537a.get();
                    default:
                        int i6 = AppRatingController.U;
                        return u.c((IconSelectorDelegate) appRatingController.R.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (fua.e) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((IconSelectorDelegate) this.R.getValue()).f52489c.d), new g(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void g1(boolean z) {
        super.g1(z);
        if (z) {
            return;
        }
        i iVar = (i) ((fua.e) this.S.getValue());
        if (iVar.f138163p) {
            return;
        }
        iVar.f138163p = true;
        iVar.C2(fua.a.f138158a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (fua.e) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getV() {
        return (List) this.T.getValue();
    }
}
