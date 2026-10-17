package kui;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.AsftPassDetailsScreenContract$InputData;
import klf.a3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends oki.h implements dli.b {
    public final AsftPassDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zsi.e f189825p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zsi.i f189826q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f189827r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f189828s;

    public h(AsftPassDetailsScreenContract$InputData inputData, j stateMapper, zsi.e passesInteractor, zsi.i termsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(passesInteractor, "passesInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        this.o = inputData;
        this.f189825p = passesInteractor;
        this.f189826q = termsInteractor;
        this.f189827r = new vii.b();
        AsftPass asftPass = inputData.f98848b;
        this.f189828s = mra.d.b(this, new e(asftPass != null ? new Data(asftPass, null, false, 6, null) : new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f189827r, new a3(continuation, this, 7)), null, null, new krc.h(this, continuation, 10), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f189828s;
    }
}
