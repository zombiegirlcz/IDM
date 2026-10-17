package ovj;

import com.revolut.retail.feature.api.travel_trips.widget.TripItineraryWidgetContext;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public TripItineraryWidgetContext u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f230230w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f230231x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f230232y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f230231x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f230230w = obj2;
        this.f230232y |= Integer.MIN_VALUE;
        return this.f230231x.i(null, null, null, this);
    }
}
