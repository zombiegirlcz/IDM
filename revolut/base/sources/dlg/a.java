package dlg;

import a08.d;
import com.revolut.feature.us_direct_deposit.DirectDepositFlowDestination;
import efm.d0;
import jf0.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import q06.h;
import sri.m;
import ukg.b;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f115765a;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f115765a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "auto-direct-deposit");
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        return new h(DirectDepositFlowDestination.f94577a, null);
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        z zVarD = new pfm.h(new d(this, 10), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
