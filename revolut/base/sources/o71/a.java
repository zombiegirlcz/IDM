package o71;

import com.revolut.domain.models.beneficiary.BeneficiarySortingStrategy;
import com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import r10.b;
import r21.h;
import te0.w;
import ufm.n;
import w4l.k;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    static n a(a aVar, String str) {
        return w.i0(((h) aVar).f251037a.getSupportedCurrencies(str, null, null));
    }

    static /* synthetic */ r b(a aVar, BeneficiarySpecialPurpose beneficiarySpecialPurpose, k kVar, int i) {
        if ((i & 4) != 0) {
            kVar = w4l.h.f294642c;
        }
        return ((h) aVar).i(beneficiarySpecialPurpose, kVar, BeneficiarySortingStrategy.DEFAULT);
    }

    static r c(a aVar, boolean z, int i) {
        if ((i & 1) != 0) {
            m70.a.c(t0.f186434a);
        }
        BeneficiarySortingStrategy sortingStrategy = BeneficiarySortingStrategy.DEFAULT;
        h hVar = (h) aVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter("", "searchQuery");
        Intrinsics.checkNotNullParameter(sortingStrategy, "sortingStrategy");
        return nim.a.w(hVar.d.f(Unit.f186387a, z), new b(hVar, 17, "", sortingStrategy));
    }
}
