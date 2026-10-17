package com.revolut.feature.credit.loan.impl.ui.rev10.togglebackupcard;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.togglebackupcard.LoanToggleBackupCardScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rxe.b;
import s77.x;
import s85.e;
import s85.h;
import s85.i;
import s85.k;
import te0.w;
import vc.s;
import vkm.q;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/togglebackupcard/LoanToggleBackupCardScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ls85/i;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/togglebackupcard/LoanToggleBackupCardScreenContract$InputData;", "Ls85/h;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanToggleBackupCardScreen extends BaseRecyclerViewScreen<i, LoanToggleBackupCardScreenContract$InputData, h> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f70599e0 = {o0.f186429a.j(new h0(LoanToggleBackupCardScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final ao.h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f70600a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f70601b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f70602d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanToggleBackupCardScreen(LoanToggleBackupCardScreenContract$InputData input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = w.y0(new b(this, input, 29));
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: s85.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanToggleBackupCardScreen f260888b;

            {
                this.f260888b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LoanToggleBackupCardScreen loanToggleBackupCardScreen = this.f260888b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanToggleBackupCardScreen.f70599e0;
                        return (k) ((u45.o0) loanToggleBackupCardScreen.W.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = LoanToggleBackupCardScreen.f70599e0;
                        return v.k((RowDelegate) loanToggleBackupCardScreen.f70600a0.getValue(), (FullScreenStateDelegate) loanToggleBackupCardScreen.f70602d0.getValue(), (CellDetailsActionDelegate) loanToggleBackupCardScreen.c0.getValue(), (CellDetailsSwitcherDelegate) loanToggleBackupCardScreen.f70601b0.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate());
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: s85.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanToggleBackupCardScreen f260888b;

            {
                this.f260888b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LoanToggleBackupCardScreen loanToggleBackupCardScreen = this.f260888b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanToggleBackupCardScreen.f70599e0;
                        return (k) ((u45.o0) loanToggleBackupCardScreen.W.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = LoanToggleBackupCardScreen.f70599e0;
                        return v.k((RowDelegate) loanToggleBackupCardScreen.f70600a0.getValue(), (FullScreenStateDelegate) loanToggleBackupCardScreen.f70602d0.getValue(), (CellDetailsActionDelegate) loanToggleBackupCardScreen.c0.getValue(), (CellDetailsSwitcherDelegate) loanToggleBackupCardScreen.f70601b0.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate());
                }
            }
        });
        this.Z = s.t(this, e.f);
        this.f70600a0 = w.y0(new x(26));
        this.f70601b0 = w.y0(new x(27));
        this.c0 = w.y0(new x(28));
        this.f70602d0 = w.y0(new x(29));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (u45.o0) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (k) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.Z.getValue(this, f70599e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new s1k.b(this, null, 14), 3);
        a.g2(this, q.J(rd0.e.b(((CellDetailsSwitcherDelegate) this.f70601b0.getValue()).f51912c), rd0.e.b(((CellDetailsActionDelegate) this.c0.getValue()).d), rd0.e.b(((FullScreenStateDelegate) this.f70602d0.getValue()).f52371h.f121375b), rd0.e.b(((RowDelegate) this.f70600a0.getValue()).f53218h)), null, new s56.i(this, null, 10), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF95992b0() {
        return (List) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        ViewBinding value = this.Z.getValue(this, f70599e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.loan_management_details_backup_card, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.backup_card_toggle_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
