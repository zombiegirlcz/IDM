package z0c;

import cli.n;
import cli.y;
import com.revolut.feature.rev_points.impl.ui.trophy_room.highlights_sharing.RevPointsTrophyRoomHighlightsSharingScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends oki.h implements e {

    @NotNull
    public static final g Companion = new g();
    public final nad.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f318210p;

    public i(n stateMapper, RevPointsTrophyRoomHighlightsSharingScreenContract$InputData inputData, nad.c shareMediaInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shareMediaInteractor, "shareMediaInteractor");
        this.o = shareMediaInteractor;
        this.f318210p = mra.d.b(this, new d(inputData.f83920b, inputData.f83919a, f0.f322471a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new yl6.b(this, null, 23), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f318210p;
    }
}
