package pjl;

import android.accounts.Account;

/* JADX INFO: loaded from: classes12.dex */
public final class w0 extends gim.c {
    public Account u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f236861w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f236862x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z0 f236863y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(z0 z0Var, gim.c cVar) {
        super(cVar);
        this.f236863y = z0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f236862x = obj2;
        this.z |= Integer.MIN_VALUE;
        return z0.d(this.f236863y, null, null, null, this);
    }
}
