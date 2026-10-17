package pjl;

import android.accounts.Account;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public final class r0 extends gim.c {
    public String A;
    public Boolean B;
    public Integer C;
    public String D;
    public /* synthetic */ Object E;
    public final /* synthetic */ z0 F;
    public int G;
    public Account u;
    public Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public UUID f236844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public UUID f236845x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f236846y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(z0 z0Var, gim.c cVar) {
        super(cVar);
        this.F = z0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.E = obj2;
        this.G |= Integer.MIN_VALUE;
        return z0.c(this.F, null, this);
    }
}
