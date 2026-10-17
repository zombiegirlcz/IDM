package q6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public MoneyRequest u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f242667w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f242668x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f242667w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f242668x |= Integer.MIN_VALUE;
        return this.f242667w.a(null, this);
    }
}
