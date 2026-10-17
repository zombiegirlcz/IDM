package j7k;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import v61.p;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static MoneyClause a(TransferLinkDetails.Active transferLinkDetails) {
        Intrinsics.checkNotNullParameter(transferLinkDetails, "transferLinkDetails");
        return new MoneyClause(transferLinkDetails.k, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }

    public static TextClause b(TransferLinkDetails.Active transferLinkDetails) {
        String strO;
        Intrinsics.checkNotNullParameter(transferLinkDetails, "transferLinkDetails");
        p pVar = transferLinkDetails.f60362p;
        if (pVar == null || (strO = com.google.android.gms.internal.mlkit_vision_face.a.o(pVar.f286311b, " ", pVar.f286312c)) == null) {
            m70.a.c(t0.f186434a);
            strO = "";
        }
        return new TextClause(strO, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
