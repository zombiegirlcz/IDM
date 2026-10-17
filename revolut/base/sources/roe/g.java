package roe;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.chooser.ChooserConfiguration;
import com.revolut.feature.chooser.ChooserScreenContract$Model;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreen;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreenContract$DomainDataItem;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qi3.t;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxNumberInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TaxNumberInputScreen taxNumberInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxNumberInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? arrayList;
        List list;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarI3 = this.v.T2();
        Intrinsics.h(model);
        com.revolut.feature.tax_residency.impl.screens.tin.c cVar = (com.revolut.feature.tax_residency.impl.screens.tin.c) kVarI3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52580a, "REGIMES_LIST_ID")) {
            t.Companion.getClass();
            ExplicitActivityDestination explicitActivityDestination = com.revolut.feature.chooser.b.f65915b;
            TaxNumberInputScreenContract$DomainDataItem.TaxRegime taxRegime = ((com.revolut.feature.tax_residency.impl.screens.tin.a) cVar.t2()).d;
            if (taxRegime == null || (list = taxRegime.f90113a) == null) {
                arrayList = f0.f322471a;
            } else {
                List<String> list2 = list;
                arrayList = new ArrayList(w.t(list2, 10));
                for (String str : list2) {
                    arrayList.add(new ChooserScreenContract$Model(str, str, null, null, null, null, false, null, 32764));
                }
            }
            cVar.C1(new BridgeDestination(new ActivityNavigateCommand(explicitActivityDestination, new ChooserConfiguration(arrayList, null, null, false, null, null, true, 0, null, false, 15102), null, 1000, 0, null, null, null, null, false, 1012)));
        }
        return Unit.f186387a;
    }
}
