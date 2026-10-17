package com.revolut.retail.feature.api.income_sorter.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/api/income_sorter/models/ConflictingIncomeSorterExistsException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConflictingIncomeSorterExistsException extends Exception {
    public ConflictingIncomeSorterExistsException() {
        this(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConflictingIncomeSorterExistsException(int i) {
        super("An active income sorter already exists for this income source");
        Intrinsics.checkNotNullParameter("An active income sorter already exists for this income source", "message");
    }
}
