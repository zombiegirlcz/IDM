package cp5;

import android.animation.AnimatorSet;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import ba6.r;
import byl.i;
import ce9.m;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawOrder;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawOrderDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawOrderTransaction;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimCancellationFile;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.experiences.models.TravelExperiencesCashback;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPricing;
import dp5.g0;
import dp5.j0;
import dp5.m0;
import fgm.l;
import hha.g;
import hha.n;
import hha.z;
import igm.o;
import igm.q;
import io.reactivex.rxjava3.core.ObservableSource;
import java.io.File;
import java.math.BigDecimal;
import java.math.MathContext;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import jz8.b0;
import jz8.s;
import jz8.v;
import jz8.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.joda.time.Period;
import qg7.k;
import sgm.h5;
import st3.u;
import zh9.f;
import zh9.h;
import zhm.a0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final boolean A(hha.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List list = dVar.f152291h;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (((g) it8.next()).e != null) {
                return true;
            }
        }
        return false;
    }

    public static final boolean B(Address address) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        if (address.getCity() == null) {
            return true;
        }
        String country = address.getCountry();
        wi0.b.Companion.getClass();
        wi0.a aVar = wi0.b.Companion;
        if (!Intrinsics.f(country, "IE")) {
            return false;
        }
        String postcode = address.getPostcode();
        return postcode == null || postcode.length() != 8;
    }

    public static final boolean C(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return hVar.f322274m == f.Withdrawal;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007b A[LOOP:0: B:23:0x0075->B:25:0x007b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final vkm.d D(cpk.a r9, java.util.List r10, xi0.b r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "allCurrencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "baseCurrency"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L1f
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1f
            goto L66
        L1f:
            java.util.Iterator r0 = r10.iterator()
        L23:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r0.next()
            xi0.b r1 = (xi0.b) r1
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r11)
            if (r1 != 0) goto L23
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L3e:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r10.next()
            xi0.b r1 = (xi0.b) r1
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r1, r11)
            if (r2 == 0) goto L52
            r1 = 0
            goto L58
        L52:
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r1, r11)
            r1 = r2
        L58:
            if (r1 == 0) goto L3e
            r0.add(r1)
            goto L3e
        L5e:
            r10 = 0
            ppk.f r9 = (ppk.f) r9
            efm.r r9 = r9.b(r0, r10)
            goto L95
        L66:
            java.util.ArrayList r9 = new java.util.ArrayList
            r0 = 10
            int r0 = zhm.w.t(r10, r0)
            r9.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        L75:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r0 = r10.next()
            xi0.b r0 = (xi0.b) r0
            n9l.a r1 = new n9l.a
            r7 = 0
            r8 = 0
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6 = 0
            r3 = r11
            r2 = r11
            r1.<init>(r2, r3, r4, r6, r7, r8)
            r9.add(r1)
            goto L75
        L91:
            efm.r r9 = zi0.c.j(r9)
        L95:
            vkm.d r9 = rd0.e.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: cp5.c.D(cpk.a, java.util.List, xi0.b):vkm.d");
    }

    public static final bu3.a E(n04.a aVar, dr3.g promptMapper) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(promptMapper, "promptMapper");
        u uVarB = aVar.getIntro();
        return new bu3.a(uVarB != null ? dr3.g.c(promptMapper, uVarB, null, null, 14) : null, oi0.d.N(aVar.getCalculator()));
    }

    public static final CryptoWithdrawOrder F(j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        m0 m0Var = j0Var.f116770a;
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        String str = m0Var.f116780a;
        String str2 = m0Var.f116781b;
        String str3 = m0Var.f116782c;
        String str4 = m0Var.d;
        long j2 = m0Var.e;
        long j3 = m0Var.f;
        g0 g0Var = m0Var.f116783g;
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        return new CryptoWithdrawOrder(new CryptoWithdrawOrderTransaction(str, str2, str3, str4, j2, j3, new CryptoWithdrawOrderDetails(g0Var.f116757a, g0Var.f116758b), m0Var.f116784h, m0Var.i), v04.b.s(j0Var.f116771b));
    }

    public static final TravelExperiencesPricing G(xzf.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        dj0.d dVarO = mo3.a.o(aVar.getOverallPrice());
        dj0.d dVarO2 = mo3.a.o(aVar.getPriceInRequestedCurrency());
        TravelExperiencesCashback travelExperiencesCashbackR = ue8.c.R(aVar.getCashback());
        vzf.a aVarC = aVar.getPointsOption();
        TravelExperiencesPointsOption travelExperiencesPointsOptionM = aVarC != null ? d.M(aVarC) : null;
        String strD = aVar.getPointsReward();
        return new TravelExperiencesPricing(dVarO, dVarO2, travelExperiencesCashbackR, travelExperiencesPointsOptionM, strD != null ? qvb.a.d(strD) : null);
    }

    public static final TravelExperiencesPricing H(yzf.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        dj0.d dVarV = hx7.a.v(aVar.getOverallPrice());
        dj0.d dVarV2 = hx7.a.v(aVar.getPriceInRequestedCurrency());
        TravelExperiencesCashback travelExperiencesCashbackS = ue8.c.S(aVar.getCashback());
        wzf.a aVarC = aVar.getPointsOption();
        TravelExperiencesPointsOption travelExperiencesPointsOptionN = aVarC != null ? d.N(aVarC) : null;
        String strD = aVar.getPointsReward();
        return new TravelExperiencesPricing(dVarV, dVarV2, travelExperiencesCashbackS, travelExperiencesPointsOptionN, strD != null ? qvb.a.d(strD) : null);
    }

    public static final ej0.b I(ko3.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        BigDecimal bigDecimal = new BigDecimal(bVar.getValue(), MathContext.DECIMAL128);
        xi0.a aVar = xi0.b.Companion;
        String currency = bVar.getCurrency();
        aVar.getClass();
        return new ej0.b(bigDecimal, xi0.a.a(currency));
    }

    public static final u09.e J(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        if (sVar instanceof v) {
            v vVar = (v) sVar;
            List list = vVar.f179674b;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(J((s) it8.next()));
            }
            return new u09.b(vVar.f179675c, arrayList);
        }
        if (!(sVar instanceof y)) {
            if (sVar instanceof b0) {
                return new u09.d(((b0) sVar).f179605b);
            }
            throw new NoWhenBranchMatchedException();
        }
        List list2 = ((y) sVar).f179681b;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(J((s) it9.next()));
        }
        return new u09.c(arrayList2);
    }

    public static final u09.e K(vz8.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (eVar instanceof vz8.f) {
            vz8.f fVar = (vz8.f) eVar;
            List list = fVar.f293414b;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(K((vz8.e) it8.next()));
            }
            return new u09.b(fVar.f293415c, arrayList);
        }
        if (!(eVar instanceof vz8.g)) {
            if (eVar instanceof vz8.h) {
                return new u09.d(((vz8.h) eVar).f293420b);
            }
            throw new NoWhenBranchMatchedException();
        }
        List list2 = ((vz8.g) eVar).f293418b;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(K((vz8.e) it9.next()));
        }
        return new u09.c(arrayList2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final u61.a L(zk3.a r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            u61.a r0 = new u61.a
            java.lang.String r1 = r3.getChannel()
            int r2 = r1.hashCode()
            switch(r2) {
                case 82233: goto L37;
                case 2060894: goto L2b;
                case 2067288: goto L1f;
                case 66081660: goto L13;
                default: goto L12;
            }
        L12:
            goto L3f
        L13:
            java.lang.String r2 = "EMAIL"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1c
            goto L3f
        L1c:
            com.revolut.domain.models.login.ChannelType r1 = com.revolut.domain.models.login.ChannelType.EMAIL
            goto L43
        L1f:
            java.lang.String r2 = "CHAT"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L28
            goto L3f
        L28:
            com.revolut.domain.models.login.ChannelType r1 = com.revolut.domain.models.login.ChannelType.CHAT
            goto L43
        L2b:
            java.lang.String r2 = "CALL"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L34
            goto L3f
        L34:
            com.revolut.domain.models.login.ChannelType r1 = com.revolut.domain.models.login.ChannelType.CALL
            goto L43
        L37:
            java.lang.String r2 = "SMS"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L41
        L3f:
            r1 = 0
            goto L43
        L41:
            com.revolut.domain.models.login.ChannelType r1 = com.revolut.domain.models.login.ChannelType.SMS
        L43:
            java.lang.String r3 = r3.getValue()
            r0.<init>(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cp5.c.L(zk3.a):u61.a");
    }

    public static final ko3.b M(ej0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String plainString = bVar.f126703a.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return new ko3.b(plainString, bVar.f126704b.f306286a);
    }

    public static final s N(u09.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (eVar instanceof u09.b) {
            u09.b bVar = (u09.b) eVar;
            ArrayList arrayList = bVar.f276100a;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(N((u09.e) it8.next()));
            }
            return new v(bVar.f276101b, arrayList2);
        }
        if (!(eVar instanceof u09.c)) {
            if (eVar instanceof u09.d) {
                return new b0(((u09.d) eVar).f276105a);
            }
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList3 = ((u09.c) eVar).f276104a;
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            arrayList4.add(N((u09.e) it9.next()));
        }
        return new y(arrayList4);
    }

    public static final yzf.a O(TravelExperiencesPricing travelExperiencesPricing) {
        Intrinsics.checkNotNullParameter(travelExperiencesPricing, "<this>");
        jo3.b bVarA = hx7.a.A(travelExperiencesPricing.f93198a);
        jo3.b bVarA2 = hx7.a.A(travelExperiencesPricing.f93199b);
        lzf.a aVarE0 = ue8.c.e0(travelExperiencesPricing.f93200c);
        TravelExperiencesPointsOption travelExperiencesPointsOption = travelExperiencesPricing.d;
        wzf.a aVarZ = travelExperiencesPointsOption != null ? d.Z(travelExperiencesPointsOption) : null;
        RevPoints revPoints = travelExperiencesPricing.e;
        return new yzf.a(bVarA, bVarA2, aVarE0, aVarZ, revPoints != null ? revPoints.W() : null);
    }

    public static final pei.a P(tei.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (fag.c.f133310a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return pei.a.CREATED;
            case 4:
            case 5:
                return pei.a.CANCELLED;
            case 6:
            case 7:
                return pei.a.CONFIRMED;
            case 8:
                return pei.a.FAILED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ArrayList Q(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new File(((CFACClaimCancellationFile) it8.next()).f74938b));
        }
        return arrayList2;
    }

    public static final String R(ZonedDateTime zonedDateTime) {
        Intrinsics.checkNotNullParameter(zonedDateTime, "<this>");
        String str = zonedDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static boolean S(l lVar, o oVar, ObservableSource observableSource) {
        if (!(observableSource instanceof q)) {
            return false;
        }
        try {
            Object obj2 = ((q) observableSource).get();
            if (obj2 == null) {
                jgm.c.a(lVar);
                return true;
            }
            try {
                Object objApply = oVar.apply(obj2);
                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource2 = (ObservableSource) objApply;
                if (!(observableSource2 instanceof q)) {
                    observableSource2.subscribe(lVar);
                    return true;
                }
                try {
                    Object obj3 = ((q) observableSource2).get();
                    if (obj3 == null) {
                        jgm.c.a(lVar);
                        return true;
                    }
                    h5 h5Var = new h5(lVar, obj3);
                    lVar.onSubscribe(h5Var);
                    h5Var.run();
                    return true;
                } catch (Throwable th10) {
                    m.F(th10);
                    jgm.c.c(th10, lVar);
                    return true;
                }
            } catch (Throwable th11) {
                m.F(th11);
                jgm.c.c(th11, lVar);
                return true;
            }
        } catch (Throwable th12) {
            m.F(th12);
            jgm.c.c(th12, lVar);
            return true;
        }
    }

    public static final void T(kk0.a aVar, String key, k action) {
        ReentrantReadWriteLock reentrantReadWriteLock;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "keyLock");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (aVar.f184498a) {
            try {
                HashMap map = aVar.f184498a;
                Object reentrantReadWriteLock2 = map.get(key);
                if (reentrantReadWriteLock2 == null) {
                    reentrantReadWriteLock2 = new ReentrantReadWriteLock();
                    map.put(key, reentrantReadWriteLock2);
                }
                reentrantReadWriteLock = (ReentrantReadWriteLock) reentrantReadWriteLock2;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            action.invoke();
        } finally {
            writeLock.unlock();
            aVar.a(key);
        }
    }

    public static final int a(LayerDrawable layerDrawable) {
        return layerDrawable.getNumberOfLayers() - 1;
    }

    public static void b(AnimatorSet animatorSet, ht0.b0 b0Var, byl.d dVar, byl.d dVar2, int i) {
        Object yVar = b0Var;
        if ((i & 1) != 0) {
            yVar = new bu7.y(21);
        }
        Object yVar2 = dVar;
        if ((i & 2) != 0) {
            yVar2 = new bu7.y(22);
        }
        Object yVar3 = dVar2;
        if ((i & 4) != 0) {
            yVar3 = new bu7.y(23);
        }
        animatorSet.addListener(new i(yVar, 0, yVar2, yVar3));
    }

    public static final void c(List list, Path path, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        int i3 = (i2 - i) + 1;
        for (int i5 = 0; i5 < i3; i5++) {
            PointF pointF = (PointF) list.get(i + i5);
            if (i5 == 0) {
                path.moveTo(pointF.x, pointF.y);
            } else {
                path.lineTo(pointF.x, pointF.y);
            }
        }
    }

    public static /* synthetic */ void d(List list, Path path) {
        c(list, path, 0, zhm.v.j(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(android.content.Context r5, android.graphics.Bitmap r6, int r7) throws java.lang.Throwable {
        /*
            r0 = 0
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r5)     // Catch: java.lang.Throwable -> L4c
            android.renderscript.RenderScript$RSMessageHandler r1 = new android.renderscript.RenderScript$RSMessageHandler     // Catch: java.lang.Throwable -> L48
            r1.<init>()     // Catch: java.lang.Throwable -> L48
            r5.setMessageHandler(r1)     // Catch: java.lang.Throwable -> L48
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: java.lang.Throwable -> L48
            r2 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r5, r6, r1, r2)     // Catch: java.lang.Throwable -> L48
            android.renderscript.Type r2 = r1.getType()     // Catch: java.lang.Throwable -> L43
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r5, r2)     // Catch: java.lang.Throwable -> L43
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r5)     // Catch: java.lang.Throwable -> L3e
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r5, r3)     // Catch: java.lang.Throwable -> L3e
            r0.setInput(r1)     // Catch: java.lang.Throwable -> L3e
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L3e
            r0.setRadius(r7)     // Catch: java.lang.Throwable -> L3e
            r0.forEach(r2)     // Catch: java.lang.Throwable -> L3e
            r2.copyTo(r6)     // Catch: java.lang.Throwable -> L3e
            android.renderscript.RenderScript.releaseAllContexts()
            r1.destroy()
            r2.destroy()
            r0.destroy()
            return
        L3e:
            r6 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L50
        L43:
            r6 = move-exception
            r2 = r0
        L45:
            r0 = r5
            r5 = r2
            goto L50
        L48:
            r6 = move-exception
            r1 = r0
            r2 = r1
            goto L45
        L4c:
            r6 = move-exception
            r5 = r0
            r1 = r5
            r2 = r1
        L50:
            if (r0 == 0) goto L55
            android.renderscript.RenderScript.releaseAllContexts()
        L55:
            if (r1 == 0) goto L5a
            r1.destroy()
        L5a:
            if (r2 == 0) goto L5f
            r2.destroy()
        L5f:
            if (r5 == 0) goto L64
            r5.destroy()
        L64:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cp5.c.e(android.content.Context, android.graphics.Bitmap, int):void");
    }

    public static final String f(String str) {
        Locale locale;
        String displayCountry;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale[] availableLocales = Locale.getAvailableLocales();
        Intrinsics.checkNotNullExpressionValue(availableLocales, "getAvailableLocales(...)");
        int length = availableLocales.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                locale = null;
                break;
            }
            locale = availableLocales[i];
            if (Intrinsics.f(locale.getCountry(), str)) {
                break;
            }
            i++;
        }
        return (locale == null || (displayCountry = locale.getDisplayCountry()) == null) ? str : displayCountry;
    }

    public static final g g(hha.d dVar, Period period) {
        Object next;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(period, "period");
        Iterator it8 = dVar.f152291h.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((g) next).f152306a, period)) {
                break;
            }
        }
        return (g) next;
    }

    public static final PointF h(List list, float f) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Integer numI = i(list, f, dt0.b.FIND_ANY);
        if (numI != null) {
            return (PointF) list.get(numI.intValue());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r4 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        return java.lang.Integer.valueOf(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        r4 = r4 * (-1);
        r9 = r4 - 2;
        r4 = r4 - 1;
        r0 = (android.graphics.PointF) zhm.d0.e0(r9, r7);
        r7 = (android.graphics.PointF) zhm.d0.e0(r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r7 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (java.lang.Math.abs(r7.x - r8) >= java.lang.Math.abs(r0.x - r8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        return java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r7 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        return java.lang.Integer.valueOf(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        return java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer i(java.util.List r7, float r8, dt0.b r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "ifExactMatch"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            int r0 = r7.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = -1
            r4 = r3
        L13:
            if (r2 > r0) goto L4d
            int r5 = r2 + r0
            int r5 = r5 >>> r1
            java.lang.Object r6 = r7.get(r5)
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            float r6 = r6.x
            int r6 = java.lang.Float.compare(r6, r8)
            if (r6 >= 0) goto L29
            int r2 = r5 + 1
            goto L13
        L29:
            if (r6 <= 0) goto L2e
            int r0 = r5 + (-1)
            goto L13
        L2e:
            int[] r4 = dt0.a.f117344a
            int r6 = r9.ordinal()
            r4 = r4[r6]
            if (r4 == r1) goto L4b
            r6 = 2
            if (r4 == r6) goto L48
            r2 = 3
            if (r4 != r2) goto L42
            int r2 = r5 + 1
        L40:
            r4 = r5
            goto L13
        L42:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L48:
            int r0 = r5 + (-1)
            goto L40
        L4b:
            r4 = r5
            goto L52
        L4d:
            if (r4 < 0) goto L50
            goto L52
        L50:
            int r2 = r2 + r1
            int r4 = -r2
        L52:
            if (r4 < 0) goto L59
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            return r7
        L59:
            int r4 = r4 * r3
            int r9 = r4 + (-2)
            int r4 = r4 - r1
            java.lang.Object r0 = zhm.d0.e0(r9, r7)
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            java.lang.Object r7 = zhm.d0.e0(r4, r7)
            android.graphics.PointF r7 = (android.graphics.PointF) r7
            if (r7 == 0) goto L85
            if (r0 == 0) goto L85
            float r7 = r7.x
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            float r0 = r0.x
            float r0 = r0 - r8
            float r8 = java.lang.Math.abs(r0)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L80
            r9 = r4
        L80:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            return r7
        L85:
            if (r7 == 0) goto L8c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            return r7
        L8c:
            if (r0 == 0) goto L93
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            return r7
        L93:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cp5.c.i(java.util.List, float, dt0.b):java.lang.Integer");
    }

    public static final boolean j(gh0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.getSource() == gh0.d.GOOGLE;
    }

    public static final int k(pu3.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        switch (q84.c.f242971a[dVar.ordinal()]) {
            case 1:
                return R$string.credit_application_outstanding_debts_debt_details_mortgage_title;
            case 2:
                return R$string.credit_application_outstanding_debts_debt_details_credit_card_title;
            case 3:
                return R$string.credit_application_outstanding_debts_debt_details_loan_title;
            case 4:
                return R$string.credit_application_outstanding_debts_debt_details_line_of_credit_title;
            case 5:
                return R$string.credit_application_outstanding_debts_debt_details_overdraft_title;
            case 6:
                return R$string.credit_application_outstanding_debts_debt_details_bnpl_title;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ArrayList l(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ti7.h) it8.next()).d);
        }
        return w.u(arrayList);
    }

    public static final hha.o m(hha.d dVar, Period billingPeriod) {
        Object next;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
        List list = dVar.f152291h;
        xi0.b bVar = dVar.d;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((g) next).f152306a, billingPeriod)) {
                break;
            }
        }
        g gVar = (g) next;
        if (gVar == null) {
            n nVar = hha.o.Companion;
            dj0.d dVar2 = new dj0.d(0L, bVar);
            nVar.getClass();
            return n.a(dVar2);
        }
        if (gVar.f != null) {
            n nVar2 = hha.o.Companion;
            dj0.d dVar3 = new dj0.d(0L, bVar);
            nVar2.getClass();
            return n.a(dVar3);
        }
        hha.f fVar = gVar.e;
        if (fVar != null) {
            hha.o oVar = fVar.d;
            if (oVar != null) {
                return oVar;
            }
            n nVar3 = hha.o.Companion;
            dj0.d dVar4 = fVar.f152304c;
            nVar3.getClass();
            return n.a(dVar4);
        }
        hha.o oVar2 = gVar.d;
        if (oVar2 != null) {
            return oVar2;
        }
        n nVar4 = hha.o.Companion;
        dj0.d dVar5 = gVar.f152308c;
        nVar4.getClass();
        return n.a(dVar5);
    }

    public static final dj0.d n(hha.d dVar, Period billingPeriod) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
        return m(dVar, billingPeriod).f152326a;
    }

    public static final Pair o(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        BigDecimal bigDecimal = hVar.f322269c;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimalValueOf);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return new Pair(bigDecimalMultiply, hVar.f322268b);
    }

    public static final oha.a p(hha.d dVar, oha.e productType) {
        Object next;
        dj0.d dVar2;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Iterator it8 = dVar.i.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            oha.a aVar = (oha.a) next;
            if (aVar.f225325b.equals(productType) && aVar.f225326c == 0.0d && ((dVar2 = aVar.f) == null || dVar2.k())) {
                dj0.d dVar3 = aVar.f225327g;
                if (dVar3 == null || dVar3.k()) {
                    break;
                }
            }
        }
        return (oha.a) next;
    }

    public static final z q(hha.d dVar) {
        Object next;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Iterator it8 = dVar.f152291h.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((g) next).f != null) {
                break;
            }
        }
        g gVar = (g) next;
        if (gVar != null) {
            return gVar.f;
        }
        return null;
    }

    public static final q84.b r(pu3.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        switch (q84.c.f242971a[dVar.ordinal()]) {
            case 1:
                return q84.b.MORTGAGE;
            case 2:
                return q84.b.CREDIT_CARD;
            case 3:
                return q84.b.LOAN;
            case 4:
            case 5:
            case 6:
                return q84.b.OTHER;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Pair s(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        BigDecimal bigDecimal = hVar.e;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimalValueOf);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return new Pair(bigDecimalMultiply, hVar.f322268b);
    }

    public static final int t(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return 100 - rim.d.c((hVar.f.f115082a * 100.0f) / hVar.f322273l.f115082a);
    }

    public static final dj0.d u(r rVar, xi0.b donationCurrency) {
        Intrinsics.checkNotNullParameter(donationCurrency, "donationCurrency");
        Object obj2 = null;
        if (rVar == null) {
            return null;
        }
        Iterator it8 = rVar.e.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((dj0.d) next).f115083b, donationCurrency)) {
                obj2 = next;
                break;
            }
        }
        return (dj0.d) obj2;
    }

    public static final int v(dp8.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int i = ip8.a.f167678a[dVar.ordinal()];
        if (i == 1) {
            return com.revolut.feature.junior_tasks.api.R$string.junior_challenges_common_frequency_daily;
        }
        if (i == 2) {
            return com.revolut.feature.junior_tasks.api.R$string.junior_challenges_common_frequency_weekly;
        }
        if (i == 3) {
            return com.revolut.feature.junior_tasks.api.R$string.junior_challenges_common_frequency_monthly;
        }
        if (i == 4) {
            return com.revolut.feature.junior_tasks.api.R$string.junior_challenges_common_frequency_one_off;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int w(pu3.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        switch (q84.c.f242971a[dVar.ordinal()]) {
            case 1:
                return R$string.credit_application_outstanding_debts_add_debt_dialog_mortgage_title;
            case 2:
                return R$string.credit_application_outstanding_debts_add_debt_dialog_credit_card_title;
            case 3:
                return R$string.credit_application_outstanding_debts_add_debt_dialog_loan_title;
            case 4:
                return R$string.credit_application_outstanding_debts_add_debt_line_of_credit;
            case 5:
                return R$string.credit_application_outstanding_debts_add_debt_overdraft;
            case 6:
                return R$string.credit_application_outstanding_debts_add_debt_bnpl;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int x(pu3.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i = q84.c.f242972b[eVar.ordinal()];
        if (i == 1) {
            return R$string.credit_application_outstanding_debts_debt_details_repayment_amount;
        }
        if (i == 2) {
            return R$string.credit_application_outstanding_debts_debt_details_credit_limit;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final pu3.e y(pu3.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        switch (q84.c.f242971a[dVar.ordinal()]) {
            case 1:
            case 3:
                return pu3.e.MONTHLY_REPAYMENT;
            case 2:
            case 4:
            case 5:
            case 6:
                return pu3.e.LIMIT;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ArrayList z(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        IntRange intRangeO = kotlin.ranges.f.o(0, viewGroup.getChildCount());
        ArrayList<View> arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(viewGroup.getChildAt(it8.nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (View view : arrayList) {
            a0.x(view instanceof ViewGroup ? d0.E0(z((ViewGroup) view), zhm.u.c(view)) : zhm.u.c(view), arrayList2);
        }
        return arrayList2;
    }
}
