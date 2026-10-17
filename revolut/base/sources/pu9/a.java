package pu9;

import c8.g;
import com.bumptech.glide.j;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.DateInputItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionData;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionId;
import com.revolut.feature.rev10_main_screen.api.AppStarterDestination;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.navigation.DeeplinkFeatureConfig;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$SelectTransaction$Destination;
import com.revolut.feature.subscriptions.api.block_future_payments.BlockFuturePaymentsFlowDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.AppHomeDestination;
import com.revolut.kompot.bridge.navigation.DeeplinkDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.event_appearance.api.models.WelcomeAppearance;
import com.youTransactor.uCube.payment.PaymentContext;
import com.youTransactor.uCube.rpc.Constants;
import dv9.m;
import fa1.k;
import h93.f0;
import ha1.q;
import ha1.r;
import ha1.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ma1.v;
import ma1.x;
import org.joda.time.DateTime;
import pxc.f;
import qc0.j0;
import qp5.c0;
import qz0.n;
import r21.h;
import rp0.l;
import rp0.t;
import rp0.y;
import rrj.o;
import ufm.i;
import zh9.u0;
import zhm.d0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f239838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f239839c;

    public /* synthetic */ a(BackendFlow backendFlow, j0 j0Var, BackendScreen backendScreen) {
        this.f239837a = 5;
        this.f239838b = backendFlow;
        this.f239839c = backendScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v38, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        CompositeCommand compositeCommandC;
        Object next;
        FormScreen formScreenE0;
        g eVar;
        FeatureCommand featureCommand;
        MainContainerScreenDestination.JustShow justShow;
        lal.a aVar;
        byte[] dataEncryptionKey;
        int i = 14;
        boolean z = false;
        Object[] objArr = 0;
        switch (this.f239837a) {
            case 0:
                b bVar = (b) this.f239838b;
                String str = (String) this.f239839c;
                m mVar = bVar.f239841b.f189756a;
                return Boolean.valueOf(Intrinsics.f(mVar != null ? mVar.f118076a : null, str));
            case 1:
                ((pud.g) this.f239838b).f239869a.c((NaviCommand) this.f239839c);
                return Boolean.TRUE;
            case 2:
                f fVar = (f) this.f239838b;
                pxc.e eVarC = f.c((jf0.c) this.f239839c);
                if (eVarC != null) {
                    sri.m mVar2 = fVar.f240604a;
                    if (eVarC instanceof pxc.c) {
                        pxc.c cVar = (pxc.c) eVarC;
                        FeatureCommand featureCommand2 = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new ChatFlowDestination(new ChatTarget.ChatList(new ChatListFilter.Tickets(true, true), (TicketCreationContext) null, cVar.f240600a, 4), true), false, (Integer) null, 0, 61));
                        if (cVar.f240601b) {
                            String str2 = cVar.f240602c;
                            FeatureCommand[] elements = {str2 != null ? new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(str2), null, null, null, 94)) : null, featureCommand2};
                            Intrinsics.checkNotNullParameter(elements, "elements");
                            compositeCommandC = new CompositeCommand(kotlin.collections.d.L(elements));
                        } else {
                            compositeCommandC = com.revolut.retail.core.navigation.a.c(fVar.b(), featureCommand2);
                        }
                    } else {
                        if (!(eVarC instanceof pxc.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        compositeCommandC = com.revolut.retail.core.navigation.a.c(fVar.b(), u0.f(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) new ChatListFilter.Tickets(true, true), (TicketCreationContext) null, (String) (0 == true ? 1 : 0), 12), true)));
                    }
                    mVar2.c(compositeCommandC);
                }
                return Boolean.TRUE;
            case 3:
                q3i.a aVar2 = (q3i.a) this.f239838b;
                FeatureCommand featureCommandB = aVar2.b((jf0.c) this.f239839c);
                if (featureCommandB != null) {
                    aVar2.f241974a.c(featureCommandB);
                }
                return Boolean.TRUE;
            case 4:
                j0 j0Var = (j0) this.f239838b;
                String str3 = (String) this.f239839c;
                FormScreen formScreenE02 = j0Var.e0();
                if (formScreenE02 != null) {
                    List list = formScreenE02.f63468b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof DateInputItem) {
                            arrayList.add(obj2);
                        }
                    }
                    Iterator it8 = arrayList.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((InputItem) next).getId(), str3)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    DateInputItem dateInputItem = (DateInputItem) ((InputItem) next);
                    if (dateInputItem != null && (formScreenE0 = j0Var.e0()) != null) {
                        return j0Var.f.d(formScreenE0, dateInputItem, null);
                    }
                }
                return null;
            case 5:
                BackendFlow backendFlow = (BackendFlow) this.f239838b;
                BackendScreen backendScreen = (BackendScreen) this.f239839c;
                Intrinsics.h(backendFlow);
                ArrayList<BackendScreen> arrayListF1 = d0.f1(backendFlow.e);
                ArrayList arrayList2 = new ArrayList(w.t(arrayListF1, 10));
                for (BackendScreen backendScreen2 : arrayListF1) {
                    if (Intrinsics.f(backendScreen2.getId(), backendScreen.getId())) {
                        backendScreen2 = backendScreen;
                    }
                    arrayList2.add(backendScreen2);
                }
                return BackendFlow.a(backendFlow, arrayList2, null, 495);
            case 6:
                Function1 function1 = (Function1) this.f239838b;
                FormScreen formScreen = (FormScreen) this.f239839c;
                Intrinsics.h(formScreen);
                return (BackendScreen) function1.invoke(formScreen);
            case 7:
                CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.f239838b;
                c0 c0Var = (c0) this.f239839c;
                Object obj3 = model.f51787l;
                if (obj3 instanceof CryptoWithdrawLimits) {
                    opi.d dVar = c0Var.f248262n;
                    CryptoWithdrawLimits limits = (CryptoWithdrawLimits) obj3;
                    tp5.b bVar2 = (tp5.b) c0Var.f248260l;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(limits, "limits");
                    ((opi.b) dVar).Z(new y(bVar2.c(limits), new t(new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_details_monthly_limits_title_v2, null, null, 14), bVar2.b(limits), null, 28), l.WINDOW, null, null, null, 1016));
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.m(obj3, "handleLimitItemClick called with wrong parcel: "));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                }
                return Unit.f186387a;
            case 8:
                ((qpf.d) this.f239838b).f248383a.c((FeatureCommand) this.f239839c);
                return Unit.f186387a;
            case 9:
                ((qpf.f) this.f239838b).f248386a.c((FeatureCommand) this.f239839c);
                return Unit.f186387a;
            case 10:
                ((qsb.a) this.f239838b).f248796a.c(new FeatureCommand(new MainScreenFeatureConfig.WithAction(s49.a.SINGLE_TOP, new MainContainerActionData(new MainContainerActionId("CHECKLIST_ACTION_ID"), qsb.a.b((jf0.c) this.f239839c)))));
                return Boolean.TRUE;
            case 11:
                n nVar = (n) this.f239838b;
                UrlImage urlImage = (UrlImage) this.f239839c;
                j jVarZ = com.bumptech.glide.b.d(nVar.f250333a).k().Z(nVar.b(urlImage, null));
                String str4 = urlImage.f60017a;
                long j2 = urlImage.e;
                long j3 = urlImage.d;
                if (j2 != 0) {
                    eVar = ue0.e.l(str4, j2, j3);
                } else {
                    n.Companion.getClass();
                    eVar = new x8.e(String.valueOf(j3));
                }
                return (File) ((j) jVarZ.E(eVar)).c0().get();
            case 12:
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((qz9.g) this.f239838b).f250422a, qz9.g.a((zm3.a) this.f239839c), Boolean.TRUE);
                return Unit.f186387a;
            case 13:
                h hVar = (h) this.f239838b;
                String str5 = (String) this.f239839c;
                f5j.a aVarB = hVar.f251038b.b(str5);
                if (aVarB == null) {
                    throw new IllegalArgumentException(p.a.p("Beneficiary with id = ", str5, " is not found"));
                }
                hVar.f251038b.d(f5j.a.a(aVarB, aVarB.f132345y + 1, DateTime.now().getMillis(), null, 2097151999));
                return Unit.f186387a;
            case 14:
                ((cid.a) this.f239838b).f24445b.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new BlockFuturePaymentsFlowDestination(((jf0.c) this.f239839c).e(2), true), false, (Integer) null, 0, 61)));
                return Boolean.TRUE;
            case 15:
                do3.n nVar2 = (do3.n) this.f239838b;
                rf3.l lVar = (rf3.l) this.f239839c;
                String str6 = nVar2.i;
                if (lVar.f.k(str6, null)) {
                    return str6;
                }
                return null;
            case 16:
                o oVar = (o) this.f239838b;
                CategorisationFilter categorisationFilter = (CategorisationFilter) this.f239839c;
                Intrinsics.h(categorisationFilter);
                return oVar.C1(new AnalyticsFeatureConfig$SelectTransaction$Destination(categorisationFilter, u.c(com.revolut.retail.feature.api.a.b(oVar.f256869p.f101520b))));
            case 17:
                xq2.a aVar3 = (xq2.a) this.f239838b;
                rw9.a aVar4 = (rw9.a) this.f239839c;
                if (aVar3.f308051c != xq2.g.URL) {
                    throw new IllegalArgumentException(j6.a.q("Require URL QR code, code: ", rw9.a.c(aVar3)));
                }
                String str7 = aVar3.f308049a;
                String str8 = (str7 == null || !((s06.j) aVar4.f257853a).y1(str7)) ? null : str7;
                if (str8 != null) {
                    return new xo9.g(str8);
                }
                throw new IllegalArgumentException(j6.a.q("Require QR code URL deeplink, code: ", rw9.a.c(aVar3)).toString());
            case 18:
                vxb.y yVarC = ((rxb.l) this.f239838b).f258129b.g().c((String) this.f239839c);
                if (yVarC != null) {
                    return gxb.d.d(yVarC);
                }
                return null;
            case 19:
                boolean z3 = false;
                return ((ry2.d) this.f239838b).d.c(new CardScreenAction.Select(((f0) this.f239839c).f150110a, 6, z3, z3), AccountId.Personal.f51414a);
            case 20:
                s06.j jVar = (s06.j) this.f239838b;
                ParcelableDestination parcelableDestination = (ParcelableDestination) this.f239839c;
                if (wri.b.a()) {
                    if (parcelableDestination instanceof AppStarterDestination) {
                        AppStarterDestination appStarterDestination = (AppStarterDestination) parcelableDestination;
                        justShow = appStarterDestination.f83410a;
                        parcelableDestination = appStarterDestination.f83411b;
                    } else {
                        SliderLayout.SlidingSpec slidingSpec = null;
                        justShow = new MainContainerScreenDestination.JustShow(ibb.c.f160140a.f83420a, slidingSpec, slidingSpec, i);
                    }
                    featureCommand = new FeatureCommand(new DeeplinkFeatureConfig(new DeeplinkDestination(justShow, parcelableDestination), false));
                } else {
                    featureCommand = parcelableDestination instanceof AppStarterDestination ? new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, ((AppStarterDestination) parcelableDestination).f83411b, false, (Integer) null, 0, 61)) : parcelableDestination instanceof AppHomeDestination ? ((AppHomeDestination) parcelableDestination).getF83419c() : new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, parcelableDestination, true, (Integer) null, 0, 57));
                }
                jVar.e.c(featureCommand);
                return Boolean.TRUE;
            case 21:
                sa1.c cVar2 = (sa1.c) this.f239838b;
                fa1.m mVar3 = (fa1.m) this.f239839c;
                List list2 = mVar3.f133195c;
                byte[] bArrY0 = list2 != null ? d0.Y0(list2) : null;
                cVar2.getClass();
                sa1.c.b(Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2, bArrY0);
                List list3 = mVar3.d;
                sa1.c.b(Constants.TAG_F4, list3 != null ? d0.Y0(list3) : null);
                List list4 = mVar3.e;
                sa1.c.b(Constants.TAG_F5, list4 != null ? d0.Y0(list4) : null);
                return Unit.f186387a;
            case 22:
                PaymentContext paymentContext = (PaymentContext) this.f239838b;
                sa1.h hVar2 = (sa1.h) this.f239839c;
                byte b4 = paymentContext.onlinePinBlockFormat;
                ea1.b.a("Online PIN block (Format: " + ((int) b4) + "): " + (paymentContext.getOnlinePinBlock() != null ? "Present" : "Not present"), k.INFO);
                lal.a aVar5 = hVar2.f261225a;
                final fa1.j cardReaderInterface = x5d.b.f(paymentContext);
                final byte[] plainEmvTags = paymentContext.getAuthorizationGetPlainTagsResponse();
                Intrinsics.checkNotNullExpressionValue(plainEmvTags, "getAuthorizationGetPlainTagsResponse(...)");
                final byte[] encryptedEmvTags = paymentContext.getAuthorizationSecuredTagsValues();
                Intrinsics.checkNotNullExpressionValue(encryptedEmvTags, "getAuthorizationSecuredTagsValues(...)");
                final byte[] dataEncryptionKey2 = paymentContext.getSredKsn();
                Intrinsics.checkNotNullExpressionValue(dataEncryptionKey2, "getSredKsn(...)");
                final byte[] pinKsn = paymentContext.getPinKsn();
                final byte[] onlinePinBlock = paymentContext.getOnlinePinBlock();
                final boolean zIsContainsOnlinePinChallengeResponse = paymentContext.isContainsOnlinePinChallengeResponse();
                x xVar = (x) aVar5.d;
                ca1.a aVar6 = xVar.d;
                ha1.o oVar2 = xVar.f203915c;
                Intrinsics.checkNotNullParameter(cardReaderInterface, "cardReaderInterface");
                Intrinsics.checkNotNullParameter(plainEmvTags, "plainEmvTags");
                Intrinsics.checkNotNullParameter(encryptedEmvTags, "securedEmvTags");
                Intrinsics.checkNotNullParameter(dataEncryptionKey2, "dataEncryptionKey");
                fa1.y yVar = (fa1.y) aVar5.f193426b;
                if (yVar != null) {
                    fa1.y yVar2 = yVar.f133224b == fa1.d.SOFT_DECLINED ? yVar : null;
                    if (yVar2 != null) {
                        String paymentId = yVar2.f133223a;
                        ha1.f fVar2 = (ha1.f) aVar6;
                        final String terminalId = (String) j6.a.k(String.class, fVar2.f150353a, "KEY_TERMINAL_ID");
                        if (terminalId == null) {
                            throw new IllegalArgumentException("Card reader ID is required");
                        }
                        final String svppFirmwareVersion = fVar2.d();
                        final String bluetoothFirmwareVersion = fVar2.a();
                        final ha1.u uVar = (ha1.u) oVar2;
                        uVar.getClass();
                        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                        Intrinsics.checkNotNullParameter(terminalId, "terminalId");
                        Intrinsics.checkNotNullParameter(cardReaderInterface, "cardReaderInterface");
                        Intrinsics.checkNotNullParameter(plainEmvTags, "plainEmvTags");
                        Intrinsics.checkNotNullParameter(encryptedEmvTags, "encryptedEmvTags");
                        Intrinsics.checkNotNullParameter(dataEncryptionKey2, "dataEncryptionKey");
                        Intrinsics.checkNotNullParameter(svppFirmwareVersion, "svppFirmwareVersion");
                        Intrinsics.checkNotNullParameter(bluetoothFirmwareVersion, "bluetoothFirmwareVersion");
                        final int i2 = 1;
                        Callable callable = new Callable() { // from class: ha1.p
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i3 = i2;
                                String str9 = bluetoothFirmwareVersion;
                                boolean z4 = zIsContainsOnlinePinChallengeResponse;
                                switch (i3) {
                                }
                                return uVar.b(terminalId, cardReaderInterface, plainEmvTags, encryptedEmvTags, dataEncryptionKey2, pinKsn, onlinePinBlock, svppFirmwareVersion, str9, z4);
                            }
                        };
                        int i3 = 2;
                        i iVar = new i(new i(new ufm.c(callable, i3), new ha1.j(28, new q(uVar, paymentId, 1)), 0), new ha1.j(29, new r(uVar, i3)), 0);
                        int i5 = 8;
                        int i6 = 3;
                        ufm.f fVar3 = new ufm.f(new ufm.f(iVar, new s(0, new ha1.k(i5)), 2), new ha1.j(15, new ha1.k(9)), i6);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        ufm.f fVar4 = new ufm.f(new ufm.f(te0.w.i0(fVar3), new v(7, new ma1.w(aVar5, 2)), i6), new v(i5, new ma1.w(aVar5, i6)), 1);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnError(...)");
                        return fVar4;
                    }
                    dataEncryptionKey = dataEncryptionKey2;
                    aVar = aVar5;
                } else {
                    aVar = aVar5;
                    dataEncryptionKey = dataEncryptionKey2;
                }
                String orderId = (String) aVar.e;
                lal.a aVar7 = aVar;
                ha1.f fVar5 = (ha1.f) aVar6;
                final String terminalId2 = (String) j6.a.k(String.class, fVar5.f150353a, "KEY_TERMINAL_ID");
                if (terminalId2 == null) {
                    throw new IllegalArgumentException("Card reader ID is required");
                }
                final String svppFirmwareVersion2 = fVar5.d();
                final String bluetoothFirmwareVersion2 = fVar5.a();
                final ha1.u uVar2 = (ha1.u) oVar2;
                uVar2.getClass();
                Intrinsics.checkNotNullParameter(orderId, "orderId");
                Intrinsics.checkNotNullParameter(terminalId2, "terminalId");
                Intrinsics.checkNotNullParameter(cardReaderInterface, "cardReaderInterface");
                Intrinsics.checkNotNullParameter(plainEmvTags, "plainEmvTags");
                Intrinsics.checkNotNullParameter(encryptedEmvTags, "encryptedEmvTags");
                Intrinsics.checkNotNullParameter(dataEncryptionKey, "dataEncryptionKey");
                Intrinsics.checkNotNullParameter(svppFirmwareVersion2, "svppFirmwareVersion");
                Intrinsics.checkNotNullParameter(bluetoothFirmwareVersion2, "bluetoothFirmwareVersion");
                final int i21 = 0;
                final byte[] bArr = dataEncryptionKey;
                int i22 = 0;
                i iVar2 = new i(new i(new ufm.c(new Callable() { // from class: ha1.p
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i32 = i21;
                        String str9 = bluetoothFirmwareVersion2;
                        boolean z4 = zIsContainsOnlinePinChallengeResponse;
                        switch (i32) {
                        }
                        return uVar2.b(terminalId2, cardReaderInterface, plainEmvTags, encryptedEmvTags, bArr, pinKsn, onlinePinBlock, svppFirmwareVersion2, str9, z4);
                    }
                }, 2), new ha1.j(16, new q(uVar2, orderId, i22)), 0), new ha1.j(17, new r(uVar2, i22)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                i iVar3 = new i(iVar2, new ha1.j(21, new r(uVar2, 1)), 2);
                Intrinsics.checkNotNullExpressionValue(iVar3, "onErrorResumeNext(...)");
                int i32 = 5;
                int i33 = 18;
                int i43 = 3;
                ufm.f fVar6 = new ufm.f(new ufm.f(iVar3, new ha1.j(i33, new ha1.k(i32)), 2), new ha1.j(19, new gqh.a(orderId, i33)), i43);
                Intrinsics.checkNotNullExpressionValue(fVar6, "doOnSuccess(...)");
                ufm.f fVar7 = new ufm.f(te0.w.i0(fVar6), new v(i32, new ma1.w(aVar7, 0)), i43);
                int i59 = 1;
                ufm.f fVar8 = new ufm.f(fVar7, new v(6, new ma1.w(aVar7, i59)), i59);
                Intrinsics.checkNotNullExpressionValue(fVar8, "doOnError(...)");
                return fVar8;
            case 23:
                return new WelcomeAppearance((Clause) this.f239838b, (Image) this.f239839c, (UrlVideo) null);
            case 24:
                Object obj4 = this.f239838b;
                sp7.b bVar3 = (sp7.b) this.f239839c;
                sp7.c cVar3 = obj4 instanceof sp7.c ? (sp7.c) obj4 : null;
                Iterable iterable = cVar3 != null ? cVar3.f264903a : null;
                if (iterable == null) {
                    iterable = zhm.f0.f322471a;
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList3 = new ArrayList(w.t(iterable2, 10));
                Iterator it9 = iterable2.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(((sp7.e) it9.next()).f264904a);
                }
                bVar3.f264902a = arrayList3;
                Iterable iterable3 = cVar3 != null ? cVar3.f264903a : null;
                if (iterable3 == null) {
                    iterable3 = zhm.f0.f322471a;
                }
                Iterable<sp7.e> iterable4 = iterable3;
                ArrayList arrayList4 = new ArrayList(w.t(iterable4, 10));
                for (sp7.e eVar2 : iterable4) {
                    arrayList4.add(new InputDisclosureDelegate.Model(jl7.b.b(eVar2.f264904a), eVar2.f264905b, eVar2.f264906c, null, null, 1016));
                }
                yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                return new Data(arrayList4, null, false, 6, null);
            case 25:
                ((t4h.e) this.f239838b).f267999c.c((NaviCommand) this.f239839c);
                return Boolean.TRUE;
            case 26:
                Object objInvoke = ((v6l.v) ((ryc.a) this.f239838b).f258289a).invoke(this.f239839c);
                if (objInvoke != null) {
                    return objInvoke;
                }
                throw new NoSuchElementException();
            case 27:
                ((ta3.b) this.f239838b).f269086a.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SharedFaqDestination((SharedFaqDestination.StartPoint) this.f239839c, (SharedFaqDestination.PassthroughData) (objArr == true ? 1 : 0), z, i), false, (Integer) null, 0, 61)));
                return Boolean.TRUE;
            case 28:
                te0.r rVar = (te0.r) this.f239838b;
                Object obj5 = this.f239839c;
                rVar.set(obj5);
                return obj5;
            default:
                te0.t tVar = (te0.t) this.f239838b;
                Object obj6 = this.f239839c;
                tVar.set(obj6);
                return obj6;
        }
    }

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f239837a = i;
        this.f239838b = obj2;
        this.f239839c = obj3;
    }
}
