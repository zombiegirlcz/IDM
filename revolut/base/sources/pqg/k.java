package pqg;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreen;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddMoneyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AddMoneyScreen addMoneyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addMoneyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        rp0.y yVarC;
        rp0.y yVarA;
        SavingsProduct savingsProduct;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarT2 = this.v.T2();
        Intrinsics.h(model);
        i0 i0Var = (i0) rVarT2;
        j60.a aVar2 = i0Var.D;
        skb.f fVar = i0Var.C;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51832a;
        rp0.y yVarA2 = null;
        if (Intrinsics.f(str, "SERVICE_FEE_INTEREST_ITEM_LIST_ID")) {
            SavingsProductData savingsProductData = ((o) i0Var.t2()).i;
            if (savingsProductData == null || (savingsProduct = savingsProductData.f86683a) == null) {
                yVarA = rp0.y.a(fVar.d(), null);
            } else {
                ArrayList arrayList = savingsProduct.f86622j;
                if (arrayList.size() == 1) {
                    yVarA = fVar.b((SavingsProduct.Deduction) zhm.d0.b0(arrayList));
                } else {
                    SavingsProductData savingsProductData2 = ((o) i0Var.t2()).i;
                    if (savingsProductData2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    Intrinsics.checkNotNullParameter(savingsProductData2, "<this>");
                    Intrinsics.checkNotNullParameter(savingsProductData2, "<this>");
                    yVarA = fVar.c(new ncd.a(savingsProductData2, null));
                }
            }
            aVar2.x(yVarA);
        } else if (Intrinsics.f(str, "TAX_ITEM_LIST_ID")) {
            SavingsProductData savingsProductData3 = ((o) i0Var.t2()).i;
            if (savingsProductData3 != null) {
                Intrinsics.checkNotNullParameter(savingsProductData3, "<this>");
                if (ocd.c.g(savingsProductData3).size() == 1) {
                    Intrinsics.checkNotNullParameter(savingsProductData3, "<this>");
                    yVarC = fVar.e((ProductGroup.Tax) zhm.d0.b0(ocd.c.g(savingsProductData3)));
                } else {
                    SavingsProductData savingsProductData4 = ((o) i0Var.t2()).i;
                    if (savingsProductData4 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    Intrinsics.checkNotNullParameter(savingsProductData4, "<this>");
                    Intrinsics.checkNotNullParameter(savingsProductData4, "<this>");
                    yVarC = fVar.c(new ncd.a(savingsProductData4, null));
                }
                yVarA2 = yVarC;
            } else {
                SavingsProductData savingsProductData5 = ((o) i0Var.t2()).i;
                if (savingsProductData5 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                rp0.y yVarF = fVar.f(savingsProductData5);
                if (yVarF != null) {
                    yVarA2 = rp0.y.a(yVarF, null);
                }
            }
            if (yVarA2 != null) {
                aVar2.x(yVarA2);
            }
        }
        return Unit.f186387a;
    }
}
