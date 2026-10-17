package zc0;

import com.revolut.core.backend_flow.ui.screen.BackendScreenFragment;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BackendScreenFragment f321094b;

    public /* synthetic */ o(BackendScreenFragment backendScreenFragment, int i) {
        this.f321093a = i;
        this.f321094b = backendScreenFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f321093a) {
            case 0:
                ihm.f fVar = this.f321094b.J0;
                Unit unit = Unit.f186387a;
                fVar.onNext(unit);
                return unit;
            default:
                BackendScreen it8 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                efm.r rVarDebounce = this.f321094b.J0.debounce(300L, TimeUnit.MILLISECONDS);
                Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
                return rVarDebounce;
        }
    }
}
