package f8h;

import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public Iterator u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f132775w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f132776x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f132777y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f132776x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f132775w = obj2;
        this.f132777y |= Integer.MIN_VALUE;
        return this.f132776x.b(this);
    }
}
