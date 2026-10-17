package r0a;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.data.model.Data;
import com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose;
import com.revolut.feature.apm.core.models.recipients.ApmBeneficiary;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.PayIdBeneficiary;
import com.revolut.feature.apm.core.models.recipients.PixBeneficiary;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.screen.TransferOnlyChatScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import kye.m0;
import le.u1;
import om4.d0;
import skm.a2;
import skm.p0;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends oki.h implements o {
    public final a A;
    public final k7i.i B;
    public final j2 C;
    public a2 D;
    public final cli.y E;
    public final kge.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l0a.l f250757p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m0a.g f250758q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l0a.d f250759r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l0a.f f250760s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l0a.g f250761t;
    public final tx9.f u;
    public final m0a.l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d0 f250762w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final yz9.c f250763x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c0a.a f250764y;
    public final TransferOnlyChatScreenContract$InputData z;

    public y(kge.d transferOnlyChatInteractor, l0a.l recipientInteractor, m0a.g actionsExtension, l0a.d buttonsStateDelegate, l0a.f disclaimerDelegate, l0a.g transferOnlyFooterStateDelegate, tx9.f recentTimestampManager, m0a.l footerActionsExtension, d0 backgroundInteractor, yz9.c transactionForAnimationHolder, c0a.a chatItemMerger, TransferOnlyChatScreenContract$InputData inputData, a beneficiarySuggestionsDataDelegate, k7i.i transactionsRefresher, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(transferOnlyChatInteractor, "transferOnlyChatInteractor");
        Intrinsics.checkNotNullParameter(recipientInteractor, "recipientInteractor");
        Intrinsics.checkNotNullParameter(actionsExtension, "actionsExtension");
        Intrinsics.checkNotNullParameter(buttonsStateDelegate, "buttonsStateDelegate");
        Intrinsics.checkNotNullParameter(disclaimerDelegate, "disclaimerDelegate");
        Intrinsics.checkNotNullParameter(transferOnlyFooterStateDelegate, "transferOnlyFooterStateDelegate");
        Intrinsics.checkNotNullParameter(recentTimestampManager, "recentTimestampManager");
        Intrinsics.checkNotNullParameter(footerActionsExtension, "footerActionsExtension");
        Intrinsics.checkNotNullParameter(backgroundInteractor, "backgroundInteractor");
        Intrinsics.checkNotNullParameter(transactionForAnimationHolder, "transactionForAnimationHolder");
        Intrinsics.checkNotNullParameter(chatItemMerger, "chatItemMerger");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(beneficiarySuggestionsDataDelegate, "beneficiarySuggestionsDataDelegate");
        Intrinsics.checkNotNullParameter(transactionsRefresher, "transactionsRefresher");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = transferOnlyChatInteractor;
        this.f250757p = recipientInteractor;
        this.f250758q = actionsExtension;
        this.f250759r = buttonsStateDelegate;
        this.f250760s = disclaimerDelegate;
        this.f250761t = transferOnlyFooterStateDelegate;
        this.u = recentTimestampManager;
        this.v = footerActionsExtension;
        this.f250762w = backgroundInteractor;
        this.f250763x = transactionForAnimationHolder;
        this.f250764y = chatItemMerger;
        this.z = inputData;
        this.A = beneficiarySuggestionsDataDelegate;
        this.B = transactionsRefresher;
        this.C = vkm.q.c(inputData.f79801a);
        Data data = new Data(null, null, true, 3, null);
        q.Companion.getClass();
        g gVar = h.f250733b;
        ChatTransferRecipient chatTransferRecipient = inputData.f79801a;
        NavBarWithContainerBackground navBarWithContainerBackground = inputData.f79802b;
        od0.i.Companion.getClass();
        this.E = mra.d.b(this, new i(data, chatTransferRecipient, gVar, null, null, new Data(od0.i.f224256b, null, false, 6, null), navBarWithContainerBackground), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(r0a.y r4, com.revolut.feature.payments.social.api.model.ChatTransferRecipient r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof r0a.x
            if (r0 == 0) goto L13
            r0 = r6
            r0a.x r0 = (r0a.x) r0
            int r1 = r0.f250756x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f250756x = r1
            goto L18
        L13:
            r0a.x r0 = new r0a.x
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f250756x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.payments.social.api.model.ChatTransferRecipient r5 = r0.u
            yhm.o.b(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            vkm.j2 r6 = r4.C
            r0.u = r5
            r0.f250756x = r3
            r6.setValue(r5)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            if (r6 != r1) goto L42
            return r1
        L42:
            cli.y r6 = r4.E
            l0a.h r0 = new l0a.h
            r1 = 3
            r0.<init>(r5, r1)
            r4.H2(r6, r0)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r0a.y.I2(r0a.y, com.revolut.feature.payments.social.api.model.ChatTransferRecipient, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        String f62112a;
        TransferOnlyChatScreenContract$InputData transferOnlyChatScreenContract$InputData = this.z;
        Continuation continuation = null;
        yji.l.a1(this, this.f250762w.e(transferOnlyChatScreenContract$InputData.f79801a), null, null, new s(this, continuation, 0), 3);
        ChatTransferRecipient recipient = transferOnlyChatScreenContract$InputData.f79801a;
        Intrinsics.checkNotNullParameter(recipient, "<this>");
        if (!(recipient instanceof ChatTransferRecipient.CryptoAddressRecipient) || ((ChatTransferRecipient.CryptoAddressRecipient) recipient).f79721a.f71062g != ko5.c.SCREENING) {
            J2();
        } else if (recipient instanceof ChatTransferRecipient.CryptoAddressRecipient) {
            ChatTransferRecipient.CryptoAddressRecipient recipient2 = (ChatTransferRecipient.CryptoAddressRecipient) recipient;
            l0a.l lVar = this.f250757p;
            lVar.getClass();
            Intrinsics.checkNotNullParameter(recipient2, "recipient");
            ap5.b bVar = lVar.d;
            String id10 = recipient2.f79721a.f71059a;
            Intrinsics.checkNotNullParameter(id10, "id");
            hp5.o oVar = (hp5.o) bVar.f8094a;
            oVar.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            this.D = yji.l.a1(this, new t38.e(recipient2, 23, qe0.o.a(oVar.f154491p, id10, 10L, null, false, null, 28), new l0a.k(recipient2, null)), null, null, new u(this, null), 3);
        }
        kge.d dVar = this.o;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        yji.l.a1(this, new qna.n(yh5.b.d(rd0.e.b(nim.a.w(u1.d(((qz9.n) ((iz9.c) dVar.f183974b)).g(recipient), ((qz9.d) ((iz9.a) dVar.f183975c)).d(recipient, true)), new m0(19))), this.f250763x.a()), this, 4), null, null, new s(this, continuation, 1), 3);
        t tVar = new t(this, continuation, 2);
        j2 j2Var = this.C;
        yji.l.a1(this, rd0.e.e(vkm.q.H(tVar, j2Var), h0.f322473a, new qtb.o(3, 3, continuation)), null, null, new s(this, continuation, 2), 3);
        yji.l.a1(this, j2Var, null, null, new s(this, continuation, 3), 3);
        ChatTransferRecipient chatTransferRecipient = ((i) ((j2) this.E.f22677a).getValue()).f250735b;
        if (chatTransferRecipient instanceof ChatTransferRecipient.ApmTransferRecipient) {
            f62112a = ((ChatTransferRecipient.ApmTransferRecipient) chatTransferRecipient).f79715a.getF62134a().getF62112a();
        } else if (chatTransferRecipient instanceof ChatTransferRecipient.PaymentCounterpartyRecipient) {
            f62112a = ((ChatTransferRecipient.PaymentCounterpartyRecipient) chatTransferRecipient).f79724a.f79060a;
        } else {
            if (!(chatTransferRecipient instanceof ChatTransferRecipient.BeneficiaryRecipient) && !(chatTransferRecipient instanceof ChatTransferRecipient.CardRecipient) && !(chatTransferRecipient instanceof ChatTransferRecipient.CharityRecipient) && !(chatTransferRecipient instanceof ChatTransferRecipient.ContactRecipient) && !(chatTransferRecipient instanceof ChatTransferRecipient.CryptoAddressRecipient)) {
                throw new NoWhenBranchMatchedException();
            }
            m70.a.c(t0.f186434a);
            f62112a = "";
        }
        n2(new qu4.s(this, f62112a, continuation, 15), new whi.b(6));
    }

    public final void J2() {
        efm.r rVarA;
        Object kind;
        ChatTransferRecipient recipient = this.z.f79801a;
        l0a.l lVar = this.f250757p;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        boolean z = recipient instanceof ChatTransferRecipient.BeneficiaryRecipient;
        w4l.h hVar = w4l.h.f294642c;
        Continuation continuation = null;
        if (z) {
            rVarA = l0a.l.a(lVar.f191203a.j(((ChatTransferRecipient.BeneficiaryRecipient) recipient).f79716a.f132329a, hVar), recipient, new l0a.h(recipient, 0));
        } else if (recipient instanceof ChatTransferRecipient.CardRecipient) {
            rVarA = l0a.l.a(lVar.f191204b.b(((ChatTransferRecipient.CardRecipient) recipient).f79718a.f81490a), recipient, new m0(20));
        } else if (recipient instanceof ChatTransferRecipient.CharityRecipient) {
            rVarA = l0a.l.a(((sa6.t) lVar.f191205c).b(((ChatTransferRecipient.CharityRecipient) recipient).f79719a.f13938a, false), recipient, new m0(21));
        } else if (recipient instanceof ChatTransferRecipient.CryptoAddressRecipient) {
            rVarA = l0a.l.a(lVar.d.c(((ChatTransferRecipient.CryptoAddressRecipient) recipient).f79721a.f71059a, false, ho5.a.ADDRESS_TYPE), recipient, new l0a.h(recipient, 1));
        } else if (recipient instanceof ChatTransferRecipient.ApmTransferRecipient) {
            fy1.r rVar = lVar.e;
            ApmRecipient apmRecipient = ((ChatTransferRecipient.ApmTransferRecipient) recipient).f79715a;
            Intrinsics.checkNotNullParameter(apmRecipient, "<this>");
            if (apmRecipient instanceof ApmContact) {
                kind = c8g.a.n((ApmContact) apmRecipient);
            } else {
                if (!(apmRecipient instanceof ApmBeneficiary)) {
                    throw new NoWhenBranchMatchedException();
                }
                ApmBeneficiary apmBeneficiary = (ApmBeneficiary) apmRecipient;
                Intrinsics.checkNotNullParameter(apmBeneficiary, "<this>");
                if (apmBeneficiary instanceof PayIdBeneficiary) {
                    kind = n02.a.PAYID;
                } else {
                    if (!(apmBeneficiary instanceof PixBeneficiary)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kind = n02.a.PIX;
                }
            }
            String id10 = apmRecipient.getF62134a().getF62112a();
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(id10, "id");
            boolean z3 = kind instanceof n02.b;
            Flow flowB = vkm.i.f290039a;
            if (z3) {
                ky1.a aVarB = rVar.f138874a.b((n02.b) kind);
                if (aVarB != null) {
                    flowB = aVarB.f(id10);
                }
            } else {
                if (!(kind instanceof n02.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                hh3.c cVar = rVar.f138875b;
                n02.a kind2 = (n02.a) kind;
                Intrinsics.checkNotNullParameter(kind2, "kind");
                ky1.b bVar = (ky1.b) cVar.f152245a.get(kind2);
                if (bVar != null) {
                    gy1.e eVar = (gy1.e) bVar;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    efm.r map = m70.a.g(((r21.h) eVar.f147773a).j(id10, BeneficiarySpecialPurpose.PAYID_ALIAS, hVar), null, new gug.c(9), 1).map(new gv5.b(new gvi.p(eVar, 16), 12));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    flowB = rd0.e.b(map);
                }
            }
            rVarA = rd0.e.c(flowB, p0.f264003c).flatMap(new kxj.e(new m0(22), 8));
        } else {
            if (!(recipient instanceof ChatTransferRecipient.PaymentCounterpartyRecipient)) {
                if (!(recipient instanceof ChatTransferRecipient.ContactRecipient)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Not supported in TransferOnlyChat");
            }
            rVarA = l0a.l.a(rd0.e.c(lVar.f.d(((ChatTransferRecipient.PaymentCounterpartyRecipient) recipient).f79724a.f79060a), p0.f264003c), recipient, new m0(23));
        }
        efm.r rVarDistinctUntilChanged = rVarA.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        yji.l.a1(this, rd0.e.b(rVarDistinctUntilChanged), null, null, new t(this, continuation, 0), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.E.B(new qz9.b(27)), new q7b.j(continuation, this, 27)), null, new s(this, continuation, 4), 3);
        n2(new qc8.b(this, continuation, 19), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.E;
    }

    @Override // yji.l
    public final aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof m0a.e)) {
            return super.o2(event);
        }
        m0a.e eVar = (m0a.e) event;
        C2(new m(eVar.f201114b, eVar.f201115c));
        return aii.w.f5295a;
    }
}
