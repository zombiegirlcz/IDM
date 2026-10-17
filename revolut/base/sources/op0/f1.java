package op0;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class f1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.widgets.o0 f227245b;

    public /* synthetic */ f1(com.revolut.core.ui_kit.delegates.widgets.o0 o0Var, int i) {
        this.f227244a = i;
        this.f227245b = o0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BaseDraggableWidgetDelegate.a event = (BaseDraggableWidgetDelegate.a) obj2;
        switch (this.f227244a) {
            case 0:
                Intrinsics.checkNotNullParameter(event, "event");
                String strA = event.a();
                koi.j jVar = this.f227245b.e;
                return Boolean.valueOf(Intrinsics.f(strA, jVar != null ? jVar.getF55069b() : null));
            default:
                ood.k kVar = this.f227245b.k;
                if (kVar != null) {
                    Intrinsics.h(event);
                    kVar.invoke(event);
                }
                return Unit.f186387a;
        }
    }
}
