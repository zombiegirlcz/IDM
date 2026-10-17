package pjl;

import android.accounts.Account;
import com.revolut.sso.api.models.UserInfo;

/* JADX INFO: loaded from: classes12.dex */
public final class x0 extends gim.c {
    public Account u;
    public UserInfo v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f236865w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z0 f236866x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f236867y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(z0 z0Var, gim.c cVar) {
        super(cVar);
        this.f236866x = z0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f236865w = obj2;
        this.f236867y |= Integer.MIN_VALUE;
        return this.f236866x.n(null, null, this);
    }
}
