package an9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.data.model.Data;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import com.revolut.feature.security_hub.api.R$string;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements cli.n {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f6606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f6607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f6608c;

    public y(a payeesSelectActionsMapper, b payeesSelectItemSelectedMapper, b0 payeesSuggestedMapper, z payeesSelectableListMapper) {
        Intrinsics.checkNotNullParameter(payeesSelectActionsMapper, "payeesSelectActionsMapper");
        Intrinsics.checkNotNullParameter(payeesSelectItemSelectedMapper, "payeesSelectItemSelectedMapper");
        Intrinsics.checkNotNullParameter(payeesSuggestedMapper, "payeesSuggestedMapper");
        Intrinsics.checkNotNullParameter(payeesSelectableListMapper, "payeesSelectableListMapper");
        this.f6606a = payeesSelectItemSelectedMapper;
        this.f6607b = payeesSuggestedMapper;
        this.f6608c = payeesSelectableListMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        List list;
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.d;
        List list2 = (List) iii.c.f(data, new amf.i(11), new an4.g(1), new a15.n(domainState, this, 18));
        Set set = domainState.f6595c;
        boolean z = !set.isEmpty();
        PayeesFlowType payeesFlowType = domainState.e;
        TextNavBarMenuItem textNavBarMenuItem = null;
        if (payeesFlowType instanceof PayeesFlowType.RequireAuthentication) {
            textLocalisedClause = new TextLocalisedClause(R$string.security_hub_payees_select_sheet_action_confrim, null, null, 14);
        } else {
            if (!(payeesFlowType instanceof PayeesFlowType.Blocked)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.security_hub_payees_select_sheet_block_action, null, null, 14);
        }
        m mVar = (m) data.getContent();
        List list3 = mVar != null ? mVar.f6590a : null;
        if (list3 != null && !list3.isEmpty()) {
            m mVar2 = (m) data.getContent();
            textNavBarMenuItem = (mVar2 == null || (list = mVar2.f6590a) == null || list.size() != set.size()) ? new TextNavBarMenuItem("LIST_ID_MENU_ITEM_SELECT_ALL", new TextLocalisedClause(R$string.security_hub_payees_select_action_select_all, null, null, 14), null, null, 12) : new TextNavBarMenuItem("LIST_ID_MENU_ITEM_DESELECT", new TextLocalisedClause(R$string.security_hub_payees_select_action_deselect, null, null, 14), null, null, 12);
        }
        return new s(textLocalisedClause, list2, zhm.v.l(textNavBarMenuItem), z);
    }
}
