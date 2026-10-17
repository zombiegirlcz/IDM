package nx1;

import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends gim.c {
    public List u;
    public n02.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f220073w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f220074x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f220075y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, gim.c cVar) {
        super(cVar);
        this.f220074x = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f220073w = obj2;
        this.f220075y |= Integer.MIN_VALUE;
        return u.e(this.f220074x, null, null, this);
    }
}
