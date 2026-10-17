package zwd;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f {
    public static final y a(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause buttonText, dxd.d dVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        t tVar = new t(title, description, null, 28);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        int i = R$attr.uikit_dp16;
        int i2 = R$attr.uikit_dp24;
        return new y(u.c(new LargeActionButtonDelegate.Model("EXPANDABLE_DIALOG_BUTTON_LIST_ID", defaultFilledButton, null, buttonText, false, null, dVar, i2, i2, i, i, 368)), tVar, null, null, null, null, 1020);
    }

    public static final MoneyClause b(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
    }

    public static final bw0.d c(int i, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new bw0.d(4, new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, true, false, 11), null, null, 12), new TextLocalisedClause(i, u.c(cp5.d.J(dVar.f115083b)), null, 12));
    }

    public static final yqi.d d(d dVar, Function2 onError, Function2 predicate) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (!((Boolean) predicate.invoke(dVar, dVar)).booleanValue()) {
            return new yqi.d(dVar, (yqi.b) onError.invoke(dVar, dVar));
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(dVar);
    }
}
