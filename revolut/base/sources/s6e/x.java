package s6e;

import com.revolut.feature.subaccount.api.models.Subaccount;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends gim.c {
    public String u;
    public Subaccount v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f260316w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f260317x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f260318y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, gim.c cVar) {
        super(cVar);
        this.f260317x = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f260316w = obj2;
        this.f260318y |= Integer.MIN_VALUE;
        return this.f260317x.x(null, null, null, null, null, null, this);
    }
}
