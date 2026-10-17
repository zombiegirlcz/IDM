package s38;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.joint.api.models.JointDeeplink;
import com.revolut.feature.joint.impl.account.model.JointInvitationRemindAction;
import com.revolut.feature.joint.impl.account.model.JointTopUpMethodsAction;
import com.revolut.feature.joint.impl.account.model.JointTopUpMoneyAction;
import com.revolut.feature.pockets.api.model.OpenAccountDetailsRequest;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import efm.r;
import g48.r0;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sfe.s;
import t38.p;
import u38.q;
import zhm.a1;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends pfe.c {
    public final RowDelegate A;
    public final SuggestionsBarDelegate B;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f259456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j60.a f259457n;
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cnh.f f259458p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final oqk.k f259459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z8e.a f259460r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0 f259461s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f259462t;
    public final wsg.n u;
    public final ypf.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u38.a f259463w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LargeActionButtonDelegate f259464x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f259465y;
    public final AccountCellItemDelegate z;

    public h(n openJointProductEventHandler, r38.b jointProductInteractor, j60.a bottomDialogExtension, p actionsExtension, cnh.f pocketExtension, oqk.k transactionsWidgetActionExtension, z8e.a subscriptionsAppNavigationProvider, r0 jointAccountsInteractor, q scheduledPaymentsItemMapper, wsg.n walletInteractor, ypf.b scheduleAvailabilityInteractor, u38.a slotChecklistEventMapper) {
        Intrinsics.checkNotNullParameter(openJointProductEventHandler, "openJointProductEventHandler");
        Intrinsics.checkNotNullParameter(jointProductInteractor, "jointProductInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(actionsExtension, "actionsExtension");
        Intrinsics.checkNotNullParameter(pocketExtension, "pocketExtension");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        Intrinsics.checkNotNullParameter(subscriptionsAppNavigationProvider, "subscriptionsAppNavigationProvider");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(scheduledPaymentsItemMapper, "scheduledPaymentsItemMapper");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(scheduleAvailabilityInteractor, "scheduleAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(slotChecklistEventMapper, "slotChecklistEventMapper");
        this.f259456m = openJointProductEventHandler;
        this.f259457n = bottomDialogExtension;
        this.o = actionsExtension;
        this.f259458p = pocketExtension;
        this.f259459q = transactionsWidgetActionExtension;
        this.f259460r = subscriptionsAppNavigationProvider;
        this.f259461s = jointAccountsInteractor;
        this.f259462t = scheduledPaymentsItemMapper;
        this.u = walletInteractor;
        this.v = scheduleAvailabilityInteractor;
        this.f259463w = slotChecklistEventMapper;
        this.f259464x = new LargeActionButtonDelegate();
        this.f259465y = new TwinHorizontalButtonDelegate();
        this.z = new AccountCellItemDelegate();
        this.A = new RowDelegate(null, null, 7);
        this.B = new SuggestionsBarDelegate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
    
        if (r10 == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ec, code lost:
    
        if (r10 == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c3(s38.h r8, com.revolut.core.ui_kit.delegates.RowDelegate.Model r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s38.h.c3(s38.h, com.revolut.core.ui_kit.delegates.RowDelegate$Model, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void D2() {
        this.f259457n.d(v.k(this.f259464x, this.f259465y, this.z, this.A, this.B));
    }

    @Override // yji.n
    public final void H2() {
        r rVarMerge = r.merge(v.k(this.B.p().d, this.f259464x.d.f121375b));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        Continuation continuation = null;
        yji.n.l2(this, rd0.e.b(rVarMerge), null, new s09.c(this, continuation, 6), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.f259465y;
        yji.n.l2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new c(this, continuation, 0), 3);
        yji.n.l2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new c(this, continuation, 1), 3);
        yji.n.l2(this, rd0.e.b(this.z.f51551c.f53218h), null, new d(this, null), 3);
        yji.n.l2(this, rd0.e.b(this.A.f53218h), null, new e(this, null), 3);
    }

    @Override // pfe.a
    public final Set Z2() {
        p pVar = this.o;
        yji.n[] elements = {this.f259456m, pVar, this.f259458p, this.f259459q};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return a1.l(kotlin.collections.d.y0(elements), pVar.Z2());
    }

    @Override // pfe.c
    public final Object b3(s sVar, Continuation continuation) throws Throwable {
        Object objC3;
        Object objJ3;
        JointDeeplink jointDeeplinkA;
        Object objH3;
        boolean z = sVar instanceof sfe.m;
        p pVar = this.o;
        if (z) {
            Object objB3 = pVar.b3((sfe.m) sVar, continuation);
            return objB3 == fim.a.COROUTINE_SUSPENDED ? objB3 : Unit.f186387a;
        }
        nVar = null;
        nVar = null;
        u38.n nVar = null;
        if (sVar instanceof sfe.i) {
            sfe.i iVar = (sfe.i) sVar;
            Object objY2 = (iVar.f262413b == -1 && iVar.f262412a == 19874) ? Y2(continuation, new a(this, iVar, null)) : Unit.f186387a;
            return objY2 == fim.a.COROUTINE_SUSPENDED ? objY2 : Unit.f186387a;
        }
        if (sVar instanceof sfe.n) {
            V2(new f((sfe.n) sVar, this, null), new yi5.b(29));
        } else {
            if (sVar instanceof sfe.p) {
                TabAccountsInitialPayload tabAccountsInitialPayload = ((sfe.p) sVar).f262426b;
                if (tabAccountsInitialPayload instanceof TabAccountsInitialPayload.Action) {
                    Parcelable parcelable = ((TabAccountsInitialPayload.Action) tabAccountsInitialPayload).f89543a;
                    if (parcelable instanceof JointInvitationRemindAction) {
                        objH3 = pVar.j3(((JointInvitationRemindAction) parcelable).f76503a, continuation);
                        if (objH3 != fim.a.COROUTINE_SUSPENDED) {
                            objH3 = Unit.f186387a;
                        }
                    } else if (parcelable instanceof JointTopUpMoneyAction) {
                        objH3 = pVar.d3(((JointTopUpMoneyAction) parcelable).f76505a, continuation);
                        if (objH3 != fim.a.COROUTINE_SUSPENDED) {
                            objH3 = Unit.f186387a;
                        }
                    } else if (!(parcelable instanceof JointTopUpMethodsAction) || (objH3 = pVar.h3(((JointTopUpMethodsAction) parcelable).f76504a, continuation)) != fim.a.COROUTINE_SUSPENDED) {
                        objH3 = Unit.f186387a;
                    }
                } else {
                    objH3 = Unit.f186387a;
                }
                return objH3 == fim.a.COROUTINE_SUSPENDED ? objH3 : Unit.f186387a;
            }
            if (sVar instanceof sfe.q) {
                sfe.q productEvent = (sfe.q) sVar;
                u38.b bVar = (u38.b) this.f259463w;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(productEvent, "productEvent");
                jf0.c cVarD = ((s06.c) bVar.f276815a).d(productEvent.f262428b);
                if (cVarD != null && (jointDeeplinkA = u38.e.a(cVarD)) != null && (jointDeeplinkA instanceof JointDeeplink.InvitationRemind)) {
                    nVar = new u38.n(((JointDeeplink.InvitationRemind) jointDeeplinkA).f76477a);
                }
                if (nVar != null) {
                    objJ3 = pVar.j3(nVar.f276830a, continuation);
                    if (objJ3 != fim.a.COROUTINE_SUSPENDED) {
                        objJ3 = Unit.f186387a;
                    }
                } else {
                    int i = jli.h.f175850a;
                    objJ3 = Unit.f186387a;
                }
                return objJ3 == fim.a.COROUTINE_SUSPENDED ? objJ3 : Unit.f186387a;
            }
            if (sVar instanceof sfe.h) {
                pVar.getClass();
                Object obj2 = ((sfe.h) sVar).f262411b;
                OpenAccountDetailsRequest openAccountDetailsRequest = obj2 instanceof OpenAccountDetailsRequest ? (OpenAccountDetailsRequest) obj2 : null;
                if (openAccountDetailsRequest == null || (objC3 = pVar.c3(openAccountDetailsRequest.f80769a, continuation)) != fim.a.COROUTINE_SUSPENDED) {
                    objC3 = Unit.f186387a;
                }
                return objC3 == fim.a.COROUTINE_SUSPENDED ? objC3 : Unit.f186387a;
            }
        }
        return Unit.f186387a;
    }
}
