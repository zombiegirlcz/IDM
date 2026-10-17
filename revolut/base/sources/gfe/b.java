package gfe;

import bfe.d;
import gim.c;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f143396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f143397x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, c cVar) {
        super(cVar);
        this.f143396w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f143397x |= Integer.MIN_VALUE;
        return this.f143396w.b(null, this);
    }
}
