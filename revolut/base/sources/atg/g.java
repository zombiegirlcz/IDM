package atg;

import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.c {
    public Iterator u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f9047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f9048x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9049y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f9048x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f9047w = obj2;
        this.f9049y |= Integer.MIN_VALUE;
        return this.f9048x.a(null, this);
    }
}
