package s17;

import gim.i;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public Set u;
    public i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i f259104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f259105x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f259106y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f259106y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f259105x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f259106y.e(null, null, null, this);
    }
}
