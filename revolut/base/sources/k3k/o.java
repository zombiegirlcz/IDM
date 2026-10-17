package k3k;

import aw0.f4;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RemittanceAmountScreen f180783w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(RemittanceAmountScreen remittanceAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f180783w = remittanceAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f180783w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(this.f180783w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            case 2:
                o oVar3 = new o(this.f180783w, continuation, 2);
                oVar3.v = obj2;
                return oVar3;
            case 3:
                o oVar4 = new o(this.f180783w, continuation, 3);
                oVar4.v = obj2;
                return oVar4;
            case 4:
                o oVar5 = new o(this.f180783w, continuation, 4);
                oVar5.v = obj2;
                return oVar5;
            case 5:
                o oVar6 = new o(this.f180783w, continuation, 5);
                oVar6.v = obj2;
                return oVar6;
            default:
                o oVar7 = new o(this.f180783w, continuation, 6);
                oVar7.v = obj2;
                return oVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((kq2.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((o) create((kq2.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((o) create((RemittanceRouteId) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((o) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((o) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((yof.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        rp0.y yVarC;
        int i = this.u;
        Continuation continuation = null;
        RemittanceAmountScreen remittanceAmountScreen = this.f180783w;
        switch (i) {
            case 0:
                f4 focusData = (f4) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0VarT2 = remittanceAmountScreen.T2();
                Intrinsics.h(focusData);
                t0 t0Var = (t0) b0VarT2;
                t0Var.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                t0Var.J.b(focusData);
                return Unit.f186387a;
            case 1:
                kq2.c chargeBearer = (kq2.c) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0VarT22 = remittanceAmountScreen.T2();
                Intrinsics.h(chargeBearer);
                t0 t0Var2 = (t0) b0VarT22;
                t0Var2.getClass();
                Intrinsics.checkNotNullParameter(chargeBearer, "chargeBearer");
                j60.a.v(t0Var2.E, false, null, 3);
                t0Var2.B2(new e4k.r0(chargeBearer, 1));
                return Unit.f186387a;
            case 2:
                kq2.e transferFeeOptions = (kq2.e) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0VarT23 = remittanceAmountScreen.T2();
                Intrinsics.h(transferFeeOptions);
                t0 t0Var3 = (t0) b0VarT23;
                f2k.k kVar = t0Var3.f180797w;
                Intrinsics.checkNotNullParameter(transferFeeOptions, "transferFeeOptions");
                int i2 = g0.f180765a[transferFeeOptions.f188300a.ordinal()];
                if (i2 == 1) {
                    yVarC = kVar.c();
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yVarC = kVar.a(transferFeeOptions);
                }
                t0Var3.E.x(yVarC);
                return Unit.f186387a;
            case 3:
                RemittanceRouteId routeId = (RemittanceRouteId) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0VarT24 = remittanceAmountScreen.T2();
                Intrinsics.h(routeId);
                t0 t0Var4 = (t0) b0VarT24;
                t0Var4.getClass();
                Intrinsics.checkNotNullParameter(routeId, "routeId");
                j60.a.v(t0Var4.E, false, null, 3);
                t0Var4.B2(new g3k.b(routeId, 1));
                return Unit.f186387a;
            case 4:
                String id10 = (String) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0VarT25 = remittanceAmountScreen.T2();
                Intrinsics.h(id10);
                t0 t0Var5 = (t0) b0VarT25;
                t0Var5.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("ID_FOOTER_KID_ID")) {
                    t0Var5.F.Q();
                    j60.a aVar6 = t0Var5.E;
                    t0Var5.u.getClass();
                    aVar6.x(new rp0.y(zhm.f0.f322471a, new rp0.t(new TextLocalisedClause(R$string.payments_bank_transfer_dialog_warning_not_supported_kid_title, null, null, 14), new TextLocalisedClause(R$string.payments_bank_transfer_dialog_warning_not_supported_kid_description, null, null, 14), null, 28), null, null, null, null, 1020));
                }
                return Unit.f186387a;
            case 5:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0VarT26 = remittanceAmountScreen.T2();
                String amount = charSequence.toString();
                t0 t0Var6 = (t0) b0VarT26;
                t0Var6.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                t0Var6.B2(new k1.a(t0Var6, amount, 11));
                return Unit.f186387a;
            default:
                yof.b payload = (yof.b) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0VarT27 = remittanceAmountScreen.T2();
                Intrinsics.h(payload);
                t0 t0Var7 = (t0) b0VarT27;
                t0Var7.getClass();
                Intrinsics.checkNotNullParameter(payload, "payload");
                t0Var7.l2(new jsl.t0(t0Var7, payload, continuation, 29), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
