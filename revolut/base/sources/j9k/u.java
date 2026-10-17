package j9k;

import com.revolut.feature.transfer.core.models.FundingSource;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends gim.c {
    public a3 u;
    public FundingSource v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dj0.d f172386w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f172387x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ v f172388y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, gim.c cVar) {
        super(cVar);
        this.f172388y = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f172387x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f172388y.a(null, null, null, this);
    }
}
