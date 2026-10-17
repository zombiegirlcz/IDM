package kae;

import android.text.InputFilter;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subscriptions.impl.label.SubscriptionLabelScreenContract$InputData;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubscriptionLabelScreenContract$InputData f182479a;

    public j(SubscriptionLabelScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f182479a = inputData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5 */
    @Override // cli.n
    public final o c(cli.j jVar) {
        String str;
        boolean z;
        ?? r132;
        int i;
        TextLocalisedClause textLocalisedClause;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str2 = domainState.f182471b;
        ibd.h hVar = domainState.f182472c;
        TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        SubscriptionLabelScreenContract$InputData subscriptionLabelScreenContract$InputData = this.f182479a;
        InputTextDelegate.Model model = new InputTextDelegate.Model("SUBSCRIPTION_LABEL_INPUT_LIST_ID", textClause, null, new TextLocalisedClause(R$string.subscriptions_label_subscription_field_title, null, null, 14), null, null, null, true, Integer.valueOf(subscriptionLabelScreenContract$InputData.f89207b), false, true, 0, true, 0, true, true, true, u.c(new InputFilter.LengthFilter(subscriptionLabelScreenContract$InputData.f89207b)), false, false, 0, false, false, null, 855326708, 131071);
        int i2 = R$attr.uikit_dp16;
        yp0.b.l(model, i2, 0, i2, i2, null, false, 50);
        List listC = u.c(model);
        String str3 = domainState.f182470a;
        if (str3.length() == 0 && str2.length() == 0) {
            z = false;
            str = str2;
        } else {
            str = str2;
            z = str.equals(str3) ? false : true;
        }
        ibd.h hVar2 = ibd.h.BPAY;
        if (hVar == hVar2) {
            r132 = 0;
            i = 14;
            textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_label_subscription_field_title, null, null, 14);
        } else {
            r132 = 0;
            i = 14;
            textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_label_subscription_title, null, null, 14);
        }
        return new g(textLocalisedClause, new TextLocalisedClause(str3.length() == 0 ? R$string.subscriptions_label_subscription_cta_add : str.length() == 0 ? R$string.subscriptions_label_subscription_cta_remove : R$string.subscriptions_label_subscription_cta_change, r132, r132, i), hVar != hVar2 ? new TextLocalisedClause(R$string.subscriptions_label_subscription_caption, r132, r132, i) : r132, listC, z);
    }
}
