package bh6;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import ip0.ak0;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements h {
    public final TextDelegate.Model a(g disclaimerType) {
        Intrinsics.checkNotNullParameter(disclaimerType, "disclaimerType");
        return new TextDelegate.Model("ITEM_ID_TERMS_AND_CONDITIONS", new HtmlLocalisedClause(disclaimerType.a(), u.c("https://www.revolut.com/legal/terms/"), (Integer) null, (Object) null, 28), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
    }
}
