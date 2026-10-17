package l24;

import ft3.d1;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.c {
    public String u;
    public d1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f191613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f191614x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f191615y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f191614x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f191613w = obj2;
        this.f191615y |= Integer.MIN_VALUE;
        return this.f191614x.a(null, this);
    }
}
