package xn2;

import gim.c;
import smd.s;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f307309w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s sVar, c cVar) {
        super(cVar);
        this.v = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f307309w |= Integer.MIN_VALUE;
        return s.b(this.v, this);
    }
}
