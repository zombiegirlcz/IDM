package yed;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertRevampedScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.simple_selector.SimpleSelectorController;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.simple_selector.SimpleSelectorControllerContract$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.simple_selector.SimpleSelectorControllerContract$SimpleSelectorItem;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.kompot.common.ModalDestination;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SharedCreateAlertRevampedScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SharedCreateAlertRevampedScreen sharedCreateAlertRevampedScreen, Continuation continuation) {
        super(2, continuation);
        this.v = sharedCreateAlertRevampedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        int i2;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52580a;
        boolean zF = Intrinsics.f(str, "LIST_ID_FREQUENCY_INPUT");
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        SharedCreateAlertRevampedScreen sharedCreateAlertRevampedScreen = this.v;
        if (zF) {
            com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar = (com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) sharedCreateAlertRevampedScreen.T2();
            bVar.getClass();
            o0 o0Var = bVar.u;
            mgd.b selected = ((o) bVar.t2()).k;
            o0Var.getClass();
            Intrinsics.checkNotNullParameter(selected, "selected");
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.shared_alerts_create_alert_frequency_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
            EnumEntries<mgd.b> enumEntriesA = mgd.b.a();
            ArrayList arrayList = new ArrayList(zhm.w.t(enumEntriesA, 10));
            for (mgd.b bVar2 : enumEntriesA) {
                int i3 = n0.f312872a[bVar2.ordinal()];
                if (i3 == 1) {
                    i2 = R$string.shared_alerts_create_alert_frequency_one_time;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R$string.shared_alerts_create_alert_frequency_recurring;
                }
                arrayList.add(new SimpleSelectorControllerContract$SimpleSelectorItem(bVar2, new TextLocalisedClause(i2, null, null, 14), bVar2 == selected));
            }
            bVar.f2(new SimpleSelectorController(new SimpleSelectorControllerContract$InputData(textLocalisedClause, arrayList)), bottom_dialog, new v(bVar, 3));
        } else if (Intrinsics.f(str, "LIST_ID_TIME_RANGE_INPUT")) {
            com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar3 = (com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) sharedCreateAlertRevampedScreen.T2();
            bVar3.getClass();
            o0 o0Var2 = bVar3.u;
            mgd.e selected2 = ((o) bVar3.t2()).f312884q;
            BigDecimal inputAmount = ((o) bVar3.t2()).i;
            o0Var2.getClass();
            Intrinsics.checkNotNullParameter(selected2, "selected");
            Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.shared_alerts_create_alert_time_range_title, zhm.u.c((inputAmount.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : inputAmount.stripTrailingZeros()).toPlainString()), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
            EnumEntries<mgd.e> enumEntriesA2 = mgd.e.a();
            ArrayList arrayList2 = new ArrayList(zhm.w.t(enumEntriesA2, 10));
            for (mgd.e eVar : enumEntriesA2) {
                int i5 = n0.f312873b[eVar.ordinal()];
                if (i5 == 1) {
                    i = R$string.shared_alerts_create_alert_time_range_one_hour;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.shared_alerts_create_alert_time_range_one_day;
                }
                arrayList2.add(new SimpleSelectorControllerContract$SimpleSelectorItem(eVar, new TextLocalisedClause(i, null, null, 14), eVar == selected2));
            }
            bVar3.f2(new SimpleSelectorController(new SimpleSelectorControllerContract$InputData(textLocalisedClause2, arrayList2)), bottom_dialog, new v(bVar3, 0));
        }
        return Unit.f186387a;
    }
}
