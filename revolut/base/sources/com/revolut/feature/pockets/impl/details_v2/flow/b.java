package com.revolut.feature.pockets.impl.details_v2.flow;

import a01.e;
import ack.f;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import cu8.r0;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements aea.b {
    public final PocketDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r0 f80810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f80811q;

    public b(PocketDetailsFlowContract$InputData flowInputData, r0 kycRequiredActionTransformer) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.o = flowInputData;
        this.f80810p = kycRequiredActionTransformer;
        this.f80811q = d.a(this, new f(this, 4));
    }

    @Override // yki.j
    public final void M0() {
        l2(new e(this, null, 18), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f80811q;
    }
}
