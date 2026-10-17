package wtk;

import fmc.z;
import ip0.s7;
import ip0.yl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f300024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f300025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f300026c;

    public r(q annualReturnHeaderMapper, p annualReturnGaugeLinearMapper, z chartMapper) {
        Intrinsics.checkNotNullParameter(annualReturnHeaderMapper, "annualReturnHeaderMapper");
        Intrinsics.checkNotNullParameter(annualReturnGaugeLinearMapper, "annualReturnGaugeLinearMapper");
        Intrinsics.checkNotNullParameter(chartMapper, "chartMapper");
        this.f300024a = annualReturnHeaderMapper;
        this.f300025b = annualReturnGaugeLinearMapper;
        this.f300026c = chartMapper;
    }

    public static ArrayList a() {
        List listC = zhm.u.c(new yl("header-loading-annual-return", 0, 30));
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(new s7(a0.d.n("cell-loading-annual-return-", i), 0, 0, 0, 0, false, null, 126));
        }
        return d0.E0(arrayList, listC);
    }
}
