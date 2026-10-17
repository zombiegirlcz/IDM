package w2j;

import com.revolut.domain.models.beneficiary.BeneficiarySortingStrategy;
import com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose;
import d3j.b;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r0e.i;
import r21.h;
import w4l.k;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    static r b(b bVar) {
        Intrinsics.checkNotNullParameter("", "searchQuery");
        h hVar = (h) bVar.f111211a;
        Intrinsics.checkNotNullParameter("", "searchQuery");
        return nim.a.w(hVar.i.f(Unit.f186387a, true), new i(14));
    }

    static r c(b bVar, BeneficiarySpecialPurpose specialPurpose, BeneficiarySortingStrategy sortingStrategy, int i) {
        k loadingStrategy = (i & 4) != 0 ? w4l.h.f294642c : w4l.i.f294643c;
        if ((i & 8) != 0) {
            sortingStrategy = BeneficiarySortingStrategy.DEFAULT;
        }
        Intrinsics.checkNotNullParameter("", "searchQuery");
        Intrinsics.checkNotNullParameter(specialPurpose, "specialPurpose");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(sortingStrategy, "sortingStrategy");
        return ((h) bVar.f111211a).i(specialPurpose, loadingStrategy, sortingStrategy);
    }

    static r d(a aVar, String searchQuery, boolean z, BeneficiarySortingStrategy sortingStrategy, int i) {
        if ((i & 1) != 0) {
            searchQuery = "";
        }
        if ((i & 4) != 0) {
            sortingStrategy = BeneficiarySortingStrategy.DEFAULT;
        }
        b bVar = (b) aVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(sortingStrategy, "sortingStrategy");
        h hVar = (h) bVar.f111211a;
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(sortingStrategy, "sortingStrategy");
        return nim.a.w(hVar.d.f(Unit.f186387a, z), new r10.b(hVar, 17, searchQuery, sortingStrategy));
    }
}
