package ndi;

import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import gim.c;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends c {
    public RevPointsOptInSource u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f214374w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f214375x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f214374w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f214375x |= Integer.MIN_VALUE;
        return this.f214374w.b(null, this);
    }
}
