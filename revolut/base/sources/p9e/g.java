package p9e;

import com.revolut.feature.subscriptions.impl.block_card_subscription.what_will_happen.WhatWillHappenScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f234309p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper, WhatWillHappenScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f234309p = new c(inputData.f89170a);
    }

    @Override // jki.g
    public final i r2() {
        return this.f234309p;
    }
}
