package ywi;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.amenities.AirportLoungesAmenitiesScreenContract$InputData;
import dwi.b0;
import jki.h;
import jki.i;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;
import y4f.o;
import yji.l;
import yk6.m;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f317447p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AirportLoungesAmenitiesScreenContract$InputData f317448q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f317449r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f317450s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper, b0 loungesInteractor, AirportLoungesAmenitiesScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(loungesInteractor, "loungesInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f317447p = loungesInteractor;
        this.f317448q = inputData;
        this.f317449r = new e(new Data(null, null, true, 3, null));
        this.f317450s = q.b(0, 7, null);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f317450s, new o(continuation, this, 21)), null, null, new m(this, continuation, 26), 3);
        l2(new y7i.h(this, continuation, 25), new yi5.b(26));
    }

    @Override // jki.g
    public final i r2() {
        return this.f317449r;
    }
}
