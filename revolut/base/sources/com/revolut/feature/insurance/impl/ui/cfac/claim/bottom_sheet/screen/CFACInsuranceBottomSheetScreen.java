package com.revolut.feature.insurance.impl.ui.cfac.claim.bottom_sheet.screen;

import android.view.View;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.insurance.impl.ui.cfac.claim.bottom_sheet.screen.CFACInsuranceBottomSheetScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.bottom_sheet.screen.CFACInsuranceBottomSheetScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nk7.i;
import nk7.q;
import pfk.o0;
import pgk.d;
import pj7.b;
import pj7.c;
import pj7.e;
import pj7.l;
import pj7.m;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/bottom_sheet/screen/CFACInsuranceBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lpj7/l;", "Lpj7/e;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACInsuranceBottomSheetScreen extends BaseBottomSheetRecyclerController<l, e> {
    public static final /* synthetic */ int X = 0;
    public final CFACInsuranceBottomSheetScreenContract$InputData Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final List U;
    public final Object V;
    public final Object W;

    public CFACInsuranceBottomSheetScreen(CFACInsuranceBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        Lazy lazyY0 = w.y0(new d(19));
        this.R = lazyY0;
        Lazy lazyY02 = w.y0(new d(20));
        this.S = lazyY02;
        Lazy lazyY03 = w.y0(new d(21));
        this.T = lazyY03;
        final int i = 0;
        final int i2 = 1;
        this.U = v.k((RowDelegate) lazyY0.getValue(), (DatePickerDelegate) lazyY02.getValue(), (ListSubheaderDelegate) lazyY03.getValue());
        this.V = w.y0(new Function0(this) { // from class: pj7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceBottomSheetScreen f236677b;

            {
                this.f236677b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                CFACInsuranceBottomSheetScreen cFACInsuranceBottomSheetScreen = this.f236677b;
                switch (i3) {
                    case 0:
                        int i5 = CFACInsuranceBottomSheetScreen.X;
                        qji.b bVarU2 = cFACInsuranceBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.claim.bottom_sheet.screen.di.CFACInsuranceBottomSheetScreenInjector");
                        nk7.j jVar = (nk7.j) bVarU2;
                        q qVar = jVar.f216688b;
                        nk7.j jVar2 = jVar.f216689c;
                        CFACInsuranceBottomSheetScreenContract$InputData cFACInsuranceBottomSheetScreenContract$InputData = cFACInsuranceBottomSheetScreen.Q;
                        cFACInsuranceBottomSheetScreenContract$InputData.getClass();
                        return new nk7.i(qVar, jVar2, cFACInsuranceBottomSheetScreenContract$InputData);
                    default:
                        int i6 = CFACInsuranceBottomSheetScreen.X;
                        return (m) ((nk7.i) cFACInsuranceBottomSheetScreen.V.getValue()).f216686b.get();
                }
            }
        });
        this.W = w.y0(new Function0(this) { // from class: pj7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceBottomSheetScreen f236677b;

            {
                this.f236677b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                CFACInsuranceBottomSheetScreen cFACInsuranceBottomSheetScreen = this.f236677b;
                switch (i3) {
                    case 0:
                        int i5 = CFACInsuranceBottomSheetScreen.X;
                        qji.b bVarU2 = cFACInsuranceBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.claim.bottom_sheet.screen.di.CFACInsuranceBottomSheetScreenInjector");
                        nk7.j jVar = (nk7.j) bVarU2;
                        q qVar = jVar.f216688b;
                        nk7.j jVar2 = jVar.f216689c;
                        CFACInsuranceBottomSheetScreenContract$InputData cFACInsuranceBottomSheetScreenContract$InputData = cFACInsuranceBottomSheetScreen.Q;
                        cFACInsuranceBottomSheetScreenContract$InputData.getClass();
                        return new nk7.i(qVar, jVar2, cFACInsuranceBottomSheetScreenContract$InputData);
                    default:
                        int i6 = CFACInsuranceBottomSheetScreen.X;
                        return (m) ((nk7.i) cFACInsuranceBottomSheetScreen.V.getValue()).f216686b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((ListSubheaderDelegate) this.T.getValue()).f52707c), new b(this, null), 3);
        ViewController.P2(this, rd0.e.b(((DatePickerDelegate) this.S.getValue()).f52176c.f121375b), new o0(this, (Continuation) null, 10), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.R.getValue()).f53218h), new c(this, null), 3);
        ViewController.P2(this, e3(), new pj7.d(this, null, 0), 3);
        ViewController.P2(this, f3(), new pj7.d(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final m R2() {
        return (m) this.W.getValue();
    }
}
