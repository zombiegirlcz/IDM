package fi3;

import ci3.c;
import com.revolut.feature.checkout.models.PreorderPreconditions;
import dj0.d;
import hha.i;
import java.time.Instant;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import pi3.j;
import pi3.l;
import pi3.m;
import pi3.n;
import pi3.o;
import pi3.p;
import pi3.q;
import pi3.s;
import uh3.b;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f135288a = r0.k(new Pair("CARD", s.CARD), new Pair("PLAN", s.PLAN));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f135289b = r0.k(new Pair("MONTHLY", i.MONTHLY), new Pair("ANNUAL", i.ANNUAL));

    public static final PreorderPreconditions a(b bVar) {
        q qVar;
        o oVar;
        j jVar;
        String state;
        String state2;
        String state3;
        String state4;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        uh3.a terms = bVar.getTerms();
        int i = 0;
        m mVar = null;
        if (terms == null || (state4 = terms.getState()) == null) {
            qVar = null;
        } else {
            q[] qVarArrValues = q.values();
            int length = qVarArrValues.length;
            for (int i2 = 0; i2 < length; i2++) {
                qVar = qVarArrValues[i2];
                if (a0.z(qVar.name(), state4, true)) {
                    break;
                }
            }
            qVar = null;
        }
        uh3.a kyc2 = bVar.getKyc();
        if (kyc2 == null || (state3 = kyc2.getState()) == null) {
            oVar = null;
        } else {
            o[] oVarArrValues = o.values();
            int length2 = oVarArrValues.length;
            for (int i3 = 0; i3 < length2; i3++) {
                oVar = oVarArrValues[i3];
                if (a0.z(oVar.name(), state3, true)) {
                    break;
                }
            }
            oVar = null;
        }
        uh3.a creditCard = bVar.getCreditCard();
        if (creditCard == null || (state2 = creditCard.getState()) == null) {
            jVar = null;
        } else {
            j[] jVarArrValues = j.values();
            int length3 = jVarArrValues.length;
            for (int i5 = 0; i5 < length3; i5++) {
                jVar = jVarArrValues[i5];
                if (a0.z(jVar.name(), state2, true)) {
                    break;
                }
            }
            jVar = null;
        }
        uh3.a balance = bVar.getBalance();
        if (balance != null && (state = balance.getState()) != null) {
            m[] mVarArrValues = m.values();
            int length4 = mVarArrValues.length;
            while (true) {
                if (i >= length4) {
                    break;
                }
                m mVar2 = mVarArrValues[i];
                if (a0.z(mVar2.name(), state, true)) {
                    mVar = mVar2;
                    break;
                }
                i++;
            }
        }
        return new PreorderPreconditions(oVar, mVar, jVar, qVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Map] */
    public static final l b(c cVar) {
        n nVar;
        p pVar;
        pi3.i iVar;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        s sVar = (s) u1.v(cVar.getType(), f135288a);
        if (sVar == null) {
            return null;
        }
        String id10 = cVar.getId();
        ci3.b card = cVar.getCard();
        if (card != null) {
            Intrinsics.checkNotNullParameter(card, "<this>");
            String id11 = card.getId();
            ci3.a pointsRedemption = card.getPointsRedemption();
            if (pointsRedemption != null) {
                Intrinsics.checkNotNullParameter(pointsRedemption, "<this>");
                d dVarO = mo3.a.o(pointsRedemption.getPointsToRedeem());
                iVar = new pi3.i(d.c(dVarO, 0L, xi0.b.a(dVarO.f115083b, 6), 1), mo3.a.o(pointsRedemption.getFiatEquivalent()));
            } else {
                iVar = null;
            }
            nVar = new n(id11, iVar);
        } else {
            nVar = null;
        }
        ci3.d plan = cVar.getPlan();
        if (plan != null) {
            Intrinsics.checkNotNullParameter(plan, "<this>");
            String id12 = plan.getId();
            String billingCode = plan.getBillingCode();
            pVar = new p(id12, billingCode != null ? (i) u1.u(billingCode, f135289b) : null, pd.b.j(plan.getCredit()));
        } else {
            pVar = null;
        }
        Long endDate = cVar.getEndDate();
        Instant instantOfEpochMilli = endDate != null ? Instant.ofEpochMilli(endDate.longValue()) : null;
        b preconditions = cVar.getPreconditions();
        return new l(id10, sVar, nVar, pVar, instantOfEpochMilli, preconditions != null ? a(preconditions) : null);
    }
}
