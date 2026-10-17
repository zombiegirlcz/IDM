package lw5;

import gim.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f200407w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f200408x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f200407w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f200408x |= Integer.MIN_VALUE;
        return this.f200407w.e(null, this);
    }
}
