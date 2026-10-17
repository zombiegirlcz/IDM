package gvl;

import a3e.u;
import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.d5;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.trading.orders.R$string;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import te0.w;
import vkm.j2;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends oki.h implements dli.b {
    public final a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f147230p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f147231q;

    public o(j initialState, u stateMapper, p saveStateDelegate, a dialogMapper, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.o = dialogMapper;
        this.f147230p = bottomExpandableDialogControllerExtension;
        this.f147231q = w.y0(new bib.b(this, initialState, stateMapper, saveStateDelegate, 9));
    }

    public final y I2(LocalDate startDate) {
        LocalDate localDate = ((j) ((j2) getState().f22677a).getValue()).f147222b;
        LocalDate localDate2 = ((j) ((j2) getState().f22677a).getValue()).f147223c;
        boolean z = ((j) ((j2) getState().f22677a).getValue()).d;
        List excludeDates = ((j) ((j2) getState().f22677a).getValue()).e;
        a aVar = this.o;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(excludeDates, "excludeDates");
        DatePickerDelegate.a[] elements = {z ? DatePickerDelegate.a.C0402a.f52177a : null, new d5(d0.i1(excludeDates))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("SELECT_START_DATE_PICKER_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TimeClause(oc.c.F(startDate), TimeClause.Format.DateFull.f57961b, null, null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp16, 0, 0, 56314);
        LocalDate localDateWithDayOfMonth = startDate.withDayOfMonth(1);
        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth, "withDayOfMonth(...)");
        List listK = v.k(model, new g5("SELECT_START_DATE_PICKER_ITEM_ID", localDateWithDayOfMonth, startDate, false, null, localDate, localDate2, null, listL, null, R$attr.uikit_dp12, R$attr.uikit_dp16, 850744));
        yp0.b.k(listK, R$attr.uikit_dp0, 0, 0, 0, 30);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_action_set, null, null, 14);
        int i = R$attr.uikit_dp16;
        return new y(d0.F0(new LargeActionButtonDelegate.Model("SELECT_START_DATE_SET_BUTTON_ITEM_ID", defaultFilledButton, null, textLocalisedClause, false, null, startDate, i, R$attr.uikit_dp24, i, i, 368), listK), new t(new TextLocalisedClause(R$string.trading_orders_frequency_settings_dialog_select_start_date_title, null, null, 14), null, null, 30), rp0.l.WINDOW, Integer.valueOf(kli.a.k(aVar.f147213a.f22265a, 24.0f)), "SELECT_START_DATE_DIALOG_TAG", null, 968);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.z
    public final cli.g getState() {
        return (cli.g) this.f147231q.getValue();
    }
}
