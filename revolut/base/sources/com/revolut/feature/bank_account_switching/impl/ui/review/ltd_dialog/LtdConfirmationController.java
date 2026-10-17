package com.revolut.feature.bank_account_switching.impl.ui.review.ltd_dialog;

import android.view.View;
import cli.k;
import cli.w;
import co7.c;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.feature.bank_account_switching.impl.ui.review.ltd_dialog.LtdConfirmationController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import cp2.d;
import cp2.e;
import cp2.g;
import cp2.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/review/ltd_dialog/LtdConfirmationController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lcp2/h;", "Lcli/k;", "Lcli/w;", "Lcii/b;", "<init>", "()V", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LtdConfirmationController extends BaseBottomSheetRecyclerController<h, k> implements w {
    public static final /* synthetic */ int V = 0;
    public final LargeActionButtonDelegate Q;
    public final PlainTextDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public LtdConfirmationController() {
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.Q = largeActionButtonDelegate;
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        this.R = plainTextDelegate;
        final int i = 0;
        final int i2 = 1;
        this.S = v.k(new SimpleMediaDelegate(), plainTextDelegate, largeActionButtonDelegate);
        this.T = te0.w.y0(new Function0(this) { // from class: cp2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LtdConfirmationController f107772b;

            {
                this.f107772b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                LtdConfirmationController ltdConfirmationController = this.f107772b;
                switch (i3) {
                    case 0:
                        int i5 = LtdConfirmationController.V;
                        phm.a aVar = (phm.a) ue0.e.j(ltdConfirmationController.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        vn2.v vVar = new vn2.v();
                        vVar.f290724a = e4m.b.b(new vk6.a(3));
                        return vVar;
                    default:
                        int i6 = LtdConfirmationController.V;
                        return (e) ((vn2.v) ltdConfirmationController.T.getValue()).f290724a.get();
                }
            }
        });
        this.U = te0.w.y0(new Function0(this) { // from class: cp2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LtdConfirmationController f107772b;

            {
                this.f107772b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                LtdConfirmationController ltdConfirmationController = this.f107772b;
                switch (i3) {
                    case 0:
                        int i5 = LtdConfirmationController.V;
                        phm.a aVar = (phm.a) ue0.e.j(ltdConfirmationController.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        vn2.v vVar = new vn2.v();
                        vVar.f290724a = e4m.b.b(new vk6.a(3));
                        return vVar;
                    default:
                        int i6 = LtdConfirmationController.V;
                        return (e) ((vn2.v) ltdConfirmationController.T.getValue()).f290724a.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((d) ((e) this.U.getValue())).C2(g.f107774a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (vn2.v) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b k3() {
        return (e) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.d.f121375b), new c(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d.f121375b), new cp2.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (e) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
