package pjl;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.c {
    public List u;
    public bjl.p0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f236808w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f236809x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f236810y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f236809x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f236808w = obj2;
        this.f236810y |= Integer.MIN_VALUE;
        return g.a(this.f236809x, null, this);
    }
}
