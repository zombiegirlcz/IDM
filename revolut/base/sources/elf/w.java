package elf;

import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends gim.c {
    public a3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f127425w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f127426x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, gim.c cVar) {
        super(cVar);
        this.f127425w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f127426x |= Integer.MIN_VALUE;
        return this.f127425w.g3(this);
    }
}
