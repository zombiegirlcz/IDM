package mkf;

import tof.t3;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public t3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f206224w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f206225x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f206224w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f206225x |= Integer.MIN_VALUE;
        return c.a(this.f206224w, null, null, this);
    }
}
