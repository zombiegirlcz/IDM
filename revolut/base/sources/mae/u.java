package mae;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.payid.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements a9e.i {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.g f204034a;

    public u(t70.g localization) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f204034a = localization;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(java.util.Map r25) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mae.u.a(java.util.Map):java.util.ArrayList");
    }

    public final List b(f5j.a aVar) {
        f5j.r rVar = aVar != null ? aVar.f132335l : null;
        if ((rVar == null ? -1 : t.f204032a[rVar.ordinal()]) != 1) {
            return a(aVar != null ? aVar.u : null);
        }
        String strA = f5j.c.a(aVar);
        if (strA == null) {
            return null;
        }
        return zhm.u.c(new CellDetailsDelegate.Model("LIST_ID_PAYID_DETAILS", new TextLocalisedClause(R$string.pay_id_area_title, null, null, 14), new TextClause(strA, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
    }
}
