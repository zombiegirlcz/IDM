package er4;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ck0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements fr4.d {
    public static TextDelegate.Model a(xp3.b bVar) {
        if (bVar != null) {
            return new TextDelegate.Model("ID_CC_DETAILS_CREDIT_LIMIT_INCREASE", new CompositeClause(u.c(new HtmlClause(0, 30, (Integer) null, (Object) null, bVar.f307883b)), null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 10), true, new ck0(0), null, null, R$attr.uikit_dp0, 0, 0, 0, 1904);
        }
        return null;
    }
}
