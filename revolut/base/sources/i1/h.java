package i1;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.revolut.core.ui_kit.internal.views.candlesticks.CandleSticksView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f157524b;

    public /* synthetic */ h(float f, int i) {
        this.f157523a = i;
        this.f157524b = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f157523a;
        float f = this.f157524b;
        switch (i) {
            case 0:
                return PaddingKt.padding_3ABfNKs$lambda$0(f, (InspectorInfo) obj2);
            default:
                rs0.g it8 = (rs0.g) obj2;
                int i2 = CandleSticksView.S;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Integer.valueOf((int) Math.signum(it8.f256919a - f));
        }
    }
}
