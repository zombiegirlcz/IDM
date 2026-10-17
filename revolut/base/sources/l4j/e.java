package l4j;

import aw0.o9;
import ch.qos.logback.core.CoreConstants;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.beneficiary.BeneficiaryDetails;
import com.revolut.domain.models.beneficiary.BeneficiaryRouteDetails;
import com.revolut.retail.feature.beneficiary.impl.R$string;
import f5j.t;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        l4j.a domainState = (l4j.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<BeneficiaryRouteDetails> list = domainState.f192142a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (BeneficiaryRouteDetails beneficiaryRouteDetails : list) {
            BeneficiaryRouteDetails beneficiaryRouteDetails2 = domainState.f192143b;
            Intrinsics.checkNotNullParameter(beneficiaryRouteDetails, "<this>");
            StringBuilder sb6 = new StringBuilder();
            BeneficiaryDetails beneficiaryDetails = beneficiaryRouteDetails.f60287a;
            Boolean bool = beneficiaryRouteDetails.e;
            String str = beneficiaryDetails.f60285b;
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            sb6.append(CoreConstants.COLON_CHAR);
            String str2 = beneficiaryDetails.f60286c;
            if (str2 == null) {
                str2 = "";
            }
            sb6.append(str2);
            sb6.append(CoreConstants.COLON_CHAR);
            String str3 = beneficiaryDetails.d;
            if (str3 == null) {
                str3 = "";
            }
            sb6.append(str3);
            sb6.append(CoreConstants.COLON_CHAR);
            sb6.append(beneficiaryDetails.e);
            sb6.append(CoreConstants.COLON_CHAR);
            sb6.append(d0.k0(beneficiaryDetails.f60284a, ",", null, null, 0, new n5k.c(8), 30));
            sb6.append(CoreConstants.COLON_CHAR);
            sb6.append(beneficiaryRouteDetails.f60288b);
            sb6.append(CoreConstants.COLON_CHAR);
            t tVar = beneficiaryRouteDetails.f60289c;
            String strName = tVar != null ? tVar.name() : null;
            if (strName == null) {
                strName = "";
            }
            sb6.append(strName);
            sb6.append(CoreConstants.COLON_CHAR);
            String str4 = beneficiaryRouteDetails.d;
            if (str4 == null) {
                str4 = "";
            }
            sb6.append(str4);
            sb6.append(CoreConstants.COLON_CHAR);
            sb6.append(bool);
            sb6.append(CoreConstants.COLON_CHAR);
            sb6.append(beneficiaryRouteDetails.f);
            sb6.append(CoreConstants.COLON_CHAR);
            sb6.append(beneficiaryRouteDetails.f60290g);
            String string = sb6.toString();
            String strQ = j6.a.q("INNER_ITEM_", string);
            String str5 = beneficiaryRouteDetails.f60287a.f60286c;
            arrayList.add(new SelectableDelegate.Model(string, new RowDelegate.Model(strQ, null, new TextClause(str5 == null ? "" : str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, Intrinsics.f(bool, Boolean.TRUE) ? new TextLocalisedClause(R$string.beneficiary_creation_route_picker_fees_apply, null, null, 14) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874), beneficiaryRouteDetails.equals(beneficiaryRouteDetails2) ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, false, null, beneficiaryRouteDetails, null, false, 32488));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList, new lw0.a(new TextLocalisedClause(R$string.beneficiary_creation_route_picker_title, null, null, 14), null, null, null, false, 30));
    }
}
