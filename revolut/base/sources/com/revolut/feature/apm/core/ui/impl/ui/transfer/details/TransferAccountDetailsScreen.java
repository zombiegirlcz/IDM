package com.revolut.feature.apm.core.ui.impl.ui.transfer.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.details.TransferAccountDetailsScreen;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.details.TransferAccountDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p12.l0;
import p12.u0;
import te0.w;
import vc.s;
import xki.e;
import z42.b;
import z42.d;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/details/TransferAccountDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lz42/d;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferAccountDetailsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TransferAccountDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final TransferAccountDetailsScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;

    public TransferAccountDetailsScreen(TransferAccountDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: z42.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferAccountDetailsScreen f319306b;

            {
                this.f319306b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransferAccountDetailsScreen transferAccountDetailsScreen = this.f319306b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransferAccountDetailsScreen.Q;
                        TransferAccountDetailsScreen transferAccountDetailsScreen2 = this.f319306b;
                        return dli.f.a(transferAccountDetailsScreen2, (e) transferAccountDetailsScreen2.O.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferAccountDetailsScreen.Q;
                        qji.b bVarU2 = transferAccountDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.transfer.details.di.TransferAccountDetailsScreenInjector");
                        l0 l0Var = (l0) bVarU2;
                        p12.v vVar = l0Var.f231717b;
                        l0 l0Var2 = l0Var.f231718c;
                        TransferAccountDetailsScreenContract$InputData transferAccountDetailsScreenContract$InputData = transferAccountDetailsScreen.K;
                        transferAccountDetailsScreenContract$InputData.getClass();
                        return new u0(vVar, l0Var2, transferAccountDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TransferAccountDetailsScreen.Q;
                        return (e) ((u0) transferAccountDetailsScreen.N.getValue()).f231776c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: z42.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferAccountDetailsScreen f319306b;

            {
                this.f319306b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransferAccountDetailsScreen transferAccountDetailsScreen = this.f319306b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferAccountDetailsScreen.Q;
                        TransferAccountDetailsScreen transferAccountDetailsScreen2 = this.f319306b;
                        return dli.f.a(transferAccountDetailsScreen2, (e) transferAccountDetailsScreen2.O.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferAccountDetailsScreen.Q;
                        qji.b bVarU2 = transferAccountDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.transfer.details.di.TransferAccountDetailsScreenInjector");
                        l0 l0Var = (l0) bVarU2;
                        p12.v vVar = l0Var.f231717b;
                        l0 l0Var2 = l0Var.f231718c;
                        TransferAccountDetailsScreenContract$InputData transferAccountDetailsScreenContract$InputData = transferAccountDetailsScreen.K;
                        transferAccountDetailsScreenContract$InputData.getClass();
                        return new u0(vVar, l0Var2, transferAccountDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TransferAccountDetailsScreen.Q;
                        return (e) ((u0) transferAccountDetailsScreen.N.getValue()).f231776c.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: z42.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferAccountDetailsScreen f319306b;

            {
                this.f319306b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransferAccountDetailsScreen transferAccountDetailsScreen = this.f319306b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferAccountDetailsScreen.Q;
                        TransferAccountDetailsScreen transferAccountDetailsScreen2 = this.f319306b;
                        return dli.f.a(transferAccountDetailsScreen2, (e) transferAccountDetailsScreen2.O.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferAccountDetailsScreen.Q;
                        qji.b bVarU2 = transferAccountDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.transfer.details.di.TransferAccountDetailsScreenInjector");
                        l0 l0Var = (l0) bVarU2;
                        p12.v vVar = l0Var.f231717b;
                        l0 l0Var2 = l0Var.f231718c;
                        TransferAccountDetailsScreenContract$InputData transferAccountDetailsScreenContract$InputData = transferAccountDetailsScreen.K;
                        transferAccountDetailsScreenContract$InputData.getClass();
                        return new u0(vVar, l0Var2, transferAccountDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TransferAccountDetailsScreen.Q;
                        return (e) ((u0) transferAccountDetailsScreen.N.getValue()).f231776c.get();
                }
            }
        });
        this.P = s.t(this, b.f);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (z42.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.bre_b_send_transfer_review_account_details_title, null, null, 14), null, null, null, false, 30));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
