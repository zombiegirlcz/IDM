package com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update;

import com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.CFACClaimStatusUpdateScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.a;
import jki.g;
import jki.i;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zk7.d;
import zk7.e;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CFACClaimStatusUpdateScreenContract$InputData f75149p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f75150q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p stateMapper, CFACClaimStatusUpdateScreenContract$InputData inputData) {
        a dVar;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f75149p = inputData;
        if (inputData instanceof CFACClaimStatusUpdateScreenContract$InputData.InReviewProgress) {
            dVar = a.C0500a.f75148a;
        } else {
            if (!(inputData instanceof CFACClaimStatusUpdateScreenContract$InputData.DeclinedProgress)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = new d(((CFACClaimStatusUpdateScreenContract$InputData.DeclinedProgress) inputData).f75145c);
        }
        this.f75150q = dVar;
    }

    @Override // jki.g
    public final i r2() {
        return this.f75150q;
    }
}
