package l2c;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.data.model.Data;
import ip0.p70;
import ip0.s7;
import ip0.v7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements cli.n {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f191764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jub.a f191765b;

    public x(gte.a featureToggleInteractor, jub.a revPointsDisclaimerProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsDisclaimerProvider, "revPointsDisclaimerProvider");
        this.f191764a = featureToggleInteractor;
        this.f191765b = revPointsDisclaimerProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static aim.e a(com.revolut.feature.rev_points.models.SpareChangeCalculations r33, int r34, com.revolut.feature.rev_points.models.RevPointsProductRate r35) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2c.x.a(com.revolut.feature.rev_points.models.SpareChangeCalculations, int, com.revolut.feature.rev_points.models.RevPointsProductRate):aim.e");
    }

    public static aim.e b() {
        aim.e eVarB = zhm.u.b();
        eVarB.add(new p70("SPARE_CHANGE_FM_RADIAL_SLIDER_ITEM_ID", 1));
        v7.C("SPARE_CHANGE_SUBHEADER_LOADING_ITEM_ID", 0, 0, 30, eVarB);
        IntRange intRangeO = kotlin.ranges.f.o(0, 3);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(new s7(a0.d.n("SPARE_CHANGE_CELL_DELEGATE_LOADING_ITEM_ID_", it8.nextInt()), 0, 0, 0, 0, false, null, 126));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        return zhm.u.a(eVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0101  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r22) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2c.x.c(cli.j):cli.o");
    }

    public final CompositeClause d(Data data) {
        if (data.getContent() == null && data.getLoading() && data.getError() == null) {
            return null;
        }
        return ((ryb.b) this.f191765b).c((l71.d) data.getContent());
    }
}
