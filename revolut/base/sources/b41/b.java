package b41;

import java.time.Instant;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.c {
    public hlm.a u;
    public Instant v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f12145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f12146y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f12146y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f12145x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f12146y.b(this);
    }
}
