package qz9;

import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import com.revolut.feature.apm.core.models.recipients.AaniContact;
import com.revolut.feature.apm.core.models.recipients.ApmBeneficiary;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.apm.core.models.recipients.MultibancoContact;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import com.revolut.feature.apm.core.models.recipients.WeroContact;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import g48.r0;
import h6i.q0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import skm.p0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements iz9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax1.a f250416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vv9.c f250417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f250418c;
    public final ang.f d;
    public final q0 e;
    public final i f;

    public d(ax1.a apmMoneyRequestsInteractor, vv9.c moneyRequestsInteractor, r0 jointAccountInteractor, ang.f userInteractor, q0 paymentsChatCountryProfilesProvider, i settingsInteractor) {
        Intrinsics.checkNotNullParameter(apmMoneyRequestsInteractor, "apmMoneyRequestsInteractor");
        Intrinsics.checkNotNullParameter(moneyRequestsInteractor, "moneyRequestsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountInteractor, "jointAccountInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(paymentsChatCountryProfilesProvider, "paymentsChatCountryProfilesProvider");
        Intrinsics.checkNotNullParameter(settingsInteractor, "settingsInteractor");
        this.f250416a = apmMoneyRequestsInteractor;
        this.f250417b = moneyRequestsInteractor;
        this.f250418c = jointAccountInteractor;
        this.d = userInteractor;
        this.e = paymentsChatCountryProfilesProvider;
        this.f = settingsInteractor;
    }

    public static boolean a(MoneyRequest moneyRequest, String str) {
        MoneyRequestCounterParty moneyRequestCounterParty = moneyRequest.k;
        return Intrinsics.f(moneyRequestCounterParty != null ? moneyRequestCounterParty.getE() : null, str) || Intrinsics.f(moneyRequest.f60320l.getE(), str);
    }

    public static boolean b(MoneyRequest moneyRequest, String str) {
        MoneyRequestCounterParty moneyRequestCounterParty = moneyRequest.k;
        return Intrinsics.f(moneyRequestCounterParty != null ? moneyRequestCounterParty.getF60345c() : null, str) || Intrinsics.f(moneyRequest.f60320l.getF60345c(), str);
    }

    public static boolean c(MoneyRequest moneyRequest, String str) {
        MoneyRequestCounterParty moneyRequestCounterParty = moneyRequest.k;
        return Intrinsics.f(moneyRequestCounterParty != null ? moneyRequestCounterParty.getF60344b() : null, str) || Intrinsics.f(moneyRequest.f60320l.getF60344b(), str);
    }

    public final efm.r d(ChatTransferRecipient chatRecipient, boolean z) {
        Flow flowI;
        Object channel;
        Intrinsics.checkNotNullParameter(chatRecipient, "chatRecipient");
        boolean z3 = chatRecipient instanceof ChatTransferRecipient.ContactRecipient;
        vv9.c cVar = this.f250417b;
        q0 q0Var = this.e;
        if (z3) {
            zm3.a aVar = ((ChatTransferRecipient.ContactRecipient) chatRecipient).f79720a;
            efm.r rVarD = ((u6k.h) cVar).d(z);
            cxe.u uVarH = this.f250418c.h(w4l.h.f294642c);
            kotlinx.coroutines.d dVar = p0.f264003c;
            return ue0.e.p(nim.a.w(mif.a.g(rVarD, rd0.e.c(uVarH, dVar), this.d.k(false), rd0.e.c(q0Var.c(), dVar), this.f.a(aVar)), new gck.v(this, aVar)), h0.f322473a);
        }
        if (!(chatRecipient instanceof ChatTransferRecipient.ApmTransferRecipient)) {
            if (chatRecipient instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                return ue0.e.p(nim.a.w(kli.a.h(((u6k.h) cVar).d(z), rd0.e.c(q0Var.c(), p0.f264003c)), new d3j.c(((ChatTransferRecipient.BeneficiaryRecipient) chatRecipient).f79716a, 2)), h0.f322473a);
            }
            if (!(chatRecipient instanceof ChatTransferRecipient.CardRecipient) && !(chatRecipient instanceof ChatTransferRecipient.CharityRecipient) && !(chatRecipient instanceof ChatTransferRecipient.CryptoAddressRecipient) && !(chatRecipient instanceof ChatTransferRecipient.PaymentCounterpartyRecipient)) {
                throw new NoWhenBranchMatchedException();
            }
            efm.r rVarJust = efm.r.just(new Data(f0.f322471a, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
            return rVarJust;
        }
        ApmRecipient contact = ((ChatTransferRecipient.ApmTransferRecipient) chatRecipient).f79715a;
        pz1.c cVar2 = (pz1.c) this.f250416a;
        Intrinsics.checkNotNullParameter(contact, "contact");
        if (contact instanceof ApmContact) {
            ApmContact apmContact = (ApmContact) contact;
            if (apmContact instanceof AaniContact) {
                channel = MoneyRequestChannel.Aani.f60329b;
            } else if (apmContact instanceof BizumContact) {
                channel = MoneyRequestChannel.Bizum.f60331b;
            } else if (apmContact instanceof MultibancoContact) {
                channel = MoneyRequestChannel.MBWay.f60332b;
            } else if (apmContact instanceof QvikContact) {
                channel = MoneyRequestChannel.Qvik.f60333b;
            } else if (apmContact instanceof WeroContact) {
                channel = MoneyRequestChannel.Wero.f60336b;
            } else {
                flowI = zi0.c.i(f0.f322471a);
            }
            Intrinsics.checkNotNullParameter(channel, "channel");
            flowI = nim.a.v(rd0.e.b(nim.a.w(((u6k.h) cVar2.f240866b).d(z), new pth.l(channel, 21))), new oz1.k(contact));
        } else {
            if (!(contact instanceof ApmBeneficiary)) {
                throw new NoWhenBranchMatchedException();
            }
            flowI = zi0.c.i(f0.f322471a);
        }
        return ue0.e.p(nim.a.w(kli.a.h(rd0.e.c(flowI, kotlin.coroutines.g.f186406a), rd0.e.c(q0Var.c(), p0.f264003c)), new b(3)), h0.f322473a);
    }
}
