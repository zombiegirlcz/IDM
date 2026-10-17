package pfc;

import com.revolut.feature.revpro.lite_pos.impl.data.repository.CatalogueDataProviderImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CatalogueDataProviderImpl f235574w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f235575x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CatalogueDataProviderImpl catalogueDataProviderImpl, gim.c cVar) {
        super(cVar);
        this.f235574w = catalogueDataProviderImpl;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f235575x |= Integer.MIN_VALUE;
        return this.f235574w.c(null, this);
    }
}
