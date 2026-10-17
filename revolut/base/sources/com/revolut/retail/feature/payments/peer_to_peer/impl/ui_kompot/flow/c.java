package com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$Details$ByMoneyRequest;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transfer.core.api.interactor.ReferenceData;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerCustomization;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.CurrencyPickerMode;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.LaunchMode;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerExtraConfiguration$DisableReference;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerReviewScreenInputData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.PeerToPeerTransferFlowContract$Step;
import cp5.d;
import eul.f;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o9k.i;
import o9k.j0;
import oki.h;
import q8k.j;
import q8k.k;
import q8k.l;
import q8k.m;
import q8k.n;
import qua.p;
import s8k.g;
import zhm.f0;
import zhm.z0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends h implements f9k.b {
    public final PeerToPeerTransferInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b3a.a f102348p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f102349q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j0 f102350r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final aqf.b f102351s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f102352t;

    public c(PeerToPeerTransferInputData inputData, b3a.a chatTransferNavigationProvider, i peerToPeerScheduleTransferExtension, j0 peerToPeerTransferExecutionExtension, aqf.b transferExecutionLoadingController) {
        FlowStep review;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(chatTransferNavigationProvider, "chatTransferNavigationProvider");
        Intrinsics.checkNotNullParameter(peerToPeerScheduleTransferExtension, "peerToPeerScheduleTransferExtension");
        Intrinsics.checkNotNullParameter(peerToPeerTransferExecutionExtension, "peerToPeerTransferExecutionExtension");
        Intrinsics.checkNotNullParameter(transferExecutionLoadingController, "transferExecutionLoadingController");
        this.o = inputData;
        this.f102348p = chatTransferNavigationProvider;
        this.f102349q = peerToPeerScheduleTransferExtension;
        this.f102350r = peerToPeerTransferExecutionExtension;
        this.f102351s = transferExecutionLoadingController;
        if (inputData instanceof PeerToPeerTransferInputData.NewTransfer) {
            PeerToPeerTransferInputData.NewTransfer newTransfer = (PeerToPeerTransferInputData.NewTransfer) inputData;
            review = new PeerToPeerTransferFlowContract$Step.Amount(new PeerToPeerAmountScreenContract$InputData.NewTransfer(newTransfer.f102279a, newTransfer.f102280b, newTransfer.f102281c, newTransfer.f102284j, newTransfer.d, newTransfer.k, newTransfer.f102286m, newTransfer.o, newTransfer.f102287n, J2(), newTransfer.e, newTransfer.f102285l, L2(), newTransfer.f102283h, newTransfer.f102288p, newTransfer.i, newTransfer.f102289q));
        } else {
            if (!(inputData instanceof PeerToPeerTransferInputData.ReviewOnly)) {
                throw new NoWhenBranchMatchedException();
            }
            PeerToPeerTransferInputData.ReviewOnly reviewOnly = (PeerToPeerTransferInputData.ReviewOnly) inputData;
            review = new PeerToPeerTransferFlowContract$Step.Review(new PeerToPeerReviewScreenInputData(reviewOnly.f102290a, reviewOnly.f102292c, reviewOnly.f102295j, reviewOnly.e, z0.i(reviewOnly.f102294h ? PeerToPeerReviewScreenInputData.AdditionalConfig.ContinueMode.f102275a : null, reviewOnly.i.contains(PeerToPeerExtraConfiguration$DisableReference.f102268a) ? PeerToPeerReviewScreenInputData.AdditionalConfig.DisableReference.f102276a : null)));
        }
        this.f102352t = d.a(this, review, f0.f322471a, new f(this, 21));
    }

    public final void I2(n nVar, PeerToPeerTransferData peerToPeerTransferData, boolean z) {
        NaviCommand naviCommandB;
        FeatureCommand featureCommand;
        NaviCommand naviCommandB2;
        if (Intrinsics.f(nVar, q8k.h.f243145a)) {
            h.D2(this.f102352t);
            return;
        }
        boolean z3 = nVar instanceof j;
        b3a.a aVar = this.f102348p;
        PeerToPeerTransferInputData peerToPeerTransferInputData = this.o;
        if (z3) {
            j jVar = (j) nVar;
            MoneyRequest data = jVar.f243147a;
            boolean z4 = jVar.f243148b;
            ChatTransferRecipient.ContactRecipient contactRecipient = new ChatTransferRecipient.ContactRecipient(peerToPeerTransferInputData.getF102290a().f102270a);
            if (z4) {
                v3a.b bVar = (v3a.b) aVar;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                naviCommandB2 = com.revolut.retail.core.navigation.a.c(bVar.b(contactRecipient), new FeatureCommand(new MoneyRequestFeatureConfig$Details$ByMoneyRequest(data, null)));
            } else {
                naviCommandB2 = null;
            }
            FlowExtras f = peerToPeerTransferInputData.getF();
            NaviCommand naviCommand = f != null ? f.f98611a : null;
            if (naviCommandB2 == null) {
                naviCommandB2 = naviCommand == null ? t8k.a.e(peerToPeerTransferInputData.getF102290a()) ? null : ((v3a.b) aVar).b(contactRecipient) : naviCommand;
            }
            C1(new BridgeDestination(r6.b.g(null, null, null, 7, naviCommandB2)));
            return;
        }
        if (nVar instanceof k) {
            k kVar = (k) nVar;
            dj0.d dVar = kVar.f243149a;
            p pVar = kVar.f243150b;
            boolean z6 = kVar.f243151c;
            LaunchMode f102293g = peerToPeerTransferInputData.getF102293g();
            if ((f102293g instanceof LaunchMode.AsController) && ((LaunchMode.AsController) f102293g).f102266a == com.revolut.retail.feature.payments.peer_to_peer.api.navigation.a.SILENT_COMPLETION) {
                C2(new s8k.f(dVar, peerToPeerTransferData.f102252n));
                return;
            } else {
                l2(new f9k.c(z6, this, pVar, null), new yi5.b(26));
                return;
            }
        }
        if (!(nVar instanceof l)) {
            if (nVar instanceof m) {
                C2(new s8k.h(((m) nVar).f243155a));
                return;
            } else {
                if (!(nVar instanceof q8k.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (!z && (peerToPeerTransferInputData.getF102293g() instanceof LaunchMode.AsController)) {
            l lVar = (l) nVar;
            C2(new g(lVar.f243152a, lVar.f243153b));
            return;
        }
        LaunchMode f102293g2 = peerToPeerTransferInputData.getF102293g();
        if ((f102293g2 instanceof LaunchMode.AsController) && ((LaunchMode.AsController) f102293g2).f102266a == com.revolut.retail.feature.payments.peer_to_peer.api.navigation.a.SILENT_COMPLETION) {
            l lVar2 = (l) nVar;
            C2(new g(lVar2.f243152a, lVar2.f243153b));
            return;
        }
        l lVar3 = (l) nVar;
        PeerToPeerTransferDescriptor descriptor = lVar3.f243153b;
        boolean z11 = lVar3.f243154c;
        ChatTransferRecipient.ContactRecipient contactRecipient2 = new ChatTransferRecipient.ContactRecipient(peerToPeerTransferInputData.getF102290a().f102270a);
        if (z11) {
            v3a.b bVar2 = (v3a.b) aVar;
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(descriptor, "data");
            CompositeCommand compositeCommandB = bVar2.b(contactRecipient2);
            y8k.c cVar = bVar2.f285864b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (descriptor instanceof PeerToPeerTransferDescriptor.Link) {
                featureCommand = cVar.f311671a.a(((PeerToPeerTransferDescriptor.Link) descriptor).f60547a);
            } else {
                if (!(descriptor instanceof PeerToPeerTransferDescriptor.Transfer)) {
                    throw new NoWhenBranchMatchedException();
                }
                featureCommand = new FeatureCommand(new TransactionsFeatureConfig.Details(((PeerToPeerTransferDescriptor.Transfer) descriptor).f60549a, null, null, null, 122));
            }
            naviCommandB = com.revolut.retail.core.navigation.a.c(compositeCommandB, featureCommand);
        } else {
            naviCommandB = null;
        }
        FlowExtras f4 = peerToPeerTransferInputData.getF();
        NaviCommand naviCommand2 = f4 != null ? f4.f98611a : null;
        if (naviCommandB == null) {
            naviCommandB = naviCommand2 == null ? t8k.a.e(peerToPeerTransferInputData.getF102290a()) ? null : ((v3a.b) aVar).b(contactRecipient2) : naviCommand2;
        }
        C1(new BridgeDestination(r6.b.g(null, null, null, 7, naviCommandB)));
    }

    public final boolean J2() {
        LaunchMode f102293g = this.o.getF102293g();
        if (f102293g instanceof LaunchMode.AsController) {
            return ((LaunchMode.AsController) f102293g).f102266a == com.revolut.retail.feature.payments.peer_to_peer.api.navigation.a.ANIMATION_WITH_STATUS_FALLBACK;
        }
        if (f102293g instanceof LaunchMode.AsDestination) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void K2(PeerToPeerTransferFlowContract$Step.Personalisation personalisation, PeerToPeerCustomization peerToPeerCustomization, TransitionAnimation transitionAnimation) {
        PeerToPeerTransferData transferData = PeerToPeerTransferData.a(personalisation.f102343b.f102327l, 0L, null, null, null, null, null, peerToPeerCustomization, null, null, null, null, 261631);
        yki.a aVar = this.f102352t;
        h.r2(aVar);
        PeerToPeerAmountScreenContract$InputData.WithTransferData withTransferData = personalisation.f102343b;
        PeerToPeerRecipient recipient = withTransferData.f102321a;
        hrf.f direction = withTransferData.f102322b;
        TransferFlowType flowType = withTransferData.f102323c;
        boolean z = withTransferData.d;
        p pVar = withTransferData.e;
        boolean z3 = withTransferData.f;
        boolean z4 = withTransferData.f102324g;
        boolean z6 = withTransferData.f102325h;
        CurrencyPickerMode currencyPickerMode = withTransferData.i;
        Set extraConfigurations = withTransferData.f102326j;
        TransferAppSource transferAppSource = withTransferData.k;
        ReferenceData referenceData = withTransferData.f102328m;
        boolean z11 = withTransferData.f102329n;
        boolean z12 = withTransferData.o;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(currencyPickerMode, "currencyPickerMode");
        Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
        Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        h.t2(this, aVar, new PeerToPeerTransferFlowContract$Step.Amount(new PeerToPeerAmountScreenContract$InputData.WithTransferData(recipient, direction, flowType, z, pVar, z3, z4, z6, currencyPickerMode, extraConfigurations, transferAppSource, transferData, referenceData, z11, z12)), false, transitionAnimation, false, 8);
    }

    public final boolean L2() {
        LaunchMode f102293g = this.o.getF102293g();
        if (f102293g instanceof LaunchMode.AsController) {
            return ((LaunchMode.AsController) f102293g).f102266a != com.revolut.retail.feature.payments.peer_to_peer.api.navigation.a.SILENT_COMPLETION;
        }
        if (f102293g instanceof LaunchMode.AsDestination) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f102352t;
    }
}
