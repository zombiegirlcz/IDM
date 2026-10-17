package com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.dialog;

import android.view.View;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.dialog.CardDeliveryCancelOrderDialogController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import dw3.f6;
import ede.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import see.a;
import see.d;
import see.f;
import see.g;
import te0.w;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/support/impl/ui/troubleshooting/carddelivery/kompot/dialog/CardDeliveryCancelOrderDialogController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lsee/d;", "Lsee/a;", "<init>", "()V", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardDeliveryCancelOrderDialogController extends BaseBottomSheetRecyclerController<d, a> {
    public static final /* synthetic */ int T = 0;
    public final Object Q;
    public final Object R;
    public final f0 S = f0.f322471a;

    public CardDeliveryCancelOrderDialogController() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: see.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDeliveryCancelOrderDialogController f262184b;

            {
                this.f262184b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardDeliveryCancelOrderDialogController cardDeliveryCancelOrderDialogController = this.f262184b;
                switch (i2) {
                    case 0:
                        int i3 = CardDeliveryCancelOrderDialogController.T;
                        phm.a aVar = (phm.a) ue0.e.j(cardDeliveryCancelOrderDialogController.m2()).a().get(ede.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ede.e.class, " is not found"));
                        }
                        ede.e eVar = ((ede.e) aVar2.b()).f125010h;
                        ede.c cVar = new ede.c();
                        cVar.f125000a = e4m.b.b(new f6(cVar, 1, 19));
                        cVar.f125001b = e4m.b.b(new f6(cVar, 0, 19));
                        return cVar;
                    default:
                        int i5 = CardDeliveryCancelOrderDialogController.T;
                        return (g) ((ede.c) cardDeliveryCancelOrderDialogController.Q.getValue()).f125001b.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: see.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDeliveryCancelOrderDialogController f262184b;

            {
                this.f262184b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardDeliveryCancelOrderDialogController cardDeliveryCancelOrderDialogController = this.f262184b;
                switch (i22) {
                    case 0:
                        int i3 = CardDeliveryCancelOrderDialogController.T;
                        phm.a aVar = (phm.a) ue0.e.j(cardDeliveryCancelOrderDialogController.m2()).a().get(ede.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ede.e.class, " is not found"));
                        }
                        ede.e eVar = ((ede.e) aVar2.b()).f125010h;
                        ede.c cVar = new ede.c();
                        cVar.f125000a = e4m.b.b(new f6(cVar, 1, 19));
                        cVar.f125001b = e4m.b.b(new f6(cVar, 0, 19));
                        return cVar;
                    default:
                        int i5 = CardDeliveryCancelOrderDialogController.T;
                        return (g) ((ede.c) cardDeliveryCancelOrderDialogController.Q.getValue()).f125001b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, f3(), null, new f(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getU() {
        return this.S;
    }
}
