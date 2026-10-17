package sc7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.a3;
import com.revolut.core.ui_kit.delegates.widgets.b3;
import com.revolut.core.ui_kit.delegates.widgets.c3;
import com.revolut.core.ui_kit.delegates.widgets.f3;
import com.revolut.core.ui_kit.delegates.widgets.n0;
import com.revolut.feature.apm.core.models.recipients.ApmBeneficiary;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoWithdrawFeatureConfig;
import com.revolut.feature.crypto.withdraw.api.navigation.WithdrawFinishBehavior;
import com.revolut.feature.donations.api.navigation.DonationsFeatureConfig;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.api.navigation.TransferOnlyChatDestination;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillsFeatureConfig;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import cu8.r0;
import efm.d0;
import java.util.List;
import jq9.a0;
import jq9.b0;
import jq9.k;
import jq9.l;
import jq9.n;
import jq9.o;
import jq9.p;
import jq9.q;
import jq9.s;
import jq9.t;
import jq9.u;
import jq9.v;
import jq9.w;
import jq9.x;
import jq9.y;
import jq9.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oma.r;
import pfm.m;
import skm.p0;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k39.b f261658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx9.a f261659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y8k.b f261660c;
    public final x2k.e d;
    public final rq9.a e;
    public final oy1.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final un9.a f261661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r0 f261662h;
    public final uc7.a i;

    public j(k39.b navigationCommandsDispatcher, fx9.a recipientNaviCommandProvider, y8k.b peerToPeerFeatureConfigProvider, x2k.e paymentsBankTransferNaviCommandProvider, rq9.a groupBillsNaviCommandProvider, oy1.b apmNavigationProvider, un9.a paymentCounterpartyNavigationProvider, r0 kycTransformer, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(recipientNaviCommandProvider, "recipientNaviCommandProvider");
        Intrinsics.checkNotNullParameter(peerToPeerFeatureConfigProvider, "peerToPeerFeatureConfigProvider");
        Intrinsics.checkNotNullParameter(paymentsBankTransferNaviCommandProvider, "paymentsBankTransferNaviCommandProvider");
        Intrinsics.checkNotNullParameter(groupBillsNaviCommandProvider, "groupBillsNaviCommandProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(paymentCounterpartyNavigationProvider, "paymentCounterpartyNavigationProvider");
        Intrinsics.checkNotNullParameter(kycTransformer, "kycTransformer");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        this.f261658a = navigationCommandsDispatcher;
        this.f261659b = recipientNaviCommandProvider;
        this.f261660c = peerToPeerFeatureConfigProvider;
        this.d = paymentsBankTransferNaviCommandProvider;
        this.e = groupBillsNaviCommandProvider;
        this.f = apmNavigationProvider;
        this.f261661g = paymentCounterpartyNavigationProvider;
        this.f261662h = kycTransformer;
        this.i = homeFeedWidgetsEventDispatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (nim.a.a(r11, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(sc7.j r11, com.revolut.feature.push_to_card.api.data.CardOwner r12, gim.c r13) {
        /*
            boolean r0 = r13 instanceof sc7.i
            if (r0 == 0) goto L13
            r0 = r13
            sc7.i r0 = (sc7.i) r0
            int r1 = r0.f261657x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261657x = r1
            goto L18
        L13:
            sc7.i r0 = new sc7.i
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261657x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)
            goto L7e
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            com.revolut.feature.push_to_card.api.data.CardOwner r12 = r0.u
            yhm.o.b(r13)
        L37:
            r6 = r12
            goto L49
        L39:
            yhm.o.b(r13)
            cu8.r0 r13 = r11.f261662h
            r0.u = r12
            r0.f261657x = r4
            java.lang.Object r13 = ks8.m.b(r13, r0)
            if (r13 != r1) goto L37
            goto L7d
        L49:
            ks8.j r13 = (ks8.j) r13
            boolean r12 = r13 instanceof ks8.i
            if (r12 == 0) goto L54
            ks8.i r13 = (ks8.i) r13
            com.revolut.retail.core.navigation.FeatureCommand r12 = r13.f189312a
            goto L6e
        L54:
            boolean r12 = r13 instanceof ks8.j.a
            if (r12 == 0) goto L81
            com.revolut.retail.core.navigation.FeatureCommand r12 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.push_to_card.api.feature_config.PushToCardCardTransferFeatureConfig r5 = new com.revolut.feature.push_to_card.api.feature_config.PushToCardCardTransferFeatureConfig
            com.revolut.retail.core.flow.FlowExtras r9 = new com.revolut.retail.core.flow.FlowExtras
            com.revolut.retail.core.navigation.FeatureCommand r13 = c()
            r9.<init>(r13)
            r10 = 6
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r12.<init>(r5)
        L6e:
            efm.b r11 = r11.e(r12, r4)
            r12 = 0
            r0.u = r12
            r0.f261657x = r3
            java.lang.Object r11 = nim.a.a(r11, r0)
            if (r11 != r1) goto L7e
        L7d:
            return r1
        L7e:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L81:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: sc7.j.b(sc7.j, com.revolut.feature.push_to_card.api.data.CardOwner, gim.c):java.lang.Object");
    }

    public static FeatureCommand c() {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6)));
    }

    public final efm.b d(Object obj2, boolean z) {
        ufm.b bVarM;
        boolean z3 = obj2 instanceof k;
        fx9.a aVar = this.f261659b;
        if (z3) {
            return new pfm.a(((rx9.c) aVar).b((k) obj2, null), new g(new h(this, z, 0), 1), 4);
        }
        if (!(obj2 instanceof t)) {
            m mVar = m.f235744a;
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        t paymentRecipient = (t) obj2;
        rx9.c cVar = (rx9.c) aVar;
        kz9.a aVar2 = cVar.f258088c;
        Intrinsics.checkNotNullParameter(paymentRecipient, "paymentRecipient");
        if (paymentRecipient instanceof v) {
            bVarM = d0.m(gc0.c.f(((uz9.a) aVar2).a(new ChatTransferRecipient.BeneficiaryRecipient(((v) paymentRecipient).f177523a, null), null)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        } else if (paymentRecipient instanceof w) {
            bVarM = d0.m(gc0.c.f(((uz9.a) aVar2).a(new ChatTransferRecipient.CardRecipient(((w) paymentRecipient).f177524a.f81495a), null)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        } else if (paymentRecipient instanceof x) {
            bVarM = d0.m(gc0.c.f(((uz9.a) aVar2).a(new ChatTransferRecipient.CharityRecipient(((x) paymentRecipient).f177525a), null)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        } else if (paymentRecipient instanceof y) {
            bVarM = te0.w.o0(p0.f264002b, new rx9.a(cVar, ((y) paymentRecipient).f177526a, null, null));
        } else if (paymentRecipient instanceof a0) {
            bVarM = cVar.a(((a0) paymentRecipient).f177495a);
        } else if (paymentRecipient instanceof b0) {
            bVarM = te0.w.o0(p0.f264002b, new rx9.b(cVar, ((b0) paymentRecipient).f177496a, null));
        } else if (paymentRecipient instanceof u) {
            bVarM = d0.m(gc0.c.f(((uz9.a) aVar2).a(new ChatTransferRecipient.ApmTransferRecipient(((u) paymentRecipient).f177522a), null)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        } else {
            if (!(paymentRecipient instanceof z)) {
                throw new NoWhenBranchMatchedException();
            }
            bVarM = d0.m(gc0.c.f(((uz9.a) aVar2).a(new ChatTransferRecipient.PaymentCounterpartyRecipient(((z) paymentRecipient).f177527a), null)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        }
        return new pfm.a(bVarM, new g(new h(this, z, 1), 2), 4);
    }

    public final efm.b e(NaviCommand naviCommand, boolean z) {
        if (z && (naviCommand instanceof FeatureCommand)) {
            FeatureConfig featureConfig = ((FeatureCommand) naviCommand).f98638a;
            if (featureConfig instanceof KompotBridgeFeatureConfig) {
                return new pfm.h(new rzc.b(this, (KompotBridgeFeatureConfig) featureConfig, 7), 2);
            }
        }
        return this.f261658a.a(naviCommand);
    }

    public final efm.b f(ApmRecipient recipient, hrf.f fVar) {
        KompotDestination kompotDestinationG;
        boolean z = recipient instanceof ApmContact;
        oy1.b bVar = this.f;
        if (z) {
            ApmContact.State f = ((ApmContact) recipient).getF();
            if (Intrinsics.f(f, ApmContact.State.ACTIVE.f62099a)) {
                kompotDestinationG = bVar.g(recipient, fVar, new TransferMoneyPocket(null, null, 3));
            } else {
                if (!Intrinsics.f(f, ApmContact.State.DELETED.f62100a) && !Intrinsics.f(f, ApmContact.State.NOT_REGISTERED.f62101a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullParameter(recipient, "recipient");
                kompotDestinationG = new TransferOnlyChatDestination(new ChatTransferRecipient.ApmTransferRecipient(recipient));
            }
        } else {
            if (!(recipient instanceof ApmBeneficiary)) {
                throw new NoWhenBranchMatchedException();
            }
            kompotDestinationG = bVar.g(recipient, fVar, new TransferMoneyPocket(null, null, 3));
        }
        return e(u0.f(kompotDestinationG), true);
    }

    public final pfm.a g(f5j.a aVar) {
        ufm.b bVarM = d0.m(d2k.g.a(this.d, aVar, null, null, null, null, new FlowExtras(c()), null, null, 894));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        pfm.a aVar2 = new pfm.a(bVarM, new g(new cia.d(1, this, j.class, "handleZoomableNaviCommand", "handleZoomableNaviCommand(Lcom/revolut/retail/core/navigation/NaviCommand;Z)Lio/reactivex/Completable;", 0, 4), 5), 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return aVar2;
    }

    public final pfm.a h(PaymentGroup paymentGroup) {
        pfm.a aVar = new pfm.a(((zr9.a) this.e).a(paymentGroup.f79285a), new g(new cia.d(1, this, j.class, "handleZoomableNaviCommand", "handleZoomableNaviCommand(Lcom/revolut/retail/core/navigation/NaviCommand;Z)Lio/reactivex/Completable;", 0, 5), 0), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    @Override // csh.f
    public final Class j() {
        return HomeFeedWidgetContext.Personal.class;
    }

    public final pfm.a k(zm3.a aVar) {
        pfm.a aVar2 = new pfm.a(new ufm.i(q8k.g.a(this.f261660c, aVar, null, new FlowExtras(c()), 6), new g(new sa6.y(15), 3), 1), new g(new cia.d(1, this, j.class, "handleZoomableNaviCommand", "handleZoomableNaviCommand(Lcom/revolut/retail/core/navigation/NaviCommand;Z)Lio/reactivex/Completable;", 0, 6), 4), 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return aVar2;
    }

    public final pfm.a l(zm3.a aVar) {
        m1l.a aVar2 = m1l.a.SCHEDULE_ENABLED;
        FlowExtras flowExtras = new FlowExtras(c());
        pfm.a aVar3 = new pfm.a(new ufm.i(q8k.g.b(this.f261660c, aVar, aVar2, TransferFlowType.Default.f92257b, null, flowExtras, null, null, 232), new sa6.a(new sa6.y(16), 28), 1), new sa6.a(new cia.d(1, this, j.class, "handleZoomableNaviCommand", "handleZoomableNaviCommand(Lcom/revolut/retail/core/navigation/NaviCommand;Z)Lio/reactivex/Completable;", 0, 7), 29), 4);
        Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
        return aVar3;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        HomeFeedWidgetContext.Personal widgetContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof n0) {
            Object obj2 = ((n0) event).f55437c.f53167l;
            if (obj2 != null) {
                return d(obj2, false);
            }
            pfm.h hVar = new pfm.h(new r(this, 23), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        boolean z = event instanceof com.revolut.core.ui_kit.delegates.widgets.i;
        m mVar = m.f235744a;
        if (z) {
            BaseDraggableWidgetDelegate.Model model = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
            if (model instanceof HorizontalScrollerWidgetDelegate.Model) {
                pfm.h hVar2 = new pfm.h(new r(this, 23), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
            }
            if (!(model instanceof QuickActionWidgetDelegate.Model)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            Object obj3 = ((QuickActionWidgetDelegate.Model) model).f55221j;
            if (obj3 != null) {
                return d(obj3, true);
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (event instanceof a3) {
            Object obj4 = ((a3) event).f55292c.f55221j;
            if (obj4 != null) {
                return d(obj4, true);
            }
            pfm.h hVar3 = new pfm.h(new r(this, 23), 2);
            Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
            return hVar3;
        }
        if (!(event instanceof c3)) {
            if (!(event instanceof b3)) {
                if (!(event instanceof f3)) {
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                Object obj5 = ((f3) event).f55356c.f55221j;
                if (obj5 instanceof p) {
                    return k(((p) obj5).f177514b);
                }
                if (obj5 instanceof l) {
                    return f(((l) obj5).f177506b, hrf.f.INCOMING);
                }
                if (obj5 instanceof y) {
                    return k(((y) obj5).f177526a);
                }
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            Object obj6 = ((b3) event).f55303c.f55221j;
            if (obj6 instanceof p) {
                zm3.a aVar = ((p) obj6).f177514b;
                SplitBillsFeatureConfig.Companion companion = SplitBillsFeatureConfig.INSTANCE;
                List listC = zhm.u.c(aVar);
                x0a.a aVar2 = x0a.a.WIDGET;
                companion.getClass();
                return e(new FeatureCommand(SplitBillsFeatureConfig.Companion.a(listC, aVar2)), true);
            }
            if (!(obj6 instanceof y)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            zm3.a aVar3 = ((y) obj6).f177526a;
            SplitBillsFeatureConfig.Companion companion2 = SplitBillsFeatureConfig.INSTANCE;
            List listC2 = zhm.u.c(aVar3);
            x0a.a aVar4 = x0a.a.WIDGET;
            companion2.getClass();
            return e(new FeatureCommand(SplitBillsFeatureConfig.Companion.a(listC2, aVar4)), true);
        }
        Object obj7 = ((c3) event).f55316c.f55221j;
        boolean z3 = obj7 instanceof k;
        un9.a aVar5 = this.f261661g;
        Continuation continuation = null;
        if (z3) {
            k kVar = (k) obj7;
            if (kVar instanceof p) {
                return l(((p) kVar).f177514b);
            }
            if (kVar instanceof jq9.m) {
                return g(((jq9.m) kVar).f177508b);
            }
            if (kVar instanceof n) {
                return pd.b.n(kotlin.coroutines.g.f186406a, new sbb.w(this, kVar, continuation, 2));
            }
            if (kVar instanceof s) {
                return h(((s) kVar).f177520b);
            }
            if (kVar instanceof jq9.r) {
                return e(new FeatureCommand(new CryptoWithdrawFeatureConfig.Withdraw(new WithdrawFinishBehavior.Navigate(c()), ((jq9.r) kVar).f177518b.f71059a, null)), true);
            }
            if (kVar instanceof o) {
                return e(new FeatureCommand(new DonationsFeatureConfig.CharityDonationConfig(((o) kVar).f177512b.f13938a, ba6.u.REGULAR, (dj0.d) null, 12)), true);
            }
            if (kVar instanceof l) {
                return f(((l) kVar).f177506b, hrf.f.OUTGOING);
            }
            if (kVar instanceof q) {
                return e(u0.f(((eo9.b) aVar5).b(((q) kVar).f177516b, m1l.a.SCHEDULE_ENABLED)), true);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(obj7 instanceof t)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        t tVar = (t) obj7;
        if (tVar instanceof v) {
            return g(((v) tVar).f177523a);
        }
        if (tVar instanceof w) {
            return pd.b.n(kotlin.coroutines.g.f186406a, new sbb.w(this, tVar, continuation, 1));
        }
        if (tVar instanceof x) {
            return e(new FeatureCommand(new DonationsFeatureConfig.CharityDonationConfig(((x) tVar).f177525a.f13938a, ba6.u.REGULAR, (dj0.d) null, 12)), true);
        }
        if (tVar instanceof y) {
            return l(((y) tVar).f177526a);
        }
        if (tVar instanceof a0) {
            return e(new FeatureCommand(new CryptoWithdrawFeatureConfig.Withdraw(new WithdrawFinishBehavior.Navigate(c()), ((a0) tVar).f177495a.f71059a, null)), true);
        }
        if (tVar instanceof b0) {
            return h(((b0) tVar).f177496a);
        }
        if (tVar instanceof u) {
            return f(((u) tVar).f177522a, hrf.f.OUTGOING);
        }
        if (tVar instanceof z) {
            return e(u0.f(((eo9.b) aVar5).b(((z) tVar).f177527a, m1l.a.SCHEDULE_ENABLED)), true);
        }
        throw new NoWhenBranchMatchedException();
    }
}
