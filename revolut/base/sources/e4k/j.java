package e4k;

import aw0.f4;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BankTransferAmountScreen f122609w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(BankTransferAmountScreen bankTransferAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f122609w = bankTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f122609w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(this.f122609w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            case 2:
                j jVar3 = new j(this.f122609w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
            case 3:
                j jVar4 = new j(this.f122609w, continuation, 3);
                jVar4.v = obj2;
                return jVar4;
            case 4:
                j jVar5 = new j(this.f122609w, continuation, 4);
                jVar5.v = obj2;
                return jVar5;
            case 5:
                j jVar6 = new j(this.f122609w, continuation, 5);
                jVar6.v = obj2;
                return jVar6;
            case 6:
                j jVar7 = new j(this.f122609w, continuation, 6);
                jVar7.v = obj2;
                return jVar7;
            default:
                j jVar8 = new j(this.f122609w, continuation, 7);
                jVar8.v = obj2;
                return jVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((j) create((kq2.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((j) create((kq2.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((j) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        rp0.y yVarC;
        int i = this.u;
        BankTransferAmountScreen bankTransferAmountScreen = this.f122609w;
        switch (i) {
            case 0:
                g6 g6Var = (g6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0VarK3 = bankTransferAmountScreen.T2();
                String type = g6Var.f54199a;
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar2 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) h0VarK3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(type, "type");
                BankTransferData bankTransferData = ((x) aVar2.t2()).f122647c;
                TransferNote transferNote = bankTransferData != null ? bankTransferData.f : null;
                TransferNote.StructuredNote structuredNote = transferNote instanceof TransferNote.StructuredNote ? (TransferNote.StructuredNote) transferNote : null;
                if (structuredNote != null) {
                    aVar2.x2(new c4k.j(structuredNote, type, 1));
                }
                return Unit.f186387a;
            case 1:
                f4 focusData = (f4) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0VarK32 = bankTransferAmountScreen.T2();
                Intrinsics.h(focusData);
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar4 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) h0VarK32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                aVar4.J.b(focusData);
                return Unit.f186387a;
            case 2:
                String suggestion = (String) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0VarK33 = bankTransferAmountScreen.T2();
                Intrinsics.h(suggestion);
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar6 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) h0VarK33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(suggestion, "suggestion");
                aVar6.x2(new q0(aVar6, suggestion, 1));
                return Unit.f186387a;
            case 3:
                kq2.c chargeBearer = (kq2.c) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0VarK34 = bankTransferAmountScreen.T2();
                Intrinsics.h(chargeBearer);
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar8 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) h0VarK34;
                aVar8.getClass();
                Intrinsics.checkNotNullParameter(chargeBearer, "chargeBearer");
                j60.a.v(aVar8.E, false, null, 3);
                aVar8.H2(new r0(chargeBearer, 0));
                return Unit.f186387a;
            case 4:
                kq2.e transferFeeOptions = (kq2.e) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0VarK35 = bankTransferAmountScreen.T2();
                Intrinsics.h(transferFeeOptions);
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar10 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) h0VarK35;
                x1k.a aVar11 = aVar10.u;
                Intrinsics.checkNotNullParameter(transferFeeOptions, "transferFeeOptions");
                int i2 = s0.f122635a[transferFeeOptions.f188300a.ordinal()];
                if (i2 == 1) {
                    yVarC = ((f2k.k) aVar11).c();
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yVarC = ((f2k.k) aVar11).a(transferFeeOptions);
                }
                aVar10.E.x(yVarC);
                return Unit.f186387a;
            case 5:
                String id10 = (String) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0VarK36 = bankTransferAmountScreen.T2();
                Intrinsics.h(id10);
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar13 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) h0VarK36;
                aVar13.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("ID_FOOTER_KID_ID")) {
                    aVar13.F.Q();
                    j60.a aVar14 = aVar13.E;
                    aVar13.f102084t.getClass();
                    aVar14.x(new rp0.y(zhm.f0.f322471a, new rp0.t(new TextLocalisedClause(R$string.payments_bank_transfer_dialog_warning_not_supported_kid_title, null, null, 14), new TextLocalisedClause(R$string.payments_bank_transfer_dialog_warning_not_supported_kid_description, null, null, 14), null, 28), null, null, null, null, 1020));
                }
                return Unit.f186387a;
            case 6:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0VarK37 = bankTransferAmountScreen.T2();
                String amount = charSequence.toString();
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar16 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) h0VarK37;
                aVar16.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                BankTransferData bankTransferDataG2 = aVar16.G2();
                long jB = aVar16.H.b(amount, bankTransferDataG2.f101925b.f306286a);
                if (jB > 0) {
                    aVar16.x2(new m0(bankTransferDataG2, jB, 0));
                } else {
                    aVar16.x2(new csl.a(bankTransferDataG2, jB, aVar16, 3));
                }
                return Unit.f186387a;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yof.b payload = (yof.b) pair.f186385a;
                c0 c0Var = (c0) pair.f186386b;
                if (payload != null) {
                    com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar18 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) bankTransferAmountScreen.T2();
                    aVar18.getClass();
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    aVar18.l2(new e38.c(aVar18, payload, c0Var, null, 4), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }
}
