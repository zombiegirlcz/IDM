package ej6;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f126720w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f126721x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, gim.c cVar) {
        super(cVar);
        this.f126720w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f126721x |= Integer.MIN_VALUE;
        return this.f126720w.a(null, this);
    }
}
