package mod;

import com.revolut.retail.feature.api.trips.models.Trip;
import com.revolut.retail.feature.api.trips.models.TripTransactionAdjustment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ood.x0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0j.a f207622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f207623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f207624c;

    public l(j0j.a tripsInteractor, x0 stateHolder, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(tripsInteractor, "tripsInteractor");
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f207622a = tripsInteractor;
        this.f207623b = stateHolder;
        this.f207624c = dateProvider;
    }

    public static ArrayList a(Trip trip, ArrayList arrayList) {
        List list = trip.e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((TripTransactionAdjustment) obj2).f99268b == k0j.a.EXCLUDED) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((TripTransactionAdjustment) it8.next()).f99267a);
        }
        Set setH1 = d0.h1(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list) {
            if (((TripTransactionAdjustment) obj3).f99268b == k0j.a.INCLUDED) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
        Iterator it9 = arrayList4.iterator();
        while (it9.hasNext()) {
            arrayList5.add(((TripTransactionAdjustment) it9.next()).f99267a);
        }
        Set setH12 = d0.h1(arrayList5);
        Iterator it10 = arrayList.iterator();
        while (it10.hasNext()) {
            ard.j jVar = (ard.j) it10.next();
            ard.i iVar = jVar.f8656b;
            String str = jVar.f8655a;
            int i = g.f207614a[iVar.ordinal()];
            if (i == 1) {
                setH12.add(str);
                setH1.remove(str);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                setH1.add(str);
                setH12.remove(str);
            }
        }
        ArrayList arrayList6 = new ArrayList(zhm.w.t(setH1, 10));
        Iterator it11 = setH1.iterator();
        while (it11.hasNext()) {
            arrayList6.add(new TripTransactionAdjustment((String) it11.next(), k0j.a.EXCLUDED));
        }
        ArrayList arrayList7 = new ArrayList(zhm.w.t(setH12, 10));
        Iterator it12 = setH12.iterator();
        while (it12.hasNext()) {
            arrayList7.add(new TripTransactionAdjustment((String) it12.next(), k0j.a.INCLUDED));
        }
        return d0.E0(arrayList7, arrayList6);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.retail.feature.api.trips.models.Trip r8, java.time.LocalDate r9, java.time.LocalDate r10, gim.c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof mod.h
            if (r0 == 0) goto L14
            r0 = r11
            mod.h r0 = (mod.h) r0
            int r1 = r0.f207615w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f207615w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            mod.h r0 = new mod.h
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f207615w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r11)
            goto L68
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r11)
            java.lang.String r8 = r8.f99263a
            java.time.ZoneId r11 = g0m.a.f139502a
            java.time.ZonedDateTime r3 = r9.atStartOfDay(r11)
            if (r10 == 0) goto L56
            r4 = 1
            java.time.LocalDate r9 = r10.plusDays(r4)
            if (r9 == 0) goto L56
            java.time.ZonedDateTime r9 = r9.atStartOfDay(r11)
            if (r9 == 0) goto L56
            java.time.Duration r10 = java.time.Duration.ofMillis(r4)
            java.time.ZonedDateTime r9 = r9.minus(r10)
        L54:
            r4 = r9
            goto L58
        L56:
            r9 = 0
            goto L54
        L58:
            r6.f207615w = r2
            j0j.a r9 = r7.f207622a
            r1 = r9
            vvj.g r1 = (vvj.g) r1
            r5 = 0
            r2 = r8
            java.lang.Object r11 = r1.g(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L68
            return r0
        L68:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r8 = r11.booleanValue()
            if (r8 == 0) goto L73
            mod.d$b r8 = mod.d.b.f207609a
            return r8
        L73:
            mod.d$a r8 = mod.d.a.f207608a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mod.l.b(com.revolut.retail.feature.api.trips.models.Trip, java.time.LocalDate, java.time.LocalDate, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008d -> B:36:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a7 -> B:29:0x00aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.Set r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mod.l.c(java.util.Set, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.retail.feature.api.trips.models.Trip r9, ard.f r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mod.l.d(com.revolut.retail.feature.api.trips.models.Trip, ard.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.retail.feature.api.trips.models.Trip r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mod.k
            if (r0 == 0) goto L13
            r0 = r6
            mod.k r0 = (mod.k) r0
            int r1 = r0.f207621x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207621x = r1
            goto L18
        L13:
            mod.k r0 = new mod.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207621x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.retail.feature.api.trips.models.Trip r5 = r0.u
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = r5.f99263a
            r0.u = r5
            r0.f207621x = r3
            j0j.a r2 = r4.f207622a
            vvj.g r2 = (vvj.g) r2
            java.lang.Object r6 = r2.c(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L55
            ood.x0 r6 = r4.f207623b
            r6.a(r5)
            mod.f$b r5 = mod.f.b.f207613a
            return r5
        L55:
            mod.f$a r5 = mod.f.a.f207612a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mod.l.e(com.revolut.retail.feature.api.trips.models.Trip, gim.c):java.lang.Object");
    }
}
