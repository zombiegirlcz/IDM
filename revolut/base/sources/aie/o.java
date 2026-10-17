package aie;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) obj2;
        b bVar = (b) this.receiver;
        KProperty[] kPropertyArr = AccountSpacesScreen.Y;
        com.revolut.feature.tab.accounts.impl.ui.spaces.i iVar = (com.revolut.feature.tab.accounts.impl.ui.spaces.i) bVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        iVar.L2(model.o);
        return Unit.f186387a;
    }
}
