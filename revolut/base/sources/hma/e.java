package hma;

import com.revolut.feature.uipersonalisation.api.models.ColorThemeOption;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public ColorThemeOption u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f153594w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f153595x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f153594w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f153595x |= Integer.MIN_VALUE;
        return this.f153594w.e(this);
    }
}
