package mod;

import com.revolut.retail.feature.api.trips.models.Trip;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.c {
    public Set u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Trip f207616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f207617x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f207618y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, gim.c cVar) {
        super(cVar);
        this.f207618y = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f207617x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f207618y.c(null, this);
    }
}
