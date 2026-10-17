package yxb;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f317618w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f317619x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(s sVar, gim.c cVar) {
        super(cVar);
        this.f317618w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f317619x |= Integer.MIN_VALUE;
        return this.f317618w.s(this);
    }
}
