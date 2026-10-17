package n7e;

import com.revolut.feature.subaccount.api.models.Subaccount;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.c {
    public Subaccount u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f213077w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f213078x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f213077w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f213078x |= Integer.MIN_VALUE;
        return this.f213077w.a(null, this);
    }
}
