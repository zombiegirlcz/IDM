package x9c;

import com.revolut.feature.revolutpay.management.api.articles.RevolutPayArticleKey;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public RevolutPayArticleKey u;
    public RevolutPayArticleKey v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f303660w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f303661x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f303662y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f303661x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f303660w = obj2;
        this.f303662y |= Integer.MIN_VALUE;
        return this.f303661x.a(null, null, this);
    }
}
