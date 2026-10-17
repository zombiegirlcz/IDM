package nyb;

import com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext;

/* JADX INFO: loaded from: classes6.dex */
public final class j0 extends gim.c {
    public RevPointsRimWidgetContext u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k0 f220802w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f220803x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, gim.c cVar) {
        super(cVar);
        this.f220802w = k0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f220803x |= Integer.MIN_VALUE;
        return this.f220802w.a(null, this);
    }
}
