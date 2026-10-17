package opf;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends gim.c {
    public k1j.a u;
    public AccountId v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public io3.d f227632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f227633x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z f227634y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, gim.c cVar) {
        super(cVar);
        this.f227634y = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f227633x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f227634y.d(null, this, null, null);
    }
}
