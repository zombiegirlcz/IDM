package xo8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior_payment_links.api.navigation.JuniorCardProfileNavigationDestination;
import com.revolut.feature.junior_profile.api.navigation.JuniorProfileDetailsDestination;
import com.revolut.feature.junior_settings.api.navigation.JuniorSettingsLimitsDestination;
import com.revolut.feature.junior_settings.impl.ui_kompot.coparents.CoparentsSettingsScreenContract$Destination;
import com.revolut.feature.junior_settings.impl.ui_kompot.coparents.CoparentsSettingsScreenContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings.JuniorSettingsController;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings.JuniorSettingsControllerContract$Input;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings_flow.SettingsFlowContract$Step;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.kompot.navigable.TransitionAnimation;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorSettingsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(JuniorSettingsController juniorSettingsController, Continuation continuation) {
        super(2, continuation);
        this.v = juniorSettingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model item = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        Intrinsics.h(item);
        h0 h0Var = (h0) nVarE3;
        JuniorSettingsControllerContract$Input juniorSettingsControllerContract$Input = h0Var.o;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f53228a;
        Continuation continuation = null;
        switch (str.hashCode()) {
            case -2139340334:
                if (str.equals("ID_FAQ")) {
                    SharedFaqDestination.StartPoint.FaqExplicit faqExplicit = new SharedFaqDestination.StartPoint.FaqExplicit("topic.revolut-junior", 14);
                    TransitionAnimation.FADE fade = TransitionAnimation.FADE.f98392a;
                    h0Var.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) faqExplicit, (SharedFaqDestination.PassthroughData) null, false, 10));
                }
                break;
            case -2102352180:
                if (str.equals("ID_ACCOUNT_DETAILS")) {
                    h0Var.C2(new k(SettingsFlowContract$Step.AccountDetails.f77341a));
                }
                break;
            case -1937712412:
                if (str.equals("ID_BLOCKED_PAYMENTS")) {
                    h0Var.l2(new y(h0Var, null), new yi5.b(26));
                }
                break;
            case -1889949865:
                if (str.equals("ID_PAYMENT_LINK")) {
                    h0Var.C1(new JuniorCardProfileNavigationDestination(h0Var.o.f77340a));
                }
                break;
            case -331432156:
                if (str.equals("ID_SPENDING_FEES")) {
                    h0Var.C1(new JuniorSettingsLimitsDestination(juniorSettingsControllerContract$Input.f77340a));
                }
                break;
            case -221018206:
                if (str.equals("ID_BLOCKED_PAYEES")) {
                    h0Var.l2(new x(h0Var, null), new yi5.b(26));
                }
                break;
            case 160937697:
                if (str.equals("ID_CARD_CONTROLS")) {
                    h0Var.n2(new g0(h0Var, null), new whi.b(6));
                }
                break;
            case 189353415:
                if (str.equals("ID_PERSONAL_DETAILS")) {
                    h0Var.C1(new JuniorProfileDetailsDestination(juniorSettingsControllerContract$Input.f77340a));
                }
                break;
            case 905720582:
                if (str.equals("ID_APP_ACCESS")) {
                    h0Var.C2(new k(SettingsFlowContract$Step.AppAccess.f77342a));
                }
                break;
            case 1032854745:
                if (str.equals("ID_COPARENTS")) {
                    h0Var.C1(new CoparentsSettingsScreenContract$Destination(new CoparentsSettingsScreenContract$InputData(juniorSettingsControllerContract$Input.f77340a), TransitionAnimation.FADE.f98392a));
                }
                break;
            case 1161403010:
                if (str.equals("ID_CLOSE_ACCOUNT")) {
                    h0Var.f307701s.Z2(juniorSettingsControllerContract$Input.f77340a);
                }
                break;
            case 1512895237:
                if (str.equals("ID_SECURITY_AND_PRIVACY")) {
                    h0Var.C2(new k(SettingsFlowContract$Step.SecurityAndPrivacy.f77345a));
                }
                break;
            case 1531081347:
                if (str.equals("ID_REMOVE_POCKET_CURRENCY")) {
                    Object obj3 = item.u;
                    io3.d dVar = obj3 instanceof io3.d ? (io3.d) obj3 : null;
                    if (dVar != null) {
                        ProductAccountId productAccountId = ((j) ((j2) h0Var.E.f22677a).getValue()).f307716n;
                        if (productAccountId != null) {
                            h0Var.l2(new xge.f(h0Var, productAccountId, dVar, continuation, 12), new yi5.b(26));
                        } else {
                            IllegalStateException illegalStateException = new IllegalStateException("Cannot start removal of currency pocket as productAccountId is null");
                            zhm.h0 h0Var2 = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                        }
                    } else {
                        IllegalStateException illegalStateException2 = new IllegalStateException("Cannot start removal of currency pocket as pocket is null");
                        zhm.h0 h0Var3 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var3);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
