package d11;

import gim.c;
import i4b.f;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f110478w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, c cVar) {
        super(cVar);
        this.v = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f110478w |= Integer.MIN_VALUE;
        return this.v.b(this);
    }
}
