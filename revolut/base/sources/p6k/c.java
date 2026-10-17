package p6k;

import amh.w;
import android.os.Parcelable;
import ang.f;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$Destination;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType;
import com.revolut.feature.payments.money_request.api.MoneyRequestApi$Toggles;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestActionNavigation$InputData;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$Details$ByMoneyRequest;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payments.money_request.core.R$string;
import com.revolut.retail.feature.payments.money_request.core.actions.money_requests_actions.MoneyRequestsActionsContract$StatusAction;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.MoneyRequestActionFlow;
import eli.j;
import g48.r0;
import j49.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import nii.l1;
import nii.n1;
import oxd.m;
import p4a.g;
import rp0.d0;
import rp0.d2;
import skm.p0;
import u6k.h;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements uv9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vv9.c f233345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vv9.a f233346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f233347c;
    public final j d;
    public final r0 e;
    public final f f;

    public c(vv9.c moneyRequestInteractor, vv9.a moneyRequestActionsInteractor, e helper, j twoFaErrorHandler, r0 jointAccountsInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
        Intrinsics.checkNotNullParameter(moneyRequestActionsInteractor, "moneyRequestActionsInteractor");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f233345a = moneyRequestInteractor;
        this.f233346b = moneyRequestActionsInteractor;
        this.f233347c = helper;
        this.d = twoFaErrorHandler;
        this.e = jointAccountsInteractor;
        this.f = userInteractor;
    }

    public static boolean h(MoneyRequest moneyRequest, String str) {
        if (str == null) {
            return false;
        }
        MoneyRequestCounterParty moneyRequestCounterParty = moneyRequest.f60321m;
        if (str.equals(moneyRequestCounterParty != null ? moneyRequestCounterParty.getF60343a() : null)) {
            return true;
        }
        MoneyRequestCounterParty moneyRequestCounterParty2 = moneyRequest.k;
        return Intrinsics.f(moneyRequestCounterParty2 != null ? moneyRequestCounterParty2.getF60343a() : null, str);
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.f54722b.f51596l instanceof MoneyRequest;
    }

    @Override // i49.c
    public final Object c(n1 n1Var) {
        if (n1Var instanceof l1) {
            Parcelable parcelableA = ((l1) n1Var).f216190a.a();
            if (parcelableA instanceof MoneyRequestsActionsContract$StatusAction.InsufficientFunds) {
                return new j49.b(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, ((MoneyRequestsActionsContract$StatusAction.InsufficientFunds) parcelableA).f102139a.d, null, null, 30)));
            }
        }
        return j49.c.f171322a;
    }

    @Override // i49.c
    public final Object e(Object obj2, j60.a aVar, Continuation continuation) {
        LargeActionButtonDelegate.Model model = obj2 instanceof LargeActionButtonDelegate.Model ? (LargeActionButtonDelegate.Model) obj2 : null;
        if (model != null) {
            if (model.i instanceof i6k.e) {
                return i((LargeActionButtonDelegate.Model) obj2, aVar, (gim.c) continuation);
            }
            if (Intrinsics.f(model.f52613a, "MR_BOTTOM_DIALOG_BUTTON_DISMISS_ID")) {
                j60.a.v(aVar, false, null, 3);
                return j49.a.f171320a;
            }
        }
        return j49.c.f171322a;
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return rd0.e.b(m70.a.e(nim.a.w(kli.a.i(((h) this.f233345a).d(true), rd0.e.c(new w(k38.c.a(this.e, null, null, 3), 21), p0.f264003c), this.f.k(false)), new m(this, 26)), new g(18), new g(19)));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        ActionWidgetDelegate.Model model = tVar.f54722b;
        ActionWidgetDelegate.a action = tVar.f54721a;
        Object obj2 = model.f51596l;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.domain.models.moneyrequest.MoneyRequest");
        MoneyRequest moneyRequest = (MoneyRequest) obj2;
        String str = moneyRequest.f60314a;
        boolean zC = f6k.a.c(moneyRequest);
        e eVar = this.f233347c;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (zC) {
            r6k.a aVar = eVar.f233353c;
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(moneyRequest, "request");
            if (action instanceof ActionWidgetDelegate.a.b) {
                return new j49.b(new WeroNavigation$Destination(new WeroNavigation$StartType.Pay.RequestLinkDetails(str)));
            }
            if (action instanceof ActionWidgetDelegate.a.c) {
                String str2 = moneyRequest.f60317g;
                if (str2 != null) {
                    tqi.g gVar = aVar.f251917c;
                    tqi.c cVar = new tqi.c(null, str2, null, null, 91);
                    m70.a.c(t0.f186434a);
                    return new j49.b(u0.b(gVar.g(cVar, "")));
                }
                IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Open Request without link: ", str));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return j49.a.f171320a;
            }
            if (action instanceof ActionWidgetDelegate.a.d) {
                return ((jte.d) aVar.f251916b).c(MoneyRequestApi$Toggles.MoneyRequestActionsDialog.f79588c) ? new j49.e(gc0.c.b(new MoneyRequestActionFlow(new MoneyRequestActionNavigation$InputData(moneyRequest, yv9.a.CANCEL)), new ogk.b(17)), bottom_dialog) : new j49.d(((v6k.c) aVar.f251915a).c(moneyRequest));
            }
            if (!(action instanceof com.revolut.core.ui_kit.delegates.h) && !(action instanceof ActionWidgetDelegate.a.C0395a)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            q6k.c cVar2 = eVar.f233351a;
            if (action instanceof ActionWidgetDelegate.a.c) {
                return cVar2.a(moneyRequest, (gim.c) continuation);
            }
            if (action instanceof ActionWidgetDelegate.a.d) {
                wv9.c cVar3 = cVar2.f242671c;
                gte.a aVar2 = cVar2.e;
                int i = 15;
                if (f6k.a.e(moneyRequest) || f6k.a.d(moneyRequest)) {
                    return ((jte.d) aVar2).c(MoneyRequestApi$Toggles.MoneyRequestActionsDialog.f79588c) ? new j49.e(gc0.c.b(new MoneyRequestActionFlow(new MoneyRequestActionNavigation$InputData(moneyRequest, yv9.a.CANCEL)), new ogk.b(i)), bottom_dialog) : new j49.d(((v6k.c) cVar3).c(moneyRequest));
                }
                if (!f6k.a.b(moneyRequest)) {
                    throw new IllegalStateException("moneyRequestId=" + str + ", state=" + moneyRequest.f60315b + " is not supported");
                }
                MoneyRequestChannel moneyRequestChannel = moneyRequest.f60316c;
                if (!(moneyRequestChannel instanceof MoneyRequestChannel.APM) && !(moneyRequestChannel instanceof MoneyRequestChannel.BankBeneficiary)) {
                    if (moneyRequestChannel instanceof MoneyRequestChannel.Revolut) {
                        return new j49.b(new BridgeDestination(new FeatureCommand(new MoneyRequestFeatureConfig.RejectWithReason(moneyRequest))));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (((jte.d) aVar2).c(MoneyRequestApi$Toggles.MoneyRequestActionsDialog.f79588c)) {
                    return new j49.e(gc0.c.b(new MoneyRequestActionFlow(new MoneyRequestActionNavigation$InputData(moneyRequest, yv9.a.DECLINE)), new ogk.b(i)), bottom_dialog);
                }
                v6k.c cVar4 = (v6k.c) cVar3;
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
                return new j49.d(d0.d(cVar4.h(moneyRequest), null, new d2("BOTTOM_DIALOG_BUTTON_REJECT_ID", new TextLocalisedClause(R$string.request_details_action_decline, null, null, 14), new i6k.d(moneyRequest), 56), new d2("MR_BOTTOM_DIALOG_BUTTON_DISMISS_ID", new TextLocalisedClause(R$string.money_request_core_details_cancel, null, null, 14), null, 56), null, 114));
            }
            if (!(action instanceof com.revolut.core.ui_kit.delegates.h) && !(action instanceof ActionWidgetDelegate.a.C0395a)) {
                if (action instanceof ActionWidgetDelegate.a.b) {
                    return new j49.b(new BridgeDestination(new FeatureCommand(new MoneyRequestFeatureConfig$Details$ByMoneyRequest(moneyRequest, null))));
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return j49.c.f171322a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        if (nim.a.a(r6, r3) == r4) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0159, code lost:
    
        if (nim.a.a(r2, r3) == r4) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a1, code lost:
    
        if (nim.a.a(r2, r3) == r4) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate.Model r26, j60.a r27, gim.c r28) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6k.c.i(com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate$Model, j60.a, gim.c):java.lang.Object");
    }
}
