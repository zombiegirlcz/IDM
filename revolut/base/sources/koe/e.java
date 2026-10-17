package koe;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.tax_residency.impl.screens.list.TaxResidencyListScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n nVar = (n) this.receiver;
        KProperty[] kPropertyArr = TaxResidencyListScreen.V;
        ((com.revolut.feature.tax_residency.impl.screens.list.a) nVar).J2((RowDelegate.Model) obj2);
        return Unit.f186387a;
    }
}
