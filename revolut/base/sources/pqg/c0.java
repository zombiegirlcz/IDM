package pqg;

import com.revolut.feature.retail.savings.api.documents.navigation.SavingsDocumentLauncherDestination;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(i0 i0Var, Continuation continuation) {
        super(1, continuation);
        this.v = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        i0 i0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            efm.d0 d0VarC2 = i0Var.C2();
            this.u = 1;
            obj2 = nim.a.b(d0VarC2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        SavingsProductData savingsProductData = (SavingsProductData) ((od0.i) obj2).g();
        if (savingsProductData == null) {
            return null;
        }
        SavingsProduct savingsProduct = savingsProductData.f86683a;
        SavingsProduct.Protection protection = savingsProduct.f;
        SavingsDocument savingsDocument = protection != null ? protection.e : null;
        if (savingsDocument != null) {
            return i0Var.C1(new SavingsDocumentLauncherDestination(savingsDocument));
        }
        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Protection or document for product with id:", savingsProduct.f86617a, " is null"));
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return Unit.f186387a;
    }
}
