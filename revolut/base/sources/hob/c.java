package hob;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public String u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f154261w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f154262x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f154263y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f154263y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f154262x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f154263y.c(null, null, null, this);
    }
}
