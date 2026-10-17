package k2j;

import h2j.h;
import h30.q;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.c {
    public xi0.b u;
    public h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f180603w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f180604x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f180605y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, gim.c cVar) {
        super(cVar);
        this.f180604x = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f180603w = obj2;
        this.f180605y |= Integer.MIN_VALUE;
        return this.f180604x.v0(null, null, this);
    }
}
