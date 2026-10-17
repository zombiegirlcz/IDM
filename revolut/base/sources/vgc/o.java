package vgc;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.c {
    public LinkedHashMap u;
    public p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f288833w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f288834x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f288835y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, gim.c cVar) {
        super(cVar);
        this.f288834x = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f288833w = obj2;
        this.f288835y |= Integer.MIN_VALUE;
        return this.f288834x.b(null, this);
    }
}
