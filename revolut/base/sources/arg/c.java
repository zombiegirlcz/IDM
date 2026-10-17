package arg;

import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public Iterator u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f8713w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f8714x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8715y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f8714x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f8713w = obj2;
        this.f8715y |= Integer.MIN_VALUE;
        return this.f8714x.a(null, this);
    }
}
