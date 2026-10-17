package com.revolut.feature.credit.autopay.ui.screen.set_date;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.GridSingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.autopay.ui.screen.set_date.SetDateContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.set_date.SetDateScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import dw3.k6;
import dw3.l6;
import java.util.List;
import jii.u;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import vc.s;
import wk4.b;
import wk4.d;
import wk4.e;
import wk4.g;
import wk4.i;
import wk4.j;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/set_date/SetDateScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lwk4/e;", "Lcom/revolut/feature/credit/autopay/ui/screen/set_date/SetDateContract$InputData;", "Lwk4/b;", "Lno/k;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SetDateScreen extends BaseRecyclerViewScreen<e, SetDateContract$InputData, b> implements k {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f68668e0 = {o0.f186429a.j(new h0(SetDateScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final SetDateContract$InputData U;
    public final h V;
    public final int W;
    public AnalyticsContext X;
    public final Object Y;
    public final GridSingleChoiceDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final LargeActionButtonDelegate f68669a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f68670b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f68671d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetDateScreen(SetDateContract$InputData input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.U = input;
        this.V = s.t(this, g.f);
        this.W = R$layout.screen_recycler_navbar_nextbutton;
        this.X = input.f;
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: wk4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetDateScreen f298242b;

            {
                this.f298242b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SetDateScreen setDateScreen = this.f298242b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SetDateScreen.f68668e0;
                        l6 l6Var = (l6) setDateScreen.c0.getValue();
                        switch (l6Var.f119209a) {
                            case 0:
                                return (j60.a) l6Var.e.get();
                            case 1:
                                return (j60.a) l6Var.e.get();
                            default:
                                return (j60.a) l6Var.e.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = SetDateScreen.f68668e0;
                        qji.b bVarQ2 = setDateScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.autopay.ui.screen.set_date.di.SetDateScreenInjector");
                        k6 k6Var = (k6) ((xk4.a) bVarQ2).j().S(setDateScreen);
                        SetDateContract$InputData setDateContract$InputData = setDateScreen.U;
                        switch (k6Var.f119130a) {
                            case 0:
                                setDateContract$InputData.getClass();
                                k6Var.f119132c = setDateContract$InputData;
                                break;
                            case 1:
                                setDateContract$InputData.getClass();
                                k6Var.f119132c = setDateContract$InputData;
                                break;
                            default:
                                setDateContract$InputData.getClass();
                                k6Var.f119132c = setDateContract$InputData;
                                break;
                        }
                        return (l6) k6Var.mo3800build();
                    default:
                        KProperty[] kPropertyArr3 = SetDateScreen.f68668e0;
                        l6 l6Var2 = (l6) setDateScreen.c0.getValue();
                        switch (l6Var2.f119209a) {
                            case 0:
                                return (d) l6Var2.f119213h.get();
                            case 1:
                                return (d) l6Var2.f119213h.get();
                            default:
                                return (d) l6Var2.f119213h.get();
                        }
                }
            }
        });
        GridSingleChoiceDelegate gridSingleChoiceDelegate = new GridSingleChoiceDelegate();
        this.Z = gridSingleChoiceDelegate;
        this.f68669a0 = new LargeActionButtonDelegate();
        final int i2 = 2;
        final int i3 = 1;
        this.f68670b0 = v.k(gridSingleChoiceDelegate, new PlainTextDelegate());
        this.c0 = w.y0(new Function0(this) { // from class: wk4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetDateScreen f298242b;

            {
                this.f298242b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SetDateScreen setDateScreen = this.f298242b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SetDateScreen.f68668e0;
                        l6 l6Var = (l6) setDateScreen.c0.getValue();
                        switch (l6Var.f119209a) {
                            case 0:
                                return (j60.a) l6Var.e.get();
                            case 1:
                                return (j60.a) l6Var.e.get();
                            default:
                                return (j60.a) l6Var.e.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = SetDateScreen.f68668e0;
                        qji.b bVarQ2 = setDateScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.autopay.ui.screen.set_date.di.SetDateScreenInjector");
                        k6 k6Var = (k6) ((xk4.a) bVarQ2).j().S(setDateScreen);
                        SetDateContract$InputData setDateContract$InputData = setDateScreen.U;
                        switch (k6Var.f119130a) {
                            case 0:
                                setDateContract$InputData.getClass();
                                k6Var.f119132c = setDateContract$InputData;
                                break;
                            case 1:
                                setDateContract$InputData.getClass();
                                k6Var.f119132c = setDateContract$InputData;
                                break;
                            default:
                                setDateContract$InputData.getClass();
                                k6Var.f119132c = setDateContract$InputData;
                                break;
                        }
                        return (l6) k6Var.mo3800build();
                    default:
                        KProperty[] kPropertyArr3 = SetDateScreen.f68668e0;
                        l6 l6Var2 = (l6) setDateScreen.c0.getValue();
                        switch (l6Var2.f119209a) {
                            case 0:
                                return (d) l6Var2.f119213h.get();
                            case 1:
                                return (d) l6Var2.f119213h.get();
                            default:
                                return (d) l6Var2.f119213h.get();
                        }
                }
            }
        });
        this.f68671d0 = w.y0(new Function0(this) { // from class: wk4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetDateScreen f298242b;

            {
                this.f298242b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SetDateScreen setDateScreen = this.f298242b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SetDateScreen.f68668e0;
                        l6 l6Var = (l6) setDateScreen.c0.getValue();
                        switch (l6Var.f119209a) {
                            case 0:
                                return (j60.a) l6Var.e.get();
                            case 1:
                                return (j60.a) l6Var.e.get();
                            default:
                                return (j60.a) l6Var.e.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = SetDateScreen.f68668e0;
                        qji.b bVarQ2 = setDateScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.autopay.ui.screen.set_date.di.SetDateScreenInjector");
                        k6 k6Var = (k6) ((xk4.a) bVarQ2).j().S(setDateScreen);
                        SetDateContract$InputData setDateContract$InputData = setDateScreen.U;
                        switch (k6Var.f119130a) {
                            case 0:
                                setDateContract$InputData.getClass();
                                k6Var.f119132c = setDateContract$InputData;
                                break;
                            case 1:
                                setDateContract$InputData.getClass();
                                k6Var.f119132c = setDateContract$InputData;
                                break;
                            default:
                                setDateContract$InputData.getClass();
                                k6Var.f119132c = setDateContract$InputData;
                                break;
                        }
                        return (l6) k6Var.mo3800build();
                    default:
                        KProperty[] kPropertyArr3 = SetDateScreen.f68668e0;
                        l6 l6Var2 = (l6) setDateScreen.c0.getValue();
                        switch (l6Var2.f119209a) {
                            case 0:
                                return (d) l6Var2.f119213h.get();
                            case 1:
                                return (d) l6Var2.f119213h.get();
                            default:
                                return (d) l6Var2.f119213h.get();
                        }
                }
            }
        });
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.X = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getX() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (l6) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        a.g2(this, rd0.e.b(h3().f174565c.f59410q), null, new wk4.h(this, continuation, 0), 3);
        a.g2(this, rd0.e.b(h3().f174565c.o.f57403b), null, new i(this, continuation, 0), 3);
        int i = 1;
        a.g2(this, rd0.e.b(h3().f174564b.o), null, new wk4.h(this, continuation, i), 3);
        a.g2(this, rd0.e.b(this.Z.f52390g.f121375b), null, new i(this, continuation, i), 3);
        a.g2(this, rd0.e.b(this.f68669a0.d.f121375b), null, new j(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) this.Y.getValue()).d(v.k(this.f68669a0, new ListCellDelegate()));
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_schedule_payment_set_day_screen_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_schedule_payment_set_day_screen_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.credit_schedule_payment_set_day_screen_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getV() {
        return this.f68670b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(e uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f174564b.setEnabled(uiState.f298239b);
        h3().f174565c.setMenuItems(uiState.f298240c);
        h3().f174565c.setSecondDescriptionText(uiState.d);
        h3().f174564b.setText(uiState.e);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.W;
    }

    public final u h3() {
        ViewBinding value = this.V.getValue(this, f68668e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final d T2() {
        return (d) this.f68671d0.getValue();
    }
}
