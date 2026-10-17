package gdc;

import android.content.Context;
import cli.y;
import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodScreen;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddPaymentMethodScreen f143133b;

    public /* synthetic */ g(AddPaymentMethodScreen addPaymentMethodScreen, int i) {
        this.f143132a = i;
        this.f143133b = addPaymentMethodScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f143132a;
        AddPaymentMethodScreen addPaymentMethodScreen = this.f143133b;
        switch (i) {
            case 0:
                String updatedCvv = (String) obj2;
                AddPaymentMethodScreen.a aVar = AddPaymentMethodScreen.Companion;
                Intrinsics.checkNotNullParameter(updatedCvv, "it");
                com.revolut.feature.revolutpay.shared.ui.add_payment_method.c cVar = (com.revolut.feature.revolutpay.shared.ui.add_payment_method.c) addPaymentMethodScreen.e3();
                cVar.getClass();
                Intrinsics.checkNotNullParameter(updatedCvv, "updatedCvv");
                cVar.H2(cVar.u, new g58.h(updatedCvv, 6));
                return Unit.f186387a;
            case 1:
                String updatedCardholderName = (String) obj2;
                AddPaymentMethodScreen.a aVar2 = AddPaymentMethodScreen.Companion;
                Intrinsics.checkNotNullParameter(updatedCardholderName, "it");
                com.revolut.feature.revolutpay.shared.ui.add_payment_method.c cVar2 = (com.revolut.feature.revolutpay.shared.ui.add_payment_method.c) addPaymentMethodScreen.e3();
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(updatedCardholderName, "updatedCardholderName");
                cVar2.H2(cVar2.u, new g58.h(updatedCardholderName, 7));
                return Unit.f186387a;
            case 2:
                String updatedPostcode = (String) obj2;
                AddPaymentMethodScreen.a aVar3 = AddPaymentMethodScreen.Companion;
                Intrinsics.checkNotNullParameter(updatedPostcode, "it");
                com.revolut.feature.revolutpay.shared.ui.add_payment_method.c cVar3 = (com.revolut.feature.revolutpay.shared.ui.add_payment_method.c) addPaymentMethodScreen.e3();
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(updatedPostcode, "updatedPostcode");
                y yVar = cVar3.u;
                com.revolut.feature.revolutpay.shared.ui.add_payment_method.a aVar4 = ((k) ((j2) yVar.f22677a).getValue()).d;
                l lVar = aVar4 instanceof l ? (l) aVar4 : null;
                if (lVar != null) {
                    cVar3.H2(yVar, new gbi.c(updatedPostcode, lVar));
                }
                return Unit.f186387a;
            default:
                Context it8 = (Context) obj2;
                AddPaymentMethodScreen.a aVar5 = AddPaymentMethodScreen.Companion;
                Intrinsics.checkNotNullParameter(it8, "it");
                ScreenGridLayoutManager screenGridLayoutManager = new ScreenGridLayoutManager(addPaymentMethodScreen.m2(), 2, 8);
                screenGridLayoutManager.setSpanSizeLookup(new i());
                return screenGridLayoutManager;
        }
    }
}
