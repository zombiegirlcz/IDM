package ag1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.add.new_product.impl.ui.add_new_product_group.AddNewProductGroupScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        c cVar = (c) this.receiver;
        KProperty[] kPropertyArr = AddNewProductGroupScreen.R;
        o oVar = (o) cVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        qf1.j jVar = obj4 instanceof qf1.j ? (qf1.j) obj4 : null;
        if (jVar instanceof qf1.h) {
            oVar.C1(((qf1.h) jVar).f245217a);
        } else if (jVar instanceof qf1.i) {
            oVar.l2(new n(oVar, (qf1.i) jVar, null), new yi5.b(26));
        } else if (jVar instanceof qf1.g) {
            yji.l.j2(oVar, oVar.e1(((qf1.g) jVar).f245216a), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        } else {
            hx7.e.n(new IllegalStateException(model.u + " can't be cast to a NavigationDestination"));
        }
        return Unit.f186387a;
    }
}
