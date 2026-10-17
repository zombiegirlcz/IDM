package y20;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class v extends gim.c {
    public int A;
    public r10.q u;
    public Map v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f310552w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public u10.q f310553x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f310554y;
    public final /* synthetic */ uvl.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(uvl.c cVar, gim.c cVar2) {
        super(cVar2);
        this.z = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f310554y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.h(null, null, null, this);
    }
}
