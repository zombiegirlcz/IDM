package v4d;

import a0e.w;
import a5d.i;
import a5d.l;
import android.content.Context;
import cli.n;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.messaging.t;
import com.revolut.feature.bank_account_switching.impl.data.network.BankAccountSwitchingService;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.payment_schedule.BankAccountSwitchingPaymentScheduleScreenContract$InputData;
import com.revolut.feature.retail.restaurants.impl.data.network.ReservationsService;
import com.revolut.feature.revolutpay.order_tracking.impl.data.service.RevolutPayDeliveryTrackingService;
import com.revolut.feature.revolutpay.order_tracking.impl.data.service.RevolutPayFlightBookingApiService;
import com.revolut.feature.security_hub.impl.ui.add_to_click_to_pay.AddToClickToPayScreenContract$InputData;
import com.revolut.ui_kit.nudge.di.NudgeApi$Toggles$NudgesDebugMode;
import com.youTransactor.uCube.rpc.Constants;
import ecm.q;
import eq5.x0;
import g3l.g;
import j1a.o;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import lo5.p;
import ne0.j;
import no.o1;
import om4.d0;
import retrofit2.Retrofit;
import up2.u;
import up5.g0;
import vc.s;
import vl3.h;
import vn2.a0;
import vn2.b0;
import vn2.c0;
import vn2.e0;
import vn2.z;
import w4d.k;
import y4d.m;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f286024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f286025c;

    public /* synthetic */ a(Object obj2, int i, int i2) {
        this.f286023a = i2;
        this.f286025c = obj2;
        this.f286024b = i;
    }

    @Override // phm.a
    public final Object get() {
        Object fVar;
        Object bVar;
        Object nVar;
        Object bVar2;
        Object aVar;
        Object hVar;
        Object jVar;
        switch (this.f286023a) {
            case 0:
                b bVar3 = (b) this.f286025c;
                int i = this.f286024b;
                if (i == 0) {
                    return new w4d.f((n) bVar3.f286028c.get(), bVar3.f286026a, bVar3.f286027b);
                }
                if (i == 1) {
                    return new k();
                }
                throw new AssertionError(i);
            case 1:
                c cVar = (c) this.f286025c;
                int i2 = this.f286024b;
                if (i2 == 0) {
                    return new com.revolut.feature.settings.preview.displayCurrency.a((n) cVar.f286030b.get(), cVar.f286029a);
                }
                if (i2 == 1) {
                    return new m();
                }
                throw new AssertionError(i2);
            case 2:
                e eVar = (e) this.f286025c;
                int i3 = this.f286024b;
                if (i3 == 0) {
                    return new i((n) eVar.f286034b.get(), eVar.f286033a);
                }
                if (i3 == 1) {
                    return new l();
                }
                throw new AssertionError(i3);
            case 3:
                v66.a aVar2 = (v66.a) this.f286025c;
                a31.a aVar3 = aVar2.d;
                a31.a aVar4 = aVar2.f286326c;
                int i5 = this.f286024b;
                if (i5 == 0) {
                    fVar = new w66.f(aVar2.f286324a, aVar2.f286325b, aVar4, aVar3, aVar2.e);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new AssertionError(i5);
                        }
                        w66.b bVar4 = (w66.b) ((w66.f) aVar2.f286328h.get()).b();
                        s.k(bVar4);
                        return bVar4;
                    }
                    fVar = new ae9.d(aVar4, aVar2.f, aVar3, aVar2.f286327g, aVar2.i, 8);
                }
                return fVar;
            case 4:
                v81.d dVar = (v81.d) this.f286025c;
                ee0.a aVar5 = dVar.f286705a;
                int i6 = this.f286024b;
                if (i6 == 0) {
                    return new u81.d((ue0.c) dVar.f286706b.get());
                }
                if (i6 != 1) {
                    throw new AssertionError(i6);
                }
                je0.d mapper = aVar5.d();
                s.j(mapper);
                xe0.f storageFactory = aVar5.f();
                s.j(storageFactory);
                v81.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.e(storageFactory, "AccessibilitySettings", mapper, 12);
            case 5:
                v98.a aVar6 = (v98.a) this.f286025c;
                int i21 = this.f286024b;
                if (i21 == 0) {
                    return new o(aVar6.f286991a, aVar6.f286992b, aVar6.f286993c, aVar6.d, aVar6.e, aVar6.f, aVar6.f286994g, aVar6.f286995h, aVar6.i, aVar6.f286996j, aVar6.k, aVar6.f286997l, aVar6.f286998m, aVar6.u, aVar6.f287001q, aVar6.f287002r, aVar6.f287003s);
                }
                if (i21 != 1) {
                    if (i21 == 2) {
                        return new x98.s(aVar6.f286999n, aVar6.o, aVar6.f287000p);
                    }
                    throw new AssertionError(i21);
                }
                x98.b bVar5 = (x98.b) ((x98.s) aVar6.f287004t.get()).b();
                s.k(bVar5);
                return bVar5;
            case 6:
                vac.a aVar7 = (vac.a) this.f286025c;
                ee0.a aVar8 = aVar7.f287250a;
                nj0.a aVar9 = aVar7.f287252c;
                l70.e eVar2 = aVar7.f;
                int i22 = this.f286024b;
                switch (i22) {
                    case 0:
                        je0.d mapper2 = aVar8.b();
                        s.j(mapper2);
                        yk0.a databaseSecurityProvider = aVar7.f287251b.b();
                        s.j(databaseSecurityProvider);
                        xe0.f storageFactory2 = aVar8.f();
                        s.j(storageFactory2);
                        vac.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, databaseSecurityProvider, "revolut_pay_delivery_tracking", mapper2, 1, null, 48);
                    case 1:
                        Retrofit retrofit = ((nj0.d) aVar9).f();
                        vac.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(RevolutPayDeliveryTrackingService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        RevolutPayDeliveryTrackingService revolutPayDeliveryTrackingService = (RevolutPayDeliveryTrackingService) objCreate;
                        s.k(revolutPayDeliveryTrackingService);
                        return revolutPayDeliveryTrackingService;
                    case 2:
                        vac.d.Companion.getClass();
                        return new ne0.d();
                    case 3:
                        vac.d.Companion.getClass();
                        ne0.n.Companion.getClass();
                        return ne0.l.a(Integer.MAX_VALUE, 10L);
                    case 4:
                        bVar = new qac.b((RevolutPayFlightBookingApiService) aVar7.k.get(), (j) aVar7.f287256l.get(), (ue0.c) aVar7.f287253g.get());
                        break;
                    case 5:
                        Retrofit retrofit3 = ((nj0.d) aVar9).f();
                        vac.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        Object objCreate2 = retrofit3.create(RevolutPayFlightBookingApiService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                        RevolutPayFlightBookingApiService revolutPayFlightBookingApiService = (RevolutPayFlightBookingApiService) objCreate2;
                        s.k(revolutPayFlightBookingApiService);
                        return revolutPayFlightBookingApiService;
                    case 6:
                        vac.d.Companion.getClass();
                        return new ne0.d();
                    case 7:
                        qac.b bVar6 = (qac.b) aVar7.f287257m.get();
                        toa.a aVarA = aVar7.d.a();
                        s.j(aVarA);
                        gte.a aVarB = aVar7.e.b();
                        s.j(aVarB);
                        bVar = new wac.a(bVar6, aVarA, aVarB);
                        break;
                    case 8:
                        l80.e eVarH = eVar2.h();
                        s.j(eVarH);
                        l80.e eVarH2 = eVar2.h();
                        s.j(eVarH2);
                        return new hbc.b(eVarH, new w(eVarH2, 2));
                    default:
                        throw new AssertionError(i22);
                }
                return bVar;
            case 7:
                vdb.j jVar2 = (vdb.j) this.f286025c;
                nj0.a aVar10 = jVar2.f287854a;
                ee0.a aVar11 = jVar2.f287855b;
                int i32 = this.f286024b;
                switch (i32) {
                    case 0:
                        Retrofit retrofit4 = (Retrofit) jVar2.f287859j.get();
                        vdb.l.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                        Object objCreate3 = retrofit4.create(ReservationsService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                        ReservationsService reservationsService = (ReservationsService) objCreate3;
                        s.k(reservationsService);
                        return reservationsService;
                    case 1:
                        xj0.i okHttpClientFactory = ((nj0.d) aVar10).l();
                        s.j(okHttpClientFactory);
                        ik0.b retrofitFactory = ((nj0.d) aVar10).m();
                        s.j(retrofitFactory);
                        vdb.l.Companion.getClass();
                        Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
                        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                        Retrofit retrofitA = ik0.b.a(retrofitFactory, xj0.i.a(okHttpClientFactory, null, false, false, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), "https://reservations.revolut.codes/api/", null, null, 28);
                        s.k(retrofitA);
                        return retrofitA;
                    case 2:
                        nVar = new wdb.n((rdb.k) jVar2.o.get(), jVar2.d.e());
                        break;
                    case 3:
                        nVar = new rdb.k((ReservationsService) jVar2.k.get(), (ne0.n) jVar2.f287860l.get(), (j) jVar2.f287861m.get(), (ue0.c) jVar2.f287862n.get());
                        break;
                    case 4:
                        vdb.l.Companion.getClass();
                        ne0.n.Companion.getClass();
                        return ne0.l.a(1, 10L);
                    case 5:
                        vdb.l.Companion.getClass();
                        return new ne0.d();
                    case 6:
                        je0.d mapper3 = aVar11.b();
                        s.j(mapper3);
                        yk0.a databaseSessionProvider = jVar2.f287856c.b();
                        s.j(databaseSessionProvider);
                        xe0.f storageFactory3 = aVar11.f();
                        s.j(storageFactory3);
                        vdb.l.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper3, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                        return xe0.f.f(storageFactory3, databaseSessionProvider, "retail_restaurants_reservations", mapper3, 1, f0.f322471a, 32);
                    default:
                        throw new AssertionError(i32);
                }
                return nVar;
            case 8:
                vee.c cVar2 = (vee.c) this.f286025c;
                int i33 = this.f286024b;
                if (i33 == 0) {
                    return new ifm.b();
                }
                if (i33 == 1) {
                    return new iri.j();
                }
                if (i33 == 2) {
                    return new u3l.e();
                }
                if (i33 == 3) {
                    return new um.c();
                }
                if (i33 == 4) {
                    return new g();
                }
                if (i33 != 5) {
                    throw new AssertionError(i33);
                }
                f80.a aVarX = cVar2.f288309b.x();
                s.j(aVarX);
                return new nee.l(aVarX);
            case 9:
                vfd.e eVar3 = (vfd.e) this.f286025c;
                int i43 = this.f286024b;
                if (i43 == 0) {
                    return new jhd.j((n) eVar3.f288596c.get(), eVar3.f288595b);
                }
                if (i43 == 1) {
                    return new jhd.l();
                }
                throw new AssertionError(i43);
            case 10:
                vfd.e eVar4 = (vfd.e) this.f286025c;
                int i59 = this.f286024b;
                if (i59 == 0) {
                    return new jhd.j((n) eVar4.f288596c.get(), eVar4.f288595b);
                }
                if (i59 == 1) {
                    return new jhd.l();
                }
                throw new AssertionError(i59);
            case 11:
                vhl.a aVar12 = (vhl.a) this.f286025c;
                a31.a aVar13 = aVar12.i;
                a31.a aVar14 = aVar12.f;
                a31.a aVar15 = aVar12.f289485c;
                a31.a aVar16 = aVar12.f289487h;
                a31.a aVar17 = aVar12.e;
                q qVar = aVar12.f289483a;
                int i66 = this.f286024b;
                if (i66 == 0) {
                    return new b6b.e(qVar, aVar12.f289484b, aVar15, aVar12.d, aVar17, aVar14, aVar12.f289486g, aVar16, aVar13, aVar12.f289491n);
                }
                if (i66 != 1) {
                    if (i66 == 2) {
                        return new whl.a(aVar12.f289488j, aVar12.k, aVar17, aVar16, aVar15, aVar14, aVar12.f289489l, aVar13, qVar);
                    }
                    throw new AssertionError(i66);
                }
                whl.e eVar5 = (whl.e) ((whl.a) aVar12.f289490m.get()).b();
                s.k(eVar5);
                return eVar5;
            case 12:
                h hVar2 = (h) this.f286025c;
                int i74 = this.f286024b;
                if (i74 != 0) {
                    if (i74 == 1) {
                        return new wm3.m();
                    }
                    throw new AssertionError(i74);
                }
                vl3.k kVar = hVar2.f290190b;
                vl3.n nVar2 = kVar.f290210n;
                cl3.a aVarD = nVar2.d();
                s.j(aVarD);
                wl3.c cVar3 = (wl3.c) nVar2.f290240x.get();
                s.j(cVar3);
                yl3.a aVar18 = (yl3.a) nVar2.o.get();
                s.j(aVar18);
                z80.b bVarS = kVar.f290205g.s();
                s.j(bVarS);
                return new wm3.l(new ym3.b(aVarD, cVar3, aVar18, bVarS), hVar2.f290189a, (n) hVar2.f290191c.get());
            case 13:
                vle.b bVar7 = (vle.b) this.f286025c;
                int i92 = this.f286024b;
                if (i92 != 0) {
                    if (i92 == 1) {
                        vle.f.Companion.getClass();
                        return new vqi.a();
                    }
                    if (i92 == 2) {
                        return new ule.b();
                    }
                    throw new AssertionError(i92);
                }
                tla.e eVarA = bVar7.f290376a.a();
                s.j(eVarA);
                n63.h hVar3 = (n63.h) bVar7.f290377b.f319904a.get();
                s.j(hVar3);
                j30.d dVarU = ((h30.n) bVar7.f290378c).u();
                s.j(dVarU);
                gte.a aVarB2 = bVar7.d.b();
                s.j(aVarB2);
                return new sle.c(eVarA, hVar3, dVarU, aVarB2, (vqi.a) bVar7.E.get());
            case 14:
                vn2.e eVar6 = (vn2.e) this.f286025c;
                int i96 = this.f286024b;
                if (i96 == 0) {
                    xoj.a aVarA2 = eVar6.f290655a.a();
                    s.j(aVarA2);
                    gte.a aVarB3 = eVar6.f290656b.b();
                    s.j(aVarB3);
                    bVar2 = new on2.b(aVarA2, aVarB3);
                } else {
                    if (i96 != 1) {
                        if (i96 != 2) {
                            throw new AssertionError(i96);
                        }
                        Context context = eVar6.f290657c;
                        vn2.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        return sri.o.c(context, null, null, 14);
                    }
                    bVar2 = new un2.c((on2.b) eVar6.d.get(), (sri.m) eVar6.e.get());
                }
                return bVar2;
            case 15:
                vn2.f fVar2 = (vn2.f) this.f286025c;
                int i99 = this.f286024b;
                if (i99 == 0) {
                    return new bo2.k((n) fVar2.f290671b.get(), fVar2.f290670a);
                }
                if (i99 == 1) {
                    return new bo2.l();
                }
                throw new AssertionError(i99);
            case 16:
                vn2.h hVar4 = (vn2.h) this.f286025c;
                int i100 = this.f286024b;
                if (i100 == 0) {
                    return new tn2.b();
                }
                if (i100 != 1) {
                    if (i100 != 2) {
                        throw new AssertionError(i100);
                    }
                    BankAccountSwitchingService bankAccountSwitchingService = (BankAccountSwitchingService) a0.d.f((nj0.d) hVar4.f290678c, "retrofit", BankAccountSwitchingService.class, "create(...)");
                    s.k(bankAccountSwitchingService);
                    return bankAccountSwitchingService;
                }
                BankAccountSwitchingService bankAccountSwitchingService2 = (BankAccountSwitchingService) hVar4.f290684n.get();
                l70.e eVar7 = hVar4.d;
                l80.e eVarH3 = eVar7.h();
                s.j(eVarH3);
                z80.b bVarS2 = eVar7.s();
                s.j(bVarS2);
                return new pn2.d(bankAccountSwitchingService2, new d0(new qn2.l(eVarH3, bVarS2)));
            case 17:
                vn2.k kVar2 = (vn2.k) this.f286025c;
                int i101 = this.f286024b;
                if (i101 == 0) {
                    return kxa.j.j((j60.a) kVar2.e.get());
                }
                if (i101 == 1) {
                    return v1.c.r((com.revolut.kompot.navigable.a) kVar2.f290693c.get(), (rp0.m) kVar2.d.get());
                }
                if (i101 == 2) {
                    return new rp0.m();
                }
                if (i101 == 3) {
                    n nVar3 = (n) kVar2.f290694g.get();
                    BankAccountSwitchingPaymentScheduleScreenContract$InputData bankAccountSwitchingPaymentScheduleScreenContract$InputData = kVar2.f290691a;
                    j60.a aVar19 = (j60.a) kVar2.f290695h.get();
                    l80.e eVarH4 = kVar2.f290692b.d.h();
                    s.j(eVarH4);
                    return new ro2.k(nVar3, bankAccountSwitchingPaymentScheduleScreenContract$InputData, aVar19, new ro2.b(eVarH4));
                }
                if (i101 == 4) {
                    return new ro2.l();
                }
                if (i101 != 5) {
                    throw new AssertionError(i101);
                }
                j60.a bottomExpandableDialogEmbeddedControllerExtension = (j60.a) kVar2.e.get();
                so2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(bottomExpandableDialogEmbeddedControllerExtension, "bottomExpandableDialogEmbeddedControllerExtension");
                s.k(bottomExpandableDialogEmbeddedControllerExtension);
                return bottomExpandableDialogEmbeddedControllerExtension;
            case 18:
                int i102 = this.f286024b;
                if (i102 == 0) {
                    vn2.s sVar = (vn2.s) this.f286025c;
                    return new eq2.h(sVar.f290717a, (n) sVar.f290718b.get());
                }
                if (i102 == 1) {
                    return new eq2.i();
                }
                throw new AssertionError(i102);
            case 19:
                z zVar = (z) this.f286025c;
                int i103 = this.f286024b;
                if (i103 == 0) {
                    return new to2.m((n) zVar.f290736c.get(), zVar.f290734a, new vo2.e((pn2.d) zVar.f290735b.o.get()));
                }
                if (i103 == 1) {
                    return new to2.n();
                }
                throw new AssertionError(i103);
            case 20:
                a0 a0Var = (a0) this.f286025c;
                vn2.h hVar5 = a0Var.f290644b;
                int i104 = this.f286024b;
                if (i104 == 0) {
                    return new com.revolut.feature.bank_account_switching.impl.ui.review_joint.a((n) a0Var.f290645c.get(), a0Var.f290643a, new bp2.d((pn2.d) hVar5.o.get(), 1), new bp2.c((pn2.d) hVar5.o.get()), new ep2.a());
                }
                if (i104 == 1) {
                    return new ep2.n(new kp2.a(), new kp2.c(hVar5.f290679g.g()));
                }
                throw new AssertionError(i104);
            case 21:
                b0 b0Var = (b0) this.f286025c;
                int i105 = this.f286024b;
                if (i105 == 0) {
                    return new zp2.i((n) b0Var.f290648b.get(), b0Var.f290647a, new u());
                }
                if (i105 == 1) {
                    return new zp2.j();
                }
                throw new AssertionError(i105);
            case 22:
                int i106 = this.f286024b;
                if (i106 == 0) {
                    return new bq2.e((n) ((c0) this.f286025c).f290650a.get());
                }
                if (i106 == 1) {
                    return new bq2.f();
                }
                throw new AssertionError(i106);
            case 23:
                e0 e0Var = (e0) this.f286025c;
                q qVar2 = e0Var.f290658a;
                int i107 = this.f286024b;
                if (i107 == 0) {
                    aVar = new vn2.a(e0Var.f290659b, e0Var.f290660c, qVar2);
                } else if (i107 == 1) {
                    aVar = new bt7.l(qVar2, e0Var.d, e0Var.e, e0Var.f, e0Var.f290661g, e0Var.f290662h, e0Var.i, e0Var.f290663j, e0Var.k, e0Var.f290664l, e0Var.f290665m, e0Var.f290666n, 3);
                } else {
                    if (i107 != 2) {
                        if (i107 != 3) {
                            throw new AssertionError(i107);
                        }
                        vn2.e eVar8 = (vn2.e) ((vn2.a) e0Var.o.get()).b();
                        s.k(eVar8);
                        return eVar8;
                    }
                    aVar = new a51.d(e0Var.f290668q, 19);
                }
                return aVar;
            case 24:
                vp5.d dVar2 = (vp5.d) this.f286025c;
                int i108 = this.f286024b;
                switch (i108) {
                    case 0:
                        hri.b bVar8 = dVar2.f291077a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar9 = dVar2.f291077a;
                        return new iri.j();
                    case 2:
                        return new up5.e();
                    case 3:
                        return new ln.c();
                    case 4:
                        return new cn.e();
                    case 5:
                        return new um.c();
                    case 6:
                        dVar2.getClass();
                        hVar = new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                        return hVar;
                    case 7:
                        ln.a aVar20 = (ln.a) dVar2.I.get();
                        g3l.a aVar21 = (g3l.a) dVar2.M.get();
                        ap5.b bVarE = ((yo5.w) dVar2.f291081c).e();
                        s.j(bVarE);
                        sf0.h hVarB = dVar2.d.b();
                        s.j(hVarB);
                        hVar = new kp5.c(aVar20, aVar21, bVarE, hVarB, new ip5.a(), (up5.b) dVar2.Q.get(), dVar2.f291089q.a(), dVar2.d());
                        return hVar;
                    case 8:
                        return new g();
                    case 9:
                        e4m.e eVar9 = dVar2.H;
                        go5.c cVar4 = dVar2.f291081c;
                        up5.c cVar5 = (up5.c) eVar9.get();
                        ap5.b bVarE2 = ((yo5.w) cVar4).e();
                        s.j(bVarE2);
                        wsg.n nVarB = dVar2.e.b();
                        mm.d dVar3 = (mm.d) dVar2.N.get();
                        ifm.b bVar10 = (ifm.b) dVar2.F.get();
                        rea.m mVarF = dVar2.f.f();
                        t tVarD = dVar2.d();
                        po5.a aVarD2 = ((yo5.w) cVar4).d();
                        s.j(aVarD2);
                        bk5.a aVarA3 = ((ak5.i) dVar2.f291082g).a();
                        i90.b bVar11 = new i90.b();
                        gte.a aVarB4 = dVar2.f291083h.b();
                        s.j(aVarB4);
                        tga.k kVarB = dVar2.i.b();
                        wj0.a aVarI = ((nj0.d) dVar2.f291084j).i();
                        s.j(aVarI);
                        x0 x0VarA = dVar2.a();
                        opf.z zVarD = dVar2.o.d();
                        vo9.a aVarB5 = ((ut9.a) dVar2.f291088p).b();
                        s.j(aVarB5);
                        return new up5.a0(cVar5, bVarE2, nVarB, dVar3, bVar10, mVarF, tVarD, aVarD2, aVarA3, bVar11, aVarB4, kVarB, aVarI, x0VarA, zVarD, aVarB5);
                    case 10:
                        return new mm.d();
                    case 11:
                        return new ym.d();
                    case 12:
                        qd0.b languageProvider = dVar2.f291079b.n();
                        s.j(languageProvider);
                        vp5.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                        return v80.b.b(languageProvider, false, false, 58);
                    case 13:
                        qp5.h hVar6 = (qp5.h) dVar2.S.get();
                        g3l.a aVar22 = (g3l.a) dVar2.M.get();
                        ap5.b bVarE3 = ((yo5.w) dVar2.f291081c).e();
                        s.j(bVarE3);
                        qp5.d0 d0Var = new qp5.d0();
                        j61.b bVarC = dVar2.f291092t.c();
                        s.j(bVarC);
                        up5.b bVar12 = (up5.b) dVar2.Q.get();
                        sf0.h hVarB2 = dVar2.d.b();
                        s.j(hVarB2);
                        mm.d dVar4 = (mm.d) dVar2.N.get();
                        ym.d dVar5 = (ym.d) dVar2.O.get();
                        v60.e eVarA2 = dVar2.u.a();
                        s.j(eVarA2);
                        lrh.a aVar23 = (lrh.a) ((krh.a) dVar2.v).f188872g.get();
                        s.j(aVar23);
                        ln.a aVar24 = (ln.a) dVar2.I.get();
                        eli.j jVarA = dVar2.f291089q.a();
                        gte.a aVarB6 = dVar2.f291083h.b();
                        s.j(aVarB6);
                        jVar = new sp5.j(hVar6, aVar22, bVarE3, d0Var, bVarC, bVar12, hVarB2, dVar4, dVar5, eVarA2, aVar23, aVar24, jVarA, aVarB6, (xq5.b) dVar2.T.get(), dVar2.d());
                        return jVar;
                    case 14:
                        up5.b bVar13 = (up5.b) dVar2.Q.get();
                        ln.a aVar25 = (ln.a) dVar2.I.get();
                        uj5.b bVarE4 = ((ak5.i) dVar2.f291082g).e();
                        s.j(bVarE4);
                        ang.f fVarE = dVar2.f291090r.e();
                        mre.c cVarB = dVar2.f291091s.b();
                        s.j(cVarB);
                        p pVarB = ((yo5.w) dVar2.f291081c).b();
                        s.j(pVarB);
                        hVar = new g0(bVar13, aVar25, bVarE4, fVarE, cVarB, pVarB);
                        return hVar;
                    case 15:
                        return new xq5.b();
                    case 16:
                        hVar = new kp5.d((up5.b) dVar2.Q.get());
                        return hVar;
                    case 17:
                        g3l.a aVar26 = (g3l.a) dVar2.M.get();
                        agf.b bVarA = ((dgf.a) dVar2.f291093w).a();
                        s.j(bVarA);
                        jVar = new sp5.c(aVar26, bVarA, new qp5.d0(), (ym.d) dVar2.O.get(), (qp5.h) dVar2.S.get(), (up5.b) dVar2.Q.get(), (ln.a) dVar2.I.get(), (xq5.b) dVar2.T.get(), dVar2.d());
                        return jVar;
                    case 18:
                        e4m.e eVar10 = dVar2.S;
                        go5.c cVar6 = dVar2.f291081c;
                        op5.j jVar3 = (op5.j) eVar10.get();
                        g3l.a aVar27 = (g3l.a) dVar2.M.get();
                        ap5.b bVarE5 = ((yo5.w) cVar6).e();
                        s.j(bVarE5);
                        t tVarD2 = dVar2.d();
                        mo5.a aVarC = ((yo5.w) cVar6).c();
                        s.j(aVarC);
                        hVar = new op5.h(jVar3, aVar27, bVarE5, tVarD2, new bq5.c(aVarC));
                        return hVar;
                    case 19:
                        return new sm.e();
                    case 20:
                        return new om.c();
                    case 21:
                        return new wm.a();
                    case 22:
                        return new s3l.f();
                    default:
                        throw new AssertionError(i108);
                }
            case 25:
                vtc.a aVar28 = (vtc.a) this.f286025c;
                int i109 = this.f286024b;
                if (i109 == 0) {
                    n nVar4 = (n) aVar28.d.get();
                    AddToClickToPayScreenContract$InputData addToClickToPayScreenContract$InputData = aVar28.f291943a;
                    da3.j jVar4 = aVar28.f291945c.e;
                    l93.f fVarJ = jVar4.j();
                    s.j(fVarJ);
                    ha3.f fVarD = jVar4.d();
                    s.j(fVarD);
                    return new duc.i(nVar4, addToClickToPayScreenContract$InputData, new ja3.f(aVar28.f291944b, (c90.c) aVar28.f291946g.get(), fVarD, fVarJ, (yy0.f) aVar28.f.get()));
                }
                if (i109 == 1) {
                    return new duc.j();
                }
                if (i109 != 2) {
                    if (i109 != 3) {
                        throw new AssertionError(i109);
                    }
                    com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) aVar28.e.get();
                    euc.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    return new c90.c(controller.m2());
                }
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) aVar28.e.get();
                euc.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                yy0.f fVarQ = jh.d.f(controller2.m2()).Q();
                s.k(fVarQ);
                return fVarQ;
            case 26:
                vtc.c cVar7 = (vtc.c) this.f286025c;
                int i110 = this.f286024b;
                if (i110 == 0) {
                    return new xuc.k((n) cVar7.f291957c.get(), cVar7.f291955a);
                }
                if (i110 != 1) {
                    throw new AssertionError(i110);
                }
                m93.d dVarF = cVar7.f291956b.e.f();
                s.j(dVarF);
                xtc.c cVar8 = new xtc.c(dVarF);
                wuc.c linkedWalletsDeviceImageMapper = new wuc.c();
                Intrinsics.checkNotNullParameter(linkedWalletsDeviceImageMapper, "linkedWalletsDeviceImageMapper");
                return new xuc.n(cVar8, new wuc.d(), new wuc.a());
            case 27:
                int i111 = this.f286024b;
                if (i111 == 0) {
                    return new zub.c((n) ((vub.d) this.f286025c).f292293a.get());
                }
                if (i111 == 1) {
                    return new zub.d();
                }
                throw new AssertionError(i111);
            case 28:
                vub.g gVar = (vub.g) this.f286025c;
                int i112 = this.f286024b;
                if (i112 == 0) {
                    return new wub.e((wub.a) gVar.d.get(), 0);
                }
                if (i112 != 1) {
                    if (i112 == 2) {
                        return new wub.e((wub.a) gVar.d.get(), 1);
                    }
                    throw new AssertionError(i112);
                }
                gte.a aVarB7 = gVar.f292305a.b();
                s.j(aVarB7);
                eub.a aVarA4 = gVar.f292306b.a();
                s.j(aVarA4);
                return new wub.a(aVarA4, aVarB7, gVar.f292307c.a());
            default:
                vxl.a aVar29 = (vxl.a) this.f286025c;
                int i113 = this.f286024b;
                if (i113 == 0) {
                    CoroutineScope coroutineScopeA = aVar29.f293098a.a();
                    s.j(coroutineScopeA);
                    wxl.a aVar30 = (wxl.a) aVar29.f293101g.get();
                    xxl.a aVar31 = new xxl.a();
                    o1 o1Var = (o1) aVar29.d.j0.get();
                    s.j(o1Var);
                    return new rxl.a(coroutineScopeA, aVar30, aVar31, o1Var);
                }
                if (i113 != 1) {
                    if (i113 == 2) {
                        return new wxl.e();
                    }
                    if (i113 != 3) {
                        throw new AssertionError(i113);
                    }
                    mk0.a aVarA5 = aVar29.f293099b.a();
                    s.j(aVarA5);
                    return new wxl.d(aVarA5);
                }
                a aVar32 = aVar29.e;
                a aVar33 = aVar29.f;
                gte.a aVarB8 = aVar29.f293100c.b();
                s.j(aVarB8);
                nd.k factory = new nd.k(aVar32, aVar33, aVarB8);
                vxl.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return ((jte.d) aVarB8).c(NudgeApi$Toggles$NudgesDebugMode.f107114a) ? (wxl.a) aVar32.get() : (wxl.a) aVar33.get();
        }
    }
}
