package arg;

import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.c {
    public Iterator u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f8710w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f8711x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8712y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f8711x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f8710w = obj2;
        this.f8712y |= Integer.MIN_VALUE;
        return this.f8711x.b(null, this);
    }
}
