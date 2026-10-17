package com.revolut.feature.rev_points.impl.ui.transactions.details;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n0c.h;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f83853a = new a();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        h update = (h) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        return new h(new Data(null, new IllegalStateException("Transaction not found"), false, 5, null), null);
    }
}
