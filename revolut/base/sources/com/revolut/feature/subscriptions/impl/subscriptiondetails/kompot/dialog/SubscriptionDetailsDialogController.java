package com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog;

import android.view.View;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.SubscriptionDetailsDialogController;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.SubscriptionDetailsDialogControllerContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import fce.d;
import fce.f;
import fce.y;
import i9e.r;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/a;", "Lfce/y;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubscriptionDetailsDialogController extends BaseBottomSheetRecyclerController<a, y> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f89272a0 = 0;
    public final SubscriptionDetailsDialogControllerContract$InputData Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final List Z;

    public SubscriptionDetailsDialogController(SubscriptionDetailsDialogControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: fce.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionDetailsDialogController f133700b;

            {
                this.f133700b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SubscriptionDetailsDialogController subscriptionDetailsDialogController = this.f133700b;
                switch (i2) {
                    case 0:
                        int i3 = SubscriptionDetailsDialogController.f89272a0;
                        qji.b bVarU2 = subscriptionDetailsDialogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.di.SubscriptionDetailsDialogControllerInjector");
                        i9e.w wVar = (i9e.w) ((dae.a) bVarU2);
                        i9e.o oVar = wVar.f159753b;
                        i9e.w wVar2 = wVar.f159754c;
                        SubscriptionDetailsDialogControllerContract$InputData subscriptionDetailsDialogControllerContract$InputData = subscriptionDetailsDialogController.Q;
                        subscriptionDetailsDialogControllerContract$InputData.getClass();
                        return new i9e.r(oVar, wVar2, subscriptionDetailsDialogControllerContract$InputData);
                    default:
                        int i5 = SubscriptionDetailsDialogController.f89272a0;
                        return (f) ((i9e.r) subscriptionDetailsDialogController.R.getValue()).f159741c.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: fce.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionDetailsDialogController f133700b;

            {
                this.f133700b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SubscriptionDetailsDialogController subscriptionDetailsDialogController = this.f133700b;
                switch (i22) {
                    case 0:
                        int i3 = SubscriptionDetailsDialogController.f89272a0;
                        qji.b bVarU2 = subscriptionDetailsDialogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.di.SubscriptionDetailsDialogControllerInjector");
                        i9e.w wVar = (i9e.w) ((dae.a) bVarU2);
                        i9e.o oVar = wVar.f159753b;
                        i9e.w wVar2 = wVar.f159754c;
                        SubscriptionDetailsDialogControllerContract$InputData subscriptionDetailsDialogControllerContract$InputData = subscriptionDetailsDialogController.Q;
                        subscriptionDetailsDialogControllerContract$InputData.getClass();
                        return new i9e.r(oVar, wVar2, subscriptionDetailsDialogControllerContract$InputData);
                    default:
                        int i5 = SubscriptionDetailsDialogController.f89272a0;
                        return (f) ((i9e.r) subscriptionDetailsDialogController.R.getValue()).f159741c.get();
                }
            }
        });
        Lazy lazyY0 = w.y0(new f2i.b(27));
        this.T = lazyY0;
        Lazy lazyY02 = w.y0(new f2i.b(28));
        this.U = lazyY02;
        Lazy lazyY03 = w.y0(new f2i.b(29));
        this.V = lazyY03;
        Lazy lazyY04 = w.y0(new fce.b(0));
        this.W = lazyY04;
        Lazy lazyY05 = w.y0(new fce.b(1));
        this.X = lazyY05;
        Lazy lazyY06 = w.y0(new fce.b(2));
        this.Y = lazyY06;
        this.Z = v.k((LargeActionButtonDelegate) lazyY03.getValue(), (SingleChoiceDelegate) lazyY04.getValue(), (TwinHorizontalButtonDelegate) lazyY05.getValue(), (InputChecklistDelegate) lazyY06.getValue(), (RowDelegate) lazyY0.getValue(), (AccountCellItemDelegate) lazyY02.getValue(), new RowLoadingDelegate(), new PlainTextDelegate(), new CellDetailsNoteDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new fce.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, f3(), null, new fce.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SingleChoiceDelegate) this.W.getValue()).p()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputChecklistDelegate) this.Y.getValue()).f52518c), null, new fce.e(this, null), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getZ() {
        return this.Z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.S.getValue();
    }
}
