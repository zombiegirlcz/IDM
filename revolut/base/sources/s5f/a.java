package s5f;

import gim.c;
import t5f.j;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends c {
    public j u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f260066w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f260067x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f260066w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f260067x |= Integer.MIN_VALUE;
        return b.a(this.f260066w, null, this);
    }
}
