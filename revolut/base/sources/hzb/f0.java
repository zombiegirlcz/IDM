package hzb;

import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f0 extends kotlin.jvm.internal.q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        RevPointsSpareChangeControllerApi$Result p0 = (RevPointsSpareChangeControllerApi$Result) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((com.revolut.feature.rev_points.impl.ui.earn.b) this.receiver).J2(p0);
        return Unit.f186387a;
    }
}
