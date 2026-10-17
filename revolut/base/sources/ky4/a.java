package ky4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a {
    private a() {
    }

    public static TextLocalisedClause a(int i, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new TextLocalisedClause(i, u.c(new TextClause(value, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }
}
