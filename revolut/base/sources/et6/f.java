package et6;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.c {
    public AtomicReference u;
    public AtomicReference v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AtomicInteger f129220w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f129221x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f129222y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f129222y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f129221x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f129222y.g(this);
    }
}
