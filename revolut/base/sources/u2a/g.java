package u2a;

import cli.y;
import cli.z;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.gallery.TransferPersonalisationGallerySelectorContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import om4.d0;
import qee.s;
import qz0.n;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends h implements z {
    public final TransferPersonalisationGallerySelectorContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0 f276593p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f276594q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f276595r;

    public g(TransferPersonalisationGallerySelectorContract$InputData inputData, d0 personalisationInteractor, n urlImagesRepository, s stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(personalisationInteractor, "personalisationInteractor");
        Intrinsics.checkNotNullParameter(urlImagesRepository, "urlImagesRepository");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f276593p = personalisationInteractor;
        this.f276594q = urlImagesRepository;
        this.f276595r = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, d0.f(this.f276593p, 1), null, null, new tz6.e(this, (Continuation) null, 13), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f276595r;
    }
}
