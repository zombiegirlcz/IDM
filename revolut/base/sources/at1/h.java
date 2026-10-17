package at1;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.c {
    public boolean u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Function1 f8986w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f8987x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f8988y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, gim.c cVar) {
        super(cVar);
        this.f8988y = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f8987x = obj2;
        this.z |= Integer.MIN_VALUE;
        return j.Z2(this.f8988y, false, null, null, this);
    }
}
