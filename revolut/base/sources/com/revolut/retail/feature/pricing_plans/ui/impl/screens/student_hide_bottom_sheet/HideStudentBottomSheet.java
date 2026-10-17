package com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_hide_bottom_sheet;

import android.view.View;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_hide_bottom_sheet.HideStudentBottomSheet;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p12.o;
import pki.b;
import qgk.q;
import te0.w;
import ujb.v;
import unk.c;
import unk.d;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/student_hide_bottom_sheet/HideStudentBottomSheet;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lunk/d;", "Lunk/c;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HideStudentBottomSheet extends BaseBottomSheetRecyclerController<d, c> {
    public static final /* synthetic */ int V = 0;
    public final Object Q;
    public final Object R;
    public final List S;
    public final Object T;
    public final Object U;

    public HideStudentBottomSheet() {
        Lazy lazyY0 = w.y0(new v(19));
        this.Q = lazyY0;
        Lazy lazyY02 = w.y0(new v(20));
        this.R = lazyY02;
        final int i = 0;
        final int i2 = 1;
        this.S = zhm.v.k((RowDelegate) lazyY0.getValue(), (LargeActionButtonDelegate) lazyY02.getValue());
        this.T = w.y0(new Function0(this) { // from class: unk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HideStudentBottomSheet f281454b;

            {
                this.f281454b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                HideStudentBottomSheet hideStudentBottomSheet = this.f281454b;
                switch (i3) {
                    case 0:
                        int i5 = HideStudentBottomSheet.V;
                        qji.b bVarU2 = hideStudentBottomSheet.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_hide_bottom_sheet.di.HideStudentBottomSheetInjector");
                        q qVar = new q();
                        qVar.f246196a = e4m.b.b(new o(20));
                        return qVar;
                    default:
                        int i6 = HideStudentBottomSheet.V;
                        return (e) ((q) hideStudentBottomSheet.T.getValue()).f246196a.get();
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: unk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HideStudentBottomSheet f281454b;

            {
                this.f281454b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                HideStudentBottomSheet hideStudentBottomSheet = this.f281454b;
                switch (i3) {
                    case 0:
                        int i5 = HideStudentBottomSheet.V;
                        qji.b bVarU2 = hideStudentBottomSheet.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_hide_bottom_sheet.di.HideStudentBottomSheetInjector");
                        q qVar = new q();
                        qVar.f246196a = e4m.b.b(new o(20));
                        return qVar;
                    default:
                        int i6 = HideStudentBottomSheet.V;
                        return (e) ((q) hideStudentBottomSheet.T.getValue()).f246196a.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b k3() {
        return (unk.e) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((LargeActionButtonDelegate) this.R.getValue()).d.f121375b), new unk.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (unk.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
