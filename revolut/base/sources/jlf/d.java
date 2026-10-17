package jlf;

import tof.a3;
import tof.z6;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public a3 u;
    public z6 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e f175734w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f175735x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f175736y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f175736y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f175735x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f175736y.c(null, null, this);
    }
}
