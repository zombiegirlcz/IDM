package yoj;

import android.graphics.Rect;
import aw0.o9;
import ch.qos.logback.core.CoreConstants;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.models.GroupAnalytics;
import com.revolut.feature.payments.groups.models.GroupCurrencySpend;
import com.revolut.feature.payments.groups.models.GroupSettings;
import com.revolut.feature.shops.api.model.ShopsAvailabilityInOutlet;
import com.revolut.feature.shops.api.model.ShopsOutlet;
import com.revolut.feature.shops.api.model.ShopsOutletAvailabilityInterval;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import cr9.i;
import cr9.j;
import cr9.k;
import cr9.v;
import cr9.y;
import eid.u;
import ft3.d1;
import ft3.g1;
import g9j.x;
import ggc.a0;
import ggc.b0;
import io.fotoapparat.view.CameraView;
import io3.h;
import io3.l;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import le.u1;
import oq9.m;
import oq9.n;
import oq9.p;
import oq9.q;
import oq9.r;
import oq9.s;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import sid.o;
import tof.a3;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {
    public static final x A(io3.g gVar, dj0.d dVar, Function1 convertLockedGiftBalance) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(convertLockedGiftBalance, "convertLockedGiftBalance");
        if (dVar == null || gVar.f163163a.e == l.LOCKED_GIFT || dVar.f115082a <= 0) {
            dVar = null;
        }
        dj0.d dVar2 = dVar != null ? (dj0.d) convertLockedGiftBalance.invoke(dVar) : null;
        io3.d dVar3 = gVar.f163163a;
        dj0.d dVarO = pyd.c.O(pyd.c.O(h.e(dVar3), new dj0.d(dVar3.f163151l, z92.f.l(dVar3))), dVar);
        dj0.d dVarO2 = pyd.c.O(pyd.c.M(gVar.e), dVar2);
        dj0.d dVar4 = dVar3.e == l.LOCKED_GIFT ? new dj0.d(0L, z92.f.l(dVar3)) : h.e(dVar3);
        dj0.d dVarE = h.e(dVar3);
        if (dVar == null) {
            dVar = new dj0.d(0L, z92.f.l(dVar3));
        }
        return new x(dVarO, dVarO2, dVar4, pyd.c.O(dVarE, dVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final a2l.h B(q1l.a r17) {
        /*
            r0 = r17
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = r0.f241466a
            q1l.d r2 = r0.f241467b
            if (r2 == 0) goto L15
            a2l.c r4 = new a2l.c
            java.lang.String r2 = r2.f241471a
            r4.<init>(r2)
            goto L16
        L15:
            r4 = 0
        L16:
            java.util.List r0 = r0.f241468c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = zhm.w.t(r0, r5)
            r2.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L95
            java.lang.Object r5 = r0.next()
            q1l.h r5 = (q1l.h) r5
            java.lang.String r7 = r5.f241474a
            java.lang.String r8 = r5.f241475b
            java.lang.String r9 = r5.f241476c
            java.lang.String r10 = r5.d
            java.lang.String r6 = r5.f
            r11 = 0
            r12 = 1
            if (r6 == 0) goto L5f
            a2l.g[] r13 = a2l.g.values()
            int r14 = r13.length
            r15 = r11
        L49:
            if (r15 >= r14) goto L5b
            r16 = r13[r15]
            java.lang.String r3 = r16.name()
            boolean r3 = kotlin.text.a0.z(r3, r6, r12)
            if (r3 == 0) goto L58
            goto L5d
        L58:
            int r15 = r15 + 1
            goto L49
        L5b:
            r16 = 0
        L5d:
            if (r16 != 0) goto L61
        L5f:
            a2l.g r16 = a2l.g.UNKNOWN
        L61:
            java.lang.String r3 = r5.e
            if (r3 == 0) goto L7f
            a2l.e[] r6 = a2l.e.values()
            int r13 = r6.length
        L6a:
            if (r11 >= r13) goto L7c
            r14 = r6[r11]
            java.lang.String r15 = r14.name()
            boolean r15 = kotlin.text.a0.z(r15, r3, r12)
            if (r15 == 0) goto L79
            goto L7d
        L79:
            int r11 = r11 + 1
            goto L6a
        L7c:
            r14 = 0
        L7d:
            r12 = r14
            goto L80
        L7f:
            r12 = 0
        L80:
            java.lang.String r13 = r5.f241477g
            java.lang.String r14 = r5.f241478h
            java.lang.String r15 = r5.i
            java.util.List r3 = r5.f241479j
            a2l.f r6 = new a2l.f
            r11 = r16
            r16 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.add(r6)
            goto L29
        L95:
            a2l.h r0 = new a2l.h
            r0.<init>(r1, r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yoj.b.B(q1l.a):a2l.h");
    }

    public static final co3.a C(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return new co3.a(uVar.getLat(), uVar.getLong());
    }

    public static final co3.a D(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return new co3.a(oVar.getLat(), oVar.getLong());
    }

    public static final PaymentGroup E(v groupDto) {
        xi0.b bVarA;
        oq9.a aVar;
        xi0.b bVarA2;
        GroupAnalytics groupAnalytics;
        oq9.e cVar;
        dj0.d dVar;
        dj0.d dVar2;
        dj0.d dVar3;
        dj0.d dVar4;
        dj0.d dVar5;
        dj0.d dVar6;
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        LinkedHashMap identifiers;
        oq9.o nVar;
        oq9.o mVar;
        String str4;
        y.b bVar;
        r rVar;
        wi0.b bVarC;
        ArrayList arrayList2;
        String str5;
        y.a aVar2;
        wi0.b bVarC2;
        String strA;
        Intrinsics.checkNotNullParameter(groupDto, "<this>");
        String strD = groupDto.getId();
        String strH = groupDto.getName();
        String strE = groupDto.getImageUrl();
        List listG = groupDto.getMembers();
        String groupId = groupDto.getId();
        Intrinsics.checkNotNullParameter(listG, "<this>");
        String str6 = "groupId";
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        List<y> list = listG;
        int iB = q0.b(w.t(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap identifiers2 = new LinkedHashMap(iB);
        for (y yVar : list) {
            boolean z = yVar instanceof y.a;
            if (z) {
                strA = ((y.a) yVar).getMemberId();
            } else if (yVar instanceof y.b) {
                strA = ((y.b) yVar).getMemberId();
            } else {
                if (!(yVar instanceof y.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                strA = ((y.c) yVar).getMemberId();
            }
            Object qVar = r.a.f227851a;
            if (z) {
                y.a aVar3 = (y.a) yVar;
                if (aVar3.getCode() != null) {
                    qVar = new p(aVar3.getCode(), aVar3.getUsername());
                } else if (aVar3.getPhone() != null) {
                    qVar = new s(aVar3.getPhone());
                } else if (aVar3.getEmail() != null) {
                    qVar = new q(aVar3.getEmail());
                }
            } else if (yVar instanceof y.b) {
                y.b bVar2 = (y.b) yVar;
                if (bVar2.getCode() != null) {
                    qVar = new p(bVar2.getCode(), bVar2.getUsername());
                } else if (bVar2.getPhone() != null) {
                    qVar = new s(bVar2.getPhone());
                } else if (bVar2.getEmail() != null) {
                    qVar = new q(bVar2.getEmail());
                }
            } else if (!(yVar instanceof y.c)) {
                throw new NoWhenBranchMatchedException();
            }
            identifiers2.put(strA, qVar);
        }
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            y yVar2 = (y) it8.next();
            Intrinsics.checkNotNullParameter(yVar2, "<this>");
            Intrinsics.checkNotNullParameter(groupId, str6);
            Intrinsics.checkNotNullParameter(identifiers2, "identifiers");
            Iterator it9 = it8;
            String str7 = "";
            if (yVar2 instanceof y.a) {
                y.a aVar4 = (y.a) yVar2;
                Intrinsics.checkNotNullParameter(aVar4, "<this>");
                Intrinsics.checkNotNullParameter(groupId, str6);
                Intrinsics.checkNotNullParameter(identifiers2, "identifiers");
                String str8 = str6;
                String strG = aVar4.getMemberId();
                str = strD;
                r rVar2 = (r) identifiers2.get(aVar4.getInviterId());
                if (rVar2 == null) {
                    throw new IllegalStateException(a0.d.s("No identifier found for inviterId=", aVar4.getInviterId(), ", memberId=", aVar4.getMemberId()));
                }
                r rVar3 = (r) identifiers2.get(aVar4.getMemberId());
                if (rVar3 == null) {
                    throw new IllegalStateException(a0.d.s("No identifier found for memberId=", aVar4.getMemberId(), ", inviterId=", aVar4.getInviterId()));
                }
                String strD2 = aVar4.getFirstName();
                if (strD2 == null) {
                    m70.a.c(t0.f186434a);
                    str5 = "";
                } else {
                    str5 = strD2;
                }
                String strF = aVar4.getLastName();
                if (strF == null) {
                    m70.a.c(t0.f186434a);
                } else {
                    str7 = strF;
                }
                String strB = aVar4.getCountryCode();
                if (strB != null) {
                    aVar2 = aVar4;
                    bVarC2 = com.bumptech.glide.d.c(strB);
                } else {
                    aVar2 = aVar4;
                    bVarC2 = null;
                }
                identifiers = identifiers2;
                arrayList2 = arrayList3;
                str2 = strH;
                str3 = str8;
                mVar = new oq9.l(strG, groupId, rVar2, rVar3, str5, str7, bVarC2, aVar2.j(), null);
            } else {
                str = strD;
                str2 = strH;
                str3 = str6;
                arrayList = arrayList3;
                identifiers = identifiers2;
                if (yVar2 instanceof y.b) {
                    y.b bVar3 = (y.b) yVar2;
                    Intrinsics.checkNotNullParameter(bVar3, "<this>");
                    Intrinsics.checkNotNullParameter(groupId, str3);
                    Intrinsics.checkNotNullParameter(identifiers, "identifiers");
                    String strG2 = bVar3.getMemberId();
                    r rVar4 = (r) identifiers.get(bVar3.getInviterId());
                    if (rVar4 == null) {
                        throw new IllegalStateException(a0.d.s("No identifier found for inviterId=", bVar3.getInviterId(), ", memberId=", bVar3.getMemberId()));
                    }
                    r rVar5 = (r) identifiers.get(bVar3.getMemberId());
                    if (rVar5 == null) {
                        throw new IllegalStateException(a0.d.s("No identifier found for memberId=", bVar3.getMemberId(), ", inviterId=", bVar3.getInviterId()));
                    }
                    String strD3 = bVar3.getFirstName();
                    if (strD3 == null) {
                        m70.a.c(t0.f186434a);
                        str4 = "";
                    } else {
                        str4 = strD3;
                    }
                    String strF2 = bVar3.getLastName();
                    if (strF2 == null) {
                        m70.a.c(t0.f186434a);
                    } else {
                        str7 = strF2;
                    }
                    String strB2 = bVar3.getCountryCode();
                    if (strB2 != null) {
                        bVar = bVar3;
                        rVar = rVar5;
                        bVarC = com.bumptech.glide.d.c(strB2);
                    } else {
                        bVar = bVar3;
                        rVar = rVar5;
                        bVarC = null;
                    }
                    arrayList2 = arrayList;
                    mVar = new m(strG2, groupId, rVar4, rVar, str4, str7, bVarC, bVar.j(), null);
                } else {
                    if (!(yVar2 instanceof y.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    y.c cVar2 = (y.c) yVar2;
                    Intrinsics.checkNotNullParameter(cVar2, "<this>");
                    Intrinsics.checkNotNullParameter(groupId, str3);
                    nVar = new n(cVar2.getMemberId(), groupId);
                    arrayList.add(nVar);
                    identifiers2 = identifiers;
                    arrayList3 = arrayList;
                    it8 = it9;
                    strD = str;
                    str6 = str3;
                    strH = str2;
                }
            }
            oq9.o oVar = mVar;
            arrayList = arrayList2;
            nVar = oVar;
            arrayList.add(nVar);
            identifiers2 = identifiers;
            arrayList3 = arrayList;
            it8 = it9;
            strD = str;
            str6 = str3;
            strH = str2;
        }
        String str9 = strD;
        String str10 = strH;
        ArrayList arrayList4 = arrayList3;
        String strC = groupDto.getCurrencyCode();
        if (strC != null) {
            xi0.b.Companion.getClass();
            bVarA = xi0.a.a(strC);
        } else {
            bVarA = null;
        }
        cr9.h hVarB = groupDto.getBalance();
        if (hVarB != null) {
            Intrinsics.checkNotNullParameter(hVarB, "<this>");
            i iVarA = hVarB.getPersonal();
            Intrinsics.checkNotNullParameter(iVarA, "<this>");
            if (iVarA instanceof i.a) {
                if (j.a(iVarA)) {
                    i.a aVar5 = (i.a) iVarA;
                    Long lC = aVar5.getOweAmount();
                    if (lC != null) {
                        long jLongValue = lC.longValue();
                        xi0.a aVar6 = xi0.b.Companion;
                        String strB3 = aVar5.getCurrencyCode();
                        aVar6.getClass();
                        dVar5 = new dj0.d(jLongValue, xi0.a.a(strB3));
                    } else {
                        dVar5 = null;
                    }
                    Long lD = aVar5.getOwedAmount();
                    if (lD != null) {
                        long jLongValue2 = lD.longValue();
                        xi0.a aVar7 = xi0.b.Companion;
                        String strB4 = aVar5.getCurrencyCode();
                        aVar7.getClass();
                        dVar6 = new dj0.d(jLongValue2, xi0.a.a(strB4));
                    } else {
                        dVar6 = null;
                    }
                    cVar = new oq9.b(dVar5, dVar6, br9.a.a(aVar5.getOweAmount(), aVar5.getOwedAmount()));
                } else {
                    i.a aVar8 = (i.a) iVarA;
                    long jA = aVar8.getAmount();
                    xi0.a aVar9 = xi0.b.Companion;
                    String strB5 = aVar8.getCurrencyCode();
                    aVar9.getClass();
                    cVar = new oq9.c(new dj0.d(jA, xi0.a.a(strB5)), oq9.d.OWE);
                }
            } else if (!(iVarA instanceof i.b)) {
                if (!(iVarA instanceof i.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (j.a(iVarA)) {
                    i.c cVar3 = (i.c) iVarA;
                    Long lC2 = cVar3.getOweAmount();
                    if (lC2 != null) {
                        long jLongValue3 = lC2.longValue();
                        xi0.a aVar10 = xi0.b.Companion;
                        String strB6 = cVar3.getCurrencyCode();
                        aVar10.getClass();
                        dVar = new dj0.d(jLongValue3, xi0.a.a(strB6));
                    } else {
                        dVar = null;
                    }
                    Long lD2 = cVar3.getOwedAmount();
                    if (lD2 != null) {
                        long jLongValue4 = lD2.longValue();
                        xi0.a aVar11 = xi0.b.Companion;
                        String strB7 = cVar3.getCurrencyCode();
                        aVar11.getClass();
                        dVar2 = new dj0.d(jLongValue4, xi0.a.a(strB7));
                    } else {
                        dVar2 = null;
                    }
                    cVar = new oq9.b(dVar, dVar2, br9.a.a(cVar3.getOweAmount(), cVar3.getOwedAmount()));
                } else {
                    i.c cVar4 = (i.c) iVarA;
                    long jA2 = cVar4.getAmount();
                    xi0.a aVar12 = xi0.b.Companion;
                    String strB8 = cVar4.getCurrencyCode();
                    aVar12.getClass();
                    cVar = new oq9.c(new dj0.d(jA2, xi0.a.a(strB8)), oq9.d.SETTLED);
                }
            } else if (j.a(iVarA)) {
                i.b bVar4 = (i.b) iVarA;
                Long lC3 = bVar4.getOweAmount();
                if (lC3 != null) {
                    long jLongValue5 = lC3.longValue();
                    xi0.a aVar13 = xi0.b.Companion;
                    String strB9 = bVar4.getCurrencyCode();
                    aVar13.getClass();
                    dVar3 = new dj0.d(jLongValue5, xi0.a.a(strB9));
                } else {
                    dVar3 = null;
                }
                Long lD3 = bVar4.getOwedAmount();
                if (lD3 != null) {
                    long jLongValue6 = lD3.longValue();
                    xi0.a aVar14 = xi0.b.Companion;
                    String strB10 = bVar4.getCurrencyCode();
                    aVar14.getClass();
                    dVar4 = new dj0.d(jLongValue6, xi0.a.a(strB10));
                } else {
                    dVar4 = null;
                }
                cVar = new oq9.b(dVar3, dVar4, br9.a.a(bVar4.getOweAmount(), bVar4.getOwedAmount()));
            } else {
                i.b bVar5 = (i.b) iVarA;
                long jA3 = bVar5.getAmount();
                xi0.a aVar15 = xi0.b.Companion;
                String strB11 = bVar5.getCurrencyCode();
                aVar15.getClass();
                cVar = new oq9.c(new dj0.d(jA3, xi0.a.a(strB11)), oq9.d.OWED);
            }
            k kVarB = hVarB.getTotal();
            Intrinsics.checkNotNullParameter(kVarB, "<this>");
            long jA4 = kVarB.getAmount();
            xi0.a aVar16 = xi0.b.Companion;
            String strB12 = kVarB.getCurrencyCode();
            aVar16.getClass();
            aVar = new oq9.a(cVar, new oq9.f(new dj0.d(jA4, xi0.a.a(strB12))));
        } else {
            aVar = null;
        }
        boolean zK = groupDto.getIsTrusted();
        DateTime dateTime = new DateTime(groupDto.getUpdatedDate());
        Long lF = groupDto.getLastFullSettlementDate();
        DateTime dateTime2 = lF != null ? new DateTime(lF.longValue()) : null;
        cr9.d dVarI = groupDto.getSettings();
        Intrinsics.checkNotNullParameter(dVarI, "<this>");
        for (st9.b bVar6 : st9.b.values()) {
            if (Intrinsics.f(bVar6.a(), dVarI.getCalculationType())) {
                String strA2 = dVarI.getBaseCurrency();
                if (strA2 != null) {
                    xi0.b.Companion.getClass();
                    bVarA2 = xi0.a.a(strA2);
                } else {
                    bVarA2 = null;
                }
                GroupSettings groupSettings = new GroupSettings(bVar6, bVarA2);
                cr9.a aVarA = groupDto.getAnalytics();
                Intrinsics.checkNotNullParameter(aVarA, "<this>");
                Intrinsics.checkNotNullParameter(groupDto, "groupDto");
                String strA3 = groupDto.getSettings().getBaseCurrency();
                if (strA3 == null) {
                    strA3 = groupDto.getCurrencyCode();
                }
                if (strA3 != null) {
                    xi0.b.Companion.getClass();
                    xi0.b bVarA3 = xi0.a.a(strA3);
                    groupAnalytics = new GroupAnalytics(new dj0.d(aVarA.getTotalSpentByGroup(), bVarA3), new dj0.d(aVarA.getTotalSpentByCurrentMember(), bVarA3), K(aVarA.getTotalSpentByGroupByCurrency(), bVarA3), K(aVarA.getTotalSpentByYouByCurrency(), bVarA3));
                } else {
                    groupAnalytics = null;
                }
                return new PaymentGroup(str9, str10, strE, arrayList4, bVarA, aVar, zK, dateTime, dateTime2, groupSettings, groupAnalytics);
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final ShopsOutlet F(eid.y yVar) {
        String str = "<this>";
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        String strE = yVar.getId();
        String strC = yVar.getCampaignId();
        co3.a aVarC = C(yVar.getLocation());
        int iD = yVar.getDistanceMeters();
        String strA = yVar.getAddress();
        List<eid.g> listB = yVar.getAvailability();
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(listB, 10));
        for (eid.g gVar : listB) {
            Intrinsics.checkNotNullParameter(gVar, str);
            List listA = gVar.getDays();
            List<eid.x> listB2 = gVar.getIntervals();
            ArrayList arrayList2 = new ArrayList(w.t(listB2, i));
            for (eid.x xVar : listB2) {
                boolean zC = gVar.getIsAllDay();
                Intrinsics.checkNotNullParameter(xVar, str);
                arrayList2.add(new ShopsOutletAvailabilityInterval(new LocalTime(xVar.getStart()), new LocalTime(xVar.getEnd()), zC));
                str = str;
            }
            arrayList.add(new ShopsAvailabilityInOutlet(arrayList2, listA));
            str = str;
            i = 10;
        }
        return new ShopsOutlet(strE, strC, strA, aVarC, Integer.valueOf(iD), arrayList);
    }

    public static final ShopsOutlet G(sid.s sVar) {
        String str = "<this>";
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        String strE = sVar.getId();
        String strC = sVar.getCampaignId();
        co3.a aVarD = D(sVar.getLocation());
        int iD = sVar.getDistanceMeters();
        String strA = sVar.getAddress();
        List<sid.c> listB = sVar.getAvailability();
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(listB, 10));
        for (sid.c cVar : listB) {
            Intrinsics.checkNotNullParameter(cVar, str);
            List listA = cVar.getDays();
            List<sid.r> listB2 = cVar.getIntervals();
            ArrayList arrayList2 = new ArrayList(w.t(listB2, i));
            for (sid.r rVar : listB2) {
                boolean zC = cVar.getIsAllDay();
                Intrinsics.checkNotNullParameter(rVar, str);
                arrayList2.add(new ShopsOutletAvailabilityInterval(new LocalTime(rVar.getStart()), new LocalTime(rVar.getEnd()), zC));
                str = str;
            }
            arrayList.add(new ShopsAvailabilityInOutlet(arrayList2, listA));
            str = str;
            i = 10;
        }
        return new ShopsOutlet(strE, strC, strA, aVarD, Integer.valueOf(iD), arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final cs3.b H(tr3.a r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            cs3.b r1 = new cs3.b
            jo3.b r2 = r9.getLoanMaxAmount()
            dj0.d r2 = hx7.a.v(r2)
            jo3.b r3 = r9.getLoanMinAmount()
            dj0.d r3 = hx7.a.v(r3)
            jo3.b r4 = r9.getCreditLimit()
            dj0.d r4 = hx7.a.v(r4)
            jo3.b r5 = r9.getUnknownBankMaxLimit()
            r6 = 0
            if (r5 == 0) goto L2b
            dj0.d r5 = hx7.a.v(r5)
            goto L2c
        L2b:
            r5 = r6
        L2c:
            jo3.b r7 = r9.getCreditCardUnknownBankMaxLimit()
            if (r7 == 0) goto L36
            dj0.d r6 = hx7.a.v(r7)
        L36:
            tr3.e r9 = r9.getEntryPoints()
            if (r9 == 0) goto L87
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.List r0 = r9.getProductOrder()
            if (r0 == 0) goto L6c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L66
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            ft3.d1 r8 = ft3.g1.b(r8)
            if (r8 == 0) goto L50
            r7.add(r8)
            goto L50
        L66:
            java.util.Set r0 = zhm.d0.i1(r7)
            if (r0 != 0) goto L75
        L6c:
            cs3.c r0 = cs3.d.Companion
            r0.getClass()
            java.util.Set r0 = cs3.c.a()
        L75:
            java.lang.Boolean r9 = r9.getIsBalanceTransferEnabled()
            if (r9 == 0) goto L80
            boolean r9 = r9.booleanValue()
            goto L81
        L80:
            r9 = 0
        L81:
            cs3.d r7 = new cs3.d
            r7.<init>(r0, r9)
            goto L8e
        L87:
            cs3.c r9 = cs3.d.Companion
            r9.getClass()
            cs3.d r7 = cs3.d.f108444c
        L8e:
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yoj.b.H(tr3.a):cs3.b");
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    public static final ggc.y I(ihc.b bVar) {
        b0 b0Var;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String strC = bVar.getName();
        String strB = bVar.getLogo();
        String strG = bVar.getWebsite();
        String strA = bVar.getChannel();
        ggc.q qVar = strA != null ? (ggc.q) u1.u(strA, hhc.c.f152383a) : ggc.q.ONLINE;
        ihc.c cVarD = bVar.getNearestOutlet();
        Integer numValueOf = cVarD != null ? Integer.valueOf(cVarD.getDistance()) : null;
        String strE = bVar.getSource();
        if (strE == null) {
            strE = "unknown";
        }
        a0 a0Var = new a0(strE);
        String strF = bVar.getSourceType();
        if (strF == null || (b0Var = (b0) u1.v(strF, hhc.a.f152381a)) == null) {
            b0Var = b0.UNKNOWN;
        }
        return new ggc.y(strC, strB, strG, qVar, numValueOf, a0Var, b0Var);
    }

    public static final ArrayList J(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<scd.c> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (scd.c cVar : list2) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            arrayList.add(new rcd.a(cVar.f261715a, cVar.f261716b));
        }
        return arrayList;
    }

    public static final List K(List list, xi0.b bVar) {
        if (list == null) {
            return f0.f322471a;
        }
        List<cr9.c> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (cr9.c cVar : list2) {
            xi0.a aVar = xi0.b.Companion;
            String strC = cVar.getCurrency();
            aVar.getClass();
            xi0.b bVarA = xi0.a.a(strC);
            arrayList.add(new GroupCurrencySpend(new dj0.d(cVar.getAmount(), bVarA), new dj0.d(cVar.getAmountInGroupBaseCurrency(), bVar), bVarA));
        }
        return arrayList;
    }

    public static final wrl.b L(orl.u uVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        String strB = uVar.getExchange();
        return new wrl.b(uVar.getVolume(), new dj0.d(uVar.getAmount(), currency), strB);
    }

    public static final ArrayList M(oqj.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(cVar.f227912b);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        ZoneId zoneId = g0m.a.f139502a;
        LocalDateTime localDateTimeAtTime = oi0.d.V(instantOfEpochMilli, zoneId).atTime(23, 59, 59);
        Intrinsics.checkNotNullExpressionValue(localDateTimeAtTime, "atTime(...)");
        long jQ = oi0.d.Q(localDateTimeAtTime, zoneId);
        List<oqj.g> list = cVar.d;
        ArrayList arrayList = new ArrayList();
        for (oqj.g gVar : list) {
            int size = gVar.f227918b.size() - 1;
            List list2 = gVar.f227918b;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            int i = 0;
            for (Object obj2 : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                arrayList2.add(new mqj.a(jQ - (((long) (size - i)) * CoreConstants.MILLIS_IN_ONE_DAY), ((Number) obj2).longValue(), gVar.f227917a));
                i = i2;
            }
            zhm.a0.x(arrayList2, arrayList);
        }
        return arrayList;
    }

    public static final sid.s N(ShopsOutlet shopsOutlet) {
        Intrinsics.checkNotNullParameter(shopsOutlet, "<this>");
        String str = shopsOutlet.f87056a;
        String str2 = shopsOutlet.f87057b;
        co3.a aVar = shopsOutlet.d;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        o oVar = new o(aVar.f25486a, aVar.f25487b);
        Integer num = shopsOutlet.e;
        int iIntValue = num != null ? num.intValue() : 0;
        String str3 = shopsOutlet.f87058c;
        ArrayList<ShopsAvailabilityInOutlet> arrayList = shopsOutlet.f;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (ShopsAvailabilityInOutlet shopsAvailabilityInOutlet : arrayList) {
            Intrinsics.checkNotNullParameter(shopsAvailabilityInOutlet, "<this>");
            List list = shopsAvailabilityInOutlet.f87018a;
            ArrayList<ShopsOutletAvailabilityInterval> arrayList3 = shopsAvailabilityInOutlet.f87019b;
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, i));
            for (ShopsOutletAvailabilityInterval shopsOutletAvailabilityInterval : arrayList3) {
                Intrinsics.checkNotNullParameter(shopsOutletAvailabilityInterval, "<this>");
                String string = shopsOutletAvailabilityInterval.f87059a.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                String string2 = shopsOutletAvailabilityInterval.f87060b.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                arrayList4.add(new sid.r(string, string2));
            }
            ShopsOutletAvailabilityInterval shopsOutletAvailabilityInterval2 = (ShopsOutletAvailabilityInterval) d0.d0(arrayList3);
            arrayList2.add(new sid.c(arrayList4, list, shopsOutletAvailabilityInterval2 != null ? shopsOutletAvailabilityInterval2.f87061c : false));
            i = 10;
        }
        return new sid.s(str, str2, oVar, iIntValue, str3, arrayList2);
    }

    public static final tr3.a O(cs3.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        jo3.b bVarA = hx7.a.A(bVar.f108441a);
        jo3.b bVarA2 = hx7.a.A(bVar.f108442b);
        jo3.b bVarA3 = hx7.a.A(bVar.f108443c);
        dj0.d dVar = bVar.d;
        jo3.b bVarA4 = dVar != null ? hx7.a.A(dVar) : null;
        dj0.d dVar2 = bVar.e;
        jo3.b bVarA5 = dVar2 != null ? hx7.a.A(dVar2) : null;
        cs3.d dVar3 = bVar.f;
        Intrinsics.checkNotNullParameter(dVar3, "<this>");
        Set set = dVar3.f108445a;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(g1.h((d1) it8.next()));
        }
        return new tr3.a(bVarA, bVarA2, bVarA3, bVarA4, bVarA5, new tr3.e(arrayList, Boolean.valueOf(dVar3.f108446b)));
    }

    public static final String P(scl.d dVar) {
        String strK0;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List listG = g(dVar);
        if (listG == null || (strK0 = d0.k0(listG, ",", null, null, 0, null, 62)) == null) {
            strK0 = "all";
        }
        return "performance_parameters_last_modified_".concat(strK0);
    }

    public static final Asset a(nel.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        f8l.c cVar = f8l.c.FIAT;
        xi0.b bVar = nVar.i;
        return new Asset(cVar, bVar.f306286a, bVar);
    }

    public static final Asset b(nel.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        f8l.c cVar = f8l.c.SECURITY;
        String str = nVar.e;
        xi0.a aVar = xi0.b.Companion;
        String str2 = nVar.f214596b;
        aVar.getClass();
        return new Asset(cVar, str, xi0.a.a(str2));
    }

    public static final dj0.d c(kel.b bVar, xi0.b bVar2) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return Intrinsics.f(bVar.f183148a.e, bVar2 != null ? bVar2.f306286a : null) ? bVar.d : bVar.e;
    }

    public static final bel.b d(String str) {
        bel.b bVar;
        Intrinsics.checkNotNullParameter(str, "<this>");
        bel.b[] bVarArrValues = bel.b.values();
        int length = bVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i];
            if (kotlin.text.a0.z(bVar.name(), str, true)) {
                break;
            }
            i++;
        }
        return bVar == null ? bel.b.UNKNOWN : bVar;
    }

    public static final wkm.l e(Flow flow, Function3 mapContent, Function0 mapLoading, Function1 mapError) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(mapContent, "mapContent");
        Intrinsics.checkNotNullParameter(mapLoading, "mapLoading");
        Intrinsics.checkNotNullParameter(mapError, "mapError");
        return vkm.q.Q(flow, new mki.d((Continuation) null, mapContent, mapLoading, mapError, 21));
    }

    public static final xi0.b f(kel.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        xi0.a aVar = xi0.b.Companion;
        String currency = gVar.getCurrency();
        aVar.getClass();
        return xi0.a.a(currency);
    }

    public static final List g(scl.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List list = dVar.f261764a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    public static final ArrayList h(whf.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        List list = pVar.f297646a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            a3 a3Var = (a3) obj2;
            yk5.a aVar = (yk5.a) pVar.f297647b.k.get(a3Var.f272581b);
            boolean z = (aVar != null ? aVar.f314567b : null) == yk5.e.AVAILABLE_FOR_RETURN;
            if (k71.k.r1(a3Var) && z) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final BigDecimal i(kel.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        BigDecimal bigDecimalSubtract = eVar.f183163a.subtract(eVar.f183164b);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    public static final zel.f j(wgl.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar instanceof wgl.c) {
            return ((wgl.c) dVar).f297342a;
        }
        if (dVar instanceof wgl.b) {
            zel.f fVar = ((wgl.b) dVar).f297339a;
            return fVar == null ? zel.f.STOCKS : fVar;
        }
        if (dVar instanceof wgl.a) {
            return ((wgl.a) dVar).f297338a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean k(a aVar) {
        d dVar;
        if (aVar == null || (dVar = aVar.f315683b) == null) {
            return false;
        }
        return hx7.i.v(dVar);
    }

    public static final boolean l(a aVar) {
        return (aVar != null ? aVar.f315683b : null) == d.PENDING;
    }

    public static final CompositeClause m(Clause separator, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            arrayList.add((Clause) obj2);
            if (i < size - 1) {
                arrayList.add(separator);
            }
            i = i2;
        }
        return new CompositeClause(arrayList, null, null, null, 14);
    }

    public static /* synthetic */ CompositeClause n(List list) {
        return m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), list);
    }

    public static final void o(CameraView cameraView, Rect rect) {
        vim.f fVarC = kotlin.ranges.f.o(0, cameraView.getChildCount()).iterator();
        while (fVarC.f289625c) {
            cameraView.getChildAt(fVarC.nextInt()).layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public static final efm.r p(efm.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        efm.r rVarDoOnNext = rVar.doOnNext(new q09.c(9, new q09.a(22)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return rVarDoOnNext;
    }

    public static final zel.b q(wgl.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar instanceof wgl.c) {
            return zel.b.TOP_MOVERS;
        }
        if (dVar instanceof wgl.b) {
            return zel.b.MOST_TRADED;
        }
        if (dVar instanceof wgl.a) {
            return zel.b.MOST_OWNED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void r(fgm.l lVar, AtomicInteger atomicInteger, ygm.c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            cVar.e(lVar);
        }
    }

    public static final efm.r s(efm.r rVar, Object obj2) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        efm.r map = rVar.map(new dkk.a0(new av8.o(obj2, 8), 4));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static void t(fgm.l lVar, Throwable th10, AtomicInteger atomicInteger, ygm.c cVar) {
        if (cVar.a(th10) && atomicInteger.getAndIncrement() == 0) {
            cVar.e(lVar);
        }
    }

    public static void u(fgm.l lVar, Object obj2, AtomicInteger atomicInteger, ygm.c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            lVar.onNext(obj2);
            if (atomicInteger.decrementAndGet() != 0) {
                cVar.e(lVar);
            }
        }
    }

    public static boolean v(dom.a aVar, Object obj2, AtomicInteger atomicInteger, ygm.c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            aVar.onNext(obj2);
            if (atomicInteger.decrementAndGet() == 0) {
                return true;
            }
            cVar.c(aVar);
        }
        return false;
    }

    public static final Clause w(Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(clause, "<this>");
        if (clause2 == null) {
            return clause;
        }
        if (clause instanceof CompositeClause) {
            CompositeClause compositeClause = (CompositeClause) clause;
            Intrinsics.checkNotNullParameter(compositeClause, "<this>");
            return CompositeClause.a(compositeClause, d0.F0(clause2, compositeClause.f57747a), null, 14);
        }
        if (!(clause2 instanceof CompositeClause)) {
            Clause[] elements = {clause, clause2};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
        }
        s0 s0Var = new s0(2);
        s0Var.a(clause);
        s0Var.b(((CompositeClause) clause2).f57747a.toArray(new Clause[0]));
        ArrayList arrayList = s0Var.f186433a;
        return new CompositeClause(zhm.v.m(arrayList.toArray(new Clause[arrayList.size()])), null, null, null, 14);
    }

    public static final dj0.d x(List list, xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Iterator it8 = list.iterator();
        long j2 = 0;
        while (it8.hasNext()) {
            dj0.d dVar = ((io3.g) it8.next()).f163164b;
            j2 += dVar != null ? dVar.f115082a : 0L;
        }
        return new dj0.d(j2, baseCurrency);
    }

    public static final k1j.a y(j8l.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (x5i.b.f302982a[aVar.ordinal()]) {
            case 1:
                return k1j.a.POCKETS;
            case 2:
                return k1j.a.JOINT_ACCOUNT;
            case 3:
                return k1j.a.PRO;
            case 4:
                return k1j.a.PRO_VAULTS;
            case 5:
                return k1j.a.VAULTS;
            case 6:
                return k1j.a.JOINT_VAULTS;
            case 7:
                return k1j.a.SAVINGS;
            case 8:
                return k1j.a.JOINT_SAVINGS;
            case 9:
                return k1j.a.CREDIT_CARDS;
            case 10:
                return k1j.a.CRYPTO;
            case 11:
                return k1j.a.REVOLUT_X_FIAT;
            case 12:
                return k1j.a.REV_POINTS_POCKETS;
            case 13:
                return k1j.a.YOUTH_POCKETS;
            case 14:
                return k1j.a.YOUTH_VAULTS;
            case 15:
                return k1j.a.YOUTH_SAVINGS;
            case 16:
                return k1j.a.TEEN_POCKETS;
            case 17:
                return k1j.a.TEEN_VAULTS;
            case 18:
                return k1j.a.TRADING_ACCOUNTS;
            case 19:
                return k1j.a.JOINT_TRADING_ACCOUNTS;
            case 20:
                return k1j.a.COMMODITIES;
            case 21:
                return k1j.a.SPOT_MARGIN_COLLATERAL;
            case 22:
                return k1j.a.FUTURES_COLLATERAL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String z(scl.d dVar) {
        String strK0;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List listG = g(dVar);
        if (listG == null || (strK0 = d0.k0(listG, ",", null, null, 0, null, 62)) == null) {
            strK0 = "all";
        }
        return "performance_parameters_".concat(strK0);
    }
}
