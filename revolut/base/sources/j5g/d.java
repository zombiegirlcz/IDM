package j5g;

import b4g.o0;
import cli.g;
import cli.k;
import cli.y;
import cli.z;
import com.revolut.feature.travel.flights.impl.ui.screen.chat_redirect.TravelFlightsChatRedirectScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends h implements z {
    public final TravelFlightsChatRedirectScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0 f171630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f171631q;

    public d(e stateMapper, TravelFlightsChatRedirectScreenContract$InputData inputData, o0 repository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.o = inputData;
        this.f171630p = repository;
        this.f171631q = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f171631q;
    }
}
