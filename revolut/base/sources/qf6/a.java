package qf6;

import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilConsentsGroup;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import foh.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mf6.c;
import nf6.a;
import ro6.g;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final OpenBankingBrazilConsentsGroup a(mf6.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        ThirdPartyBrazil thirdPartyBrazilX = i.x(cVar.getThirdParty());
        List<c.a> consents = cVar.getConsents();
        ArrayList arrayList = new ArrayList(w.t(consents, 10));
        for (c.a aVar : consents) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList.add(new OpenBankingBrazilConsentsGroup.Consent(aVar.getId(), aVar.getPaymentDescription()));
        }
        return new OpenBankingBrazilConsentsGroup(thirdPartyBrazilX, arrayList);
    }

    public static final OpenBankingBrazilConsentsGroup b(nf6.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        ThirdPartyBrazil thirdPartyBrazilY = i.y(aVar.getThirdParty());
        List<a.c> consents = aVar.getConsents();
        ArrayList arrayList = new ArrayList(w.t(consents, 10));
        for (a.c cVar : consents) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            arrayList.add(new OpenBankingBrazilConsentsGroup.Consent(cVar.getId(), cVar.getPaymentDescription()));
        }
        return new OpenBankingBrazilConsentsGroup(thirdPartyBrazilY, arrayList);
    }

    public static final nf6.a c(OpenBankingBrazilConsentsGroup openBankingBrazilConsentsGroup) {
        Intrinsics.checkNotNullParameter(openBankingBrazilConsentsGroup, "<this>");
        g gVarG = i.G(openBankingBrazilConsentsGroup.f72386a);
        ArrayList<OpenBankingBrazilConsentsGroup.Consent> arrayList = openBankingBrazilConsentsGroup.f72387b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (OpenBankingBrazilConsentsGroup.Consent consent : arrayList) {
            Intrinsics.checkNotNullParameter(consent, "<this>");
            arrayList2.add(new a.c(consent.f72388a, consent.f72389b));
        }
        return new nf6.a(gVarG, arrayList2);
    }
}
