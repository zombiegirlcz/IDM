package cvi;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.number_of_travelers_picker.AsftNumberOfTravelersPickerScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mti.n;
import vkm.q;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends oki.h implements dli.b {
    public final AsftNumberOfTravelersPickerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f109477p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pti.k f109478q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f109479r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f109480s;

    public k(AsftNumberOfTravelersPickerScreenContract$InputData inputData, cli.n stateMapper, n terminalsInteractor, pti.k configRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(terminalsInteractor, "terminalsInteractor");
        Intrinsics.checkNotNullParameter(configRepository, "configRepository");
        this.o = inputData;
        this.f109477p = terminalsInteractor;
        this.f109478q = configRepository;
        this.f109479r = new vii.b();
        this.f109480s = mra.d.b(this, new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.f98900c), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f109479r, new i(continuation, this, 0)), null, null, new j(this, continuation, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f109480s;
    }
}
