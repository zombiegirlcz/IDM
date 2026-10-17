package pdi;

import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public Unit u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f235252w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f235253x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f235254y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f235253x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f235252w = obj2;
        this.f235254y |= Integer.MIN_VALUE;
        return this.f235253x.b(null, this);
    }
}
