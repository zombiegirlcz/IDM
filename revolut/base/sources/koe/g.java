package koe;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.tax_residency.impl.screens.list.TaxResidencyListScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) obj2;
        n nVar = (n) this.receiver;
        KProperty[] kPropertyArr = TaxResidencyListScreen.V;
        com.revolut.feature.tax_residency.impl.screens.list.a aVar = (com.revolut.feature.tax_residency.impl.screens.list.a) nVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        aVar.l2(new a31.v(aVar, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
