package mug;

import aw0.o9;
import cli.n;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RateDelegate;
import com.revolut.core.ui_kit.delegates.xd;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeatureRating;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackFeature;
import com.revolut.feature.wealth.account_closure.impl.R$string;
import ip0.w70;
import ip0.y70;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // cli.n
    public final o c(cli.j jVar) {
        Integer num;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ?? r87 = 0;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_account_closure_feedback_screen_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_account_closure_feedback_screen_feature_subtitle, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
        boolean z = !domainState.f209027b.isEmpty();
        ArrayList<AccountClosureFeedbackFeature> arrayList = domainState.f209026a;
        ?? r06 = domainState.f209027b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (AccountClosureFeedbackFeature accountClosureFeedbackFeature : arrayList) {
            AccountClosureFeatureRating accountClosureFeatureRating = (AccountClosureFeatureRating) r06.get(accountClosureFeedbackFeature);
            Integer num2 = accountClosureFeatureRating != null ? accountClosureFeatureRating.f94855a : r87;
            String str = accountClosureFeedbackFeature.f94870a;
            TextClause textClause = new TextClause(accountClosureFeedbackFeature.f94871b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            y70 y70Var = new y70(str, (num2 == 0 || num2.intValue() > 2) ? new xd(new RateDelegate.b((accountClosureFeatureRating == null || (num = accountClosureFeatureRating.f94855a) == null) ? BitmapDescriptorFactory.HUE_RED : num.intValue(), 62)) : new w70(new TextLocalisedClause(R$string.trading_account_closure_feedback_screen_low_rating_button, r87, r87, 14)), textClause, accountClosureFeedbackFeature);
            yp0.b.l(y70Var, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(y70Var);
            r87 = 0;
        }
        return new i(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, arrayList2, z);
    }
}
