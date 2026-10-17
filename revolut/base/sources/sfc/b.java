package sfc;

import lr6.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public i u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f262389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f262390x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.f262389w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f262390x |= Integer.MIN_VALUE;
        return this.f262389w.b(this);
    }
}
