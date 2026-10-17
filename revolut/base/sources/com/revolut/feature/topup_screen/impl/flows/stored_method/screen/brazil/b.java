package com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import uxe.m;
import uxe.n;
import uxe.q;
import w4l.i;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements n {
    public final BrazilStoredMethodDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sve.a f90816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f90817q;

    public b(q stateMapper, BrazilStoredMethodDetailsScreenContract$InputData inputData, sve.a storedMethodDetailsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(storedMethodDetailsInteractor, "storedMethodDetailsInteractor");
        this.o = inputData;
        this.f90816p = storedMethodDetailsInteractor;
        this.f90817q = d.b(this, new m(new Data(null, null, true, 3, null), h0.f322473a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String accountId = this.o.f90806a;
        sve.a aVar = this.f90816p;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        zue.a aVar2 = aVar.f265860a;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, aVar2.d.b(accountId, loadingStrategy), null, null, new up2.q(this, null, 12), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f90817q;
    }
}
