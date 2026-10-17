package bf6;

import af6.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import se6.i;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f14901a;

    public b(g countryDepartmentEntityMapper, d crossBorderInstitutionDataEntityMapper) {
        Intrinsics.checkNotNullParameter(countryDepartmentEntityMapper, "countryDepartmentEntityMapper");
        Intrinsics.checkNotNullParameter(crossBorderInstitutionDataEntityMapper, "crossBorderInstitutionDataEntityMapper");
        this.f14901a = countryDepartmentEntityMapper;
    }

    public final se6.d a(af6.a aVar) {
        try {
            String strB = aVar.getId();
            String strF = aVar.getName();
            uo3.a institutionLogoEntity = aVar.getLogo();
            Intrinsics.checkNotNullParameter(institutionLogoEntity, "institutionLogoEntity");
            io3.b bVar = new io3.b(io3.a.valueOf(institutionLogoEntity.getType()), institutionLogoEntity.getValue());
            se6.f fVarValueOf = se6.f.valueOf(aVar.getInstitutionType());
            String strA = aVar.getCountryCode();
            boolean zC = aVar.getInfoProvider();
            boolean zH = aVar.getPaymentInitiation();
            se6.b bVarA = d.a(aVar.getPaymentInfo());
            List listI = aVar.getTags();
            ArrayList arrayList = new ArrayList(w.t(listI, 10));
            Iterator it8 = listI.iterator();
            while (it8.hasNext()) {
                arrayList.add(se6.c.valueOf((String) it8.next()));
            }
            af6.d dVarJ = aVar.getUserRegionCountryDepartment();
            return new se6.d(strB, strF, bVar, fVarValueOf, strA, zC, zH, bVarA, arrayList, dVarJ != null ? this.f14901a.a(dVarJ) : null, null);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    public final se6.e b(af6.b entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        List listB = entity.getPopularInstitutions();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listB.iterator();
        while (it8.hasNext()) {
            se6.d dVarA = a((af6.a) it8.next());
            if (dVarA != null) {
                arrayList.add(dVarA);
            }
        }
        List listA = entity.getOtherInstitutions();
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = listA.iterator();
        while (it9.hasNext()) {
            se6.d dVarA2 = a((af6.a) it9.next());
            if (dVarA2 != null) {
                arrayList2.add(dVarA2);
            }
        }
        return new se6.e(arrayList, arrayList2);
    }

    public final af6.a c(se6.d dVar) {
        try {
            String str = dVar.f262125a;
            String str2 = dVar.f262126b;
            io3.b institutionLogo = dVar.f262127c;
            Intrinsics.checkNotNullParameter(institutionLogo, "institutionLogo");
            uo3.a aVar = new uo3.a(institutionLogo.f163142a.toString(), institutionLogo.f163143b);
            String string = dVar.d.toString();
            String str3 = dVar.e;
            boolean z = dVar.f;
            boolean z3 = dVar.f262128g;
            a.c cVarB = d.b(dVar.f262129h);
            ArrayList arrayList = dVar.i;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((se6.c) it8.next()).toString());
            }
            i iVar = dVar.f262130j;
            return new af6.a(str, str2, aVar, string, str3, z, z3, cVarB, arrayList2, iVar != null ? this.f14901a.b(iVar) : null);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    public final af6.b d(se6.e domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        List list = domain.f262131a;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            af6.a aVarC = c((se6.d) it8.next());
            if (aVarC != null) {
                arrayList.add(aVarC);
            }
        }
        List list2 = domain.f262132b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            af6.a aVarC2 = c((se6.d) it9.next());
            if (aVarC2 != null) {
                arrayList2.add(aVarC2);
            }
        }
        return new af6.b(arrayList, arrayList2);
    }
}
