package ci6;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yfe.a1;
import yfe.b1;
import yfe.d1;
import yfe.h;
import yfe.j2;
import yfe.n2;
import yfe.o2;
import yfe.p0;
import yfe.q;
import yfe.q0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements yfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je6.h f24388a;

    public a(je6.h externalInstitutionLogoMapper) {
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        this.f24388a = externalInstitutionLogoMapper;
    }

    @Override // yfe.b
    public final p0 a(h.c cVar) {
        h.c.C1743c snapshot = (h.c.C1743c) cVar;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        return new p0(R$drawable.uikit_icn_24_link, new TextLocalisedClause(R$string.open_banking_home_linked_account_product_name, null, null, 14), new TextLocalisedClause(R$string.add_new_product_linked_account_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10));
    }

    @Override // yfe.b
    public final q0 b(h.a aVar) {
        io3.b bVar;
        q snapshot = (q) aVar;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.open_banking_home_linked_account_product_name, null, null, 14);
        dj0.d dVar = snapshot.f313294c;
        List<o2> list = snapshot.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (o2 o2Var : list) {
            if (o2Var instanceof n2) {
                bVar = new io3.b(io3.a.URL, ((n2) o2Var).f313286a);
            } else {
                if (!(o2Var instanceof j2)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new io3.b(io3.a.BASE64, ((j2) o2Var).f313272a);
            }
            arrayList.add(new a1(((di6.a) this.f24388a).d(bVar)));
        }
        return new q0(textLocalisedClause, dVar, new d1(v13.d.Z(arrayList, new b1(R$drawable.uikit_icn_24_bank)), false), null, 56);
    }
}
