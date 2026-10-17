package com.revolut.feature.transfer_reasons.impl.ui.actions;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer_reasons.api.R$string;
import com.revolut.feature.transfer_reasons.impl.ui.actions.TransferReasonsDeclarationActionsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nsf.c;
import te0.w;
import vc.s;
import vqd.b;
import vsf.e;
import vsf.f;
import vsf.g;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/ui/actions/TransferReasonsDeclarationActionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvsf/e;", "Ldli/a;", "Lvsf/g;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferReasonsDeclarationActionsScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TransferReasonsDeclarationActionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final h O;
    public final Object P;

    public TransferReasonsDeclarationActionsScreen(TransferReasonsDeclarationActionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_bottom_sheet_list;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: vsf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsDeclarationActionsScreen f291776b;

            {
                this.f291776b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsDeclarationActionsScreen.Q;
                        TransferReasonsDeclarationActionsScreen transferReasonsDeclarationActionsScreen = this.f291776b;
                        return dli.f.a(transferReasonsDeclarationActionsScreen, (f) transferReasonsDeclarationActionsScreen.N.getValue(), u.c((RowDelegate) transferReasonsDeclarationActionsScreen.P.getValue()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TransferReasonsDeclarationActionsScreen.Q;
                        return (f) ((nsf.c) this.f291776b.M.getValue()).f218809b.get();
                }
            }
        });
        this.M = w.y0(new b(this, inputData, 7));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: vsf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsDeclarationActionsScreen f291776b;

            {
                this.f291776b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsDeclarationActionsScreen.Q;
                        TransferReasonsDeclarationActionsScreen transferReasonsDeclarationActionsScreen = this.f291776b;
                        return dli.f.a(transferReasonsDeclarationActionsScreen, (f) transferReasonsDeclarationActionsScreen.N.getValue(), u.c((RowDelegate) transferReasonsDeclarationActionsScreen.P.getValue()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TransferReasonsDeclarationActionsScreen.Q;
                        return (f) ((nsf.c) this.f291776b.M.getValue()).f218809b.get();
                }
            }
        });
        this.O = s.t(this, vsf.b.f);
        this.P = w.y0(new vo8.b(4));
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.f) value).f174519b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.transfer_reasons_declaration_actions_title, null, null, 14), null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), null, new vsf.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
