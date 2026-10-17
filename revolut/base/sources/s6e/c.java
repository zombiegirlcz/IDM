package s6e;

import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public RetailBackgroundKey u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f260267w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f260268x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f260267w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f260268x |= Integer.MIN_VALUE;
        return this.f260267w.a(null, this);
    }
}
