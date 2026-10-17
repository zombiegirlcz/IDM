package sw4;

import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f266099a;

    public f(h hVar, String str) {
        this.f266099a = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        nl4.h feeWaiverState = (nl4.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(feeWaiverState, "feeWaiverState");
        if (!(feeWaiverState instanceof nl4.g)) {
            return h.j(this.f266099a);
        }
        nl4.g state = (nl4.g) feeWaiverState;
        nl4.e eVar = state.f216998a;
        Intrinsics.checkNotNullParameter(state, "state");
        String widgetId = this.f266099a;
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        boolean z = eVar.e;
        dj0.d dVar = eVar.f216996c;
        dj0.d dVar2 = eVar.d;
        if (z) {
            return new AvatarWidgetDelegate.Model(widgetId, new GlyphImage(R$drawable.uikit_icn_24_present, null, null, 6), new TextLocalisedClause(R$string.credit_card_fee_waiver_fee_waived, null, null, 14), new TextLocalisedClause(R$string.credit_card_fee_waiver_goal_reached, null, null, 14), null, new ProgressStyle(100, 100, R$attr.uikit_colorPlanUltraDark, R$attr.uikit_colorPlanUltraMid, R$attr.uikit_colorGreyTone10, 2.0f, 2.0f, null, ViewUtils.EDGE_TO_EDGE_FLAGS), null, null, null, state, null, 12208);
        }
        dj0.d dVarH = pyd.c.H(dVar2, dVar);
        GlyphImage glyphImage = new GlyphImage(R$drawable.uikit_icn_24_present, null, null, 6);
        MoneyClause moneyClause = new MoneyClause(dVarH, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_fee_waiver_to_waive, null, null, 14);
        int i = (int) dVar.f115082a;
        int i2 = (int) dVar2.f115082a;
        int i3 = R$attr.uikit_colorAccent;
        return new AvatarWidgetDelegate.Model(widgetId, glyphImage, moneyClause, textLocalisedClause, null, new ProgressStyle(i, i2, i3, i3, R$attr.uikit_colorGreyTone10, 2.0f, 2.0f, null, ViewUtils.EDGE_TO_EDGE_FLAGS), null, null, null, state, null, 12208);
    }
}
