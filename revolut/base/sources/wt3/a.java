package wt3;

import gim.c;
import hw3.e;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends c {
    public ju3.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f299766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f299767x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, c cVar) {
        super(cVar);
        this.f299766w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f299767x |= Integer.MIN_VALUE;
        return e.c(this.f299766w, null, null, this);
    }
}
