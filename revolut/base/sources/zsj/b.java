package zsj;

import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestination;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kp0.w0;
import ysj.g;
import ysj.n;
import ysj.t;
import ysj.y;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {
    public static final IncomeSorter a(g gVar) {
        hzi.b bVar;
        hzi.c cVar;
        hzi.a aVar;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String str = gVar.f316477a;
        y yVar = gVar.f316482j;
        String str2 = gVar.e;
        String id10 = gVar.f316478b;
        Intrinsics.checkNotNullParameter(id10, "id");
        String str3 = gVar.f316479c;
        String str4 = gVar.d;
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
        long j2 = gVar.f316480g;
        long j3 = gVar.f;
        List list = gVar.f316481h;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(b((ysj.c) it8.next()));
        }
        String str5 = gVar.i;
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
        if (yVar != null) {
            String str6 = yVar.f316504b;
            String str7 = yVar.f316503a;
            if (str7 != null) {
                savings = new IncomeSorterDestinationId.Pocket(str7);
            } else {
                if (str6 == null) {
                    throw new IllegalArgumentException(a0.d.s("missing mapping for remaining destination id: pocketId=", str7, ", moneyBoxId=", str6));
                }
                savings = new IncomeSorterDestinationId.Savings(str6);
            }
        }
        return new IncomeSorter(str, id10, str3, bVar, cVar2, j3, j2, arrayList, aVar, savings);
    }

    public static final IncomeSorterDestination b(ysj.c cVar) {
        IncomeSorterDestinationId beneficiary;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        n nVar = cVar.f316468a;
        t tVar = cVar.f316473j;
        String str = cVar.f316472h;
        long j2 = nVar.f316492a;
        xi0.a aVar = xi0.b.Companion;
        String str2 = nVar.f316493b;
        aVar.getClass();
        dj0.d dVar = new dj0.d(j2, xi0.a.a(str2));
        String str3 = cVar.f316469b;
        if (str3 != null) {
            beneficiary = new IncomeSorterDestinationId.Pocket(str3);
        } else {
            String str4 = cVar.f316470c;
            if (str4 != null) {
                beneficiary = new IncomeSorterDestinationId.Savings(str4);
            } else {
                String str5 = cVar.d;
                hzi.d dVar2 = null;
                dVar2 = null;
                if (str5 != null) {
                    String str6 = cVar.e;
                    beneficiary = new IncomeSorterDestinationId.Portfolio(str5, str6 != null ? xi0.a.a(str6) : null);
                } else {
                    String str7 = cVar.f316471g;
                    if (str7 != null) {
                        beneficiary = new IncomeSorterDestinationId.PeerToPeer(str7, str, tVar != null ? w0.A(tVar) : null);
                    } else {
                        String str8 = cVar.f;
                        if (str8 == null) {
                            throw new IllegalArgumentException("no matching destination pocket");
                        }
                        krf.c cVarA = tVar != null ? w0.A(tVar) : null;
                        String str9 = cVar.i;
                        if (str9 != null) {
                            hzi.d[] dVarArrValues = hzi.d.values();
                            int length = dVarArrValues.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                hzi.d dVar3 = dVarArrValues[i];
                                if (a0.z(dVar3.name(), str9, true)) {
                                    dVar2 = dVar3;
                                    break;
                                }
                                i++;
                            }
                        }
                        beneficiary = new IncomeSorterDestinationId.Beneficiary(str8, str, cVarA, dVar2);
                    }
                }
            }
        }
        return new IncomeSorterDestination(dVar, beneficiary);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ysj.c c(com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestination r18) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zsj.b.c(com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestination):ysj.c");
    }
}
