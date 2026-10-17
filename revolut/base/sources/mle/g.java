package mle;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) obj2;
        i iVar = (i) this.receiver;
        KProperty[] kPropertyArr = InvestSettingsScreen.f0;
        z zVar = (z) iVar;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        zVar.u.f3(model);
        return Unit.f186387a;
    }
}
