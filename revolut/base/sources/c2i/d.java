package c2i;

import com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.OrderTypeDialogContract$DialogParcel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.a0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a f20797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f20798c;

    public /* synthetic */ d(com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a aVar, m mVar, int i) {
        this.f20796a = i;
        this.f20797b = aVar;
        this.f20798c = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f20796a) {
            case 0:
                wd6.h hVar = (wd6.h) obj2;
                com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a aVar = this.f20797b;
                pfm.a aVarT = aVar.T(this.f20798c);
                Intrinsics.h(hVar);
                pfm.a aVarE = aVarT.e(aVar.P(hVar));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            default:
                a0 a0Var = (a0) obj2;
                Intrinsics.checkNotNullParameter(a0Var, "<destruct>");
                boolean z = a0Var.f256040a;
                Object obj3 = a0Var.f256041b;
                com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a aVar2 = this.f20797b;
                return (z || !(obj3 instanceof OrderTypeDialogContract$DialogParcel.TakeProfitStopLoss)) ? (z || !(obj3 instanceof OrderTypeDialogContract$DialogParcel.OrderType)) ? pfm.m.f235744a : new pfm.h(new a08.d(aVar2, 6), 2) : aVar2.T(this.f20798c);
        }
    }
}
