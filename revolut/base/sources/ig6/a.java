package ig6;

import gim.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public final /* synthetic */ f61.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f161081w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f61.a aVar, c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f161081w |= Integer.MIN_VALUE;
        return this.v.w(null, null, null, null, this);
    }
}
