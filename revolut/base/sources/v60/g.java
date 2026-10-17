package v60;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import cmi.n;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import dcl.d0;
import eli.p;
import et6.p1;
import et6.t0;
import hd.r;
import ie7.m;
import ihm.j;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import k4l.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import le.u1;
import mmm.k0;
import mmm.l0;
import mmm.q0;
import mmm.r0;
import mmm.s0;
import no.e2;
import no.g1;
import no.i2;
import no.y2;
import pfm.z;
import qza.x;
import skm.e0;
import te0.w;
import vdl.y;
import vf0.q;
import vf0.s;
import vf0.t;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.m0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286250a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f286251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f286252c;
    public Object d;

    public g(ifm.b compositeDisposable, Function1 action) {
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f286251b = action;
        j jVarH = p.a.h("toSerialized(...)");
        this.f286252c = jVarH;
        this.d = p.a.D("toSerialized(...)");
        pfm.a aVar = new pfm.a(w.D(jVarH, new f(this, 3)), new a31.a(new x(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new bo.e(11, s.f288469a), t.f288470a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(compositeDisposable, hVarW);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(v60.g r19, v20.s0 r20, gim.c r21) {
        /*
            r0 = r19
            r1 = r21
            r0.getClass()
            boolean r2 = r1 instanceof y20.l
            if (r2 == 0) goto L1a
            r2 = r1
            y20.l r2 = (y20.l) r2
            int r3 = r2.f310521x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f310521x = r3
            goto L1f
        L1a:
            y20.l r2 = new y20.l
            r2.<init>(r0, r1)
        L1f:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f310521x
            java.lang.String r5 = "Failed to resolve URL for "
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L43
            if (r4 != r6) goto L3b
            v20.s0 r2 = r2.u
            yhm.o.b(r1)     // Catch: java.lang.Exception -> L34 com.revolut.core.error.data.model.ServerErrorException -> L37 java.util.concurrent.CancellationException -> L7e
            r8 = r2
            goto L5f
        L34:
            r0 = move-exception
            r4 = r2
            goto L88
        L37:
            r0 = move-exception
            r4 = r2
            goto La0
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            yhm.o.b(r1)
            java.util.UUID r1 = r20.getUploadId()
            if (r1 != 0) goto L4d
            return r7
        L4d:
            java.lang.Object r0 = r0.f286252c     // Catch: java.util.concurrent.CancellationException -> L7e java.lang.Exception -> L80 com.revolut.core.error.data.model.ServerErrorException -> L84
            d30.c r0 = (d30.c) r0     // Catch: java.util.concurrent.CancellationException -> L7e java.lang.Exception -> L80 com.revolut.core.error.data.model.ServerErrorException -> L84
            r4 = r20
            r2.u = r4     // Catch: java.lang.Exception -> L7a com.revolut.core.error.data.model.ServerErrorException -> L7c java.util.concurrent.CancellationException -> L7e
            r2.f310521x = r6     // Catch: java.lang.Exception -> L7a com.revolut.core.error.data.model.ServerErrorException -> L7c java.util.concurrent.CancellationException -> L7e
            java.lang.Object r1 = r0.a(r1, r2)     // Catch: java.lang.Exception -> L7a com.revolut.core.error.data.model.ServerErrorException -> L7c java.util.concurrent.CancellationException -> L7e
            if (r1 != r3) goto L5e
            return r3
        L5e:
            r8 = r4
        L5f:
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L74 com.revolut.core.error.data.model.ServerErrorException -> L77 java.util.concurrent.CancellationException -> L7e
            r17 = 0
            r18 = 524223(0x7ffbf, float:7.34593E-40)
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            v20.s0 r0 = v20.s0.r(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Exception -> L74 com.revolut.core.error.data.model.ServerErrorException -> L77 java.util.concurrent.CancellationException -> L7e
            return r0
        L74:
            r0 = move-exception
            r4 = r8
            goto L88
        L77:
            r0 = move-exception
            r4 = r8
            goto La0
        L7a:
            r0 = move-exception
            goto L88
        L7c:
            r0 = move-exception
            goto La0
        L7e:
            r0 = move-exception
            goto Lbf
        L80:
            r0 = move-exception
            r4 = r20
            goto L88
        L84:
            r0 = move-exception
            r4 = r20
            goto La0
        L88:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.util.UUID r2 = r4.getUploadId()
            java.lang.String r2 = prk.o.r(r2, r5)
            r1.<init>(r2, r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r7, r7, r1, r0)
        L9e:
            r7 = r4
            goto Lbe
        La0:
            int r1 = r0.e
            r2 = 404(0x194, float:5.66E-43)
            if (r1 != r2) goto La7
            goto Lbe
        La7:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.util.UUID r2 = r4.getUploadId()
            java.lang.String r2 = prk.o.r(r2, r5)
            r1.<init>(r2, r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r7, r7, r1, r0)
            goto L9e
        Lbe:
            return r7
        Lbf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v60.g.a(v60.g, v20.s0, gim.c):java.lang.Object");
    }

    public Map b(InstrumentTicker instrumentTicker, LocalDate localDate, List marketClosedDates) {
        ZonedDateTime zonedDateTimeAtStartOfDay;
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(marketClosedDates, "marketClosedDates");
        Set set = nel.x.f214635a;
        Intrinsics.checkNotNullParameter(instrumentTicker, "<this>");
        Long l2 = instrumentTicker.f105118m;
        ZonedDateTime zonedDateTimeB = null;
        Instant instantOfEpochSecond = l2 != null ? Instant.ofEpochSecond(l2.longValue()) : null;
        Intrinsics.checkNotNullParameter(marketClosedDates, "marketClosedDates");
        ZonedDateTime zonedDateTimePlusMonths = j().plusMonths(6L);
        boolean zC = instantOfEpochSecond != null ? ((l80.f) ((l80.e) this.f286252c)).c(instantOfEpochSecond.toEpochMilli()) : false;
        ZonedDateTime zonedDateTimeJ = j();
        if (!zC) {
            zonedDateTimeJ = null;
        }
        if (!zC) {
            ZonedDateTime zonedDateTimeJ2 = j();
            ((nvl.j) this.f286251b).getClass();
            zonedDateTimeB = nvl.j.b(zonedDateTimeJ2, zonedDateTimePlusMonths, marketClosedDates);
        }
        ZonedDateTime zonedDateTimeJ3 = j();
        ZonedDateTime zonedDateTimePlusWeeks = j().plusWeeks(1L);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimePlusWeeks, "plusWeeks(...)");
        ZonedDateTime zonedDateTimeO = o(zonedDateTimeJ3, zonedDateTimePlusWeeks, marketClosedDates);
        ZonedDateTime zonedDateTimeJ4 = j();
        ZonedDateTime zonedDateTimePlusDays = j().plusDays(90L);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimePlusDays, "plusDays(...)");
        ZonedDateTime zonedDateTimeO2 = o(zonedDateTimeJ4, zonedDateTimePlusDays, marketClosedDates);
        ZonedDateTime zonedDateTimeJ5 = j();
        ZonedDateTime zonedDateTimePlusMonths2 = j().plusMonths(6L);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimePlusMonths2, "plusMonths(...)");
        ZonedDateTime zonedDateTimeO3 = o(zonedDateTimeJ5, zonedDateTimePlusMonths2, marketClosedDates);
        Pair pair = new Pair(k.TODAY, zonedDateTimeJ);
        Pair pair2 = new Pair(k.NEXT_TRADING_DAY, zonedDateTimeB);
        Pair pair3 = new Pair(k.ONE_WEEK, zonedDateTimeO);
        Pair pair4 = new Pair(k.NINETY_DAYS, zonedDateTimeO2);
        Pair pair5 = new Pair(k.SIX_MONTHS, zonedDateTimeO3);
        k kVar = k.CUSTOM;
        if (localDate != null && (zonedDateTimeAtStartOfDay = localDate.atStartOfDay(ZoneId.systemDefault())) != null) {
            zonedDateTimeO = zonedDateTimeAtStartOfDay;
        }
        return foh.i.q(pair, pair2, pair3, pair4, pair5, new Pair(kVar, zonedDateTimeO));
    }

    public pfm.h c(Object params) {
        Intrinsics.checkNotNullParameter(params, "params");
        pfm.h hVar = new pfm.h(new v3e.t(this, params, 1), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // mmm.r0
    public void cancel() {
        ((r0) this.f286251b).cancel();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(gim.c r8, java.util.List r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v60.g.d(gim.c, java.util.List, boolean):java.lang.Object");
    }

    public Object e(Set set, gim.c cVar) {
        if (set.isEmpty()) {
            return zhm.r0.g();
        }
        z zVarO = ((s20.d) this.f286251b).b(set).o(zhm.r0.g());
        Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
        return nim.a.b(zVarO, cVar);
    }

    public mmm.j f() {
        return (k0) this.d;
    }

    @Override // mmm.r0
    public q0 g() {
        return (k0) this.d;
    }

    @Override // mmm.r0
    public s0 getSource() {
        return (l0) this.f286252c;
    }

    public mmm.k h() {
        return (l0) this.f286252c;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public vza.a i(vza.b scope) {
        aim.e eVarA;
        Object next;
        Intrinsics.checkNotNullParameter(scope, "scope");
        h41.b bVarA = ((i41.c) this.f286251b).a();
        int i = yza.a.f318060a[scope.ordinal()];
        if (i == 1) {
            aim.e eVarB = u.b();
            eVarB.add(vza.a.ROOTED);
            eVarB.add(vza.a.CUSTOM_KEYS);
            eVarB.add(vza.a.CUSTOM_OS);
            eVarB.add(vza.a.KA_REVOKED_CERT);
            eVarB.add(vza.a.UNLOCKED_BOOTLOADER);
            eVarB.add(vza.a.CUSTOM_FIRMWARE);
            eVarA = u.a(eVarB);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aim.e eVarB2 = u.b();
            eVarB2.add(vza.a.ROOTED);
            eVarB2.add(vza.a.CUSTOM_KEYS);
            eVarB2.add(vza.a.CUSTOM_OS);
            eVarB2.add(vza.a.KA_REVOKED_CERT);
            eVarB2.add(vza.a.UNLOCKED_BOOTLOADER);
            eVarA = u.a(eVarB2);
        }
        if (scope == vza.b.SIGN_IN_SIGN_UP) {
            com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, (ue0.c) this.f286252c, "IS_DEVICE_ROOTED_KEY", Boolean.valueOf(bVarA.k));
        }
        Iterator<E> it8 = eVarA.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            Function1 function1 = (Function1) this.d.get((vza.a) next);
            if (function1 != null && ((Boolean) function1.invoke(bVarA)).booleanValue()) {
                break;
            }
        }
        return (vza.a) next;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public ZonedDateTime j() {
        return (ZonedDateTime) this.d.getValue();
    }

    public void k() {
        hf0.b bVar = hf0.b.d;
        phm.a aVar = (phm.a) ((hf0.a) bVar.c()).a().get(nf0.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", nf0.a.class, " is not found"));
        }
        new ti2.b((sf0.c) ((nf0.a) aVar2.b()).f214797h.get(), new vo8.b(25)).init();
        if (((smd.s) this.f286252c).W() instanceof zi2.a) {
            new sf0.f(0).init();
            od0.a aVar3 = od0.a.f224253a;
            if (od0.a.e()) {
                new ti2.a().init();
            }
            new ti2.c().init();
            phm.a aVar4 = (phm.a) ((hf0.a) bVar.c()).a().get(nf0.a.class);
            b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
            if (aVar5 == null) {
                throw new IllegalStateException(a0.d.q("Api ", nf0.a.class, " is not found"));
            }
            ((rf0.a) ((nf0.a) aVar5.b()).e.get()).init();
        }
    }

    public void l() {
        if (((smd.s) this.f286252c).W() instanceof zi2.a) {
            hf0.b bVar = hf0.b.d;
            hf0.a aVar = (hf0.a) bVar.c();
            phm.a aVar2 = (phm.a) aVar.a().get(l70.e.class);
            Continuation continuation = null;
            b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
            if (aVar3 == null) {
                throw new IllegalStateException(a0.d.q("Api ", l70.e.class, " is not found"));
            }
            v70.c migratorFactory = (v70.c) ((l70.e) aVar3.b()).f192432a0.get();
            Intrinsics.checkNotNullParameter(migratorFactory, "migratorFactory");
            try {
                migratorFactory.getClass();
                Intrinsics.checkNotNullParameter("CoreAndroidApi", "name");
                ufm.g.a(new ufm.g(migratorFactory.f286525a));
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
            phm.a aVar4 = (phm.a) ((hf0.a) bVar.c()).a().get(jm0.a.class);
            b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
            if (aVar5 == null) {
                throw new IllegalStateException(a0.d.q("Api ", jm0.a.class, " is not found"));
            }
            in0.a accessibilityServicesTrustManager = (in0.a) ((jm0.a) aVar5.b()).f175907s.get();
            Intrinsics.checkNotNullParameter(accessibilityServicesTrustManager, "accessibilityServicesTrustManager");
            ((in0.d) accessibilityServicesTrustManager).init();
            phm.a aVar6 = (phm.a) aVar.a().get(osb.a.class);
            b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
            if (aVar7 == null) {
                throw new IllegalStateException(a0.d.q("Api ", osb.a.class, " is not found"));
            }
            ((p) ((osb.a) aVar7.b()).k.get()).init();
            Iterator it8 = ((List) this.d).iterator();
            while (it8.hasNext()) {
                ((e0m.d) it8.next()).init();
            }
            phm.a aVar8 = (phm.a) aVar.a().get(poi.b.class);
            b60.a aVar9 = aVar8 != null ? (b60.a) aVar8.get() : null;
            if (aVar9 == null) {
                throw new IllegalStateException(a0.d.q("Api ", poi.b.class, " is not found"));
            }
            poi.b bVar2 = (poi.b) aVar9.b();
            ((i2) ((e2) bVar2.f238028n0.get())).init();
            ((y2) bVar2.f238029o0.get()).init();
            ((g1) bVar2.i0.get()).init();
            emi.a aVar10 = (emi.a) ue0.e.i(aVar, emi.a.class);
            if (aVar10 != null) {
                new emi.d((n) aVar10.f127664g.get(), new cmi.a()).init();
            }
            phm.a aVar11 = (phm.a) aVar.a().get(k1b.c.class);
            b60.a aVar12 = aVar11 != null ? (b60.a) aVar11.get() : null;
            if (aVar12 == null) {
                throw new IllegalStateException(a0.d.q("Api ", k1b.c.class, " is not found"));
            }
            ((nri.a) ((h1b.b) ((k1b.c) aVar12.b()).f180199p.get())).init();
            phm.a aVar13 = (phm.a) aVar.a().get(iq.b.class);
            b60.a aVar14 = aVar13 != null ? (b60.a) aVar13.get() : null;
            if (aVar14 == null) {
                throw new IllegalStateException(a0.d.q("Api ", iq.b.class, " is not found"));
            }
            gq.f fVar = (gq.f) ((iq.b) aVar14.b()).o.get();
            Context context = (Context) this.f286251b;
            svh.a appWidget = new svh.a();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appWidget, "appWidget");
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            Pair pair = new Pair("AccountWidget", new gq.b(applicationContext, appWidget));
            Context context2 = (Context) this.f286251b;
            p1e.a appWidget2 = new p1e.a();
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(appWidget2, "appWidget");
            Context applicationContext2 = context2.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            Map widgets = zhm.r0.k(pair, new Pair("StockWidget", new gq.b(applicationContext2, appWidget2)));
            gq.i iVar = (gq.i) fVar;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(widgets, "widgets");
            int i = 1;
            if (iVar.i.compareAndSet(false, true)) {
                iVar.f145487j = widgets;
                iVar.f145484c.addObserver(iVar);
                com.revolut.appwidget_core.a.Companion.getClass();
                com.revolut.appwidget_core.a.f50366g.setValue(fq.c.INITIALIZED);
            }
            phm.a aVar15 = (phm.a) aVar.a().get(opa.a.class);
            b60.a aVar16 = aVar15 != null ? (b60.a) aVar15.get() : null;
            if (aVar16 == null) {
                throw new IllegalStateException(a0.d.q("Api ", opa.a.class, " is not found"));
            }
            ((spa.i) ((opa.a) aVar16.b()).o.get()).init();
            phm.a aVar17 = (phm.a) aVar.a().get(f1b.c.class);
            b60.a aVar18 = aVar17 != null ? (b60.a) aVar17.get() : null;
            if (aVar18 == null) {
                throw new IllegalStateException(a0.d.q("Api ", f1b.c.class, " is not found"));
            }
            ((fo0.a) ((f1b.c) aVar18.b()).k.get()).init();
            phm.a aVar19 = (phm.a) aVar.a().get(hwj.a.class);
            b60.a aVar20 = aVar19 != null ? (b60.a) aVar19.get() : null;
            if (aVar20 == null) {
                throw new IllegalStateException(a0.d.q("Api ", hwj.a.class, " is not found"));
            }
            ((iwj.a) ((hwj.a) aVar20.b()).f156280j.get()).init();
            phm.a aVar21 = (phm.a) aVar.a().get(ee7.a.class);
            b60.a aVar22 = aVar21 != null ? (b60.a) aVar21.get() : null;
            if (aVar22 == null) {
                throw new IllegalStateException(a0.d.q("Api ", ee7.a.class, " is not found"));
            }
            ee7.a aVar23 = (ee7.a) aVar22.b();
            CoroutineScope appCoroutineScope = aVar23.d.a();
            vc.s.j(appCoroutineScope);
            m notificationChannelsFactory = new m();
            ee7.g voiceCallsLazyWrapper = (ee7.g) aVar23.i.get();
            xg0.a dynamicDelivery = aVar23.f125112b.a();
            vc.s.j(dynamicDelivery);
            hh0.e cloudMessagingTokenProvider = th0.i.a();
            tf3.b chatAuthorizationStatus = aVar23.e.d();
            vc.s.j(chatAuthorizationStatus);
            String twilioModuleName = aVar23.f125113c;
            Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
            Intrinsics.checkNotNullParameter(notificationChannelsFactory, "notificationChannelsFactory");
            Intrinsics.checkNotNullParameter(voiceCallsLazyWrapper, "voiceCallsLazyWrapper");
            Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
            Intrinsics.checkNotNullParameter(cloudMessagingTokenProvider, "cloudMessagingTokenProvider");
            Intrinsics.checkNotNullParameter(chatAuthorizationStatus, "chatAuthorizationStatus");
            Intrinsics.checkNotNullParameter(twilioModuleName, "twilioModuleName");
            r rVar = new r();
            rVar.f151365b = appCoroutineScope;
            rVar.f151366c = voiceCallsLazyWrapper;
            rVar.d = dynamicDelivery;
            rVar.e = cloudMessagingTokenProvider;
            rVar.f = chatAuthorizationStatus;
            rVar.f151364a = twilioModuleName;
            Context context3 = (Context) this.f286251b;
            Intrinsics.checkNotNullParameter(context3, "context");
            e0.C(appCoroutineScope, null, null, new i44.a(rVar, context3, continuation, 18), 3);
            phm.a aVar24 = (phm.a) aVar.a().get(rg0.e.class);
            b60.a aVar25 = aVar24 != null ? (b60.a) aVar24.get() : null;
            if (aVar25 == null) {
                throw new IllegalStateException(a0.d.q("Api ", rg0.e.class, " is not found"));
            }
            e0.C(((rg0.e) aVar25.b()).a(), elm.f.f127540b, null, new x0f.g(aVar, continuation, i), 2);
        }
    }

    public vkm.d m(wbl.i iVar) {
        ArrayList arrayList;
        d0 d0Var = ((y) ((ael.d0) this.f286251b).f3604a).f288065c;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Set set = iVar.f296267a;
        if (set != null) {
            Set set2 = set;
            arrayList = new ArrayList(zhm.w.t(set2, 10));
            Iterator it8 = set2.iterator();
            while (it8.hasNext()) {
                arrayList.add(tbl.a.b((nel.z) it8.next()));
            }
        } else {
            arrayList = null;
        }
        d0Var.getClass();
        ArrayList arrayList2 = arrayList;
        efm.r map = ((arrayList2 == null || arrayList2.isEmpty()) ? d0Var.e() : d0Var.d(arrayList)).map(new vdl.s(0, new vch.h0(17))).map(new vdl.s(1, new vch.h0(18)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(nim.a.w(nim.a.w(w.f0(map), new aed.a(17)), new x8h.h(13)));
    }

    public Flow n(wbl.i iVar, int i) {
        tv5.b bVar = (tv5.b) this.f286252c;
        Set set = iVar.f296267a;
        nel.z zVar = nel.z.COMMODITY;
        return boh.f.e(nim.a.v(Intrinsics.f(set, y0.b(zVar)) ? rd0.e.b(nim.a.w(((xv5.h) bVar).b(), new x8h.h(14))) : (set == null || set.isEmpty() || set.contains(zVar)) ? (set == null || !set.isEmpty()) ? nim.a.v(u0.m(m(iVar), rd0.e.b(nim.a.w(((xv5.h) bVar).b(), new x8h.h(14)))), new x8h.h(12)) : new go.g(new Data(f0.f322471a, null, false, 6, null), 2) : m(iVar), new wk4.k(i, 2)), new x52.a(this, iVar, 10));
    }

    public ZonedDateTime o(ZonedDateTime currentDate, ZonedDateTime targetDate, List marketClosedDates) {
        ZonedDateTime zonedDateTime;
        ((nvl.j) this.f286251b).getClass();
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(targetDate, "targetDate");
        Intrinsics.checkNotNullParameter(marketClosedDates, "marketClosedDates");
        long jH = ebm.a.h(currentDate, targetDate);
        kotlin.ranges.d.INSTANCE.getClass();
        Iterator<Long> it8 = new kotlin.ranges.d(jH, 0, -1L).iterator();
        do {
            zonedDateTime = null;
            if (!((vim.g) it8).f289628c) {
                break;
            }
            ZonedDateTime zonedDateTimePlusDays = currentDate.plusDays(((m0) it8).nextLong());
            Intrinsics.h(zonedDateTimePlusDays);
            if (!nvl.j.a(zonedDateTimePlusDays, marketClosedDates)) {
                zonedDateTime = zonedDateTimePlusDays;
            }
        } while (zonedDateTime == null);
        return zonedDateTime;
    }

    public String toString() {
        switch (this.f286250a) {
            case 2:
                StringBuilder sb6 = new StringBuilder("[ClassStack (self-refs: ");
                ArrayList arrayList = (ArrayList) this.d;
                sb6.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
                sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                for (g gVar = this; gVar != null; gVar = (g) gVar.f286251b) {
                    sb6.append(zsc.p.SPACE_CHAR);
                    sb6.append(((Class) gVar.f286252c).getName());
                }
                sb6.append(']');
                return sb6.toString();
            default:
                return super.toString();
        }
    }

    public g(nvl.j dateCalculator, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateCalculator, "dateCalculator");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f286251b = dateCalculator;
        this.f286252c = dateProvider;
        this.d = w.y0(new vt3.a(this, 1));
    }

    public g(t0 brandingInteractor, l6d.a brandingPreviewUrlProvider, p1 invoiceInteractor) {
        Intrinsics.checkNotNullParameter(brandingInteractor, "brandingInteractor");
        Intrinsics.checkNotNullParameter(brandingPreviewUrlProvider, "brandingPreviewUrlProvider");
        Intrinsics.checkNotNullParameter(invoiceInteractor, "invoiceInteractor");
        this.f286251b = brandingInteractor;
        this.f286252c = brandingPreviewUrlProvider;
        this.d = invoiceInteractor;
    }

    public g(wtc.h linkedWalletsInteractor, wtc.i linkedWalletsSectionsLoadingCompleteInteractor, l93.f cardInteractor) {
        Intrinsics.checkNotNullParameter(linkedWalletsInteractor, "linkedWalletsInteractor");
        Intrinsics.checkNotNullParameter(linkedWalletsSectionsLoadingCompleteInteractor, "linkedWalletsSectionsLoadingCompleteInteractor");
        Intrinsics.checkNotNullParameter(cardInteractor, "cardInteractor");
        this.f286251b = linkedWalletsInteractor;
        this.f286252c = linkedWalletsSectionsLoadingCompleteInteractor;
        this.d = cardInteractor;
    }

    public g(i41.c environmentCheckProxy, ue0.c storage) {
        Intrinsics.checkNotNullParameter(environmentCheckProxy, "environmentCheckProxy");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f286251b = environmentCheckProxy;
        this.f286252c = storage;
        this.d = zhm.r0.k(new Pair(vza.a.CUSTOM_FIRMWARE, new yy9.s(7)), new Pair(vza.a.CUSTOM_KEYS, new yy9.s(8)), new Pair(vza.a.CUSTOM_OS, new yy9.s(9)), new Pair(vza.a.KA_REVOKED_CERT, new yy9.s(10)), new Pair(vza.a.ROOTED, new yy9.s(11)), new Pair(vza.a.UNLOCKED_BOOTLOADER, new yy9.s(12)));
    }

    public g(g gVar, Class cls) {
        this.f286251b = gVar;
        this.f286252c = cls;
    }

    public g(ael.d0 stocksInteractor, tv5.b currencyDiscoveryInteractor, e9h.d performanceAssetsTransformer) {
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(currencyDiscoveryInteractor, "currencyDiscoveryInteractor");
        Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
        this.f286251b = stocksInteractor;
        this.f286252c = currencyDiscoveryInteractor;
        this.d = performanceAssetsTransformer;
    }

    public g(r0 r0Var) {
        this.f286251b = r0Var;
        this.f286252c = u1.c(r0Var.getSource());
        this.d = u1.b(r0Var.g());
    }

    public g(s20.d agentDataSource, y10.b agentInfoMapper, d4m.a chatDatabaseLazy, d30.c fileUrlDataSource, y10.h mapper) {
        Intrinsics.checkNotNullParameter(agentDataSource, "agentDataSource");
        Intrinsics.checkNotNullParameter(agentInfoMapper, "agentInfoMapper");
        Intrinsics.checkNotNullParameter(chatDatabaseLazy, "chatDatabaseLazy");
        Intrinsics.checkNotNullParameter(fileUrlDataSource, "fileUrlDataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f286251b = agentDataSource;
        this.f286252c = fileUrlDataSource;
        this.d = mapper;
    }

    public g(Context context, smd.s appProcessResolver, ui2.a appInitializerConfiguration, List appScopedInitables, q crashlyticsInitializerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appProcessResolver, "appProcessResolver");
        Intrinsics.checkNotNullParameter(appInitializerConfiguration, "appInitializerConfiguration");
        Intrinsics.checkNotNullParameter(appScopedInitables, "appScopedInitables");
        Intrinsics.checkNotNullParameter(crashlyticsInitializerFactory, "crashlyticsInitializerFactory");
        this.f286251b = context;
        this.f286252c = appProcessResolver;
        this.d = appScopedInitables;
    }
}
