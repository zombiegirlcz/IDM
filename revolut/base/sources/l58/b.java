package l58;

import java.util.List;
import nb6.p;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public List u;
    public p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public zm3.a f192187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f192188x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f192189y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f192189y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f192188x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f192189y.Z2(null, null, this);
    }
}
