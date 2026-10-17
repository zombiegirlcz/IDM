package t0f;

import gim.c;
import yt8.i;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends c {
    public i u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f267017w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267018x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f267017w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f267018x |= Integer.MIN_VALUE;
        return this.f267017w.a(null, this);
    }
}
