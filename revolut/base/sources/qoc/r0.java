package qoc;

import aw0.db;
import aw0.q1;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r0 {
    public r0(h0 colorMapper) {
        Intrinsics.checkNotNullParameter(colorMapper, "colorMapper");
    }

    public static q1 a(int i, int i2, dj0.d dVar) {
        return new q1(i2, Integer.valueOf(i2), new TextLocalisedClause(i, null, null, 14), new MoneyClause(pyd.c.U(pyd.c.k(dVar, 100L), 100L), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, db.EMPHASIS1, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST), null, 8));
    }
}
