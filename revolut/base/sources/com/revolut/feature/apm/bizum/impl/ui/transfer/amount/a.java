package com.revolut.feature.apm.bizum.impl.ui.transfer.amount;

import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData;
import gim.c;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends c {
    public BizumTransferAmountContract$InputData.NewTransfer u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f61613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f61614x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f61615y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f61614x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f61613w = obj2;
        this.f61615y |= Integer.MIN_VALUE;
        return this.f61614x.a(null, this);
    }
}
