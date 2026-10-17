package jb8;

import r10.f;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f172608w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f172609x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.f172608w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f172609x |= Integer.MIN_VALUE;
        return this.f172608w.w0((String) null, this);
    }
}
