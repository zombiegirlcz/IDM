package j3i;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.material.TextFieldKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import com.revolut.core.ui_kit.internal.views.barchart.BarChartView;
import com.revolut.core.ui_kit.internal.views.candlesticks.CandleSticksView;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerControllerContract$Limit;
import com.youTransactor.uCube.rpc.Constants;
import ip0.u3;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f171208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f171209c;

    public /* synthetic */ n(float f, BorderStroke borderStroke) {
        this.f171207a = 5;
        this.f171208b = f;
        this.f171209c = borderStroke;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f171207a) {
            case 0:
                hw0.q qVar = (hw0.q) this.f171209c;
                k update = (k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                hw0.q qVar2 = hw0.q.HIGHEST;
                float f = this.f171208b;
                if (qVar == qVar2) {
                    ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit = update.f171198b;
                    return k.a(update, null, chartLimitPickerControllerContract$Limit != null ? ChartLimitPickerControllerContract$Limit.a(chartLimitPickerControllerContract$Limit, false, f, 13) : null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
                }
                ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit2 = update.f171197a;
                return k.a(update, chartLimitPickerControllerContract$Limit2 != null ? ChartLimitPickerControllerContract$Limit.a(chartLimitPickerControllerContract$Limit2, false, f, 13) : null, null, null, null, null, 254);
            case 1:
                jx0.a aVar = (jx0.a) this.f171209c;
                qta.d data = (qta.d) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                List list = data.e;
                aVar.getClass();
                return qta.d.a(data, jx0.a.A(this.f171208b, jx0.a.z(list)));
            case 2:
                return BarChartView.a((BarChartView) this.f171209c, this.f171208b, (u3) obj2);
            case 3:
                ArrayList arrayList = ((CandleSticksView) this.f171209c).f56570l;
                int iIntValue = ((Integer) obj2).intValue();
                if (iIntValue == 0) {
                    return (rs0.g) arrayList.get(iIntValue);
                }
                float f4 = ((rs0.g) arrayList.get(iIntValue)).f256919a;
                float f5 = this.f171208b;
                int i = iIntValue - 1;
                return f4 - f5 < (-(((rs0.g) arrayList.get(i)).f256919a - f5)) ? (rs0.g) arrayList.get(iIntValue) : (rs0.g) arrayList.get(i);
            case 4:
                String str = (String) this.f171209c;
                t27.i update2 = (t27.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return t27.i.a(update2, null, null, str, this.f171208b, 3);
            default:
                return TextFieldKt.drawIndicatorLine$lambda$0(this.f171208b, (BorderStroke) this.f171209c, (ContentDrawScope) obj2);
        }
    }

    public /* synthetic */ n(Object obj2, float f, int i) {
        this.f171207a = i;
        this.f171209c = obj2;
        this.f171208b = f;
    }
}
