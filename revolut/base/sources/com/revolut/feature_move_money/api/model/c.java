package com.revolut.feature_move_money.api.model;

import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import j8l.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import x5i.i;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {
    public static final Pair a(OrderMode.Threshold threshold) {
        Intrinsics.checkNotNullParameter(threshold, "<this>");
        d dVar = threshold.d;
        xi0.b bVar = threshold.f97233c;
        xi0.b bVar2 = threshold.f97232b;
        int i = i.f302990a[dVar.ordinal()];
        if (i == 1) {
            return new Pair(bVar, bVar2);
        }
        if (i == 2) {
            return new Pair(bVar2, bVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TransferScheduleData b(OrderMode orderMode) {
        Intrinsics.checkNotNullParameter(orderMode, "<this>");
        if (orderMode instanceof OrderMode.Scheduling) {
            return ((OrderMode.Scheduling) orderMode).f97229a;
        }
        if ((orderMode instanceof OrderMode.Market) || (orderMode instanceof OrderMode.Threshold) || (orderMode instanceof OrderMode.Automation)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
