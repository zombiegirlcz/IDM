package com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow;

import bwc.d;
import bwc.h;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.u;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.TransactionsDayNightLimitsFlowContract$PagerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements n {
    @Override // cli.n
    public final o c(j jVar) {
        q qVar;
        TransactionsDayNightLimitsFlowContract$FlowState domainState = (TransactionsDayNightLimitsFlowContract$FlowState) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f85711b;
        d dVar = domainState.f85712c;
        List<TransactionsDayNightLimitsFlowContract$PagerItem> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (TransactionsDayNightLimitsFlowContract$PagerItem transactionsDayNightLimitsFlowContract$PagerItem : list2) {
            if (transactionsDayNightLimitsFlowContract$PagerItem instanceof TransactionsDayNightLimitsFlowContract$PagerItem.Day) {
                qVar = new q(TransactionsDayNightLimitsFlowContract$PagerItem.Day.f85714a.getF79006a(), new u(new TextLocalisedClause(R$string.security_hub_multiple_limits_screen_time_range_daytime, null, null, 14), R$drawable.uikit_icn_24_sun), 50);
            } else if (transactionsDayNightLimitsFlowContract$PagerItem instanceof TransactionsDayNightLimitsFlowContract$PagerItem.Night) {
                qVar = new q(TransactionsDayNightLimitsFlowContract$PagerItem.Night.f85715a.getF79006a(), new u(new TextLocalisedClause(R$string.security_hub_multiple_limits_screen_time_range_nightime, null, null, 14), R$drawable.uikit_icn_24_moon), 50);
            } else if (transactionsDayNightLimitsFlowContract$PagerItem instanceof TransactionsDayNightLimitsFlowContract$PagerItem.Daily) {
                qVar = new q(TransactionsDayNightLimitsFlowContract$PagerItem.Daily.f85713a.getF79006a(), new u(new TextLocalisedClause(R$string.security_hub_multiple_limits_screen_time_range_daily, null, null, 14), R$drawable.uikit_icn_24_time_outline), 50);
            } else {
                TransactionsDayNightLimitsFlowContract$PagerItem.Other other = TransactionsDayNightLimitsFlowContract$PagerItem.Other.f85716a;
                if (!Intrinsics.f(transactionsDayNightLimitsFlowContract$PagerItem, other)) {
                    throw new NoWhenBranchMatchedException();
                }
                qVar = new q(other.getF79006a(), new u(new TextLocalisedClause(R$string.security_hub_multiple_limits_tab_others, null, null, 14), R$drawable.uikit_icn_24_more_ios), 50);
            }
            arrayList.add(qVar);
        }
        String str = domainState.f85710a;
        TextLocalisedClause textLocalisedClause = dVar == d.INDIA ? new TextLocalisedClause(R$string.security_hub_multiple_limits_india_screen_subtitle, null, null, 14) : dVar == d.MEXICO ? new TextLocalisedClause(R$string.security_hub_transactions_limits_screen_caption, zhm.u.c(new TextLocalisedClause(R$string.security_hub_transactions_limits_screen_learn_more, null, new Click(30, (Integer) null, (Object) null, "LEARN_MORE_ITEM_LIST_ID", false), 10)), null, 12) : new TextLocalisedClause(R$string.security_hub_multiple_limits_timezone_description, null, null, 14);
        int i = dVar == null ? -1 : bwc.j.f19316a[dVar.ordinal()];
        boolean z = true;
        if (i != -1 && i != 1) {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        return new h(arrayList, str, textLocalisedClause, z);
    }
}
