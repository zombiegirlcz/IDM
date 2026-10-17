package ywj;

import bjl.c0;
import com.revolut.sso.api.login.RevolutSsoApi$SignUpOutputData$Authenticated$Method;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.c {
    public final /* synthetic */ com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c A;
    public int B;
    public String u;
    public c0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RevolutSsoApi$SignUpOutputData$Authenticated$Method f317488w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public cdd.c f317489x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f317490y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar, gim.c cVar2) {
        super(cVar2);
        this.A = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c.J2(this.A, null, null, null, false, this);
    }
}
