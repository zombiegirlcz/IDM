package y5g;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.impl.ui.screen.documents.TravelFlightsDocumentsScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import y4f.o;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends oki.h implements h {

    @NotNull
    public static final j Companion = new j();
    public final h4g.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tqi.e f311084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f311085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f311086r;

    public k(m stateMapper, TravelFlightsDocumentsScreenContract$InputData inputData, h4g.e documentsInteractor, tqi.e shareExternalDestinationFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(documentsInteractor, "documentsInteractor");
        Intrinsics.checkNotNullParameter(shareExternalDestinationFactory, "shareExternalDestinationFactory");
        this.o = documentsInteractor;
        this.f311084p = shareExternalDestinationFactory;
        this.f311085q = new vii.b();
        this.f311086r = mra.d.b(this, new g(inputData.f93338a, new n7g.b(false), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public static final String I2(k kVar, n7g.c cVar) {
        if (cVar instanceof n7g.b) {
            return "FLIGHTS_DOCUMENT_DOWNLOAD";
        }
        if (cVar instanceof n7g.a) {
            return j6.a.q("FLIGHTS_RECEIPT_DOWNLOAD_", ((n7g.a) cVar).f213087a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new xb4.e(this, continuation, 27), new yi5.b(26));
        yji.l.a1(this, q.Q(this.f311085q, new o(continuation, this, 3)), null, null, new xv4.o(this, continuation, 25), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f311086r;
    }
}
