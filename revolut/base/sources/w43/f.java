package w43;

import com.revolut.core.model.account.AccountId;
import h93.l0;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public int A;
    public AccountId u;
    public l0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f294501w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f294502x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f294503y;
    public final /* synthetic */ i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, gim.c cVar) {
        super(cVar);
        this.z = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f294503y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.e(null, null, null, false, null, this);
    }
}
