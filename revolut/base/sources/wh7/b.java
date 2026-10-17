package wh7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.n3;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.widgets.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import dsh.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import op0.q;
import org.jetbrains.annotations.NotNull;
import ph7.c;
import qi7.h;
import uh7.e;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements e {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pi7.a f297427a;

    public b(pi7.a instrumentMapper) {
        Intrinsics.checkNotNullParameter(instrumentMapper, "instrumentMapper");
        this.f297427a = instrumentMapper;
    }

    @Override // uh7.e
    public final List a(dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return u.c(r.a.a(r.Companion, inputConfig, v.k(new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_one, null, null, 14), "1"), new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_two, null, null, 14), "2"), new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_three, null, null, 14), "3"), new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_five, null, null, 14), "5"), new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_ten, null, null, 14), "10")), String.valueOf(c(inputConfig)), 2));
    }

    @Override // uh7.e
    public final BaseDraggableWidgetDelegate.Model b(String id10, c selectedCollectionKey, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(selectedCollectionKey, "selectedCollectionKey");
        return RowsWidgetDelegate.Model.Companion.b(RowsWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_most_traded_header_title, null, null, 14), c(eVar), null, 24);
    }

    @Override // uh7.e
    public final int c(dsh.e eVar) {
        r.Companion.getClass();
        return r.a.b(eVar, 2);
    }

    @Override // uh7.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, c selectedCollectionKey, List instruments) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(selectedCollectionKey, "selectedCollectionKey");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
        BaseDynamicWidgetDelegate.BigHeaderModel bigHeaderModel = new BaseDynamicWidgetDelegate.BigHeaderModel("MOST_TRADED_WIDGET_LIST_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_most_traded_header_title, null, null, 14), null, false, null, 56);
        n3 n3Var = new n3(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_transactions_widget_button_see_all, null, null, 14), null);
        List list = instruments;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f297427a.a((h) it8.next()));
        }
        return RowsWidgetDelegate.Model.Companion.d(companion, id10, bigHeaderModel, arrayList, n3Var, null, null, null, 112);
    }

    @Override // uh7.e
    public final ErrorWidgetDelegate.Model e(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new ErrorWidgetDelegate.Model(id10, null, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_most_traded_error_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_action, null, null, 14), q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
    }
}
