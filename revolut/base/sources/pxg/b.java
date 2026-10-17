package pxg;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChartPoint;
import d9.e1;
import hw0.k;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kxg.b f240618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mxg.a f240619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nxg.a f240620c;

    public b(kxg.b chartMapper, mxg.a yBadgeMapper, nxg.a levelLinesMapper) {
        Intrinsics.checkNotNullParameter(chartMapper, "chartMapper");
        Intrinsics.checkNotNullParameter(yBadgeMapper, "yBadgeMapper");
        Intrinsics.checkNotNullParameter(levelLinesMapper, "levelLinesMapper");
        this.f240618a = chartMapper;
        this.f240619b = yBadgeMapper;
        this.f240620c = levelLinesMapper;
    }

    public static ArrayList a(List list, boolean z, float f, float f4, Function1 function1) {
        Float fValueOf;
        Clause textClause;
        BigDecimal bigDecimalZ;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            k kVar = null;
            if (i < 0) {
                v.s();
                throw null;
            }
            PerformanceChartPoint performanceChartPoint = (PerformanceChartPoint) obj2;
            float f5 = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                fValueOf = Float.valueOf(f5);
            } else {
                Float f6 = (Float) function1.invoke(performanceChartPoint);
                if (f6 != null) {
                    float fFloatValue = f6.floatValue();
                    if (f != f4) {
                        f5 = (fFloatValue - f) / (f4 - f);
                    }
                    fValueOf = Float.valueOf(f5);
                } else {
                    fValueOf = null;
                }
            }
            if (fValueOf != null) {
                float fFloatValue2 = fValueOf.floatValue();
                float fJ = i / v.j(list);
                if (z) {
                    textClause = new PercentageClause(e1.Z(new BigDecimal(0)), (PercentageClause.Format) null, (Style) null, 6);
                } else {
                    Float f32 = (Float) function1.invoke(performanceChartPoint);
                    textClause = (f32 == null || (bigDecimalZ = e1.Z(new BigDecimal(String.valueOf(f32.floatValue())))) == null) ? new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new PercentageClause(bigDecimalZ, (PercentageClause.Format) null, (Style) null, 6);
                }
                kVar = new k(fFloatValue2, fJ, null, performanceChartPoint, textClause, 41);
            }
            if (kVar != null) {
                arrayList.add(kVar);
            }
            i = i2;
        }
        return arrayList;
    }
}
