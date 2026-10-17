package com.revolut.feature.apm.payid.impl.screen.settings.actions;

import android.view.View;
import cb2.c;
import cb2.d;
import cb2.e;
import cb2.f;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.payid.impl.screen.settings.actions.AliasActionsScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import ea2.n;
import ea2.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/screen/settings/actions/AliasActionsScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lcb2/e;", "Lcb2/c;", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AliasActionsScreen extends BaseBottomSheetRecyclerController<e, c> {
    public static final /* synthetic */ int V = 0;
    public final d Q;
    public final RowDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public AliasActionsScreen(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: cb2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AliasActionsScreen f22702b;

            {
                this.f22702b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AliasActionsScreen aliasActionsScreen = this.f22702b;
                switch (i2) {
                    case 0:
                        int i3 = AliasActionsScreen.V;
                        o oVar = (o) aliasActionsScreen.T.getValue();
                        switch (oVar.f124102a) {
                            case 0:
                                return (f) oVar.e.get();
                            default:
                                return (f) oVar.e.get();
                        }
                    default:
                        int i5 = AliasActionsScreen.V;
                        qji.b bVarU2 = aliasActionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.settings.actions.di.AliasActionsScreenInjector");
                        n nVar = (n) ((db2.a) bVarU2).c().mo3808a(aliasActionsScreen);
                        d dVar = aliasActionsScreen.Q;
                        switch (nVar.f124099a) {
                            case 0:
                                dVar.getClass();
                                nVar.d = dVar;
                                break;
                            default:
                                dVar.getClass();
                                nVar.d = dVar;
                                break;
                        }
                        return (o) nVar.mo3783build();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: cb2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AliasActionsScreen f22702b;

            {
                this.f22702b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AliasActionsScreen aliasActionsScreen = this.f22702b;
                switch (i22) {
                    case 0:
                        int i3 = AliasActionsScreen.V;
                        o oVar = (o) aliasActionsScreen.T.getValue();
                        switch (oVar.f124102a) {
                            case 0:
                                return (f) oVar.e.get();
                            default:
                                return (f) oVar.e.get();
                        }
                    default:
                        int i5 = AliasActionsScreen.V;
                        qji.b bVarU2 = aliasActionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.settings.actions.di.AliasActionsScreenInjector");
                        n nVar = (n) ((db2.a) bVarU2).c().mo3808a(aliasActionsScreen);
                        d dVar = aliasActionsScreen.Q;
                        switch (nVar.f124099a) {
                            case 0:
                                dVar.getClass();
                                nVar.d = dVar;
                                break;
                            default:
                                dVar.getClass();
                                nVar.d = dVar;
                                break;
                        }
                        return (o) nVar.mo3783build();
                }
            }
        });
        this.U = u.c(rowDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (o) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, i3(), new c1i.f(this, (Continuation) null, 28), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new cb2.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
