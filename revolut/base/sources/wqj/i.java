package wqj;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.c {
    public String u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Map f299472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f299473x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f299474y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f299474y = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f299473x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f299474y.b(null, null, null, this);
    }
}
