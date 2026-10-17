package hj6;

import android.os.Parcelable;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import dj0.d;
import ip0.ej;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;
import ne6.b;
import oc.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    @NotNull
    public static final C0877a Companion = new C0877a();

    /* JADX INFO: renamed from: hj6.a$a, reason: collision with other inner class name */
    public static final class C0877a {
        private C0877a() {
        }
    }

    public final CellDetailsDelegate.Model b(String listId, String editableItemId, String title, LocalDate localDate, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(editableItemId, "editableItemId");
        Intrinsics.checkNotNullParameter(title, "title");
        return new CellDetailsDelegate.Model(listId, new t0((Clause) new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30), localDate != null ? new TimeClause(c.F(localDate), new TimeClause.Format.DateMedium(0), new Click(30, (Integer) null, (Object) null, editableItemId, false), null, 8) : new TextLocalisedClause(R$string.open_finance_payment_authorization_end_date_value_indefinite, null, new Click(30, (Integer) null, (Object) null, editableItemId, false), 10), null, obj2, null, null, 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, null, null, 31672);
    }

    public final CellDetailsDelegate.Model c(String listId, String editableItemId, String title, d dVar, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(editableItemId, "editableItemId");
        Intrinsics.checkNotNullParameter(title, "title");
        boolean z = (dVar != null ? Long.valueOf(dVar.f115082a) : null) != null && dVar.f115082a > 0;
        return new CellDetailsDelegate.Model(listId, new t0((Clause) new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30), z ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Click(30, (Integer) null, (Object) null, editableItemId, false), null, 8) : new TextLocalisedClause(R$string.open_finance_payment_authorization_limit_value_add, null, new Click(30, (Integer) null, (Object) null, editableItemId, false), 10), null, parcelable, null, null, 0, new ResourceImage(z ? R$drawable.uikit_icn_24_pencil : R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, null, null, 31672);
    }

    public final ej d(String text) {
        Intrinsics.checkNotNullParameter("ID_BE_DRIVEN_FOOTER", "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        return new ej("ID_BE_DRIVEN_FOOTER", new c7(new TextClause(text, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 6));
    }

    public final CellDetailsDelegate.Model e(String listId, String title, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        return new CellDetailsDelegate.Model(listId, new t0((Clause) new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30), localDate != null ? new TimeClause(c.F(localDate), new TimeClause.Format.DateMedium(0), null, null, 12) : new TextLocalisedClause(R$string.open_finance_payment_authorization_end_date_value_indefinite, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 30712);
    }

    public final CellDetailsDelegate.Model f(d dVar, String listId, String title) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        return new CellDetailsDelegate.Model(listId, new t0((Clause) new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30), (dVar != null ? Long.valueOf(dVar.f115082a) : null) != null && (dVar.f115082a > 0L ? 1 : (dVar.f115082a == 0L ? 0 : -1)) > 0 ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : new TextLocalisedClause(R$string.open_finance_payment_authorization_limit_value_no_limit, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 30712);
    }

    public final CellDetailsDelegate.Model g(String listId, String title, String endText) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(endText, "endText");
        return new CellDetailsDelegate.Model(listId, new t0((Clause) new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30), new TextClause(endText, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 30712);
    }
}
