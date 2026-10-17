package pjl;

import com.revolut.sso.api.accounts.RevolutAccount;
import com.revolut.sso.api.models.UserInfo;

/* JADX INFO: loaded from: classes12.dex */
public final class v0 extends gim.c {
    public final /* synthetic */ z0 A;
    public int B;
    public RevolutAccount u;
    public UserInfo v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f236858w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f236859x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f236860y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(z0 z0Var, gim.c cVar) {
        super(cVar);
        this.A = z0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.m(null, null, this);
    }
}
