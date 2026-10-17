package g5e;

import android.os.Parcelable;
import aw0.c7;
import aw0.t0;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.j;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.structured_note.details.impl.R$string;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note_glossary.AboutNoteGlossaryScreenContract$Category;
import d9.e1;
import fq7.k;
import g3e.s;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;
import jel.e2;
import jel.u1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements n {
    public static ListSubheaderDelegate.Model a(String str, int i, AboutNoteGlossaryScreenContract$Category aboutNoteGlossaryScreenContract$Category) {
        return new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) aboutNoteGlossaryScreenContract$Category, (Parcelable) null, 0, 0, 0, 0, 64434);
    }

    public static CellDetailsDelegate.Model b(int i, Clause clause, String str) {
        return new CellDetailsDelegate.Model(str, new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), clause, null, null, null, null, 0, null, false, false, null, null, 31736);
    }

    public static PercentageClause d(BigDecimal bigDecimal) {
        return new PercentageClause(e1.Z(bigDecimal), (PercentageClause.Format) null, (Style) null, 6);
    }

    public static TimeClause e(LocalDate localDate) {
        j jVar = c7.Companion;
        LocalDateClause$DateFormat.INSTANCE.getClass();
        return j.b(jVar, localDate, LocalDateClause$DateFormat.Companion.f57815b);
    }

    public static TextLocalisedClause f(u1 u1Var) {
        int i;
        int i2 = g.f140776c[u1Var.ordinal()];
        if (i2 == 1) {
            i = R$string.trading_structured_notes_call_frequency_monthly;
        } else if (i2 == 2) {
            i = R$string.trading_structured_notes_call_frequency_quarterly;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.trading_structured_notes_call_frequency_annually;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static TextLocalisedClause g(BigDecimal bigDecimal) {
        return new TextLocalisedClause(R$string.trading_structured_notes_attributes_dictionary_final_payout_multiplier_value_template, u.c(new NumberClause(bigDecimal, new NumberClause.Format.FixedDigitsAfterDot(2, 12, null, null, RoundingMode.HALF_DOWN), null, null, 12)), null, 12);
    }

    public static TextLocalisedClause h(e2 e2Var) {
        int i;
        int i2 = g.f140775b[e2Var.ordinal()];
        if (i2 == 1) {
            i = R$string.trading_structured_notes_performance_basis_average;
        } else if (i2 == 2) {
            i = R$string.trading_structured_notes_performance_basis_worst_performing;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.trading_structured_notes_performance_basis_single_asset;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static List i(List list, ListSubheaderDelegate.Model model) {
        return list.isEmpty() ? f0.f322471a : yp0.b.g(list, model, null, 0, 0, 126);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f140771a;
        Data data2 = domainState.f140772b;
        List list = (data == null || data2 == null) ? null : (List) iii.c.f(t1.t(data, data2), new g3e.h(24), new s(29), new k(this, 12));
        if (list == null) {
            list = f0.f322471a;
        }
        return new f(list);
    }
}
