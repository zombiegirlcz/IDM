package zha;

import com.revolut.kompot.bridge.navigation.KompotDestination;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public KompotDestination u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f322376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f322377x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f322376w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f322377x |= Integer.MIN_VALUE;
        return this.f322376w.d(null, this);
    }
}
