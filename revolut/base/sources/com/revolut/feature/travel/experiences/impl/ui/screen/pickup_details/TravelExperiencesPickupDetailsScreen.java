package com.revolut.feature.travel.experiences.impl.ui.screen.pickup_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TimePickerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.feature.travel.experiences.impl.ui.screen.pickup_details.TravelExperiencesPickupDetailsScreen;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import h30.l;
import java.util.List;
import jki.n;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import x2g.c;
import x2g.d;
import x2g.f;
import x2g.g;
import x2g.i;
import x2g.k;
import x2g.m;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/pickup_details/TravelExperiencesPickupDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lx2g/m;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/pickup_details/TravelExperiencesPickupDetailsScreenContract$InputData;", "Lx2g/k;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesPickupDetailsScreen extends BaseRecyclerViewScreen<m, TravelExperiencesPickupDetailsScreenContract$InputData, k> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(TravelExperiencesPickupDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenTravelExperiencesPickupDetailsBinding;", 0))};
    public final Object U;
    public final PickerDelegate V;
    public final LargeActionButtonDelegate W;
    public final SingleChoiceDelegate X;
    public final TimePickerDelegate Y;
    public final h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f93100a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f93101b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f93102d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f93103e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelExperiencesPickupDetailsScreen(TravelExperiencesPickupDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        Lazy lazyY0 = w.y0(new Function0(this) { // from class: x2g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesPickupDetailsScreen f302551b;

            {
                this.f302551b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelExperiencesPickupDetailsScreen travelExperiencesPickupDetailsScreen = this.f302551b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesPickupDetailsScreen.f0;
                        return new InputTextDelegate(new b(travelExperiencesPickupDetailsScreen, 0));
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesPickupDetailsScreen.f0;
                        return (l) ((z0g.m) travelExperiencesPickupDetailsScreen.c0.getValue()).f318411j.get();
                }
            }
        });
        this.U = lazyY0;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.V = new PickerDelegate();
        this.W = new LargeActionButtonDelegate();
        this.X = new SingleChoiceDelegate();
        this.Y = new TimePickerDelegate();
        this.Z = s.t(this, c.f);
        this.f93100a0 = R$layout.screen_travel_experiences_pickup_details;
        this.f93101b0 = R$id.travelExperiencesPickupDetailsScreen_recyclerView;
        this.c0 = w.y0(new wrj.m(this, inputData, 14));
        final int i2 = 1;
        this.f93102d0 = w.y0(new Function0(this) { // from class: x2g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesPickupDetailsScreen f302551b;

            {
                this.f302551b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelExperiencesPickupDetailsScreen travelExperiencesPickupDetailsScreen = this.f302551b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesPickupDetailsScreen.f0;
                        return new InputTextDelegate(new b(travelExperiencesPickupDetailsScreen, 0));
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesPickupDetailsScreen.f0;
                        return (l) ((z0g.m) travelExperiencesPickupDetailsScreen.c0.getValue()).f318411j.get();
                }
            }
        });
        this.f93103e0 = v.k((InputTextDelegate) lazyY0.getValue(), listSubheaderDelegate);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        m uiState = (m) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f293745b.setEnabled(uiState.f302560b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (z0g.m) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        a.g2(this, e.b(g3().f293746c.f59410q), null, new d(this, null, 0), 3);
        a.g2(this, e.b(g3().f293745b.o), null, new d(this, null, 1), 3);
        ?? r62 = this.U;
        a.g2(this, e.b(((InputTextDelegate) r62.getValue()).f.f121375b), null, new x2g.e(this, continuation, 0), 3);
        a.g2(this, e.b(((InputTextDelegate) r62.getValue()).e.f121375b), null, new f(this, null), 3);
        a.g2(this, l.y(((InputTextDelegate) r62.getValue()).f52575g.f121375b, ((InputTextDelegate) r62.getValue()).i.f121375b, "merge(...)"), null, new g(this, null), 3);
        a.g2(this, e.b(this.V.f52922c), null, new x2g.e(this, continuation, 1), 3);
        a.g2(this, e.b(this.W.d.f121375b), null, new x2g.h(this, null), 3);
        a.g2(this, e.b(this.X.p()), null, new i(this, null), 3);
        a.g2(this, e.b(this.Y.p()), null, new x2g.e(this, continuation, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f293746c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.experiences_additional_details_pickup_details_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.experiences_additional_details_pickup_details_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        g3().f293745b.setText(new TextLocalisedClause(R$string.experiences_common_action_continue, null, null, 14));
        ((j60.a) ((z0g.m) this.c0.getValue()).e.get()).d(v.k(this.V, this.W, this.X, this.Y));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        m uiState = (m) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f293745b.setEnabled(uiState.f302560b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF93103e0() {
        return this.f93103e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getF93101b0() {
        return this.f93101b0;
    }

    public final w0g.v g3() {
        ViewBinding value = this.Z.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w0g.v) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF93100a0() {
        return this.f93100a0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final x2g.l T2() {
        return (x2g.l) this.f93102d0.getValue();
    }
}
