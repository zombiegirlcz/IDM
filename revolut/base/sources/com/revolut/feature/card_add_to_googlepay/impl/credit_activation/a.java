package com.revolut.feature.card_add_to_googlepay.impl.credit_activation;

import aab.b;
import com.revolut.kompot.common.flow.WrapperFlowImpl;
import gc0.c;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    public a(hw2.a bottomSheetProvider) {
        Intrinsics.checkNotNullParameter(bottomSheetProvider, "bottomSheetProvider");
    }

    public final WrapperFlowImpl a(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return c.b(hw2.a.a(card), new b(this));
    }
}
