package tk5;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.feature.crypto.remittance.impl.R$string;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        j[] jVarArrValues = j.values();
        ArrayList arrayList = new ArrayList(jVarArrValues.length);
        for (j jVar2 : jVarArrValues) {
            String strName = jVar2.name();
            int i = h.f271884a[jVar2.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.crypto_multi_network_assets_title, null, null, 14);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.crypto_multi_network_address_type_title, null, null, 14);
            }
            arrayList.add(new q(strName, new t(textLocalisedClause), true, 2));
        }
        return new f(domainState.f271879b, arrayList);
    }
}
