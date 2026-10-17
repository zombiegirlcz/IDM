package opf;

import com.revolut.feature.location.api.domain.models.location.LocationDomain;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 extends gim.c {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ lal.a C;
    public int D;
    public wj0.b u;
    public lal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LocationDomain f227605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LocationDomain f227606x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f227607y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(lal.a aVar, gim.c cVar) {
        super(cVar);
        this.C = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return lal.a.s(this.C, null, this);
    }
}
