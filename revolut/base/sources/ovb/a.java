package ovb;

import aw0.n6;
import cli.y;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.RevPointsExclusiveStoreProductCheckoutScreen;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.a;
import com.revolut.feature.store.core.api.model.StoreProduct;
import com.revolut.feature.store.core.api.model.StoreProductOption;
import com.revolut.feature.terms.api.model.TermsScope;
import ip0.u8;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import om4.m1;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsExclusiveStoreProductCheckoutScreen f230012w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(RevPointsExclusiveStoreProductCheckoutScreen revPointsExclusiveStoreProductCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f230012w = revPointsExclusiveStoreProductCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a(this.f230012w, continuation, 0);
                aVar.v = obj2;
                return aVar;
            case 1:
                a aVar2 = new a(this.f230012w, continuation, 1);
                aVar2.v = obj2;
                return aVar2;
            case 2:
                a aVar3 = new a(this.f230012w, continuation, 2);
                aVar3.v = obj2;
                return aVar3;
            default:
                a aVar4 = new a(this.f230012w, continuation, 3);
                aVar4.v = obj2;
                return aVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 4;
        Continuation continuation = null;
        RevPointsExclusiveStoreProductCheckoutScreen revPointsExclusiveStoreProductCheckoutScreen = this.f230012w;
        switch (i) {
            case 0:
                u8 model = (u8) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarM3 = revPointsExclusiveStoreProductCheckoutScreen.R2();
                Intrinsics.h(model);
                com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar = (com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d) hVarM3;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                y yVar = dVar.f83612y;
                Integer num = ((e) ((j2) yVar.f22677a).getValue()).f230015c;
                if (num != null) {
                    int iIntValue = num.intValue();
                    StoreProduct storeProduct = (StoreProduct) ((e) ((j2) yVar.f22677a).getValue()).f230013a.getContent();
                    if (storeProduct != null && iIntValue + 1 < storeProduct.k.size()) {
                        dVar.H2(yVar, new l2c.l(iIntValue, i2));
                    }
                }
                break;
            case 1:
                u8 model2 = (u8) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarM32 = revPointsExclusiveStoreProductCheckoutScreen.R2();
                Intrinsics.h(model2);
                com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar2 = (com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d) hVarM32;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                y yVar2 = dVar2.f83612y;
                Integer num2 = ((e) ((j2) yVar2.f22677a).getValue()).f230015c;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    if (iIntValue2 - 1 >= 0) {
                        dVar2.H2(yVar2, new l2c.l(iIntValue2, 5));
                    }
                }
                break;
            case 2:
                n6 n6Var = (n6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarM33 = revPointsExclusiveStoreProductCheckoutScreen.R2();
                String buttonTag = n6Var.f;
                com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar3 = (com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d) hVarM33;
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(buttonTag, "buttonTag");
                y yVar3 = dVar3.f83612y;
                boolean zD = i.d((e) ((j2) yVar3.f22677a).getValue());
                j2 j2Var = (j2) yVar3.f22677a;
                boolean z = ((e) j2Var.getValue()).f230016g;
                if (Intrinsics.f(buttonTag, "PURCHASE_BUTTON_TAG") && zD) {
                    StoreProductOption storeProductOptionC = i.c((e) j2Var.getValue());
                    if (storeProductOptionC != null) {
                        dVar3.l2(new osk.m(dVar3, storeProductOptionC, continuation, i2), new m1(1, dVar3, com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 7));
                    }
                } else if (!Intrinsics.f(buttonTag, "BUY_POINTS_BUTTON_TAG") || zD) {
                    if (Intrinsics.f(buttonTag, "OPT_IN_BUTTON_TAG")) {
                        dVar3.C2(a.d.f83601a);
                    }
                } else if (z) {
                    dVar3.C2(a.C0528a.f83598a);
                } else {
                    dVar3.C2(a.b.f83599a);
                }
                break;
            default:
                ty0.a data = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar4 = (com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d) revPointsExclusiveStoreProductCheckoutScreen.R2();
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                if (Intrinsics.f(data.f275445a, "TERMS_LINK_ID")) {
                    TermsScope.INSTANCE.getClass();
                    dVar4.n2(new oqk.i(dVar4, TermsScope.j0, continuation, 3), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
