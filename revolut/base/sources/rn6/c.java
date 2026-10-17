package rn6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.external_accounts.impl.ui.link.screens.branches.BranchesScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        g gVar = (g) this.receiver;
        KProperty[] kPropertyArr = BranchesScreen.R;
        i iVar = (i) gVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        if (!(obj4 instanceof ho3.a)) {
            obj4 = null;
        }
        ho3.a aVar = (ho3.a) obj4;
        if (aVar != null) {
            iVar.C2(new e(aVar));
        }
        return Unit.f186387a;
    }
}
