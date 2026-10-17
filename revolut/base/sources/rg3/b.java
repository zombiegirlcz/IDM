package rg3;

import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f253998w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f253999x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f253998w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f253999x |= Integer.MIN_VALUE;
        return this.f253998w.a(null, this);
    }
}
