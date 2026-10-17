package com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow;

import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import u7k.w;
import u83.f;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements um6.b {
    public final JapanEasyBankAuthorizationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wve.a f72950p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f72951q;

    public b(JapanEasyBankAuthorizationFlowContract$InputData inputData, wve.a japanInboundOpenBankingInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(japanInboundOpenBankingInteractor, "japanInboundOpenBankingInteractor");
        this.o = inputData;
        this.f72950p = japanInboundOpenBankingInteractor;
        this.f72951q = d.a(this, new w(this, 28));
    }

    @Override // yki.j
    public final void M0() {
        n2(new f(this, null, 14), new whi.b(6));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        i iVar = this.f72951q;
        if (iVar.d() != null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        iVar.n();
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72951q;
    }
}
