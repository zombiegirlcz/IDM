package o3d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.c {
    public FavouritesAssetTypeKey u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f221790w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f221791x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f221792y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f221792y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f221791x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f221792y.g3(null, null, null, this);
    }
}
