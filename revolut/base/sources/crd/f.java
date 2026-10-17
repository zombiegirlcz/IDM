package crd;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.settings.SettingsContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.settings.SettingsController;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import vkm.j2;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SettingsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SettingsController settingsController, Continuation continuation) {
        super(2, continuation);
        this.v = settingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Float fValueOf = Float.valueOf(40.0f);
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = model.f53228a;
        boolean zF = Intrinsics.f(str, "SPENDING_CYCLE_FREQUENCY_ID");
        SettingsController settingsController = this.v;
        if (zF) {
            com.revolut.feature.spending_analytics.impl.ui.rev10.settings.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.settings.a) settingsController.d();
            lzi.h analyticsCycle = (lzi.h) ((a) ((j2) aVar2.f87904r.f22677a).getValue()).f108350a.getContent();
            if (analyticsCycle != null) {
                j60.a aVar3 = aVar2.f87903q;
                aVar2.f87902p.getClass();
                Intrinsics.checkNotNullParameter(analyticsCycle, "analyticsCycle");
                int i = R$attr.uikit_colorAccentNeutral;
                t tVar = new t(new TextLocalisedClause(R$string.analytics_settings_cycle_frequency_title, null, null, 14), new TextLocalisedClause(R$string.analytics_settings_cycle_frequency_description, null, null, 14), null, 28);
                rp0.l lVar = rp0.l.WINDOW;
                boolean zA = gj7.b.A(analyticsCycle);
                boolean z = !gj7.b.A(analyticsCycle);
                int i2 = R$drawable.uikit_icn_24_calendar_date;
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                List listK = v.k(new AccountCellItemDelegate.Model("MONTHLY_ID", zA, LayeredImage.Companion.b(companion, i2, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 12.0f, fValueOf, null, 32), new TextLocalisedClause(R$string.analytics_settings_cycle_frequency_monthly, null, new Custom(Integer.valueOf(i), false, null, false, null, 254), 10), (com.revolut.core.ui_kit.delegates.c) null, z, (Clause) null, (RowDelegate.Model.c.b) null, (ProgressStyle) null, (Object) null, (Parcelable) null, 131024), new AccountCellItemDelegate.Model("WEEKLY_ID", !gj7.b.A(analyticsCycle), LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_calendar_week, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 12.0f, fValueOf, null, 32), new TextLocalisedClause(R$string.analytics_settings_cycle_frequency_weekly, null, new Custom(Integer.valueOf(i), false, null, false, null, 254), 10), (com.revolut.core.ui_kit.delegates.c) null, gj7.b.A(analyticsCycle), (Clause) null, (RowDelegate.Model.c.b) null, (ProgressStyle) null, (Object) null, (Parcelable) null, 131024));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                aVar3.x(new y(listK, tVar, lVar, null, null, null, 1016));
            }
        } else {
            if (!Intrinsics.f(str, "SPENDING_CYCLE_START_ID")) {
                throw new IllegalArgumentException("Invalid listId");
            }
            com.revolut.feature.spending_analytics.impl.ui.rev10.settings.a aVar4 = (com.revolut.feature.spending_analytics.impl.ui.rev10.settings.a) settingsController.d();
            lzi.h hVar = (lzi.h) ((a) ((j2) aVar4.f87904r.f22677a).getValue()).f108350a.getContent();
            if (hVar != null) {
                oki.h.v2(aVar4.f87906t, new SettingsContract$ModalStep.EditCycle(hVar, false), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return Unit.f186387a;
    }
}
