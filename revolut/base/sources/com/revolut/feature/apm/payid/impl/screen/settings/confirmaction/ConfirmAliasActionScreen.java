package com.revolut.feature.apm.payid.impl.screen.settings.confirmaction;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.payid.impl.screen.settings.confirmaction.ConfirmAliasActionScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import eb2.c;
import eb2.d;
import eb2.e;
import eb2.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/screen/settings/confirmaction/ConfirmAliasActionScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Leb2/e;", "Lcli/k;", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConfirmAliasActionScreen extends BaseBottomSheetRecyclerController<e, k> {
    public static final /* synthetic */ int U = 0;
    public final d Q;
    public final Object R;
    public final Object S;
    public final List T;

    public ConfirmAliasActionScreen(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: eb2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmAliasActionScreen f124281b;

            {
                this.f124281b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConfirmAliasActionScreen confirmAliasActionScreen = this.f124281b;
                switch (i2) {
                    case 0:
                        int i3 = ConfirmAliasActionScreen.U;
                        return (f) ((ea2.d) confirmAliasActionScreen.S.getValue()).f124062c.get();
                    default:
                        int i5 = ConfirmAliasActionScreen.U;
                        qji.b bVarU2 = confirmAliasActionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.settings.confirmaction.di.ConfirmAliasActionScreenInjector");
                        ea2.k kVar = (ea2.k) bVarU2;
                        ea2.h hVar = kVar.f124090a;
                        ea2.k kVar2 = kVar.f124091b;
                        d dVar = confirmAliasActionScreen.Q;
                        dVar.getClass();
                        return new ea2.d(hVar, kVar2, dVar);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: eb2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmAliasActionScreen f124281b;

            {
                this.f124281b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConfirmAliasActionScreen confirmAliasActionScreen = this.f124281b;
                switch (i22) {
                    case 0:
                        int i3 = ConfirmAliasActionScreen.U;
                        return (f) ((ea2.d) confirmAliasActionScreen.S.getValue()).f124062c.get();
                    default:
                        int i5 = ConfirmAliasActionScreen.U;
                        qji.b bVarU2 = confirmAliasActionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.settings.confirmaction.di.ConfirmAliasActionScreenInjector");
                        ea2.k kVar = (ea2.k) bVarU2;
                        ea2.h hVar = kVar.f124090a;
                        ea2.k kVar2 = kVar.f124091b;
                        d dVar = confirmAliasActionScreen.Q;
                        dVar.getClass();
                        return new ea2.d(hVar, kVar2, dVar);
                }
            }
        });
        this.T = u.c(rowDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ea2.d) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new c(this, null, 0), 3);
        ViewController.P2(this, f3(), new c(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.T;
    }
}
