package g6k;

import aw0.o9;
import c12.b0;
import c12.d0;
import c12.e0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientSettingsNavigation$InputData;
import com.revolut.feature.payments.money_request.api.MoneyRequestApi$Toggles;
import com.revolut.feature.payments.money_request.api.model.MoneyRequestAction;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestActionNavigation$InputData;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.payments.money_request.core.R$string;
import g37.z;
import ip0.tm0;
import ip0.um0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeUtils;
import rp0.t;
import rp0.y;
import vkm.j2;
import zh9.u0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends yji.n implements f {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final utf.a f141006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vv9.a f141007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vv9.b f141008n;
    public final wv9.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bqf.g f141009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zof.f f141010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i5k.a f141011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f141012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tqi.g f141013t;
    public final j60.a u;
    public final f01.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j2 f141014w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j2 f141015x;

    public r(utf.a transferRequestApprovalHandler, vv9.a moneyRequestActionsInteractor, vv9.b checkInteractor, wv9.c moneyRequestResourcesMapper, bqf.g trustedPayeeChecker, zof.f transferFeatureScreensProvider, i5k.a appFraudCheckExtension, gte.a featureToggleInteractor, tqi.g shareNaviCommandFactory, j60.a bottomDialogExtension, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(transferRequestApprovalHandler, "transferRequestApprovalHandler");
        Intrinsics.checkNotNullParameter(moneyRequestActionsInteractor, "moneyRequestActionsInteractor");
        Intrinsics.checkNotNullParameter(checkInteractor, "checkInteractor");
        Intrinsics.checkNotNullParameter(moneyRequestResourcesMapper, "moneyRequestResourcesMapper");
        Intrinsics.checkNotNullParameter(trustedPayeeChecker, "trustedPayeeChecker");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(appFraudCheckExtension, "appFraudCheckExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f141006l = transferRequestApprovalHandler;
        this.f141007m = moneyRequestActionsInteractor;
        this.f141008n = checkInteractor;
        this.o = moneyRequestResourcesMapper;
        this.f141009p = trustedPayeeChecker;
        this.f141010q = transferFeatureScreensProvider;
        this.f141011r = appFraudCheckExtension;
        this.f141012s = featureToggleInteractor;
        this.f141013t = shareNaviCommandFactory;
        this.u = bottomDialogExtension;
        this.v = uiKitResources;
        this.f141014w = vkm.q.c(null);
        this.f141015x = vkm.q.c(new i(null, ""));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(g6k.r r6, com.revolut.domain.models.moneyrequest.MoneyRequest r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof g6k.o
            if (r0 == 0) goto L13
            r0 = r8
            g6k.o r0 = (g6k.o) r0
            int r1 = r0.f141002x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141002x = r1
            goto L18
        L13:
            g6k.o r0 = new g6k.o
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141002x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.domain.models.moneyrequest.MoneyRequest r7 = r0.u
            yhm.o.b(r8)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            com.revolut.domain.models.moneyrequest.MoneyRequest r7 = r0.u
            yhm.o.b(r8)
            goto L48
        L3a:
            yhm.o.b(r8)
            r0.u = r7
            r0.f141002x = r4
            java.lang.Object r8 = r6.e3(r7, r0)
            if (r8 != r1) goto L48
            goto L5a
        L48:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L64
            r0.u = r7
            r0.f141002x = r3
            java.lang.Object r8 = r6.b3(r7, r0)
            if (r8 != r1) goto L5b
        L5a:
            return r1
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L64
            goto L65
        L64:
            r4 = 0
        L65:
            if (r4 == 0) goto L8f
            i6k.b r8 = new i6k.b
            vkm.j2 r0 = r6.f141015x
            java.lang.Object r0 = r0.getValue()
            g6k.i r0 = (g6k.i) r0
            krf.c r0 = r0.f140992a
            r8.<init>(r7, r0)
            g37.z r7 = new g37.z
            r0 = 5
            r1 = 0
            r7.<init>(r6, r8, r1, r0)
            g23.q r8 = new g23.q
            java.lang.String r0 = "handleApproveDialogAction"
            r8.<init>(r6, r0, r7, r1)
            yi5.b r7 = new yi5.b
            r0 = 27
            r7.<init>(r0)
            r6.T2(r8, r7)
            goto L9e
        L8f:
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r0 = rd0.c.WARNING
            r4 = 0
            r5 = 16
            java.lang.String r1 = "MoneyRequestActionModelExtensionImpl"
            java.lang.String r2 = "Money request checks didn't pass"
            r3 = 0
            rd0.d.b(r0, r1, r2, r3, r4, r5)
        L9e:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g6k.r.Z2(g6k.r, com.revolut.domain.models.moneyrequest.MoneyRequest, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.domain.models.moneyrequest.MoneyRequest r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof g6k.j
            if (r0 == 0) goto L14
            r0 = r9
            g6k.j r0 = (g6k.j) r0
            int r1 = r0.f140994w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f140994w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            g6k.j r0 = new g6k.j
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f140994w
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            yhm.o.b(r9)
            return r9
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            yhm.o.b(r9)
            goto L50
        L38:
            yhm.o.b(r9)
            com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty r9 = r8.f60320l
            com.revolut.domain.models.moneyrequest.a.c(r9)
            g6k.k r9 = new g6k.k
            r1 = 0
            r4 = 0
            r9.<init>(r7, r8, r4, r1)
            r6.f140994w = r3
            java.lang.Object r9 = r7.Y2(r6, r9)
            if (r9 != r0) goto L50
            goto L64
        L50:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            r6.f140994w = r2
            r5 = 0
            i5k.a r1 = r7.f141011r
            r3 = 1
            r4 = 0
            r2 = r8
            java.lang.Object r8 = r1.b3(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L65
        L64:
            return r0
        L65:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g6k.r.b3(com.revolut.domain.models.moneyrequest.MoneyRequest, gim.c):java.lang.Object");
    }

    public final void c3(MoneyRequestAction action, final MoneyRequest moneyRequest) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        Continuation continuation = null;
        if (action instanceof MoneyRequestAction.Approve) {
            T2(new n(moneyRequest, this, null), new yi5.b(27));
            return;
        }
        final int i = 0;
        if (action instanceof MoneyRequestAction.SharePaymentLink) {
            MoneyClause moneyClause = new MoneyClause(moneyRequest.d, new MoneyClause.Format.Shorts(false, 63), null, null, 12);
            String str = moneyRequest.f60317g;
            if (str == null) {
                str = "";
            }
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.money_request_core_link_share_sms_template_request_anonymous, v.k(moneyClause, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            f01.c cVar = this.v;
            A2(u0.b(this.f141013t.f(0, cVar.b(new TextLocalisedClause(R$string.money_request_core_link_share, null, null, 14)).toString(), cVar.b(textLocalisedClause3).toString())));
            return;
        }
        final int i2 = 1;
        if (action instanceof MoneyRequestAction.Remind) {
            T2(new g23.q(this, "handleRemind", new k(this, moneyRequest, continuation, i2), (Continuation) null), new yi5.b(27));
            return;
        }
        boolean z = action instanceof MoneyRequestAction.Cancel;
        j60.a aVar = this.u;
        wv9.c cVar2 = this.o;
        gte.a aVar2 = this.f141012s;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            if (((jte.d) aVar2).c(MoneyRequestApi$Toggles.MoneyRequestActionsDialog.f79588c)) {
                final int i3 = 2;
                N2(o2(new yv9.b(new MoneyRequestActionNavigation$InputData(moneyRequest, yv9.a.CANCEL))), bottom_dialog, new Function1(this) { // from class: g6k.g

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ r f140990b;

                    {
                        this.f140990b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i3) {
                            case 0:
                                yv9.e output = (yv9.e) obj2;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (output instanceof yv9.d) {
                                    j2 j2Var = this.f140990b.f141014w;
                                    i6k.d dVar = new i6k.d(moneyRequest);
                                    j2Var.getClass();
                                    j2Var.g(null, dVar);
                                }
                                break;
                            case 1:
                                e0 result = (e0) obj2;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof d0) {
                                    j2 j2Var2 = this.f140990b.f141014w;
                                    i6k.a aVar3 = new i6k.a(moneyRequest, ((d0) result).f20327a);
                                    j2Var2.getClass();
                                    j2Var2.g(null, aVar3);
                                }
                                break;
                            default:
                                yv9.e output2 = (yv9.e) obj2;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                if (output2 instanceof yv9.d) {
                                    j2 j2Var3 = this.f140990b.f141014w;
                                    i6k.c cVar3 = new i6k.c(moneyRequest);
                                    j2Var3.getClass();
                                    j2Var3.g(null, cVar3);
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
                return;
            }
            v6k.c cVar3 = (v6k.c) cVar2;
            cVar3.getClass();
            Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
            MoneyClause moneyClause2 = new MoneyClause(moneyRequest.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            String strG = cVar3.g(moneyRequest);
            if (strG == null) {
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.money_request_core_notification_friend, null, null, 14);
                textLocalisedClause = new TextLocalisedClause(R$string.money_request_core_details_alert_cancel_request_title, v.k(moneyClause2, textLocalisedClause4), null, 12);
                textLocalisedClause2 = new TextLocalisedClause(R$string.money_request_core_link_cancel_alert_request_message, v.k(textLocalisedClause4, moneyClause2), null, 12);
            } else {
                textLocalisedClause = new TextLocalisedClause(R$string.money_request_core_details_cancel_request_title, v.k(moneyClause2, strG), null, 12);
                textLocalisedClause2 = null;
            }
            aVar.x(new y(u.c(new um0("MR_REQUEST_BOTTOM_DIALOG_BUTTONS_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.money_request_core_details_cancel_request_no, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.money_request_core_details_cancel_request_cancel, null, null, 14), false, null, null, 56), (Object) new i6k.c(moneyRequest), (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new t(textLocalisedClause, textLocalisedClause2, null, 28), null, null, null, null, 1020));
            return;
        }
        if (!(action instanceof MoneyRequestAction.Reject)) {
            if (!(action instanceof MoneyRequestAction.ApmSettings)) {
                throw new NoWhenBranchMatchedException();
            }
            MoneyRequestAction.ApmSettings apmSettings = (MoneyRequestAction.ApmSettings) action;
            MoneyRequestCounterParty moneyRequestCounterPartyA = com.revolut.domain.models.moneyrequest.b.a(moneyRequest);
            String f60343a = moneyRequestCounterPartyA != null ? moneyRequestCounterPartyA.getF60343a() : null;
            if (f60343a != null) {
                N2(o2(new b0(new ApmRecipientSettingsNavigation$InputData.Id(f60343a, apmSettings.f79591b))), bottom_dialog, new Function1(this) { // from class: g6k.g

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ r f140990b;

                    {
                        this.f140990b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i2) {
                            case 0:
                                yv9.e output = (yv9.e) obj2;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (output instanceof yv9.d) {
                                    j2 j2Var = this.f140990b.f141014w;
                                    i6k.d dVar = new i6k.d(moneyRequest);
                                    j2Var.getClass();
                                    j2Var.g(null, dVar);
                                }
                                break;
                            case 1:
                                e0 result = (e0) obj2;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof d0) {
                                    j2 j2Var2 = this.f140990b.f141014w;
                                    i6k.a aVar3 = new i6k.a(moneyRequest, ((d0) result).f20327a);
                                    j2Var2.getClass();
                                    j2Var2.g(null, aVar3);
                                }
                                break;
                            default:
                                yv9.e output2 = (yv9.e) obj2;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                if (output2 instanceof yv9.d) {
                                    j2 j2Var3 = this.f140990b.f141014w;
                                    i6k.c cVar32 = new i6k.c(moneyRequest);
                                    j2Var3.getClass();
                                    j2Var3.g(null, cVar32);
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("MR Action APM Setting with null counterParty id");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        if (((jte.d) aVar2).c(MoneyRequestApi$Toggles.MoneyRequestActionsDialog.f79588c)) {
            N2(o2(new yv9.b(new MoneyRequestActionNavigation$InputData(moneyRequest, yv9.a.DECLINE))), bottom_dialog, new Function1(this) { // from class: g6k.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f140990b;

                {
                    this.f140990b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            yv9.e output = (yv9.e) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof yv9.d) {
                                j2 j2Var = this.f140990b.f141014w;
                                i6k.d dVar = new i6k.d(moneyRequest);
                                j2Var.getClass();
                                j2Var.g(null, dVar);
                            }
                            break;
                        case 1:
                            e0 result = (e0) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof d0) {
                                j2 j2Var2 = this.f140990b.f141014w;
                                i6k.a aVar3 = new i6k.a(moneyRequest, ((d0) result).f20327a);
                                j2Var2.getClass();
                                j2Var2.g(null, aVar3);
                            }
                            break;
                        default:
                            yv9.e output2 = (yv9.e) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (output2 instanceof yv9.d) {
                                j2 j2Var3 = this.f140990b.f141014w;
                                i6k.c cVar32 = new i6k.c(moneyRequest);
                                j2Var3.getClass();
                                j2Var3.g(null, cVar32);
                            }
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            return;
        }
        MoneyRequestChannel moneyRequestChannel = moneyRequest.f60316c;
        if (moneyRequestChannel instanceof MoneyRequestChannel.Revolut) {
            A2(new MoneyRequestFeatureConfig.RejectWithReason.BridgeDestination(moneyRequest));
            return;
        }
        if (!(moneyRequestChannel instanceof MoneyRequestChannel.APM) && !(moneyRequestChannel instanceof MoneyRequestChannel.BankBeneficiary)) {
            throw new NoWhenBranchMatchedException();
        }
        v6k.c cVar4 = (v6k.c) cVar2;
        cVar4.getClass();
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        Intrinsics.checkNotNullParameter("", "rejectReason");
        t tVar = new t(cVar4.h(moneyRequest), null, null, 30);
        yp0.b.l(new InputTextDelegate.Model("MR_REQUEST_BOTTOM_DIALOG_INPUT_TEXT_ID", new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.money_request_core_add_reason, null, null, 14), new TextLocalisedClause(R$string.money_request_core_add_reason, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, Long.valueOf(DateTimeUtils.currentTimeMillis()), null, null, 0, 0, 0, 0, -16, 65023), 0, 0, 0, 0, null, false, 63);
        Object[] elements = {null, new um0("MR_REQUEST_BOTTOM_DIALOG_BUTTONS_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.money_request_core_details_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.request_details_action_decline, null, null, 14), false, null, null, 56), (Object) new i6k.d(moneyRequest), (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        aVar.x(new y(kotlin.collections.d.L(elements), tVar, null, null, null, null, 1020));
    }

    public final void d3(i6k.e dialogAction) {
        Intrinsics.checkNotNullParameter(dialogAction, "dialogAction");
        Continuation continuation = null;
        if (dialogAction instanceof i6k.b) {
            T2(new g23.q(this, "handleApproveDialogAction", new z(this, (i6k.b) dialogAction, continuation, 5), (Continuation) null), new yi5.b(27));
            return;
        }
        if (dialogAction instanceof i6k.c) {
            T2(new g23.q(this, "handleCancelDialogAction", new z(this, (i6k.c) dialogAction, continuation, 6), (Continuation) null), new yi5.b(27));
        } else if (dialogAction instanceof i6k.d) {
            T2(new g23.q(this, "handleRejectDialogAction", new z(this, (i6k.d) dialogAction, continuation, 7), (Continuation) null), new yi5.b(27));
        } else if (!(dialogAction instanceof i6k.a)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r12 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(com.revolut.domain.models.moneyrequest.MoneyRequest r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof g6k.q
            if (r0 == 0) goto L13
            r0 = r12
            g6k.q r0 = (g6k.q) r0
            int r1 = r0.f141005x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141005x = r1
            goto L18
        L13:
            g6k.q r0 = new g6k.q
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141005x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r12)
            goto L96
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            com.revolut.domain.models.moneyrequest.MoneyRequest r11 = r0.u
            yhm.o.b(r12)
            goto L4d
        L39:
            yhm.o.b(r12)
            g6k.k r12 = new g6k.k
            r2 = 2
            r12.<init>(r10, r11, r3, r2)
            r0.u = r11
            r0.f141005x = r5
            java.lang.Object r12 = r10.Y2(r0, r12)
            if (r12 != r1) goto L4d
            goto L95
        L4d:
            krf.f r12 = (krf.f) r12
            java.util.ArrayList r2 = r12.f188864a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L58
            goto Lba
        L58:
            r0.u = r11
            r0.f141005x = r4
            eim.c r2 = new eim.c
            kotlin.coroutines.Continuation r6 = fim.h.b(r0)
            r2.<init>(r6)
            com.revolut.feature.transfer.core.api.reason.ReasonTransferDetails$Link r6 = new com.revolut.feature.transfer.core.api.reason.ReasonTransferDetails$Link
            dj0.d r7 = r11.d
            long r8 = r7.f115082a
            xi0.b r7 = r7.f115083b
            java.lang.String r11 = r11.e
            r6.<init>(r8, r11, r7)
            com.revolut.feature.transfer.core.api.reason.ReasonForTransferInputData r11 = new com.revolut.feature.transfer.core.api.reason.ReasonForTransferInputData
            r11.<init>(r6, r12, r5)
            zof.f r12 = r10.f141010q
            qpf.h r12 = (qpf.h) r12
            zof.a r11 = r12.a(r11)
            fi0.a r12 = new fi0.a
            r6 = 1
            r12.<init>(r2, r6)
            yji.n.Q2(r10, r11, r3, r12, r5)
            java.lang.Object r12 = r2.b()
            if (r12 != r1) goto L93
            java.lang.String r11 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r11)
        L93:
            if (r12 != r1) goto L96
        L95:
            return r1
        L96:
            bpf.c r12 = (bpf.c) r12
            boolean r11 = r12 instanceof bpf.a
            if (r11 == 0) goto L9e
            r5 = 0
            goto Lba
        L9e:
            boolean r11 = r12 instanceof bpf.b
            if (r11 == 0) goto Lbf
        La2:
            vkm.j2 r11 = r10.f141015x
            java.lang.Object r0 = r11.getValue()
            r1 = r0
            g6k.i r1 = (g6k.i) r1
            r2 = r12
            bpf.b r2 = (bpf.b) r2
            krf.c r2 = r2.f17621a
            g6k.i r1 = g6k.i.a(r1, r2, r3, r4)
            boolean r11 = r11.h(r0, r1)
            if (r11 == 0) goto La2
        Lba:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            return r11
        Lbf:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g6k.r.e3(com.revolut.domain.models.moneyrequest.MoneyRequest, gim.c):java.lang.Object");
    }
}
