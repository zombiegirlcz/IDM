package com.revolut.feature.topup_screen.api.topup_limits;

import aue.c;
import aue.i;
import aue.j;
import aue.k;
import aue.l;
import com.revolut.feature.topup_screen.api.topup_limits.TopUpV2LimitUiModel;
import dj0.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static TopUpV2LimitUiModel a(l domainModel) {
        Intrinsics.checkNotNullParameter(domainModel, "domainModel");
        if (!(domainModel instanceof k)) {
            if (!(domainModel instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            i iVar = (i) domainModel;
            return new TopUpV2LimitUiModel.SingleValueLimitUiModel(iVar.f9809a, iVar.f9810b, iVar.f9811c);
        }
        k kVar = (k) domainModel;
        c cVar = kVar.f9815a;
        d dVar = kVar.f9816b;
        d dVar2 = kVar.f9817c;
        d dVar3 = kVar.d;
        j jVar = kVar.e;
        return new TopUpV2LimitUiModel.UpperBoundLimitUiModel(cVar, dVar, dVar2, dVar3, jVar != null ? new TopUpV2LimitUiModel.UpperBoundLimitUiModel.LimitInTopUpCurrency(jVar.f9812a, jVar.f9813b, jVar.f9814c) : null);
    }
}
