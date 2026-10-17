package odh;

import p5d.f;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.c {
    public p5d.b u;
    public f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f224471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f224472x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f224473y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f224472x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f224471w = obj2;
        this.f224473y |= Integer.MIN_VALUE;
        return this.f224472x.b3(null, null, this);
    }
}
