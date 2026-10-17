package w6b;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class f {
    public static TextLocalisedClause a(Data linkAccountInfoData, int i) {
        String str;
        Intrinsics.checkNotNullParameter(linkAccountInfoData, "linkAccountInfoData");
        r5b.e eVar = (r5b.e) linkAccountInfoData.getContent();
        if (eVar == null || (str = eVar.f251564a) == null) {
            str = "";
        }
        return new TextLocalisedClause(i, u.c(str), null, 12);
    }
}
