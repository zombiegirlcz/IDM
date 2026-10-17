package h4g;

import b4g.q;
import com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmParams;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends gim.c {
    public q u;
    public BookingConfirmParams v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f149350w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f149351x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f149352y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f149351x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f149350w = obj2;
        this.f149352y |= Integer.MIN_VALUE;
        return this.f149351x.a(null, this);
    }
}
