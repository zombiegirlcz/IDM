package lk6;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.tracking.ConsentLimitInputTrackableContext;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.payment.OpenBankingBrPaymentScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OpenBankingBrPaymentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(OpenBankingBrPaymentScreen openBankingBrPaymentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = openBankingBrPaymentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        OpenBankingBrazilPayment.EditableMoneyField editableMoneyField;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarE3 = this.v.d();
        Object obj3 = model.o;
        b0 b0Var = (b0) qVarE3;
        cli.y yVar = b0Var.u;
        LimitConfig dailyLimit = null;
        dailyLimit = null;
        dailyLimit = null;
        if (obj3 instanceof OpenBankingBrazilPayment.EditableMoneyField) {
            i iVar = (i) ((j2) yVar.f22677a).getValue();
            String str = ((OpenBankingBrazilPayment.EditableMoneyField) obj3).f72402a;
            if (Intrinsics.f(str, "singleTransactionLimit")) {
                OpenBankingBrazilPayment.EditableMoneyField editableMoneyField2 = iVar.d;
                if (editableMoneyField2 != null) {
                    dj0.d dVar = editableMoneyField2.f72404c;
                    dj0.d dVar2 = editableMoneyField2.d;
                    if (dVar2 == null) {
                        dVar2 = new dj0.d(0L, dVar.f115083b);
                    }
                    boolean z = editableMoneyField2.f72403b;
                    OpenBankingBrazilPayment.EditableMoneyField editableMoneyField3 = iVar.e;
                    dailyLimit = new LimitConfig.SingleTransactionLimit(dVar2, dVar, z, editableMoneyField3 != null ? editableMoneyField3.d : null);
                }
            } else if (Intrinsics.f(str, "dailyLimit") && (editableMoneyField = iVar.e) != null) {
                dj0.d dVar3 = editableMoneyField.f72404c;
                dj0.d dVar4 = editableMoneyField.d;
                if (dVar4 == null) {
                    dVar4 = new dj0.d(0L, dVar3.f115083b);
                }
                boolean z3 = editableMoneyField.f72403b;
                OpenBankingBrazilPayment.EditableMoneyField editableMoneyField4 = iVar.d;
                dailyLimit = new LimitConfig.DailyLimit(dVar4, dVar3, z3, editableMoneyField4 != null ? editableMoneyField4.d : null);
            }
            OpenBankingBrazilPayment openBankingBrazilPayment = (OpenBankingBrazilPayment) ((i) ((j2) yVar.f22677a).getValue()).f196243a.getContent();
            if (dailyLimit == null || openBankingBrazilPayment == null) {
                hx7.e.h(new IllegalStateException(j6.a.q("Limit field not found: ", str)));
            } else {
                b0Var.C2(new l(str, dailyLimit, new ConsentLimitInputTrackableContext.OutboundConsentLimit(openBankingBrazilPayment.f72394a)));
            }
        } else if (obj3 instanceof OpenBankingBrazilPayment.EditableDateField) {
            OpenBankingBrazilPayment.EditableDateField editableDateField = ((i) ((j2) yVar.f22677a).getValue()).f;
            if (editableDateField != null) {
                b0Var.C2(new k(editableDateField.f72400a, editableDateField.f72401b));
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Expiry date should be returned from BE");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            }
        } else {
            hx7.e.h(new IllegalStateException(a0.d.m(obj3, "Unexpected parcel for cell end text click ")));
        }
        return Unit.f186387a;
    }
}
