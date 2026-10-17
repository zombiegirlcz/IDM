package d7e;

import com.revolut.feature.subaccount.api.models.Subaccount;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public Subaccount.Junior u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f111938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f111939x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f111938w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f111939x |= Integer.MIN_VALUE;
        return this.f111938w.a(null, this);
    }
}
