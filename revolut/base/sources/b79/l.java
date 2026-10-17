package b79;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.c {
    public LinkedHashSet u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f12957w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12958x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.f12957w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f12958x |= Integer.MIN_VALUE;
        return this.f12957w.c(null, this);
    }
}
