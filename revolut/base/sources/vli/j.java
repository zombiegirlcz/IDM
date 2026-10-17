package vli;

import com.revolut.domain.models.moneyrequest.MoneyRequest;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.c {
    public int A;
    public jf0.c u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MoneyRequest f290466w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f290467x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f290468y;
    public final /* synthetic */ k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.z = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f290468y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.e(null, this);
    }
}
