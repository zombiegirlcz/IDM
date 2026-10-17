package i9g;

import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.c {
    public String u;
    public TravelHotelsBookingAmendmentStatus v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f159783w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f159784x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f159785y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, gim.c cVar) {
        super(cVar);
        this.f159784x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f159783w = obj2;
        this.f159785y |= Integer.MIN_VALUE;
        return this.f159784x.a(null, null, this);
    }
}
