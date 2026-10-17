package e0a;

import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.payments.messaging.data.api.model.DonationItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import com.revolut.feature.payments.messaging.data.api.model.MoneyRequestItem;
import com.revolut.feature.payments.messaging.data.api.model.P2PChatItem;
import com.revolut.feature.payments.messaging.data.api.model.TransactionItem;
import com.revolut.feature.payments.messaging.data.api.model.TransferLinkItem;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$Details$ByMoneyRequest;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;
import rp0.l0;
import tof.a3;
import vkm.z1;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends yji.n implements r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cu9.n f121528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f121529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k61.a f121530n;
    public final p7k.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1 f121531p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70.a f121532q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final iz9.e f121533r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final du9.b f121534s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l0 f121535t;
    public final lv9.d u;
    public final wu9.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wli.x f121536w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vz9.o f121537x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final PeerToPeerChatScreenContract$InputData f121538y;
    public final z1 z;

    public w(cu9.n messageActionsFactory, j60.a bottomExpandableDialog, k61.a transferInteractor, p7k.b paymentLinkNavigationProvider, g1 shotDialogDisplayer, c70.a clipboard, iz9.e socialPaymentsInteractor, du9.b disclaimerProvider, l0 popupMenuDialogDisplayer, lv9.d messageReactionsInteractor, wu9.c favoriteReactionsDelegate, wli.x deeplinkHandler, vz9.o descriptorFactory, PeerToPeerChatScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(messageActionsFactory, "messageActionsFactory");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(paymentLinkNavigationProvider, "paymentLinkNavigationProvider");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(socialPaymentsInteractor, "socialPaymentsInteractor");
        Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(messageReactionsInteractor, "messageReactionsInteractor");
        Intrinsics.checkNotNullParameter(favoriteReactionsDelegate, "favoriteReactionsDelegate");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(descriptorFactory, "descriptorFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f121528l = messageActionsFactory;
        this.f121529m = bottomExpandableDialog;
        this.f121530n = transferInteractor;
        this.o = paymentLinkNavigationProvider;
        this.f121531p = shotDialogDisplayer;
        this.f121532q = clipboard;
        this.f121533r = socialPaymentsInteractor;
        this.f121534s = disclaimerProvider;
        this.f121535t = popupMenuDialogDisplayer;
        this.u = messageReactionsInteractor;
        this.v = favoriteReactionsDelegate;
        this.f121536w = deeplinkHandler;
        this.f121537x = descriptorFactory;
        this.f121538y = inputData;
        this.z = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
    }

    public static final Object Z2(w wVar, P2PChatItem p2PChatItem, dg4.c cVar) {
        wVar.getClass();
        if (p2PChatItem instanceof TransactionItem) {
            Object objC3 = wVar.c3(((TransactionItem) p2PChatItem).f79576g, cVar);
            return objC3 == fim.a.COROUTINE_SUSPENDED ? objC3 : Unit.f186387a;
        }
        Continuation continuation = null;
        if (p2PChatItem instanceof MoneyRequestItem) {
            wVar.A2(u0.c(new MoneyRequestFeatureConfig$Details$ByMoneyRequest(((MoneyRequestItem) p2PChatItem).f79564g, null)));
        } else {
            if (p2PChatItem instanceof TransferLinkItem) {
                a3 a3Var = ((TransferLinkItem) p2PChatItem).f79581g;
                if (a3Var == null) {
                    Object objY2 = wVar.Y2(cVar, new com.revolut.feature.credit.application.plugins.impl.ui.form.a(wVar, p2PChatItem, continuation, 11));
                    return objY2 == fim.a.COROUTINE_SUSPENDED ? objY2 : Unit.f186387a;
                }
                Object objC32 = wVar.c3(a3Var, cVar);
                return objC32 == fim.a.COROUTINE_SUSPENDED ? objC32 : Unit.f186387a;
            }
            if (p2PChatItem instanceof DonationItem) {
                Object objC33 = wVar.c3(((DonationItem) p2PChatItem).d, cVar);
                return objC33 == fim.a.COROUTINE_SUSPENDED ? objC33 : Unit.f186387a;
            }
            if (!(p2PChatItem instanceof MessageItem)) {
                throw new NoWhenBranchMatchedException();
            }
            MessageType messageType = ((MessageItem) p2PChatItem).f79535h;
            if (messageType instanceof MessageType.SalaryReferral) {
                Object objY22 = wVar.Y2(cVar, new s(messageType, wVar, null));
                return objY22 == fim.a.COROUTINE_SUSPENDED ? objY22 : Unit.f186387a;
            }
        }
        return Unit.f186387a;
    }

    @Override // yji.n
    public final void H2() {
        l0 l0Var = this.f121535t;
        Continuation continuation = null;
        yji.n.l2(this, new dmj.k(rd0.e.b(l0Var.f256113c), 15), null, new u(this, continuation, 0), 3);
        yji.n.l2(this, rd0.e.b(l0Var.d), null, new u(this, continuation, 1), 3);
    }

    public final void b3(String reaction, ChatItem chatItem, zm3.a contact) {
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(chatItem, "chatItem");
        Intrinsics.checkNotNullParameter(contact, "contact");
        T2(new a9h.a(this, chatItem, reaction, (zm3.l) contact, null, 5), new yi5.b(27));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(tof.a3 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof e0a.v
            if (r0 == 0) goto L13
            r0 = r6
            e0a.v r0 = (e0a.v) r0
            int r1 = r0.f121527y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121527y = r1
            goto L18
        L13:
            e0a.v r0 = new e0a.v
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f121525w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f121527y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            e0a.w r5 = r0.v
            e0a.w r0 = r0.u
            yhm.o.b(r6)
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            com.revolut.feature.payments.social.api.model.ChatTransferRecipient$ContactRecipient r6 = new com.revolut.feature.payments.social.api.model.ChatTransferRecipient$ContactRecipient
            com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreenContract$InputData r2 = r4.f121538y
            zm3.a r2 = r2.f79768a
            r6.<init>(r2)
            r0.u = r4
            r0.v = r4
            r0.f121527y = r3
            vz9.o r2 = r4.f121537x
            java.lang.Object r6 = r2.a(r5, r6, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r5 = r4
            r0 = r5
        L50:
            aii.e r6 = (aii.e) r6
            com.revolut.kompot.navigable.vc.ViewController r5 = r5.o2(r6)
            r6 = 0
            r1 = 2
            com.revolut.kompot.common.ModalDestination$Style$FullscreenPaged r2 = com.revolut.kompot.common.ModalDestination.Style.FullscreenPaged.f98310a
            yji.n.P2(r0, r5, r2, r6, r1)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e0a.w.c3(tof.a3, gim.c):java.lang.Object");
    }
}
