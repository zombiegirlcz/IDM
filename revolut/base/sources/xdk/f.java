package xdk;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public AccountId u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f304497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f304498x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f304499y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f304499y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f304498x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f304499y.b3(null, null, null, this);
    }
}
