package op0;

import com.revolut.core.ui_kit.delegates.DetailGridItemDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.widgets.p4 f227371b;

    public /* synthetic */ o4(com.revolut.core.ui_kit.delegates.widgets.p4 p4Var, int i) {
        this.f227370a = i;
        this.f227371b = p4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String f53900a;
        switch (this.f227370a) {
            case 0:
                DetailGridItemDelegate.Model model = (DetailGridItemDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                koi.j jVar = this.f227371b.e;
                if (jVar == null || (f53900a = jVar.getF53900a()) == null) {
                    f53900a = "";
                }
                return new com.revolut.core.ui_kit.delegates.widgets.m4(model.f52184j, f53900a, model.f52179a);
            case 1:
                BaseDraggableWidgetDelegate.a event = (BaseDraggableWidgetDelegate.a) obj2;
                Intrinsics.checkNotNullParameter(event, "event");
                String strA = event.a();
                koi.j jVar2 = this.f227371b.e;
                return Boolean.valueOf(Intrinsics.f(strA, jVar2 != null ? jVar2.getF53900a() : null));
            default:
                BaseDraggableWidgetDelegate.a aVar = (BaseDraggableWidgetDelegate.a) obj2;
                ood.k kVar = this.f227371b.f55472p;
                if (kVar != null) {
                    Intrinsics.h(aVar);
                    kVar.invoke(aVar);
                }
                return Unit.f186387a;
        }
    }
}
