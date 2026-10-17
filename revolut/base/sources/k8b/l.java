package k8b;

import aw0.c7;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.corporate_events.common.R$string;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import iel.q;
import iel.z;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import k1f.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements a {
    @Override // k8b.a
    public final m8b.e a(iel.a aVar, String assetName, List instruments, Data data) {
        int i;
        TextLocalisedClause textLocalisedClauseA0;
        z event = (z) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        TextClause textClause = new TextClause(assetName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        boolean z = event instanceof iel.m;
        if (z) {
            i = R$string.feature_corporate_events_event_type_bond_coupon_title;
        } else if (event instanceof iel.g) {
            i = R$string.feature_corporate_events_event_type_structured_note_call_title;
        } else {
            if (!(event instanceof q)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.feature_corporate_events_event_type_structured_note_principal_title;
        }
        CompositeClause compositeClauseF = v1.c.f(v.k(textClause, new TextLocalisedClause(i, null, null, 14)), null);
        if (z) {
            textLocalisedClauseA0 = new TextLocalisedClause(R$string.feature_corporate_events_bubble_structured_note_description, null, null, 14);
        } else if (event instanceof iel.g) {
            textLocalisedClauseA0 = ta6.a.a0(R$string.feature_corporate_events_bubble_structured_note_regular_call_description_with_link);
        } else {
            if (!(event instanceof q)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClauseA0 = ta6.a.a0(R$string.feature_corporate_events_bubble_structured_note_principal_description_with_link);
        }
        return new m8b.e(compositeClauseF, textLocalisedClauseA0, new InstrumentImage(event.i(), 30, null, null), (CircleBadgeModel) null, data == null ? m8b.b.f203461a : (m8b.c) iii.c.f(data, new k7c.d(21), new n(29), new jb8.b(29)));
    }

    @Override // k8b.a
    public final List b(iel.a aVar, BigDecimal userOwnership, boolean z, List instruments) {
        CellDetailsDelegate.Model model;
        CellDetailsDelegate.Model model2;
        CellDetailsDelegate.Model model3;
        z event = (z) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(userOwnership, "userOwnership");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        kp3.a aVarH = j8b.k.h(event, instruments);
        CellDetailsDelegate.Model model4 = null;
        CellDetailsDelegate.Model model5 = new CellDetailsDelegate.Model(j6.a.q("CORPORATE_EVENT_DESCRIPTION_ID__", event.b()), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_type, null, null, 14), (Image) null, 0, false, 30), j8b.k.f(event, z), null, aVarH, null, null, 0, null, false, false, null, null, 32696);
        LocalDate localDateC = event.c();
        if (localDateC != null) {
            String strR = a0.d.r(event.b(), "_observation_date");
            t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_event_type_structured_note_observation_date, null, null, 14), (Image) null, 0, false, 30);
            com.revolut.core.ui_kit.models.j jVar = c7.Companion;
            LocalDateClause$DateFormat.INSTANCE.getClass();
            LocalDateClause$DateFormat.DateMedium dateMedium = LocalDateClause$DateFormat.Companion.f57815b;
            jVar.getClass();
            model = model5;
            model2 = new CellDetailsDelegate.Model(strR, t0Var, com.revolut.core.ui_kit.models.j.a(localDateC, dateMedium, null), null, aVarH, null, null, 0, null, false, false, null, null, 32696);
        } else {
            model = model5;
            model2 = null;
        }
        String strR2 = a0.d.r(event.b(), "_payment_date");
        t0 t0Var2 = new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_payment_date, null, null, 14), (Image) null, 0, false, 30);
        com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
        LocalDate localDateD = event.d();
        LocalDateClause$DateFormat.INSTANCE.getClass();
        CellDetailsDelegate.Model model6 = model2;
        CellDetailsDelegate.Model model7 = new CellDetailsDelegate.Model(strR2, t0Var2, com.revolut.core.ui_kit.models.j.b(jVar2, localDateD, LocalDateClause$DateFormat.Companion.f57815b), null, aVarH, null, null, 0, null, false, false, null, null, 32696);
        ej0.b bVarE = event.e();
        if (bVarE != null) {
            model3 = model7;
            model4 = new CellDetailsDelegate.Model(a0.d.r(event.b(), "_amount"), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_amount, null, null, 14), (Image) null, 0, false, 30), h8b.e.a(bVarE), null, aVarH, null, null, 0, null, false, false, null, null, 32696);
        } else {
            model3 = model7;
        }
        CellDetailsDelegate.Model[] elements = {model, model6, model3, model4};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    @Override // k8b.a
    public final /* bridge */ qv0.i c(iel.a aVar) {
        super.c((z) aVar);
        return null;
    }

    @Override // k8b.a
    public final qv0.i d(iel.a aVar, boolean z, LocalDate currentDate, ArrayList instruments) {
        z event = (z) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        return null;
    }
}
