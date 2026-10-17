package u7k;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes11.dex */
public final class q {
    public static TextClause a(v61.p pVar) {
        return new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(pVar.f286311b, " ", pVar.f286312c), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static TextClause b(TransferLinkDetails.Active transferLinkDetails) {
        Intrinsics.checkNotNullParameter(transferLinkDetails, "transferLinkDetails");
        v61.p pVar = transferLinkDetails.f60362p;
        if (pVar != null) {
            return a(pVar);
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
