package op0;

import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.VoucherExtraSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o10.c f227262b;

    public /* synthetic */ g(o10.c cVar, int i) {
        this.f227261a = i;
        this.f227262b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f227261a) {
            case 0:
                ReferralContactDelegate.Model model = (ReferralContactDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                return new com.revolut.core.ui_kit.delegates.widgets.e(((GridWidgetDelegate.Model) this.f227262b.invoke()).getF55069b(), model);
            case 1:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "model");
                return new s0(((GridWidgetDelegate.Model) this.f227262b.invoke()).getF55069b());
            case 2:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "model");
                return new r0(((GridWidgetDelegate.Model) this.f227262b.invoke()).getF55069b());
            case 3:
                ty0.a model2 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                return new q0(((GridWidgetDelegate.Model) this.f227262b.invoke()).getF55069b(), model2);
            case 4:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "model");
                return new p0(((GridWidgetDelegate.Model) this.f227262b.invoke()).getF55069b());
            case 5:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "model");
                return new com.revolut.core.ui_kit.delegates.widgets.w0(((GridWidgetDelegate.Model) this.f227262b.invoke()).getF55069b());
            case 6:
                IconDelegate.Model model3 = (IconDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model3, "model");
                return new com.revolut.core.ui_kit.delegates.widgets.j2(((GridWidgetDelegate.Model) this.f227262b.invoke()).getF55069b(), model3);
            case 7:
                SmallCardDelegate.Model model4 = (SmallCardDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model4, "model");
                return new com.revolut.core.ui_kit.delegates.widgets.i4(((GridWidgetDelegate.Model) this.f227262b.invoke()).getF55069b(), model4);
            default:
                VoucherExtraSmallTileDelegate.Model model5 = (VoucherExtraSmallTileDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model5, "model");
                return new com.revolut.core.ui_kit.delegates.widgets.j4(((GridWidgetDelegate.Model) this.f227262b.invoke()).getF55069b(), model5);
        }
    }
}
