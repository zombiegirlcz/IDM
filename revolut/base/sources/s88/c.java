package s88;

import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public HomeFeedWidgetContext.Junior u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f260930w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f260931x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f260930w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f260931x |= Integer.MIN_VALUE;
        return this.f260930w.k(null, this);
    }
}
