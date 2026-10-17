package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.share;

import aii.q;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.spending_analytics.impl.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import hmd.i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.l;
import mx0.t;
import ppd.f1;
import uj7.a;
import uod.b;
import uod.c;
import uod.d;
import uod.g;
import vc.s;
import xki.e;
import yy0.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/share/TripsShareController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Luod/b;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TripsShareController extends ViewController<q> implements w {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(TripsShareController.class, "binding", "getBinding()Lcom/revolut/feature/spending_analytics/impl/databinding/ScreenTripsShareBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;

    public TripsShareController(TripsShareContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_trips_share;
        this.L = s.t(this, d.f);
        this.M = te0.w.y0(new a(this, inputData, 11));
        this.N = te0.w.y0(new c(this, 0));
        this.O = te0.w.y0(new c(this, 1));
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ty0.c cVar;
        int i;
        int i2;
        i iVar;
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        i iVarD3 = d3();
        ControllerContainerFrameLayout controllerContainerFrameLayout = iVarD3.f153697a;
        AppCompatImageView tripShareCardRevolutLogo = iVarD3.f153703l;
        AppCompatTextView tripShareCardJoinDate = iVarD3.f153702j;
        AppCompatImageView tripShareCardTopIcon = iVarD3.f153705n;
        AppCompatTextView tripShareCardUserName = iVarD3.f153710t;
        LinearLayout tripShareCardTopRightHeader = iVarD3.f153706p;
        AppCompatImageView tripShareCardRevolutLogoNew = iVarD3.f153704m;
        Context context = controllerContainerFrameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        f fVarQ = jh.d.f(context).Q();
        Context context2 = iVarD3.f153697a.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ty0.c cVarB0 = jh.d.f(context2).b0();
        ActionsView tripShareActionButtonsBar = iVarD3.f153699c;
        Intrinsics.checkNotNullExpressionValue(tripShareActionButtonsBar, "tripShareActionButtonsBar");
        ArrayList arrayList = uiState.f281630n;
        TextLocalisedClause textLocalisedClause = uiState.f;
        ResourceImage resourceImage = uiState.d;
        ResourceImage resourceImage2 = uiState.e;
        ActionsView.Companion companion = ActionsView.INSTANCE;
        tripShareActionButtonsBar.k(arrayList, t.f210002a);
        Intrinsics.checkNotNullExpressionValue(tripShareActionButtonsBar, "tripShareActionButtonsBar");
        tripShareActionButtonsBar.setVisibility(0);
        CdnImage cdnImage = uiState.f281622a;
        AppCompatImageView tripShareBackgroundImage = iVarD3.d;
        Intrinsics.checkNotNullExpressionValue(tripShareBackgroundImage, "tripShareBackgroundImage");
        f.e(fVarQ, cdnImage, tripShareBackgroundImage, null, null, 12);
        CdnImage cdnImage2 = uiState.f281623b;
        FrameLayout frameLayout = iVarD3.f;
        Context context3 = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        fVarQ.c(cdnImage2, context3, frameLayout.getWidth(), frameLayout.getHeight(), new um7.d(iVarD3, 11), null);
        Image image = uiState.f281624c;
        AppCompatImageView tripShareCardMap = iVarD3.k;
        Intrinsics.checkNotNullExpressionValue(tripShareCardMap, "tripShareCardMap");
        f.e(fVarQ, image, tripShareCardMap, null, null, 12);
        boolean z = (uiState.f281627j == null || uiState.f281628l == null) ? false : true;
        if (z) {
            Intrinsics.checkNotNullExpressionValue(tripShareCardRevolutLogoNew, "tripShareCardRevolutLogoNew");
            tripShareCardRevolutLogoNew.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(tripShareCardRevolutLogoNew, "tripShareCardRevolutLogoNew");
            f.e(fVarQ, resourceImage2, tripShareCardRevolutLogoNew, null, null, 12);
            Intrinsics.checkNotNullExpressionValue(tripShareCardTopRightHeader, "tripShareCardTopRightHeader");
            tripShareCardTopRightHeader.setVisibility(0);
            AppCompatImageView tripShareCardTopIconNew = iVarD3.o;
            Intrinsics.checkNotNullExpressionValue(tripShareCardTopIconNew, "tripShareCardTopIconNew");
            f.e(fVarQ, resourceImage, tripShareCardTopIconNew, null, null, 12);
            AppCompatTextView tripShareCardUserTravels = iVarD3.u;
            Intrinsics.checkNotNullExpressionValue(tripShareCardUserTravels, "tripShareCardUserTravels");
            cVar = cVarB0;
            ty0.c.b(cVar, textLocalisedClause, tripShareCardUserTravels, null, null, 12);
            Intrinsics.checkNotNullExpressionValue(tripShareCardUserName, "tripShareCardUserName");
            tripShareCardUserName.setVisibility(8);
            Intrinsics.checkNotNullExpressionValue(tripShareCardTopIcon, "tripShareCardTopIcon");
            tripShareCardTopIcon.setVisibility(8);
            Intrinsics.checkNotNullExpressionValue(tripShareCardJoinDate, "tripShareCardJoinDate");
            tripShareCardJoinDate.setVisibility(8);
            Intrinsics.checkNotNullExpressionValue(tripShareCardRevolutLogo, "tripShareCardRevolutLogo");
            tripShareCardRevolutLogo.setVisibility(8);
            i iVarD32 = d3();
            LinearLayout linearLayout = iVarD32.e;
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = -1;
            layoutParams2.gravity = 81;
            layoutParams2.setMarginStart(0);
            layoutParams2.setMarginEnd(0);
            linearLayout.setLayoutParams(layoutParams2);
            linearLayout.setGravity(1);
            LinearLayout linearLayout2 = iVarD32.f153700g;
            ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
            Intrinsics.i(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.width = 0;
            layoutParams4.weight = 1.0f;
            linearLayout2.setLayoutParams(layoutParams4);
            iVarD32.f153701h.setTextSize(36.0f);
            iVar = iVarD3;
            i = 8;
            i2 = 0;
        } else {
            Intrinsics.checkNotNullExpressionValue(tripShareCardTopIcon, "tripShareCardTopIcon");
            f.e(fVarQ, resourceImage, tripShareCardTopIcon, null, null, 12);
            Intrinsics.checkNotNullExpressionValue(tripShareCardRevolutLogo, "tripShareCardRevolutLogo");
            f.e(fVarQ, resourceImage2, tripShareCardRevolutLogo, null, null, 12);
            Intrinsics.checkNotNullExpressionValue(tripShareCardUserName, "tripShareCardUserName");
            ty0.c.b(cVarB0, textLocalisedClause, tripShareCardUserName, null, null, 12);
            cVar = cVarB0;
            TextLocalisedClause textLocalisedClause2 = uiState.f281625g;
            Intrinsics.checkNotNullExpressionValue(tripShareCardJoinDate, "tripShareCardJoinDate");
            i = 8;
            ty0.c.b(cVar, textLocalisedClause2, tripShareCardJoinDate, null, null, 12);
            Intrinsics.checkNotNullExpressionValue(tripShareCardRevolutLogoNew, "tripShareCardRevolutLogoNew");
            tripShareCardRevolutLogoNew.setVisibility(8);
            Intrinsics.checkNotNullExpressionValue(tripShareCardTopRightHeader, "tripShareCardTopRightHeader");
            tripShareCardTopRightHeader.setVisibility(8);
            Intrinsics.checkNotNullExpressionValue(tripShareCardUserName, "tripShareCardUserName");
            i2 = 0;
            tripShareCardUserName.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(tripShareCardTopIcon, "tripShareCardTopIcon");
            tripShareCardTopIcon.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(tripShareCardJoinDate, "tripShareCardJoinDate");
            tripShareCardJoinDate.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(tripShareCardRevolutLogo, "tripShareCardRevolutLogo");
            tripShareCardRevolutLogo.setVisibility(0);
            i iVarD33 = d3();
            LinearLayout linearLayout3 = iVarD33.e;
            ViewGroup.LayoutParams layoutParams5 = linearLayout3.getLayoutParams();
            Intrinsics.i(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            layoutParams6.width = -2;
            layoutParams6.gravity = 8388693;
            layoutParams6.setMarginStart(0);
            layoutParams6.setMarginEnd((int) (2 * linearLayout3.getResources().getDisplayMetrics().density));
            linearLayout3.setLayoutParams(layoutParams6);
            linearLayout3.setGravity(8388613);
            LinearLayout linearLayout4 = iVarD33.f153700g;
            ViewGroup.LayoutParams layoutParams7 = linearLayout4.getLayoutParams();
            Intrinsics.i(layoutParams7, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
            layoutParams8.width = -2;
            layoutParams8.weight = BitmapDescriptorFactory.HUE_RED;
            linearLayout4.setLayoutParams(layoutParams8);
            iVarD33.f153701h.setTextSize(24.0f);
            iVar = iVarD3;
        }
        LinearLayout tripShareCardWorldPercentageContainer = iVar.f153711w;
        Intrinsics.checkNotNullExpressionValue(tripShareCardWorldPercentageContainer, "tripShareCardWorldPercentageContainer");
        tripShareCardWorldPercentageContainer.setVisibility(z ? i2 : i);
        LinearLayout tripShareCardTripsContainer = iVar.f153707q;
        Intrinsics.checkNotNullExpressionValue(tripShareCardTripsContainer, "tripShareCardTripsContainer");
        tripShareCardTripsContainer.setVisibility(z ? i2 : i);
        if (z) {
            Clause clause = uiState.f281627j;
            AppCompatTextView tripShareCardWorldPercentage = iVar.v;
            Intrinsics.checkNotNullExpressionValue(tripShareCardWorldPercentage, "tripShareCardWorldPercentage");
            ty0.c.b(cVar, clause, tripShareCardWorldPercentage, null, null, 12);
            Clause clause2 = uiState.k;
            AppCompatTextView tripShareCardWorldPercentageLabel = iVar.f153712x;
            Intrinsics.checkNotNullExpressionValue(tripShareCardWorldPercentageLabel, "tripShareCardWorldPercentageLabel");
            ty0.c.b(cVar, clause2, tripShareCardWorldPercentageLabel, null, null, 12);
            Clause clause3 = uiState.f281628l;
            AppCompatTextView tripShareCardTripsCount = iVar.f153708r;
            Intrinsics.checkNotNullExpressionValue(tripShareCardTripsCount, "tripShareCardTripsCount");
            ty0.c.b(cVar, clause3, tripShareCardTripsCount, null, null, 12);
            Clause clause4 = uiState.f281629m;
            AppCompatTextView tripShareCardTripsLabel = iVar.f153709s;
            Intrinsics.checkNotNullExpressionValue(tripShareCardTripsLabel, "tripShareCardTripsLabel");
            ty0.c.b(cVar, clause4, tripShareCardTripsLabel, null, null, 12);
        }
        TextLocalisedClause textLocalisedClause3 = uiState.f281626h;
        AppCompatTextView tripShareCardCountriesLabel = iVar.i;
        Intrinsics.checkNotNullExpressionValue(tripShareCardCountriesLabel, "tripShareCardCountriesLabel");
        ty0.c.b(cVar, textLocalisedClause3, tripShareCardCountriesLabel, null, null, 12);
        NumberClause numberClause = uiState.i;
        AppCompatTextView tripShareCardCountriesCount = iVar.f153701h;
        Intrinsics.checkNotNullExpressionValue(tripShareCardCountriesCount, "tripShareCardCountriesCount");
        ty0.c.b(cVar, numberClause, tripShareCardCountriesCount, null, null, 12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f1) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f153698b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f153699c.setLayoutType(l.HEADER_CIRCLE_ACTIONS);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f153698b.f59410q), null, new uea.e(this, null, 16), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f153699c.f58296a.f121375b), null, new uod.e(this, null), 3);
    }

    public final i d3() {
        ViewBinding value = this.L.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (i) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.O.getValue();
    }
}
