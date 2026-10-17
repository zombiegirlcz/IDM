package bt5;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public FavouritesAssetTypeKey u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f18283w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f18284x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18285y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f18284x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f18283w = obj2;
        this.f18285y |= Integer.MIN_VALUE;
        return this.f18284x.c(this);
    }
}
