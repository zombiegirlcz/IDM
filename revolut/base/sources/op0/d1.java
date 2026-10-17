package op0;

import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o10.c f227222b;

    public /* synthetic */ d1(o10.c cVar, int i) {
        this.f227221a = i;
        this.f227222b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f227221a) {
            case 0:
                ReferralContactDelegate.Model model = (ReferralContactDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                return new com.revolut.core.ui_kit.delegates.widgets.n0(((HorizontalScrollerWidgetDelegate.Model) this.f227222b.invoke()).getF55069b(), model);
            case 1:
                RowDelegate.Model model2 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                return new n1(model2.u, ((HorizontalScrollerWidgetDelegate.Model) this.f227222b.invoke()).getF55069b(), model2.f53228a);
            case 2:
                RowDelegate.Model model3 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model3, "model");
                return new o1(model3.u, ((HorizontalScrollerWidgetDelegate.Model) this.f227222b.invoke()).getF55069b(), model3.f53228a);
            default:
                ExtraSmallCardDelegate.Model model4 = (ExtraSmallCardDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model4, "model");
                return new com.revolut.core.ui_kit.delegates.widgets.v0(((HorizontalScrollerWidgetDelegate.Model) this.f227222b.invoke()).getF55069b(), model4);
        }
    }
}
