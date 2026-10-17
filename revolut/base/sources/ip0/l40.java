package ip0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepsDelegate;
import com.revolut.core.ui_kit.delegates.PromotionalMediumTileDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class l40 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165128a;

    public /* synthetic */ l40(int i) {
        this.f165128a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        int i = this.f165128a;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof r40);
            case 1:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof u40);
            case 2:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof w40);
            case 3:
                Color.Solid solid = ProgressStepVerticalV2Delegate.i;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ProgressStepVerticalV2Delegate.Model);
            case 4:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ProgressStepsDelegate.Model);
            case 5:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof s50);
            case 6:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.pc);
            case 7:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof b60);
            case 8:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.qc);
            case 9:
                Intrinsics.checkNotNullParameter(data, "model");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.tc);
            case 10:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof PromotionalMediumTileDelegate.Model);
            case 11:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 12:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof PromptContentDelegate.Model);
            case 13:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof q60);
            case 14:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof PromptMarketingContentDelegate.Model);
            case 15:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof x60);
            case 16:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof b70);
            case 17:
                QRCodeDelegate.Companion aVar = QRCodeDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof QRCodeDelegate.Model);
            case 18:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof i70);
            case 19:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof l70);
            case 20:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof p70);
            case 21:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof r70);
            case 22:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof y70);
            case 23:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof t80);
            case 24:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof y80);
            case 25:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof f90);
            case 26:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.ce);
            case 27:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.fe);
            case 28:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof l90);
            default:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof p90);
        }
    }
}
