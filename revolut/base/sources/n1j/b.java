package n1j;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public int A;
    public Set u;
    public aim.o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public aim.o f211371w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f211372x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f211373y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.z = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f211373y = obj2;
        this.A |= Integer.MIN_VALUE;
        return e.a(this.z, null, this);
    }
}
