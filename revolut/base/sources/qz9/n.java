package qz9;

import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.apm.core.models.recipients.ApmBeneficiary;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.payments.api.PaymentsToggles$CancelledTransfers;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import g48.r0;
import h6i.q0;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mjf.b0;
import org.joda.time.DateTime;
import pfm.z;
import rfm.x;
import skm.p0;
import te0.w;
import tof.cb;
import tof.e7;
import tof.e8;
import tof.i7;
import tof.i8;
import tof.j7;
import tof.j8;
import tof.k8;
import tof.l8;
import tof.la;
import tof.m8;
import tof.n8;
import tof.oa;
import tof.q7;
import tof.qa;
import tof.qb;
import tof.t7;
import tof.u8;
import tof.u9;
import tof.v6;
import tof.v7;
import tof.x8;
import tof.y8;
import tof.ya;
import tof.za;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements iz9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f250435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f250436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wif.a f250437c;
    public final ang.f d;
    public final r0 e;
    public final z2j.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q0 f250438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kbb.c f250439h;
    public final gte.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f250440j;

    public n(com.revolut.domain.interactors.transactions.a transactionsInteractor, wsg.n walletsInteractor, wif.a userFeaturesChecker, ang.f userInteractor, r0 jointAccountsInteractor, z2j.f beneficiaryTransactionFilterProvider, q0 paymentsChatCountryProfilesProvider, kbb.c transactionWalletScopeProvider, gte.a featureToggleInteractor, rz9.a primaryKeyInteractor, i settingsInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryTransactionFilterProvider, "beneficiaryTransactionFilterProvider");
        Intrinsics.checkNotNullParameter(paymentsChatCountryProfilesProvider, "paymentsChatCountryProfilesProvider");
        Intrinsics.checkNotNullParameter(transactionWalletScopeProvider, "transactionWalletScopeProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(primaryKeyInteractor, "primaryKeyInteractor");
        Intrinsics.checkNotNullParameter(settingsInteractor, "settingsInteractor");
        this.f250435a = transactionsInteractor;
        this.f250436b = walletsInteractor;
        this.f250437c = userFeaturesChecker;
        this.d = userInteractor;
        this.e = jointAccountsInteractor;
        this.f = beneficiaryTransactionFilterProvider;
        this.f250438g = paymentsChatCountryProfilesProvider;
        this.f250439h = transactionWalletScopeProvider;
        this.i = featureToggleInteractor;
        this.f250440j = settingsInteractor;
    }

    public static oa c(String str) {
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {new l8(str), new k8(str), new v7(str)};
        cVar.getClass();
        return i7.c.b(i7VarArr);
    }

    public final q7 a(ChatTransferRecipient chatTransferRecipient, m mVar, Long l2) {
        i7.c cVar = i7.Companion;
        i7 i7Var = mVar.f250433a;
        v6[] elements = {v6.COMPLETED, v6.PENDING, v6.REVERTED, v6.DECLINED, v6.FAILED, v6.CREATED, ((chatTransferRecipient instanceof ChatTransferRecipient.BeneficiaryRecipient) && ((jte.d) this.i).c(PaymentsToggles$CancelledTransfers.f79144c)) ? v6.CANCELLED : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        v6[] v6VarArr = (v6[]) kotlin.collections.d.L(elements).toArray(new v6[0]);
        v6[] v6VarArr2 = (v6[]) Arrays.copyOf(v6VarArr, v6VarArr.length);
        cVar.getClass();
        return i7.c.a(i7Var, i7.c.c(v6VarArr2), l2 != null ? new u8(new DateTime(l2.longValue())) : null);
    }

    public final i7 b(ChatTransferRecipient chatTransferRecipient) {
        if (chatTransferRecipient instanceof ChatTransferRecipient.BeneficiaryRecipient) {
            return this.f.a(((ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient).f79716a);
        }
        if (chatTransferRecipient instanceof ChatTransferRecipient.CardRecipient) {
            return new ya(((ChatTransferRecipient.CardRecipient) chatTransferRecipient).f79718a.f81490a);
        }
        if (!(chatTransferRecipient instanceof ChatTransferRecipient.ContactRecipient)) {
            if (chatTransferRecipient instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                CryptoAddress cryptoAddress = ((ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient).f79721a;
                i7.c cVar = i7.Companion;
                i7[] i7VarArr = {new y8(cryptoAddress.f71064j), new x8(cryptoAddress.f71061c)};
                cVar.getClass();
                return i7.c.b(i7VarArr);
            }
            if (chatTransferRecipient instanceof ChatTransferRecipient.CharityRecipient) {
                i7.c cVar2 = i7.Companion;
                ba6.l lVar = ((ChatTransferRecipient.CharityRecipient) chatTransferRecipient).f79719a;
                i7[] i7VarArr2 = {new cb(lVar.f13940c), new e8(y0.b(lVar.f13938a))};
                cVar2.getClass();
                return i7.c.b(i7VarArr2);
            }
            if (!(chatTransferRecipient instanceof ChatTransferRecipient.ApmTransferRecipient)) {
                if (chatTransferRecipient instanceof ChatTransferRecipient.PaymentCounterpartyRecipient) {
                    return new qa(((ChatTransferRecipient.PaymentCounterpartyRecipient) chatTransferRecipient).f79724a.f79060a);
                }
                throw new NoWhenBranchMatchedException();
            }
            ApmRecipient apmRecipient = ((ChatTransferRecipient.ApmTransferRecipient) chatTransferRecipient).f79715a;
            if (apmRecipient instanceof ApmBeneficiary) {
                return new j7(apmRecipient.getF62134a().getF62112a());
            }
            if (apmRecipient instanceof ApmContact) {
                return new oa(zhm.v.k(new e7(apmRecipient.getF62134a().getF62112a()), new j7(apmRecipient.getF62134a().getF62112a())));
            }
            throw new NoWhenBranchMatchedException();
        }
        zm3.a aVar = ((ChatTransferRecipient.ContactRecipient) chatTransferRecipient).f79720a;
        if (aVar instanceof zm3.i) {
            i7.c cVar3 = i7.Companion;
            zm3.i iVar = (zm3.i) aVar;
            String str = iVar.f323353g;
            oa oaVarC = c(iVar.f323351b);
            i7[] i7VarArr3 = {new j8(str), new i8(str)};
            cVar3.getClass();
            oa oaVarB = i7.c.b(i7VarArr3);
            la laVar = new la(str);
            String str2 = iVar.f323354h;
            i7[] i7VarArr4 = {new n8(str2), new m8(str2)};
            cVar3.getClass();
            i7[] i7VarArr5 = {oaVarC, oaVarB, laVar, i7.c.b(i7VarArr4)};
            cVar3.getClass();
            return i7.c.b(i7VarArr5);
        }
        if (!(aVar instanceof zm3.j)) {
            if (aVar instanceof zm3.e) {
                return new t7(((zm3.e) aVar).f323340a);
            }
            if (aVar instanceof zm3.f) {
                return c(((zm3.f) aVar).f323345a);
            }
            if (aVar instanceof zm3.n) {
                return new t7(((zm3.n) aVar).f323373a);
            }
            if (aVar instanceof zm3.o) {
                return c(((zm3.o) aVar).f323376a);
            }
            throw new NoWhenBranchMatchedException();
        }
        i7.c cVar4 = i7.Companion;
        zm3.j jVar = (zm3.j) aVar;
        String str3 = jVar.f;
        i7[] i7VarArr6 = {new j8(str3), new i8(str3)};
        cVar4.getClass();
        oa oaVarB2 = i7.c.b(i7VarArr6);
        la laVar2 = new la(str3);
        String str4 = jVar.f323362g;
        i7[] i7VarArr7 = {new n8(str4), new m8(str4)};
        cVar4.getClass();
        i7[] i7VarArr8 = {oaVarB2, laVar2, i7.c.b(i7VarArr7)};
        cVar4.getClass();
        return i7.c.b(i7VarArr8);
    }

    public final efm.r d(ChatTransferRecipient chatTransferRecipient) {
        efm.r rVarH;
        efm.r rVarJ;
        Continuation continuation = null;
        if (d0.W(rz9.a.a(chatTransferRecipient))) {
            IllegalStateException illegalStateException = new IllegalStateException("ChatTransferRecipient is not valid: " + chatTransferRecipient);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            rVarH = w.h(new Data(null, illegalStateException, false, 5, null));
        } else {
            if (chatTransferRecipient instanceof ChatTransferRecipient.ContactRecipient) {
                rVarJ = nim.a.w(nim.a.w(kli.a.h(this.d.k(false), rd0.e.c(nim.a.A(this.e.h(w4l.h.f294642c), new b(11)), p0.f264003c)), new b(12)), new l0a.h(chatTransferRecipient, this));
            } else {
                od0.i.Companion.getClass();
                rVarJ = zi0.c.j(od0.i.f224256b);
            }
            int i = 2;
            efm.r rVarFlatMap = this.f250437c.d(wog.a.JUNIOR).flatMap(new qsa.a(24, new k(this, i)));
            Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
            rVarH = nim.a.w(kli.a.h(rVarJ, rVarFlatMap), new l(this, chatTransferRecipient, i));
        }
        efm.r rVarX = w.o0(p0.f264003c, new qc8.b(this, continuation, 18)).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return nim.a.w(kli.a.h(rVarH, rVarX), new b(9));
    }

    public final x e(ChatTransferRecipient chatRecipient) {
        Intrinsics.checkNotNullParameter(chatRecipient, "chatRecipient");
        efm.k kVarFirstElement = m70.a.g(pd.b.r(d(chatRecipient), new k(this, 1)), null, null, 3).firstElement();
        qsa.a aVar = new qsa.a(23, new b(7));
        kVarFirstElement.getClass();
        rfm.m mVar = new rfm.m(kVarFirstElement, aVar, 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return ue0.e.x(mVar);
    }

    public final z f(ChatTransferRecipient chatRecipient) {
        Intrinsics.checkNotNullParameter(chatRecipient, "chatRecipient");
        if (d0.W(rz9.a.a(chatRecipient))) {
            throw new IllegalStateException("ChatTransferRecipient is not valid: " + chatRecipient);
        }
        i7.c cVar = i7.Companion;
        i7 i7VarB = b(chatRecipient);
        i7[] i7VarArr = {new u9(true), new u9(false)};
        cVar.getClass();
        ufm.p pVarT = ((b0) this.f250435a).j(i7.c.a(i7VarB, i7.c.b(i7VarArr), i7.c.b(new za("suspicious_transaction_user_action_required"), new za("suspicious_transaction_counterparty_action_required"), new za("suspicious_transaction_pending_confirmation"), new za("suspicious_transaction_pending_review"), new za("suspicious_transaction_no_user_action_required"), new za("crypto_withdrawal_fraud_limit")), new qb(zhm.u.c(v6.PENDING))), new TransactionContext(new Priority.HIGH("Payments - Chat Send Button - Suspicious check"), null, 2)).firstOrError().t(400L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(pVarT, "timeout(...)");
        od0.i.Companion.getClass();
        return ue0.e.F(pVarT, od0.i.f224256b);
    }

    public final efm.r g(ChatTransferRecipient chatRecipient) {
        efm.r rVarJust;
        zm3.a aVar;
        Intrinsics.checkNotNullParameter(chatRecipient, "chatRecipient");
        efm.r rVarD = d(chatRecipient);
        Intrinsics.checkNotNullParameter(chatRecipient, "chatRecipient");
        ChatTransferRecipient.ContactRecipient contactRecipient = chatRecipient instanceof ChatTransferRecipient.ContactRecipient ? (ChatTransferRecipient.ContactRecipient) chatRecipient : null;
        i iVar = this.f250440j;
        if (contactRecipient == null || (aVar = contactRecipient.f79720a) == null || (rVarJust = iVar.a(aVar)) == null) {
            rVarJust = efm.r.just(iVar.f250425b);
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        }
        return zi0.c.G(ue0.e.p(nim.a.w(kli.a.h(pd.b.r(kli.a.h(rVarD, rVarJust), new l(this, chatRecipient, 1)), rd0.e.c(this.f250438g.c(), p0.f264003c)), new b(8)), h0.f322473a), f0.f322471a);
    }

    public final efm.r h(ChatTransferRecipient.ContactRecipient chatRecipient) {
        Intrinsics.checkNotNullParameter(chatRecipient, "chatRecipient");
        return ue0.e.E(m70.a.g(pd.b.r(d(chatRecipient), new k(this, 0)), null, new qsk.d(27), 1), Boolean.FALSE);
    }
}
