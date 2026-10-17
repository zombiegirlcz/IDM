package com.revolut.feature.card_management.impl.ui.kompot.replace.dialog;

import android.view.View;
import com.revolut.feature.card_management.impl.ui.kompot.replace.dialog.CardReplaceTerminateDialogController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import j03.a;
import j03.b;
import j03.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tz2.i;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/kompot/replace/dialog/CardReplaceTerminateDialogController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lj03/c;", "Lj03/b;", "<init>", "()V", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReplaceTerminateDialogController extends BaseBottomSheetRecyclerController<c, b> {
    public static final /* synthetic */ int T = 0;
    public final Object Q;
    public final Object R;
    public final f0 S = f0.f322471a;

    public CardReplaceTerminateDialogController() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: j03.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReplaceTerminateDialogController f169936b;

            {
                this.f169936b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardReplaceTerminateDialogController cardReplaceTerminateDialogController = this.f169936b;
                switch (i2) {
                    case 0:
                        int i3 = CardReplaceTerminateDialogController.T;
                        qji.b bVarU2 = cardReplaceTerminateDialogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.replace.dialog.di.CardReplaceTerminateDialogControllerInjector");
                        i iVar = new i();
                        iVar.f275781a = e4m.b.b(new tn3.a(iVar, 1, 5));
                        iVar.f275782b = e4m.b.b(new tn3.a(iVar, 0, 5));
                        return iVar;
                    default:
                        int i5 = CardReplaceTerminateDialogController.T;
                        return (a) ((i) cardReplaceTerminateDialogController.Q.getValue()).f275782b.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: j03.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReplaceTerminateDialogController f169936b;

            {
                this.f169936b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardReplaceTerminateDialogController cardReplaceTerminateDialogController = this.f169936b;
                switch (i22) {
                    case 0:
                        int i3 = CardReplaceTerminateDialogController.T;
                        qji.b bVarU2 = cardReplaceTerminateDialogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.replace.dialog.di.CardReplaceTerminateDialogControllerInjector");
                        i iVar = new i();
                        iVar.f275781a = e4m.b.b(new tn3.a(iVar, 1, 5));
                        iVar.f275782b = e4m.b.b(new tn3.a(iVar, 0, 5));
                        return iVar;
                    default:
                        int i5 = CardReplaceTerminateDialogController.T;
                        return (a) ((i) cardReplaceTerminateDialogController.Q.getValue()).f275782b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (a) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new j03.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, f3(), null, new j03.e(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (a) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getU() {
        return this.S;
    }
}
