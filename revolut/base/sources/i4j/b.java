package i4j;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public wi0.b u;
    public Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f158506w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f158507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f158508y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, gim.c cVar) {
        super(cVar);
        this.f158507x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f158506w = obj2;
        this.f158508y |= Integer.MIN_VALUE;
        return this.f158507x.b(null, null, this);
    }
}
