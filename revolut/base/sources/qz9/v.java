package qz9;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kbb.c f250452w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f250453x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kbb.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f250452w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f250453x |= Integer.MIN_VALUE;
        return this.f250452w.y(this);
    }
}
