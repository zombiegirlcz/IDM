package flf;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public Map u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f135953w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f135954x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f135953w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f135954x |= Integer.MIN_VALUE;
        return this.f135953w.Z2(this);
    }
}
