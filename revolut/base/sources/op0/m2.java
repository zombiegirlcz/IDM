package op0;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class m2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.widgets.i2 f227351b;

    public /* synthetic */ m2(com.revolut.core.ui_kit.delegates.widgets.i2 i2Var, int i) {
        this.f227350a = i;
        this.f227351b = i2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BaseDraggableWidgetDelegate.a event = (BaseDraggableWidgetDelegate.a) obj2;
        switch (this.f227350a) {
            case 0:
                Intrinsics.checkNotNullParameter(event, "event");
                String strA = event.a();
                koi.j jVar = this.f227351b.e;
                return Boolean.valueOf(Intrinsics.f(strA, jVar != null ? jVar.getF55069b() : null));
            default:
                ood.k kVar = this.f227351b.f55380l;
                if (kVar != null) {
                    Intrinsics.h(event);
                    kVar.invoke(event);
                }
                return Unit.f186387a;
        }
    }
}
