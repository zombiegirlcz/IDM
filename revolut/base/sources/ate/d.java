package ate;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public ArrayList u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9034w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f9035x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f9036y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f9036y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f9035x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f9036y.c(null, this);
    }
}
