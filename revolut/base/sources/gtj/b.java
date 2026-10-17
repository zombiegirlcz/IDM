package gtj;

import a0.d;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestination;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import htj.a0;
import htj.f;
import htj.f0;
import htj.l;
import hx7.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {
    public static final IncomeSorter a(l lVar) {
        hzi.b bVar;
        hzi.c cVar;
        hzi.a aVar;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        String str = lVar.f155421a;
        f0 f0Var = lVar.f155426j;
        String str2 = lVar.e;
        String id10 = lVar.f155422b;
        Intrinsics.checkNotNullParameter(id10, "id");
        String str3 = lVar.f155423c;
        String str4 = lVar.d;
        if (Intrinsics.f(str4, "ACTIVE")) {
            bVar = hzi.b.ACTIVE;
        } else {
            if (!Intrinsics.f(str4, "INACTIVE")) {
                throw new IllegalArgumentException(j6.a.q("Unknown state: ", str4));
            }
            bVar = hzi.b.INACTIVE;
        }
        if (Intrinsics.f(str2, "ONE_TIME")) {
            cVar = hzi.c.ONE_TIME;
        } else {
            if (!Intrinsics.f(str2, "RECURRING")) {
                throw new IllegalArgumentException(j6.a.q("Unknown type: ", str2));
            }
            cVar = hzi.c.RECURRING;
        }
        hzi.c cVar2 = cVar;
        long j2 = lVar.f155425h;
        long j3 = lVar.f155424g;
        List list = lVar.i;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(b((f) it8.next()));
        }
        String str5 = lVar.f;
        IncomeSorterDestinationId savings = null;
        if (Intrinsics.f(str5, "AUTO")) {
            aVar = hzi.a.AUTO;
        } else if (Intrinsics.f(str5, "MANUAL")) {
            aVar = hzi.a.MANUALLY;
        } else {
            if (str5 != null) {
                throw new IllegalArgumentException(p.a.p("Unknown ", str5, " value for sortMethod"));
            }
            aVar = null;
        }
        if (f0Var != null) {
            String str6 = f0Var.f155411b;
            String str7 = f0Var.f155410a;
            if (str7 != null) {
                savings = new IncomeSorterDestinationId.Pocket(str7);
            } else {
                if (str6 == null) {
                    throw new IllegalArgumentException(d.s("no matching destination pocket for remaining balance with pocketId=", str7, ", moneyBoxId=", str6));
                }
                savings = new IncomeSorterDestinationId.Savings(str6);
            }
        }
        return new IncomeSorter(str, id10, str3, bVar, cVar2, j3, j2, arrayList, aVar, savings);
    }

    public static final IncomeSorterDestination b(f fVar) {
        IncomeSorterDestinationId peerToPeer;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        jo3.a aVar = fVar.f155404a;
        a0 a0Var = fVar.f155409j;
        String str = fVar.f155408h;
        long amount = aVar.getAmount();
        xi0.a aVar2 = xi0.b.Companion;
        String currency = fVar.f155404a.getCurrency();
        aVar2.getClass();
        dj0.d dVar = new dj0.d(amount, xi0.a.a(currency));
        String str2 = fVar.f155405b;
        if (str2 != null) {
            peerToPeer = new IncomeSorterDestinationId.Pocket(str2);
        } else {
            String str3 = fVar.f155406c;
            if (str3 != null) {
                peerToPeer = new IncomeSorterDestinationId.Savings(str3);
            } else {
                String str4 = fVar.d;
                dVar = null;
                hzi.d dVar2 = null;
                if (str4 != null) {
                    String str5 = fVar.e;
                    peerToPeer = new IncomeSorterDestinationId.Portfolio(str4, str5 != null ? xi0.a.a(str5) : null);
                } else {
                    String str6 = fVar.f;
                    if (str6 != null) {
                        krf.c cVarR = a0Var != null ? i.R(a0Var) : null;
                        String str7 = fVar.i;
                        if (str7 != null) {
                            hzi.d[] dVarArrValues = hzi.d.values();
                            int length = dVarArrValues.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                hzi.d dVar3 = dVarArrValues[i];
                                if (kotlin.text.a0.z(dVar3.name(), str7, true)) {
                                    dVar2 = dVar3;
                                    break;
                                }
                                i++;
                            }
                        }
                        peerToPeer = new IncomeSorterDestinationId.Beneficiary(str6, str, cVarR, dVar2);
                    } else {
                        String str8 = fVar.f155407g;
                        if (str8 == null) {
                            throw new IllegalArgumentException("no matching destination pocket");
                        }
                        peerToPeer = new IncomeSorterDestinationId.PeerToPeer(str8, str, a0Var != null ? i.R(a0Var) : null);
                    }
                }
            }
        }
        return new IncomeSorterDestination(dVar, peerToPeer);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final htj.f c(com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestination r19) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gtj.b.c(com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestination):htj.f");
    }

    public static final String d(hzi.a aVar) {
        int i = aVar == null ? -1 : a.f146621a[aVar.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return "MANUAL";
        }
        if (i == 2) {
            return "AUTO";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final f0 e(IncomeSorterDestinationId incomeSorterDestinationId) {
        Intrinsics.checkNotNullParameter(incomeSorterDestinationId, "<this>");
        IncomeSorterDestinationId.Pocket pocket = incomeSorterDestinationId instanceof IncomeSorterDestinationId.Pocket ? (IncomeSorterDestinationId.Pocket) incomeSorterDestinationId : null;
        String str = pocket != null ? pocket.f99175a : null;
        IncomeSorterDestinationId.Savings savings = incomeSorterDestinationId instanceof IncomeSorterDestinationId.Savings ? (IncomeSorterDestinationId.Savings) incomeSorterDestinationId : null;
        return new f0(str, savings != null ? savings.f99178a : null);
    }
}
