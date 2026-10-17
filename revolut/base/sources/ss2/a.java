package ss2;

import av1.c;
import com.revolut.business.feature.referrals.model.EligibilityCriteria;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.m;
import ru.n;
import ru.o;
import ru.p;
import ru.q;
import ru.r;
import ru.s;
import ru.t;
import ru.u;
import ru.v;
import tu.e;
import tu.f;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final v a(e eVar) {
        c cVar;
        c cVar2;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String type = eVar.getType();
        c cVar3 = null;
        if (type != null) {
            switch (type.hashCode()) {
                case -1607052570:
                    if (type.equals("MADE_TOPUP")) {
                        cVar2 = q.f257376c;
                        cVar = cVar2;
                    } else {
                        cVar = null;
                    }
                    break;
                case -1163727591:
                    if (type.equals("SPENT_MONEY_WITH_CARD")) {
                        cVar2 = u.f257380c;
                        cVar = cVar2;
                    } else {
                        cVar = null;
                    }
                    break;
                case -431561058:
                    if (type.equals("SIGNED_UP")) {
                        cVar2 = t.f257379c;
                        cVar = cVar2;
                    } else {
                        cVar = null;
                    }
                    break;
                case 454726918:
                    if (type.equals("ORDERED_PHYSICAL_CARD")) {
                        cVar2 = r.f257377c;
                        cVar = cVar2;
                    } else {
                        cVar = null;
                    }
                    break;
                case 1252212805:
                    if (type.equals("PASSED_KYB")) {
                        cVar2 = s.f257378c;
                        cVar = cVar2;
                    } else {
                        cVar = null;
                    }
                    break;
                default:
                    cVar = null;
                    break;
            }
            if (cVar != null) {
                String title = eVar.getTitle();
                String subtitle = eVar.getSubtitle();
                String status = eVar.getStatus();
                if (status != null) {
                    switch (status.hashCode()) {
                        case -1395063325:
                            if (status.equals("NOT_ELIGIBLE")) {
                                cVar3 = p.f257375c;
                            }
                            break;
                        case -604548089:
                            if (status.equals("IN_PROGRESS")) {
                                cVar3 = o.f257374c;
                            }
                            break;
                        case -591252731:
                            if (status.equals("EXPIRED")) {
                                cVar3 = n.f257373c;
                            }
                            break;
                        case 1383663147:
                            if (status.equals("COMPLETED")) {
                                cVar3 = m.f257372c;
                            }
                            break;
                    }
                }
                c cVar4 = cVar3;
                List eligibilityCriteria = eVar.getEligibilityCriteria();
                if (eligibilityCriteria == null) {
                    eligibilityCriteria = f0.f322471a;
                }
                List<f> list = eligibilityCriteria;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (f fVar : list) {
                    arrayList.add(new EligibilityCriteria(fVar.getIcon(), fVar.getTitle(), fVar.getDescription()));
                }
                return new v(cVar, title, subtitle, cVar4, arrayList);
            }
        }
        return null;
    }

    public static final e b(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        c cVar = vVar.f257381a;
        String str = cVar != null ? cVar.f9872b : null;
        String str2 = vVar.f257382b;
        String str3 = vVar.f257383c;
        c cVar2 = vVar.d;
        String str4 = cVar2 != null ? cVar2.f9872b : null;
        ArrayList<EligibilityCriteria> arrayList = vVar.e;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (EligibilityCriteria eligibilityCriteria : arrayList) {
            arrayList2.add(new f(eligibilityCriteria.f50665a, eligibilityCriteria.f50666b, eligibilityCriteria.f50667c));
        }
        return new e(str, str2, str3, str4, arrayList2);
    }
}
