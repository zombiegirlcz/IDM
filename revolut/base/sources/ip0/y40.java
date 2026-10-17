package ip0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class y40 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProgressStepVerticalV2Delegate.Model f167248b;

    public /* synthetic */ y40(ProgressStepVerticalV2Delegate.Model model, int i) {
        this.f167247a = i;
        this.f167248b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f167247a;
        ProgressStepVerticalV2Delegate.Model model = this.f167248b;
        Unit it8 = (Unit) obj2;
        switch (i) {
            case 0:
                Color.Solid solid = ProgressStepVerticalV2Delegate.i;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 1:
                Color.Solid solid2 = ProgressStepVerticalV2Delegate.i;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Color.Solid solid3 = ProgressStepVerticalV2Delegate.i;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return model;
    }
}
