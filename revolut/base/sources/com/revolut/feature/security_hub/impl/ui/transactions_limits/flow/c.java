package com.revolut.feature.security_hub.impl.ui.transactions_limits.flow;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$PagerItem;
import fwc.k;
import fwc.l;
import fwc.m;
import gwc.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements n {
    @Override // cli.n
    public final o c(j jVar) {
        m kVar;
        q qVar;
        TransactionsLimitsFlowContract$FlowState domainState = (TransactionsLimitsFlowContract$FlowState) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<TransactionsLimitsFlowContract$PagerItem> list = domainState.f85754b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (TransactionsLimitsFlowContract$PagerItem transactionsLimitsFlowContract$PagerItem : list) {
            if (transactionsLimitsFlowContract$PagerItem instanceof TransactionsLimitsFlowContract$PagerItem.Personal) {
                qVar = new q(TransactionsLimitsFlowContract$PagerItem.Personal.f85757a.getF103057c(), new t(new TextLocalisedClause(R$string.security_hub_transactions_limits_screen_tab_personal, null, null, 14)), 50);
            } else {
                if (!(transactionsLimitsFlowContract$PagerItem instanceof TransactionsLimitsFlowContract$PagerItem.Joint)) {
                    throw new NoWhenBranchMatchedException();
                }
                qVar = new q(TransactionsLimitsFlowContract$PagerItem.Joint.f85756a.getF103057c(), new t(new TextLocalisedClause(R$string.security_hub_transactions_limits_screen_tab_joint, null, null, 14)), 50);
            }
            arrayList.add(qVar);
        }
        String str = domainState.f85753a;
        boolean z = domainState.f85754b.size() > 1;
        TransactionsLimitsScreenContract$LimitFlowType transactionsLimitsScreenContract$LimitFlowType = domainState.f85755c;
        boolean z3 = domainState.d;
        if (transactionsLimitsScreenContract$LimitFlowType == null) {
            kVar = l.f138610a;
        } else if (transactionsLimitsScreenContract$LimitFlowType.equals(TransactionsLimitsScreenContract$LimitFlowType.Singapore.f85737a)) {
            kVar = new k(new TextLocalisedClause(R$string.security_hub_transactions_limits_title, null, null, 14), f0.f322471a);
        } else if (transactionsLimitsScreenContract$LimitFlowType.equals(TransactionsLimitsScreenContract$LimitFlowType.WalletLimits.f85738a)) {
            kVar = new k(new TextLocalisedClause(R$string.security_hub_multiple_limits_screen_title, null, null, 14), f0.f322471a);
        } else {
            if (!(transactionsLimitsScreenContract$LimitFlowType instanceof TransactionsLimitsScreenContract$LimitFlowType.SepaExtended)) {
                throw new NoWhenBranchMatchedException();
            }
            kVar = new k(z3 ? new TextLocalisedClause(R$string.security_hub_transactions_limits_screen_title, null, null, 14) : new TextLocalisedClause(R$string.security_hub_transactions_limits_title, null, null, 14), u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "TRANSACTIONS_SEPA_EXTENDED_LIMIT_MENU_BUTTON_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
        }
        return new g(arrayList, str, z, kVar);
    }
}
