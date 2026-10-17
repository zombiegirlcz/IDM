package zn4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAmountBreakdown;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentDocument;
import dj0.d;
import hx7.e;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.a0;
import ql4.c0;
import ql4.g;
import ql4.i0;
import ql4.j;
import ql4.j0;
import ql4.k0;
import ql4.l;
import ql4.l0;
import ql4.m0;
import ql4.n0;
import ql4.p;
import ql4.s;
import ql4.t;
import ql4.w;
import ql4.x;
import ql4.y;
import yhm.m;
import yhm.n;
import yhm.o;
import yn4.b0;
import yn4.e0;
import yn4.f;
import yn4.f0;
import yn4.g0;
import yn4.h;
import yn4.i;
import yn4.k;
import yn4.r;
import yn4.z;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public abstract class c {
    public static final t a(String str) {
        Object objA;
        t tVar;
        Enum r06 = t.UNKNOWN;
        try {
            m.Companion companion = m.INSTANCE;
            t[] tVarArrValues = t.values();
            int length = tVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    tVar = null;
                    break;
                }
                t tVar2 = tVarArrValues[i];
                if (a0.z(tVar2.name(), str, true)) {
                    tVar = tVar2;
                    break;
                }
                i++;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (tVar == null) {
            throw new IllegalStateException("Unsupported enum value: " + str + " for " + o0.f186429a.b(t.class).m());
        }
        objA = tVar;
        Throwable thA = m.a(objA);
        if (thA != null) {
            e.n(thA);
        }
        Enum r110 = (Enum) (objA instanceof n ? null : objA);
        if (r110 != null) {
            r06 = r110;
        }
        return (t) r06;
    }

    public static final CreditCardInstalmentAmountBreakdown b(yn4.m mVar) {
        d dVarO = mo3.a.o(mVar.getPrincipal());
        jo3.a interest = mVar.getInterest();
        return new CreditCardInstalmentAmountBreakdown(dVarO, interest != null ? mo3.a.o(interest) : null);
    }

    public static final CreditCardInstalmentDocument c(yn4.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new CreditCardInstalmentDocument(g.valueOf(cVar.getType()), cVar.getConfirmationRequired());
    }

    public static final ql4.c d(r rVar) throws Throwable {
        Object objA;
        ql4.d dVar;
        String rate = rVar.getRate();
        String type = rVar.getType();
        Enum r110 = ql4.d.UNKNOWN;
        try {
            m.Companion companion = m.INSTANCE;
            ql4.d[] dVarArrValues = ql4.d.values();
            int length = dVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    dVar = null;
                    break;
                }
                ql4.d dVar2 = dVarArrValues[i];
                if (a0.z(dVar2.name(), type, true)) {
                    dVar = dVar2;
                    break;
                }
                i++;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (dVar == null) {
            throw new IllegalStateException("Unsupported enum value: " + type + " for " + o0.f186429a.b(ql4.d.class).m());
        }
        objA = dVar;
        Throwable thA = m.a(objA);
        if (thA != null) {
            e.n(thA);
        }
        Enum r2 = (Enum) (objA instanceof n ? null : objA);
        if (r2 != null) {
            r110 = r2;
        }
        return new ql4.c(rate, (ql4.d) r110);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ql4.e e(yn4.s r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            jo3.a r0 = r12.getMaxPlanAmount()
            dj0.d r2 = mo3.a.o(r0)
            jo3.a r0 = r12.getMinTransactionAmount()
            dj0.d r3 = mo3.a.o(r0)
            java.util.List r4 = r12.getTransactionIds()
            java.lang.String r0 = r12.getTransactionSelectionRule()
            r1 = 0
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L3d
            ql4.r0[] r7 = ql4.r0.values()
            int r8 = r7.length
            r9 = r1
        L28:
            if (r9 >= r8) goto L3a
            r10 = r7[r9]
            java.lang.String r11 = r10.name()
            boolean r11 = kotlin.text.a0.z(r11, r0, r6)
            if (r11 == 0) goto L37
            goto L3b
        L37:
            int r9 = r9 + 1
            goto L28
        L3a:
            r10 = r5
        L3b:
            if (r10 != 0) goto L3f
        L3d:
            ql4.r0 r10 = ql4.r0.SINGLE_TRANSACTION
        L3f:
            java.lang.String r0 = r12.getEligibilityStatus()
            ql4.e0[] r7 = ql4.e0.values()
            int r8 = r7.length
        L48:
            if (r1 >= r8) goto L5a
            r9 = r7[r1]
            java.lang.String r11 = r9.name()
            boolean r11 = kotlin.text.a0.z(r11, r0, r6)
            if (r11 == 0) goto L57
            goto L5b
        L57:
            int r1 = r1 + 1
            goto L48
        L5a:
            r9 = r5
        L5b:
            if (r9 != 0) goto L5f
            ql4.e0 r9 = ql4.e0.INELIGIBLE
        L5f:
            r6 = r9
            yn4.l r0 = r12.getIneligibility()
            if (r0 == 0) goto L6a
            ql4.n0 r5 = p(r0)
        L6a:
            r7 = r5
            java.util.List r8 = r12.getTerms()
            java.util.List r12 = r12.getDocuments()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r9 = new java.util.ArrayList
            r0 = 10
            int r0 = zhm.w.t(r12, r0)
            r9.<init>(r0)
            java.util.Iterator r12 = r12.iterator()
        L84:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r0 = r12.next()
            yn4.c r0 = (yn4.c) r0
            com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentDocument r0 = c(r0)
            r9.add(r0)
            goto L84
        L98:
            ql4.e r1 = new ql4.e
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zn4.c.e(yn4.s):ql4.e");
    }

    public static final l f(z.a aVar) {
        ql4.m mVar;
        String reason = aVar.getReason();
        ql4.m[] mVarArrValues = ql4.m.values();
        int length = mVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                mVar = null;
                break;
            }
            mVar = mVarArrValues[i];
            if (a0.z(mVar.name(), reason, true)) {
                break;
            }
            i++;
        }
        if (mVar == null) {
            mVar = ql4.m.UNKNOWN;
        }
        return new l(mVar, aVar.getDate());
    }

    public static final ql4.n g(z.b bVar) {
        g gVar;
        String type = bVar.getType();
        g[] gVarArrValues = g.values();
        int length = gVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                gVar = null;
                break;
            }
            gVar = gVarArrValues[i];
            if (a0.z(gVar.name(), type, true)) {
                break;
            }
            i++;
        }
        if (gVar != null) {
            return new ql4.n(gVar);
        }
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unsupported type = ", bVar.getType()));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return null;
    }

    public static final p h(z.c cVar) {
        d dVarO = mo3.a.o(cVar.getTotalPlanAmount());
        d dVarO2 = mo3.a.o(cVar.getTotalPrincipalAmount());
        d dVarO3 = mo3.a.o(cVar.getTotalInterestAmount());
        int settledInstalmentsCount = cVar.getSettledInstalmentsCount();
        int currentInstalmentsCount = cVar.getCurrentInstalmentsCount();
        int futureInstalmentsCount = cVar.getFutureInstalmentsCount();
        jo3.a settledInstalmentsAmount = cVar.getSettledInstalmentsAmount();
        d dVarO4 = settledInstalmentsAmount != null ? mo3.a.o(settledInstalmentsAmount) : null;
        jo3.a currentInstalmentsAmount = cVar.getCurrentInstalmentsAmount();
        d dVarO5 = currentInstalmentsAmount != null ? mo3.a.o(currentInstalmentsAmount) : null;
        jo3.a futureInstalmentsAmount = cVar.getFutureInstalmentsAmount();
        return new p(dVarO, dVarO2, dVarO3, settledInstalmentsCount, currentInstalmentsCount, futureInstalmentsCount, dVarO4, dVarO5, futureInstalmentsAmount != null ? mo3.a.o(futureInstalmentsAmount) : null, cVar.getCurrentInstalmentsDueDate(), cVar.getLastInstalmentsDueDate());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ql4.q i(yn4.z r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn4.c.i(yn4.z):ql4.q");
    }

    public static final s j(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        int term = b0Var.getTerm();
        String interestRate = b0Var.getInterestRate();
        String apr = b0Var.getApr();
        d dVarO = mo3.a.o(b0Var.getTotalInterest());
        d dVarO2 = mo3.a.o(b0Var.getTotalRepayable());
        jo3.a totalTax = b0Var.getTotalTax();
        d dVarO3 = totalTax != null ? mo3.a.o(totalTax) : null;
        b0.a scheduleExcerpt = b0Var.getScheduleExcerpt();
        ql4.r rVar = new ql4.r(mo3.a.o(scheduleExcerpt.getInstalment()), mo3.a.o(scheduleExcerpt.getLastInstalment()), scheduleExcerpt.getFirstPaymentDate(), scheduleExcerpt.getLastPaymentDate(), scheduleExcerpt.getPaymentDay());
        String quoteIdentifier = b0Var.getQuoteIdentifier();
        r aprInfo = b0Var.getAprInfo();
        return new s(term, interestRate, apr, dVarO, dVarO2, dVarO3, rVar, quoteIdentifier, aprInfo != null ? d(aprInfo) : null);
    }

    public static final x k(e0.a aVar) {
        d dVarO = mo3.a.o(aVar.getTotalPlanAmount());
        d dVarO2 = mo3.a.o(aVar.getTotalPrincipalAmount());
        d dVarO3 = mo3.a.o(aVar.getTotalInterestAmount());
        int settledInstalmentsCount = aVar.getSettledInstalmentsCount();
        int currentInstalmentsCount = aVar.getCurrentInstalmentsCount();
        int futureInstalmentsCount = aVar.getFutureInstalmentsCount();
        jo3.a settledInstalmentsAmount = aVar.getSettledInstalmentsAmount();
        d dVarO4 = settledInstalmentsAmount != null ? mo3.a.o(settledInstalmentsAmount) : null;
        jo3.a currentInstalmentsAmount = aVar.getCurrentInstalmentsAmount();
        d dVarO5 = currentInstalmentsAmount != null ? mo3.a.o(currentInstalmentsAmount) : null;
        jo3.a futureInstalmentsAmount = aVar.getFutureInstalmentsAmount();
        return new x(dVarO, dVarO2, dVarO3, settledInstalmentsCount, currentInstalmentsCount, futureInstalmentsCount, dVarO4, dVarO5, futureInstalmentsAmount != null ? mo3.a.o(futureInstalmentsAmount) : null, aVar.getCurrentInstalmentsDueDate(), aVar.getLastInstalmentsDueDate());
    }

    public static final y l(e0 e0Var) throws Throwable {
        Object objA;
        j jVar;
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        String id10 = e0Var.getId();
        t tVarA = a(e0Var.getState());
        Instant instantOfEpochMilli = Instant.ofEpochMilli(e0Var.getCreatedAt());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        int term = e0Var.getTerm();
        e0.b schedule = e0Var.getSchedule();
        w wVar = new w(k(schedule.getInitial()), k(schedule.getActual()));
        String transactionId = e0Var.getTransactionId();
        String repaymentMethod = e0Var.getRepaymentMethod();
        Enum r110 = j.UNKNOWN;
        try {
            m.Companion companion = m.INSTANCE;
            j[] jVarArrValues = j.values();
            int length = jVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jVar = null;
                    break;
                }
                j jVar2 = jVarArrValues[i];
                if (a0.z(jVar2.name(), repaymentMethod, true)) {
                    jVar = jVar2;
                    break;
                }
                i++;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (jVar == null) {
            throw new IllegalStateException("Unsupported enum value: " + repaymentMethod + " for " + o0.f186429a.b(j.class).m());
        }
        objA = jVar;
        Throwable thA = m.a(objA);
        if (thA != null) {
            e.n(thA);
        }
        Enum r87 = (Enum) (objA instanceof n ? null : objA);
        if (r87 != null) {
            r110 = r87;
        }
        return new y(id10, tVarA, instantOfEpochMilli, term, wVar, transactionId, (j) r110, e0Var.getPlanSettleDate());
    }

    public static final ql4.a0 m(f0 f0Var) {
        ql4.z zVar;
        ql4.e0 e0Var;
        ql4.o0 o0Var;
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        String eligibilityStatus = f0Var.getEligibilityStatus();
        ql4.e0[] e0VarArrValues = ql4.e0.values();
        int length = e0VarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            zVar = null;
            o0Var = null;
            if (i2 >= length) {
                e0Var = null;
                break;
            }
            e0Var = e0VarArrValues[i2];
            if (a0.z(e0Var.name(), eligibilityStatus, true)) {
                break;
            }
            i2++;
        }
        if (e0Var == null) {
            e0Var = ql4.e0.INELIGIBLE;
        }
        f0.a ineligibility = f0Var.getIneligibility();
        if (ineligibility != null) {
            String reason = ineligibility.getReason();
            ql4.o0[] o0VarArrValues = ql4.o0.values();
            int length2 = o0VarArrValues.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                ql4.o0 o0Var2 = o0VarArrValues[i];
                if (a0.z(o0Var2.name(), reason, true)) {
                    o0Var = o0Var2;
                    break;
                }
                i++;
            }
            if (o0Var == null) {
                o0Var = ql4.o0.UNKNOWN;
            }
            zVar = new ql4.z(o0Var);
        }
        d dVarO = mo3.a.o(f0Var.getMinDownPayment());
        List documents = f0Var.getDocuments();
        ArrayList arrayList = new ArrayList(zhm.w.t(documents, 10));
        Iterator it8 = documents.iterator();
        while (it8.hasNext()) {
            arrayList.add(c((yn4.c) it8.next()));
        }
        return new ql4.a0(e0Var, zVar, dVarO, arrayList);
    }

    public static final c0 n(g0.a aVar) {
        d dVarO = mo3.a.o(aVar.getTotalPlanAmount());
        d dVarO2 = mo3.a.o(aVar.getTotalPrincipalAmount());
        d dVarO3 = mo3.a.o(aVar.getTotalInterestAmount());
        int settledInstalmentsCount = aVar.getSettledInstalmentsCount();
        int currentInstalmentsCount = aVar.getCurrentInstalmentsCount();
        int futureInstalmentsCount = aVar.getFutureInstalmentsCount();
        jo3.a settledInstalmentsAmount = aVar.getSettledInstalmentsAmount();
        d dVarO4 = settledInstalmentsAmount != null ? mo3.a.o(settledInstalmentsAmount) : null;
        jo3.a currentInstalmentsAmount = aVar.getCurrentInstalmentsAmount();
        d dVarO5 = currentInstalmentsAmount != null ? mo3.a.o(currentInstalmentsAmount) : null;
        jo3.a futureInstalmentsAmount = aVar.getFutureInstalmentsAmount();
        return new c0(dVarO, dVarO2, dVarO3, settledInstalmentsCount, currentInstalmentsCount, futureInstalmentsCount, dVarO4, dVarO5, futureInstalmentsAmount != null ? mo3.a.o(futureInstalmentsAmount) : null, aVar.getCurrentInstalmentsDueDate(), aVar.getLastInstalmentsDueDate());
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0156 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ql4.d0 o(yn4.g0 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn4.c.o(yn4.g0):ql4.d0");
    }

    public static final n0 p(yn4.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar instanceof i) {
            return k0.f247145a;
        }
        if (lVar instanceof yn4.j) {
            return l0.f247148a;
        }
        if (lVar instanceof yn4.e) {
            yn4.e eVar = (yn4.e) lVar;
            return new ql4.g0(mo3.a.o(eVar.getAmountToRepay()), eVar.getUtilizationThreshold());
        }
        if (lVar instanceof h) {
            return j0.f247136a;
        }
        if (lVar instanceof yn4.d) {
            return ql4.f0.f247121a;
        }
        if (lVar instanceof yn4.g) {
            return i0.f247135a;
        }
        if (lVar instanceof k) {
            return m0.f247149a;
        }
        if (lVar instanceof f) {
            return new ql4.h0(((f) lVar).getEndDate());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final yn4.c q(CreditCardInstalmentDocument creditCardInstalmentDocument) {
        Intrinsics.checkNotNullParameter(creditCardInstalmentDocument, "<this>");
        return new yn4.c(creditCardInstalmentDocument.f68799a.name(), creditCardInstalmentDocument.f68800b);
    }

    public static final yn4.l r(n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "<this>");
        if (n0Var instanceof k0) {
            return new i();
        }
        if (n0Var instanceof l0) {
            return new yn4.j();
        }
        if (n0Var instanceof ql4.g0) {
            ql4.g0 g0Var = (ql4.g0) n0Var;
            return new yn4.e(mo3.a.p(g0Var.f247122a), g0Var.f247123b);
        }
        if (n0Var instanceof j0) {
            return new h();
        }
        if (n0Var instanceof ql4.f0) {
            return new yn4.d();
        }
        if (n0Var instanceof i0) {
            return new yn4.g();
        }
        if (n0Var instanceof m0) {
            return k.f315178a;
        }
        if (n0Var instanceof ql4.h0) {
            return new f(((ql4.h0) n0Var).f247126a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final z.c s(p pVar) {
        jo3.a aVarP = mo3.a.p(pVar.f247153a);
        jo3.a aVarP2 = mo3.a.p(pVar.f247154b);
        jo3.a aVarP3 = mo3.a.p(pVar.f247155c);
        int i = pVar.d;
        int i2 = pVar.e;
        int i3 = pVar.f;
        d dVar = pVar.f247156g;
        jo3.a aVarP4 = dVar != null ? mo3.a.p(dVar) : null;
        d dVar2 = pVar.f247157h;
        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
        d dVar3 = pVar.i;
        return new z.c(aVarP, aVarP2, aVarP3, i, i2, i3, aVarP4, aVarP5, dVar3 != null ? mo3.a.p(dVar3) : null, pVar.f247158j, pVar.k);
    }

    public static final e0.a t(x xVar) {
        jo3.a aVarP = mo3.a.p(xVar.f247188a);
        jo3.a aVarP2 = mo3.a.p(xVar.f247189b);
        jo3.a aVarP3 = mo3.a.p(xVar.f247190c);
        int i = xVar.d;
        int i2 = xVar.e;
        int i3 = xVar.f;
        d dVar = xVar.f247191g;
        jo3.a aVarP4 = dVar != null ? mo3.a.p(dVar) : null;
        d dVar2 = xVar.f247192h;
        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
        d dVar3 = xVar.i;
        return new e0.a(aVarP, aVarP2, aVarP3, i, i2, i3, aVarP4, aVarP5, dVar3 != null ? mo3.a.p(dVar3) : null, xVar.f247193j, xVar.k);
    }

    public static final g0.a u(c0 c0Var) {
        jo3.a aVarP = mo3.a.p(c0Var.f247095a);
        jo3.a aVarP2 = mo3.a.p(c0Var.f247096b);
        jo3.a aVarP3 = mo3.a.p(c0Var.f247097c);
        int i = c0Var.d;
        int i2 = c0Var.e;
        int i3 = c0Var.f;
        d dVar = c0Var.f247098g;
        jo3.a aVarP4 = dVar != null ? mo3.a.p(dVar) : null;
        d dVar2 = c0Var.f247099h;
        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
        d dVar3 = c0Var.i;
        return new g0.a(aVarP, aVarP2, aVarP3, i, i2, i3, aVarP4, aVarP5, dVar3 != null ? mo3.a.p(dVar3) : null, c0Var.f247100j, c0Var.k);
    }
}
