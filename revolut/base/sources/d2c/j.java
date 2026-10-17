package d2c;

import cli.n;
import cli.y;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeDeactivationControllerApi$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p2c.z;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends oki.h implements dli.b, d {

    @NotNull
    public static final g Companion = new g();
    public final RevPointsSpareChangeDeactivationControllerApi$InputData.Confirm o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f110791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rul.e f110792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f110793r;

    public j(n stateMapper, z statusDialogMapper, rul.e revPointsSpareChangeInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        RevPointsSpareChangeDeactivationControllerApi$InputData.Confirm inputData = RevPointsSpareChangeDeactivationControllerApi$InputData.Confirm.f84134a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(statusDialogMapper, "statusDialogMapper");
        Intrinsics.checkNotNullParameter(revPointsSpareChangeInteractor, "revPointsSpareChangeInteractor");
        this.o = inputData;
        this.f110791p = statusDialogMapper;
        this.f110792q = revPointsSpareChangeInteractor;
        this.f110793r = mra.d.b(this, new e(), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f110793r;
    }
}
