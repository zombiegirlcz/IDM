package com.revolut.feature.external_accounts.impl.ui.link.flow.link_account;

import com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$InputData;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public LinkAccountFlowContract$InputData.PreselectedInstitution u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f73014w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f73015x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f73014w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f73015x |= Integer.MIN_VALUE;
        return d.I2(this.f73014w, null, this);
    }
}
