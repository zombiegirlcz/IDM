package f1;

import android.view.View;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.material.CheckboxKt;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import d9.e1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jmrtd.lds.LDSFile;
import wp4.i0;
import wul.m;
import yji.l;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f131154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f131155c;

    public /* synthetic */ f(Amount amount, m mVar, boolean z) {
        this.f131153a = 6;
        this.f131155c = amount;
        this.f131154b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f131153a) {
            case 0:
                return ContextMenuUiKt.ContextMenuItem$lambda$0$0(this.f131154b, (Function0) this.f131155c);
            case 1:
                com.revolut.core.ui_kit.internal.views.floatingbottombar.a aVar = (com.revolut.core.ui_kit.internal.views.floatingbottombar.a) this.f131155c;
                View view = aVar.f57049b;
                boolean z = this.f131154b;
                view.setVisibility(!z ? 0 : 8);
                aVar.f57050c.setVisibility(z ? 0 : 8);
                return Unit.f186387a;
            case 2:
                return CoreTextFieldKt.CoreTextField$lambda$23$0(this.f131154b, (LegacyPlatformTextInputServiceAdapter) this.f131155c);
            case 3:
                return new AnalyticsContext(m72.b.h("device_fingerprint_submission", com.bumptech.glide.c.g(new l3d.f(this.f131154b, (eo.f) this.f131155c, 13)), AnalyticsContext.INSTANCE));
            case 4:
                return CheckboxKt.Checkbox$lambda$0$0((Function1) this.f131155c, this.f131154b);
            case 5:
                i0 i0Var = (i0) this.f131155c;
                i0Var.getClass();
                l.b1(i0Var, i0Var.X1(new mii.f("auto-pay-status-changed-shot-dialog", this.f131154b ? new TextLocalisedClause(R$string.credit_card_auto_pay_enabled, null, null, 14) : new TextLocalisedClause(R$string.credit_card_auto_pay_disabled, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_calendar_recurring, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG)), null, null, 7);
                return Unit.f186387a;
            case 6:
                Amount amount = (Amount) this.f131155c;
                if (!e1.G(amount.f104717a) && !this.f131154b) {
                    return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trade_list_fee_no_fees, null, null, 14);
                }
                return m.q(amount);
            default:
                return ReactionsKeyboardView.q((ReactionsKeyboardView) this.f131155c, this.f131154b);
        }
    }

    public /* synthetic */ f(Object obj2, boolean z, int i) {
        this.f131153a = i;
        this.f131155c = obj2;
        this.f131154b = z;
    }

    public /* synthetic */ f(boolean z, Object obj2, int i) {
        this.f131153a = i;
        this.f131154b = z;
        this.f131155c = obj2;
    }
}
