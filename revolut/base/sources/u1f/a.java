package u1f;

import tsk.t;
import u2f.j;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.c {
    public j u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f276400w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t f276401x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f276402y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t tVar, gim.c cVar) {
        super(cVar);
        this.f276401x = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f276400w = obj2;
        this.f276402y |= Integer.MIN_VALUE;
        return this.f276401x.y(null, null, this);
    }
}
