package xcb;

import gim.c;
import smd.s;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f304109w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s sVar, c cVar) {
        super(cVar);
        this.v = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f304109w |= Integer.MIN_VALUE;
        return this.v.q(this);
    }
}
