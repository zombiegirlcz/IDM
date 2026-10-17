package pxc;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.c {
    public String u;
    public HashMap v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f240611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f240612x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f240613y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, gim.c cVar) {
        super(cVar);
        this.f240612x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f240611w = obj2;
        this.f240613y |= Integer.MIN_VALUE;
        return this.f240612x.b(null, null, null, this);
    }
}
