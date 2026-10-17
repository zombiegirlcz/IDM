package com.revolut.feature.three_ds_verification.impl.ui.add_money;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import br4.e;
import bse.b;
import bse.c;
import bse.d;
import bse.f;
import bse.i;
import bse.j;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.three_ds_verification.impl.ui.add_money.AddMoneyMethodSelectionController;
import com.revolut.feature.three_ds_verification.impl.ui.add_money.AddMoneyMethodSelectionScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/three_ds_verification/impl/ui/add_money/AddMoneyMethodSelectionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbse/i;", "Ldli/a;", "Lbse/j;", "feature_three_ds_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddMoneyMethodSelectionController extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AddMoneyMethodSelectionController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final AddMoneyMethodSelectionScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public AddMoneyMethodSelectionController(AddMoneyMethodSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: bse.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddMoneyMethodSelectionController f18178b;

            {
                this.f18178b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddMoneyMethodSelectionController addMoneyMethodSelectionController = this.f18178b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddMoneyMethodSelectionController.S;
                        qji.b bVarU2 = addMoneyMethodSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.three_ds_verification.impl.ui.add_money.di.AddMoneyMethodSelectionControllerInjector");
                        yre.f fVar = (yre.f) bVarU2;
                        yre.e eVar = fVar.f316309b;
                        yre.f fVar2 = fVar.f316310c;
                        AddMoneyMethodSelectionScreenContract$InputData addMoneyMethodSelectionScreenContract$InputData = addMoneyMethodSelectionController.K;
                        addMoneyMethodSelectionScreenContract$InputData.getClass();
                        return new yre.b(eVar, fVar2, addMoneyMethodSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddMoneyMethodSelectionController.S;
                        return (f) ((yre.b) addMoneyMethodSelectionController.L.getValue()).f316287c.get();
                    default:
                        KProperty[] kPropertyArr3 = AddMoneyMethodSelectionController.S;
                        AddMoneyMethodSelectionController addMoneyMethodSelectionController2 = this.f18178b;
                        f fVar3 = (f) addMoneyMethodSelectionController2.M.getValue();
                        List listK = v.k(new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), (RowDelegate) addMoneyMethodSelectionController2.P.getValue(), new RowLoadingDelegate(), (LargeActionButtonDelegate) addMoneyMethodSelectionController2.Q.getValue());
                        ViewBinding value = addMoneyMethodSelectionController2.O.getValue(addMoneyMethodSelectionController2, AddMoneyMethodSelectionController.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(addMoneyMethodSelectionController2, fVar3, listK, ((jii.f) value).f174520c.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: bse.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddMoneyMethodSelectionController f18178b;

            {
                this.f18178b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddMoneyMethodSelectionController addMoneyMethodSelectionController = this.f18178b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddMoneyMethodSelectionController.S;
                        qji.b bVarU2 = addMoneyMethodSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.three_ds_verification.impl.ui.add_money.di.AddMoneyMethodSelectionControllerInjector");
                        yre.f fVar = (yre.f) bVarU2;
                        yre.e eVar = fVar.f316309b;
                        yre.f fVar2 = fVar.f316310c;
                        AddMoneyMethodSelectionScreenContract$InputData addMoneyMethodSelectionScreenContract$InputData = addMoneyMethodSelectionController.K;
                        addMoneyMethodSelectionScreenContract$InputData.getClass();
                        return new yre.b(eVar, fVar2, addMoneyMethodSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddMoneyMethodSelectionController.S;
                        return (f) ((yre.b) addMoneyMethodSelectionController.L.getValue()).f316287c.get();
                    default:
                        KProperty[] kPropertyArr3 = AddMoneyMethodSelectionController.S;
                        AddMoneyMethodSelectionController addMoneyMethodSelectionController2 = this.f18178b;
                        f fVar3 = (f) addMoneyMethodSelectionController2.M.getValue();
                        List listK = v.k(new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), (RowDelegate) addMoneyMethodSelectionController2.P.getValue(), new RowLoadingDelegate(), (LargeActionButtonDelegate) addMoneyMethodSelectionController2.Q.getValue());
                        ViewBinding value = addMoneyMethodSelectionController2.O.getValue(addMoneyMethodSelectionController2, AddMoneyMethodSelectionController.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(addMoneyMethodSelectionController2, fVar3, listK, ((jii.f) value).f174520c.getId(), null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_bottom_sheet_list;
        this.O = s.t(this, b.f);
        this.P = w.y0(new e(14));
        this.Q = w.y0(new e(15));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: bse.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddMoneyMethodSelectionController f18178b;

            {
                this.f18178b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddMoneyMethodSelectionController addMoneyMethodSelectionController = this.f18178b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddMoneyMethodSelectionController.S;
                        qji.b bVarU2 = addMoneyMethodSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.three_ds_verification.impl.ui.add_money.di.AddMoneyMethodSelectionControllerInjector");
                        yre.f fVar = (yre.f) bVarU2;
                        yre.e eVar = fVar.f316309b;
                        yre.f fVar2 = fVar.f316310c;
                        AddMoneyMethodSelectionScreenContract$InputData addMoneyMethodSelectionScreenContract$InputData = addMoneyMethodSelectionController.K;
                        addMoneyMethodSelectionScreenContract$InputData.getClass();
                        return new yre.b(eVar, fVar2, addMoneyMethodSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddMoneyMethodSelectionController.S;
                        return (f) ((yre.b) addMoneyMethodSelectionController.L.getValue()).f316287c.get();
                    default:
                        KProperty[] kPropertyArr3 = AddMoneyMethodSelectionController.S;
                        AddMoneyMethodSelectionController addMoneyMethodSelectionController2 = this.f18178b;
                        f fVar3 = (f) addMoneyMethodSelectionController2.M.getValue();
                        List listK = v.k(new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), (RowDelegate) addMoneyMethodSelectionController2.P.getValue(), new RowLoadingDelegate(), (LargeActionButtonDelegate) addMoneyMethodSelectionController2.Q.getValue());
                        ViewBinding value = addMoneyMethodSelectionController2.O.getValue(addMoneyMethodSelectionController2, AddMoneyMethodSelectionController.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(addMoneyMethodSelectionController2, fVar3, listK, ((jii.f) value).f174520c.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (yre.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.f) value).f174519b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.three_ds_add_money_methods_selection_title, u.c(new MoneyClause(this.K.f90398a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.Q.getValue()).d.f121375b), null, new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
