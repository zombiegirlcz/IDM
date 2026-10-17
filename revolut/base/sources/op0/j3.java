package op0;

import com.revolut.core.ui_kit.delegates.PhotoBannerLargeDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class j3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.widgets.y2 f227320b;

    public /* synthetic */ j3(com.revolut.core.ui_kit.delegates.widgets.y2 y2Var, int i) {
        this.f227319a = i;
        this.f227320b = y2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f227319a) {
            case 0:
                PhotoBannerLargeDelegate.Model model = (PhotoBannerLargeDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                koi.j jVar = this.f227320b.e;
                if (jVar == null || (f55069b = jVar.getF55069b()) == null) {
                    String f55069b = "";
                }
                break;
            case 1:
                PhotoBannerLargeDelegate.Model model2 = (PhotoBannerLargeDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                koi.j jVar2 = this.f227320b.e;
                if (jVar2 == null || (f55069b = jVar2.getF55069b()) == null) {
                    String f55069b2 = "";
                }
                break;
            case 2:
                BaseDraggableWidgetDelegate.a event = (BaseDraggableWidgetDelegate.a) obj2;
                Intrinsics.checkNotNullParameter(event, "event");
                String strA = event.a();
                koi.j jVar3 = this.f227320b.e;
                break;
            case 3:
                BaseDraggableWidgetDelegate.a aVar = (BaseDraggableWidgetDelegate.a) obj2;
                ood.k kVar = this.f227320b.f55557l;
                if (kVar != null) {
                    Intrinsics.h(aVar);
                    kVar.invoke(aVar);
                }
                break;
            default:
                koi.j jVar4 = (koi.j) obj2;
                PhotoBannerLargeDelegate.Model model3 = jVar4 instanceof PhotoBannerLargeDelegate.Model ? (PhotoBannerLargeDelegate.Model) jVar4 : null;
                com.revolut.core.ui_kit.delegates.widgets.y2 y2Var = this.f227320b;
                PhotoBannerLargeDelegate.Model model4 = y2Var.f55558m;
                if (model3 != model4) {
                    if (model4 != null) {
                        model4.f52912p = false;
                    }
                    if (model3 != null) {
                        model3.f52912p = true;
                    }
                    y2Var.f55558m = model3;
                }
                break;
        }
        return Unit.f186387a;
    }
}
