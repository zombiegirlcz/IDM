package ip9;

import g2e.t;
import gim.c;
import jp9.r;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {
    public r u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f167682w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t f167683x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f167684y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t tVar, c cVar) {
        super(cVar);
        this.f167683x = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f167682w = obj2;
        this.f167684y |= Integer.MIN_VALUE;
        return this.f167683x.r(null, this);
    }
}
