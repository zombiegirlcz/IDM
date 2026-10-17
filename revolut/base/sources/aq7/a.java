package aq7;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.picker.PickerController;
import e4m.e;
import kl7.w1;
import kotlin.jvm.internal.Intrinsics;
import rl7.b;
import s7a.w;
import s7a.x;
import x7a.d;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f8274a;

    public a(e feedbackPickerInteractor) {
        Intrinsics.checkNotNullParameter(feedbackPickerInteractor, "feedbackPickerInteractor");
        this.f8274a = feedbackPickerInteractor;
    }

    public final PickerController a(String policyId, w1 questionnaireType, TextLocalisedClause toolbarTitle, TextLocalisedClause secondaryDescriptionText, TextLocalisedClause actionText) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(questionnaireType, "questionnaireType");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(secondaryDescriptionText, "secondaryDescriptionText");
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        x xVar = new x(toolbarTitle, new b(policyId, questionnaireType), null, secondaryDescriptionText, false, w.HIDDEN, null, null, null, true, actionText, null, null, null, false, new AnalyticsProduct.Retail(zl7.a.f323191b), null, null, null, null, 2113892060);
        Object obj2 = this.f8274a.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return new PickerController(xVar, (d) obj2);
    }
}
