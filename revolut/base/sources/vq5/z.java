package vq5;

import aw0.k7;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.l0;
import nii.m0;
import nii.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tp5.b f291348a;

    public z(tp5.b itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f291348a = itemsMapper;
    }

    public static MoneyClause a(dj0.d dVar) {
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8);
    }

    public static y0 b(bgf.e popup) {
        String str;
        m0 l0Var;
        String str2;
        Intrinsics.checkNotNullParameter(popup, "popup");
        String str3 = popup.f15192b;
        bgf.c cVar = popup.f15191a;
        TextClause textClause = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str4 = popup.f15193c;
        TextClause textClause2 = str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        bgf.d dVar = popup.e;
        TextClause textClause3 = (dVar == null || (str2 = dVar.f15190a) == null) ? null : new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = y.f291347a[cVar.ordinal()];
        if (i == 1) {
            str = null;
            l0Var = new l0(textClause, textClause2, null, textClause3, null, null, false, AnalyticsProduct.Shared.Crypto.f, 884);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("Unexpected popup type: " + cVar).toString());
            }
            str = null;
            l0Var = new g0(textClause, textClause2, null, textClause3, null, null, null, null, false, AnalyticsProduct.Shared.Crypto.f, false, null, 15860);
        }
        return new y0(str, l0Var, false, 5);
    }
}
