package ifj;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.c {
    public Iterator u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f161018w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f161019x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f161020y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, gim.c cVar) {
        super(cVar);
        this.f161019x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f161018w = obj2;
        this.f161020y |= Integer.MIN_VALUE;
        return this.f161019x.b(this);
    }
}
