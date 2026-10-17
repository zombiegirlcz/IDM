package com.revolut.feature.apm.core.ui.impl.ui.transfer.amount;

import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends gim.c {
    public TransferAmountContract$InputData.NewTransfer u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f62435w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f62436x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f62437y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f62436x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f62435w = obj2;
        this.f62437y |= Integer.MIN_VALUE;
        return this.f62436x.a(null, this);
    }
}
