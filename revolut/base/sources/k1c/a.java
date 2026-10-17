package k1c;

import com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends gim.c {
    public RevPointsRimWidgetContext u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f180203w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f180204x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f180205y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f180204x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f180203w = obj2;
        this.f180205y |= Integer.MIN_VALUE;
        return this.f180204x.i(null, null, null, this);
    }
}
