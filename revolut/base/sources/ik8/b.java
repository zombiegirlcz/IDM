package ik8;

import edk.e;
import gim.c;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f161908w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f161909x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, c cVar) {
        super(cVar);
        this.f161908w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f161909x |= Integer.MIN_VALUE;
        return this.f161908w.b(null, this);
    }
}
