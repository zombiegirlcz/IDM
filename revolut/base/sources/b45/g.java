package b45;

import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public String u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f12175w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f12176x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12177y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f12176x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f12175w = obj2;
        this.f12177y |= Integer.MIN_VALUE;
        return this.f12176x.f(null, this);
    }
}
