package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassRefundBreakdown;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import ip0.y10;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import njj.l;
import pki.b;
import q97.b1;
import qp7.g;
import qui.a;
import qui.c;
import qui.d;
import qui.e;
import qui.f;
import qui.i;
import vc.s;
import z4l.j;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/manage_booking/AsftManageBookingScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lqui/e;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftManageBookingScreen extends SimpleViewController<e> {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(AsftManageBookingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final int N;
    public final h O;
    public final i P;
    public final i Q;
    public final a R;
    public final RowDelegate S;
    public final j T;

    public AsftManageBookingScreen(AsftManageBookingPayload manageBookingPayload) {
        Intrinsics.checkNotNullParameter(manageBookingPayload, "manageBookingPayload");
        this.N = R$layout.screen_bottom_sheet_list;
        this.O = s.t(this, f.f);
        i iVar = new i();
        this.P = iVar;
        this.Q = iVar;
        this.R = new a(manageBookingPayload, new qui.j());
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.S = rowDelegate;
        this.T = new j(7, v.k(rowDelegate, new PlainTextWarningDelegate()), false);
    }

    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return this.Q;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Collection collectionC;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = U;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.O;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.f) value).f174519b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.asft_manage_booking_title, null, null, 14), null, null, null, false, 30));
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ScreenContentRecyclerView screenContentRecyclerView = ((jii.f) value2).f174520c;
        j jVar = this.T;
        screenContentRecyclerView.setAdapter(jVar);
        screenContentRecyclerView.setLayoutManager(new LinearLayoutManager(m2()));
        screenContentRecyclerView.addItemDecoration(new o31.b());
        a aVar = this.R;
        aVar.getClass();
        aim.e eVarB = u.b();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.asft_manage_booking_help_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.asft_manage_booking_help_description, null, null, 14);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        RowDelegate.Model model = new RowDelegate.Model("list_id_help", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_question_outline, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, c.f249457a, null, 0, 0, 0, 0, 532676568);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.asft_manage_booking_terms_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_document, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62);
        AsftManageBookingPayload asftManageBookingPayload = aVar.f249453a;
        List listK = v.k(model, new RowDelegate.Model("list_id_terms", image40, textLocalisedClause3, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new d(asftManageBookingPayload.f98865a), null, 0, 0, 0, 0, 532676600));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        OffsetDateTime offsetDateTime = asftManageBookingPayload.d;
        AsftPassRefundBreakdown asftPassRefundBreakdown = asftManageBookingPayload.e;
        if (offsetDateTime == null) {
            collectionC = f0.f322471a;
        } else {
            OffsetDateTime offsetDateTimeNow = OffsetDateTime.now();
            Intrinsics.checkNotNullExpressionValue(offsetDateTimeNow, "now(...)");
            if (offsetDateTimeNow.isAfter(offsetDateTime)) {
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.asft_manage_booking_cancellation_deadline_passed_title, null, null, 14);
                int i = R$string.asft_manage_booking_cancellation_deadline_passed_description;
                LocalDateTime localDateTime = offsetDateTime.toLocalDateTime();
                Intrinsics.checkNotNullExpressionValue(localDateTime, "toLocalDateTime(...)");
                sa saVar = new sa("list_id_cancellation_not_available", (Clause) textLocalisedClause4, (Clause) new TextLocalisedClause(i, u.c(new TimeClause(oi0.d.R(localDateTime), new TimeClause.Format.Pretty(0), null, null, 12)), null, 12), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorPink), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040);
                yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
                collectionC = u.c(saVar);
            } else if (asftPassRefundBreakdown == null) {
                collectionC = f0.f322471a;
            } else {
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.asft_manage_booking_cancel_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10);
                int i2 = R$string.asft_manage_booking_cancel_description_free_cancellation;
                LocalDateTime localDateTime2 = offsetDateTime.toLocalDateTime();
                Intrinsics.checkNotNullExpressionValue(localDateTime2, "toLocalDateTime(...)");
                RowDelegate.Model model2 = new RowDelegate.Model("list_id_cancel", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_cross, R$attr.uikit_colorStatusDanger, R$attr.uikit_colorStatusDanger_10), null, null, false, null, false, 62), textLocalisedClause5, null, 0, new TextLocalisedClause(i2, u.c(new TimeClause(oi0.d.R(localDateTime2), new TimeClause.Format.Pretty(0), null, null, 12)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, new qui.b(asftManageBookingPayload.f98866b, asftManageBookingPayload.f98867c, offsetDateTime, asftPassRefundBreakdown), null, 0, 0, 0, 0, 532676568);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                collectionC = u.c(model2);
            }
        }
        eVarB.addAll(collectionC);
        jVar.c(u.a(eVarB));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new l(new b1(rd0.e.b(this.S.f53218h), 18), 24), new g(this, null, 9), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }
}
