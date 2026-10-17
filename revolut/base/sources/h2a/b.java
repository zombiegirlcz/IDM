package h2a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f148754w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f148755x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f148754w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f148755x |= Integer.MIN_VALUE;
        return this.f148754w.a(this);
    }
}
