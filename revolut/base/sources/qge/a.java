package qge;

import lai.d;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.c {
    public d u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f245784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f245785x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f245786y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f245786y = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f245785x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f245786y.a(null, this);
    }
}
