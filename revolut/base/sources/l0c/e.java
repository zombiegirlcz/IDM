package l0c;

import com.revolut.feature.rev_points.impl.ui.terms_review.screen.RevPointsReadTermsController;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RevPointsReadTermsController f191210b;

    public /* synthetic */ e(RevPointsReadTermsController revPointsReadTermsController, int i) {
        this.f191209a = i;
        this.f191210b = revPointsReadTermsController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f191209a;
        RevPointsReadTermsController revPointsReadTermsController = this.f191210b;
        switch (i) {
            case 0:
                jyl.a setup = (jyl.a) obj2;
                KProperty[] kPropertyArr = RevPointsReadTermsController.T;
                Intrinsics.checkNotNullParameter(setup, "$this$setup");
                setup.f179521c = false;
                setup.d = new e(revPointsReadTermsController, 1);
                break;
            default:
                Exception error = (Exception) obj2;
                KProperty[] kPropertyArr2 = RevPointsReadTermsController.T;
                Intrinsics.checkNotNullParameter(error, "error");
                u uVar = (u) revPointsReadTermsController.e3();
                uVar.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                uVar.H2(uVar.f191230t, new ab4.q(error, 24));
                break;
        }
        return Unit.f186387a;
    }
}
