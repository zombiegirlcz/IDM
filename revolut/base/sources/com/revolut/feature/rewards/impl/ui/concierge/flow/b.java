package com.revolut.feature.rewards.impl.ui.concierge.flow;

import ack.f;
import com.revolut.feature.rewards.impl.ui.concierge.flow.ConciergeAlbertineFlowContract$Step;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements aic.b {
    public final ConciergeAlbertineFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zja.a f84910p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f84911q;

    public b(ConciergeAlbertineFlowContract$InputData inputData, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.o = inputData;
        this.f84910p = productArticleInteractor;
        this.f84911q = d.a(this, new f(this, 16));
    }

    @Override // yki.j
    public final void M0() {
        String str = this.o.f84905a;
        if (str != null) {
            l2(new a(str, this, null), new yi5.b(26));
        } else {
            h.u2(this, this.f84911q, ConciergeAlbertineFlowContract$Step.Details.f84907a, null, 6);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f84911q;
    }
}
