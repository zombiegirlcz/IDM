package jui;

import aw0.o9;
import aw0.t0;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$plurals;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.modal.available_soon.AsftPassAvailableSoonScreenContract$InputData;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qui.j;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftPassAvailableSoonScreenContract$InputData f178665a;

    public f(AsftPassAvailableSoonScreenContract$InputData inputData, j offsetDateTimeNowProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(offsetDateTimeNowProvider, "offsetDateTimeNowProvider");
        this.f178665a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        CellDetailsDelegate.Model model;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        CellDetailsStandaloneNoteDelegate.Model.Companion companion = CellDetailsStandaloneNoteDelegate.Model.INSTANCE;
        CellDetailsStandaloneNoteDelegate.Model modelB = CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion, "list_id_description_1", new TextLocalisedClause(R$string.asft_home_available_soon_text1, null, null, 14));
        CellDetailsStandaloneNoteDelegate.Model modelB2 = CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion, "list_id_description_2", new TextLocalisedClause(R$string.asft_home_available_soon_text2, null, null, 14));
        AsftPassAvailableSoonScreenContract$InputData asftPassAvailableSoonScreenContract$InputData = this.f178665a;
        int i = asftPassAvailableSoonScreenContract$InputData.f98845a;
        CellDetailsStandaloneNoteDelegate.Model[] elements = {modelB, modelB2, i > 0 ? CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion, "list_id_description_3", new TextLocalisedQuantityClause(R$plurals.asft_home_available_soon_text3, Integer.valueOf(i), (List) null, (Style) null, 28)) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(CellDetailsStandaloneNoteDelegate.Model.Companion.a(listL));
        OffsetDateTime offsetDateTime = asftPassAvailableSoonScreenContract$InputData.f98846b;
        if (offsetDateTime != null) {
            OffsetDateTime offsetDateTimeNow = OffsetDateTime.now();
            Intrinsics.checkNotNullExpressionValue(offsetDateTimeNow, "now(...)");
            if (offsetDateTimeNow.isAfter(offsetDateTime)) {
                t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.asft_manage_booking_cancellation_deadline_passed_title, null, null, 14), (Image) null, 0, false, 30);
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                model = new CellDetailsDelegate.Model("list_id_free_cancellation", t0Var, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            } else {
                t0 t0Var2 = new t0((Clause) new TextLocalisedClause(R$string.asft_cancel_booking_description_free_cancellation, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusSuccess), false, null, false, null, 254), 10), (Image) null, 0, false, 30);
                int i2 = R$string.asft_checkout_top_block_free_cancellation_value;
                LocalDateTime localDateTime = offsetDateTime.toLocalDateTime();
                Intrinsics.checkNotNullExpressionValue(localDateTime, "toLocalDateTime(...)");
                CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("list_id_free_cancellation", t0Var2, new TextLocalisedClause(i2, u.c(new TimeClause(oi0.d.R(localDateTime), TimeClause.Format.DateLong.f57962b, null, null, 12)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                model = model2;
            }
            eVarB.add(model);
        }
        return new d(u.a(eVarB));
    }
}
