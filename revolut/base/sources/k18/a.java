package k18;

import j18.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.c {
    public o u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f180133w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f180134x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f180135y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f180134x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f180133w = obj2;
        this.f180135y |= Integer.MIN_VALUE;
        return this.f180134x.g(null, null, 0, this);
    }
}
