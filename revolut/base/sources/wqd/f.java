package wqd;

import cli.y;
import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.models.ScoreCardType;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import oki.h;
import wm9.k;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends h implements ali.h {
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ali.b f299441p;

    public f(d inputData, g stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new c(ScoreCardType.a(), inputData.f299439a.name()), stateMapper, null, false, 12);
        this.f299441p = s.b(this, new k(19));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f299441p;
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.o;
    }
}
