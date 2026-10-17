package hma;

import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public GlobalThemeDeclaration u;
    public GlobalThemeDeclaration v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f153591w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f153592x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f153593y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f153592x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f153591w = obj2;
        this.f153593y |= Integer.MIN_VALUE;
        return this.f153592x.d(null, null, this);
    }
}
