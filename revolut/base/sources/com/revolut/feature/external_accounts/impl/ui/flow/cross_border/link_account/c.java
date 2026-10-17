package com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account;

import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$InputData;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public CrossBorderLinkAccountFlowContract$InputData.PreselectedInstitution u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f72891w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f72892x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f72891w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f72892x |= Integer.MIN_VALUE;
        return d.I2(this.f72891w, null, this);
    }
}
