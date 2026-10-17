package xug;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.account_closure.impl.R$string;
import ip0.iq;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static Set a(xug.a aVar) {
        int i = t.f309069a[aVar.ordinal()];
        if (i == 1) {
            return y0.b(f.CLOSE_POSITIONS);
        }
        if (i == 2) {
            return y0.b(f.DONATE);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        f[] elements = {f.CLOSE_POSITIONS, f.DONATE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    public static TextLocalisedClause b() {
        int i = R$string.trading_account_closure_review_conditions_learn_more;
        Intrinsics.checkNotNullParameter("topic.closing-your-trading-account", "key");
        return new TextLocalisedClause(i, null, new Click(28, (Integer) null, (Object) new d(), "LEARN_MORE_SPAN_ID", false), 10);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.trading_account_closure_review_conditions_title, null, null, 14);
        xug.a aVar = domainState.f309063a;
        Set set = domainState.f309064b;
        int i = t.f309069a[aVar.ordinal()];
        if (i != 1) {
            c cVar = c.f309062a;
            if (i == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.trading_account_closure_review_conditions_dividends_subtitle, v.k(new TextLocalisedClause(R$string.trading_account_closure_review_conditions_view_dividends, null, new Click(28, (Integer) null, (Object) cVar, "VIEW_DIVIDENDS_SPAN_ID", false), 10), b()), null, 12);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.trading_account_closure_review_conditions_open_positions_and_dividends_subtitle, v.k(new TextLocalisedClause(R$string.trading_account_closure_review_conditions_view_dividends, null, new Click(28, (Integer) null, (Object) cVar, "VIEW_DIVIDENDS_SPAN_ID", false), 10), b()), null, 12);
            }
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.trading_account_closure_review_conditions_open_positions_subtitle, null, null, 14);
        }
        lw0.a aVar2 = new lw0.a(textLocalisedClause4, textLocalisedClause, new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, GlyphImageTint.WARNING.f59933a, null, 4)), null, false, 24);
        Set<f> setA = a(aVar);
        ArrayList arrayList = new ArrayList(w.t(setA, 10));
        for (f fVar : setA) {
            boolean zContains = set.contains(fVar);
            String strName = fVar.name();
            int i2 = t.f309070b[fVar.ordinal()];
            if (i2 == 1) {
                textLocalisedClause3 = new TextLocalisedClause(R$string.trading_account_closure_review_conditions_dividends_checkbox_title, null, null, 14);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause3 = new TextLocalisedClause(R$string.trading_account_closure_review_conditions_open_positions_checkbox_title, null, null, 14);
            }
            arrayList.add(new InputChecklistDelegate.Model(strName, textLocalisedClause3, zContains, false, null, iq.CHECK_BUTTON, null, null, new b(fVar), null, 0, 0, 0, 523992));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        m6 m6Var = n6.Companion;
        n6 n6VarC = m6.c(m6Var, new TextLocalisedClause(R$string.trading_account_closure_review_conditions_primary_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, Intrinsics.f(set, a(aVar)), null, null, null, 988);
        int i3 = t.f309069a[aVar.ordinal()];
        if (i3 == 1) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.trading_account_closure_review_conditions_open_positions_secondary_button, null, null, 14);
        } else {
            if (i3 != 2 && i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.trading_account_closure_review_conditions_secondary_button, null, null, 14);
        }
        return new cii.b(new aw0.h(false, n6VarC, m6.c(m6Var, textLocalisedClause2, LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121), arrayList, aVar2);
    }
}
