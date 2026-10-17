package evi;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.time_slot_picker.AsftTimeSlotPickerScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mti.n;
import oki.h;
import prk.o;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends h implements dli.b {
    public final AsftTimeSlotPickerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f129965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nd.n f129966q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f129967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f129968s;

    public g(AsftTimeSlotPickerScreenContract$InputData inputData, cli.n stateMapper, n terminalsInteractor, nd.n filteredTimeSlotsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(terminalsInteractor, "terminalsInteractor");
        Intrinsics.checkNotNullParameter(filteredTimeSlotsProvider, "filteredTimeSlotsProvider");
        this.o = inputData;
        this.f129965p = terminalsInteractor;
        this.f129966q = filteredTimeSlotsProvider;
        this.f129967r = new vii.b();
        this.f129968s = mra.d.b(this, new d(new Data(null, null, true, 3, null), inputData.d, inputData.e), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.b1(this, o.w("AsftTimeSlotPickerScreenModel", "loadTerminalTillFinish", q.Q(this.f129967r, new dz6.n(continuation, this, 22))), null, new enb.f(this, continuation, 28), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f129968s;
    }
}
