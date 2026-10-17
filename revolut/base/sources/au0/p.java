package au0;

import com.revolut.core.ui_kit.internal.views.navbar.ConstraintHeaderLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintHeaderLayout f9304b;

    public /* synthetic */ p(ConstraintHeaderLayout constraintHeaderLayout, int i) {
        this.f9303a = i;
        this.f9304b = constraintHeaderLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f9303a;
        ConstraintHeaderLayout constraintHeaderLayout = this.f9304b;
        switch (i) {
            case 0:
                return zhm.v.k(constraintHeaderLayout.F, constraintHeaderLayout.G, constraintHeaderLayout.K);
            case 1:
                ihm.f fVar = constraintHeaderLayout.f57248m;
                Unit unit = Unit.f186387a;
                fVar.onNext(unit);
                return unit;
            default:
                return constraintHeaderLayout.F.getBackgroundAnimationCutoutReceiver();
        }
    }
}
