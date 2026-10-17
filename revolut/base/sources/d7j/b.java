package d7j;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public xi0.b u;
    public Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f111974w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f111975x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f111976y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, gim.c cVar) {
        super(cVar);
        this.f111975x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f111974w = obj2;
        this.f111976y |= Integer.MIN_VALUE;
        return this.f111975x.a(null, null, null, this);
    }
}
