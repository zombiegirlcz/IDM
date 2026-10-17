package com.revolut.feature.credit.application.plugins.impl.ui.waiting_list;

import d8l.d;
import hw3.n;
import kotlin.jvm.internal.Intrinsics;
import n8i.e;
import nj4.f;
import oki.h;
import q06.l;
import yi5.b;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements nj4.a {
    public final n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WaitingListFlowContract$InputData f68520p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f68521q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f68522r;

    public a(n waitingListInteractor, WaitingListFlowContract$InputData flowInputData, l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(waitingListInteractor, "waitingListInteractor");
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.o = waitingListInteractor;
        this.f68520p = flowInputData;
        this.f68521q = deeplinkRouter;
        this.f68522r = d.a(this, new e(this, 27));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a r17, gim.c r18) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a.I2(com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new f(this, null, 1), new b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68522r;
    }
}
