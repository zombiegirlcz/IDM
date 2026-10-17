package vvf;

import cli.y;
import com.revolut.feature.transport.impl.ui.extend.ExtendTicketScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends oki.h implements g {
    public final ivf.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ExtendTicketScreenContract$InputData f292538p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f292539q;

    public k(ivf.e extendTicketInteractor, ExtendTicketScreenContract$InputData inputData, l stateMapper) {
        Intrinsics.checkNotNullParameter(extendTicketInteractor, "extendTicketInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = extendTicketInteractor;
        this.f292538p = inputData;
        this.f292539q = mra.d.b(this, new f(inputData.f92518b, null), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f292539q;
    }
}
