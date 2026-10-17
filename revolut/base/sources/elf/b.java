package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f127296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f127297x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.f127296w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f127297x |= Integer.MIN_VALUE;
        return this.f127296w.b3(null, this);
    }
}
