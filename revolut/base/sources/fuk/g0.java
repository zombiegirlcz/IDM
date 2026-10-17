package fuk;

import ip0.v3;
import ip0.w3;
import ip0.x3;
import ip0.z3;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v3 f138236b = new v3("seriesId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v3 f138237c = new v3("secondBarChartSeriesId");
    public static final v3 d = new v3("lineSeriesId");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a61.a f138238a;

    public g0(a61.a yAxisLabelsMapper, a0 barTitleBuilder) {
        Intrinsics.checkNotNullParameter(yAxisLabelsMapper, "yAxisLabelsMapper");
        Intrinsics.checkNotNullParameter(barTitleBuilder, "barTitleBuilder");
        this.f138238a = yAxisLabelsMapper;
    }

    public static z3 a(Map map, Pair pair) {
        w3 w3Var;
        BigDecimal bigDecimal;
        huk.b bVar = (huk.b) map.get(pair);
        Float fValueOf = (bVar == null || (bigDecimal = bVar.f155706c) == null) ? null : Float.valueOf(bigDecimal.floatValue());
        huk.b bVar2 = (huk.b) map.get(pair);
        if (bVar2 != null) {
            int i = e0.f138233a[bVar2.d.ordinal()];
            if (i == 1) {
                w3Var = w3.DEFAULT;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                w3Var = w3.DIMMED;
            }
        } else {
            w3Var = null;
        }
        if (fValueOf == null || w3Var == null) {
            return null;
        }
        return x3.a(z3.Companion, fValueOf.floatValue(), w3Var, null, 4);
    }
}
