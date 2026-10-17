package x76;

import b4j.g;
import gim.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f303143w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, c cVar) {
        super(cVar);
        this.v = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f303143w |= Integer.MIN_VALUE;
        return this.v.d(this);
    }
}
