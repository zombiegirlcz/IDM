package rf5;

import gim.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f253692w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f253693x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f253692w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f253693x |= Integer.MIN_VALUE;
        return this.f253692w.e(null, this);
    }
}
