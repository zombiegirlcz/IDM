package h4k;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.c {
    public AccountId u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public opf.b f149384w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f149385x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f149386y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, gim.c cVar) {
        super(cVar);
        this.f149386y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f149385x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f149386y.f(null, this, null);
    }
}
