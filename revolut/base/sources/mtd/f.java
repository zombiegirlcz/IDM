package mtd;

import ash.i;
import cli.k;
import cli.n;
import cli.y;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.sheet.TravelRemoveWidgetContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends h implements dli.b {
    public final TravelRemoveWidgetContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f208823p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f208824q;

    public f(n stateMapper, TravelRemoveWidgetContract$InputData inputData, i widgetsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        this.o = inputData;
        this.f208823p = widgetsInteractor;
        this.f208824q = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f208824q;
    }
}
