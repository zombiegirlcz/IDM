package f53;

import gim.c;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends c {
    public String u;
    public Integer v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f132260w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f132261x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f132262y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f132261x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f132260w = obj2;
        this.f132262y |= Integer.MIN_VALUE;
        return this.f132261x.a(null, null, null, this);
    }
}
