package com.revolut.trading.orders.ui.trade.model;

import com.revolut.trading.orders.ui.trade.model.ExtendedHoursStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static final boolean a(ExtendedHoursStatus extendedHoursStatus) {
        Intrinsics.checkNotNullParameter(extendedHoursStatus, "<this>");
        return (extendedHoursStatus instanceof ExtendedHoursStatus.OptedIn) && ((ExtendedHoursStatus.OptedIn) extendedHoursStatus).f107063a;
    }
}
