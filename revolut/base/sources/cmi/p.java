package cmi;

import skm.g0;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.c {
    public g0 u;
    public e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hlm.c f25296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f25297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u f25298y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, gim.c cVar) {
        super(cVar);
        this.f25298y = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f25297x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f25298y.a(this);
    }
}
