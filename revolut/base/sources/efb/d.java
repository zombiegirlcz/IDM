package efb;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public Iterator u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f125303w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f125304x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f125305y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f125304x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f125303w = obj2;
        this.f125305y |= Integer.MIN_VALUE;
        return this.f125304x.a(null, this);
    }
}
