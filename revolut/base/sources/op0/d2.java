package op0;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.widgets.e2 f227224b;

    public /* synthetic */ d2(com.revolut.core.ui_kit.delegates.widgets.e2 e2Var, int i) {
        this.f227223a = i;
        this.f227224b = e2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String f55069b;
        switch (this.f227223a) {
            case 0:
                BaseDraggableWidgetDelegate.a event = (BaseDraggableWidgetDelegate.a) obj2;
                Intrinsics.checkNotNullParameter(event, "event");
                String strA = event.a();
                koi.j jVar = this.f227224b.e;
                break;
            case 1:
                BaseDraggableWidgetDelegate.a aVar = (BaseDraggableWidgetDelegate.a) obj2;
                ood.k kVar = this.f227224b.f55344r;
                if (kVar != null) {
                    Intrinsics.h(aVar);
                    kVar.invoke(aVar);
                }
                break;
            default:
                String str = (String) obj2;
                com.revolut.core.ui_kit.delegates.widgets.e2 e2Var = this.f227224b;
                koi.j jVar2 = e2Var.e;
                if (jVar2 != null && (f55069b = jVar2.getF55069b()) != null) {
                    Intrinsics.h(str);
                    com.revolut.core.ui_kit.delegates.widgets.d2 d2Var = new com.revolut.core.ui_kit.delegates.widgets.d2(f55069b, str);
                    ood.k kVar2 = e2Var.f55344r;
                    if (kVar2 != null) {
                        kVar2.invoke(d2Var);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
