package t0c;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.impl.ui.trophy_room.bottom_sheet.RevPointsTrophyRoomBottomSheetScreenContract$InputData;
import com.revolut.kompot.common.R$string;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import q06.l;
import t05.m;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends h implements dli.b {
    public final RevPointsTrophyRoomBottomSheetScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f266998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u29.d f266999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f267000r;

    public e(g stateMapper, RevPointsTrophyRoomBottomSheetScreenContract$InputData inputData, l deeplinkRouter, u29.d savingsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(savingsInteractor, "savingsInteractor");
        this.o = inputData;
        this.f266998p = deeplinkRouter;
        this.f266999q = savingsInteractor;
        this.f267000r = mra.d.b(this, new b(0), stateMapper, null, false, 12);
    }

    public static final void I2(e eVar) {
        yji.l.a1(eVar, eVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, null, new m(eVar, null, 2), 3);
    }

    @Override // yji.l
    public final void I1() {
        String product = this.o.f83901a;
        u29.d dVar = this.f266999q;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(product, "product");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, xam.a.h(new u29.c(dVar, product, (Continuation) null, 0), f39.c.b(dVar.f276567b)), new d(this, null, 0), null, new d(this, null, 1), 2);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f267000r;
    }
}
