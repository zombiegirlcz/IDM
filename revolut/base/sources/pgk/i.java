package pgk;

import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.c {
    public HashMap u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f235990w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f235991x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f235990w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f235991x |= Integer.MIN_VALUE;
        return this.f235990w.j(null, this);
    }
}
