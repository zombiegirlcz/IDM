package h4k;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public AccountId u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f149377w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f149378x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f149379y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, gim.c cVar) {
        super(cVar);
        this.f149378x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f149377w = obj2;
        this.f149379y |= Integer.MIN_VALUE;
        return this.f149378x.d(null, null, null, null, this);
    }
}
