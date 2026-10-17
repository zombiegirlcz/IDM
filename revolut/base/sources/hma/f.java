package hma;

import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public GlobalThemeDeclaration u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f153596w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f153597x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f153596w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f153597x |= Integer.MIN_VALUE;
        return this.f153596w.f(null, null, this);
    }
}
