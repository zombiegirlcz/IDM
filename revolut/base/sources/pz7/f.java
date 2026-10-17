package pz7;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import ip0.zj;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f240905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f240906c;

    public /* synthetic */ f(c cVar, h hVar, int i) {
        this.f240904a = i;
        this.f240905b = cVar;
        this.f240906c = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f240904a) {
            case 0:
                r error = (r) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                c cVar = this.f240905b;
                h hVar = this.f240906c;
                break;
            case 1:
                this.f240906c.f240910m.getClass();
                zj zjVar = zj.REGULAR;
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zjVar, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), false, null, null, false, 0, 0, 31684);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                ((BaseLayoutBuilderFragment) this.f240905b).setItems(u.c(model));
                break;
            default:
                this.f240906c.f240910m.getClass();
                ((BaseLayoutBuilderFragment) this.f240905b).setItems(qz7.a.a());
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ f(h hVar, c cVar) {
        this.f240904a = 0;
        this.f240906c = hVar;
        this.f240905b = cVar;
    }
}
