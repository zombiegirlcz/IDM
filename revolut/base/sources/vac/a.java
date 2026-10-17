package vac;

import com.revolut.feature.revolutpay.order_tracking.impl.data.service.RevolutPayDeliveryTrackingService;
import l70.e;
import lbc.d0;
import ne0.j;
import qac.i;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f287250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f287251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f287252c;
    public final voa.a d;
    public final ite.a e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f287253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f287254h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f287255j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f287256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f287257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f287258n;
    public final e4m.e o;

    public a(e eVar, ee0.a aVar, nj0.a aVar2, an0.c cVar, ite.a aVar3, voa.a aVar4) {
        this.f287250a = aVar;
        this.f287251b = cVar;
        this.f287252c = aVar2;
        this.d = aVar4;
        this.e = aVar3;
        this.f = eVar;
        int i = 6;
        this.f287253g = e4m.b.b(new v4d.a(this, 0, i));
        this.f287254h = e4m.b.b(new v4d.a(this, 1, i));
        this.i = e4m.b.b(new v4d.a(this, 2, i));
        this.f287255j = e4m.b.b(new v4d.a(this, 3, i));
        this.k = e4m.b.b(new v4d.a(this, 5, i));
        this.f287256l = e4m.b.b(new v4d.a(this, 6, i));
        this.f287257m = e4m.b.b(new v4d.a(this, 4, i));
        this.f287258n = e4m.b.b(new v4d.a(this, 7, i));
        this.o = e4m.b.b(new v4d.a(this, 8, i));
    }

    public final d0 a() {
        return new d0();
    }

    public final i b() {
        return new i((RevolutPayDeliveryTrackingService) this.f287254h.get(), (j) this.i.get(), (j) this.f287255j.get(), (ue0.c) this.f287253g.get());
    }
}
