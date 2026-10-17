package tml;

import com.revolut.sso.api.models.SsoChangeClaimMode;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SsoChangeClaimMode.Multiple f272263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f272264x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.email.change_flow.a f272265y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.sso.impl.ui.email.change_flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f272265y = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f272264x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.sso.impl.ui.email.change_flow.a.I2(this.f272265y, null, this);
    }
}
