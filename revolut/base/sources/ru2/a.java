package ru2;

import com.revolut.feature.card.terminate.api.navigation.CardTerminateDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import efm.d0;
import jf0.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import q06.h;
import sri.m;
import wp5.y;
import yhi.b;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements mu2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f257404a;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f257404a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "replace-terminated-card");
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        return new h(new BridgeDestination(vhi.c.c(new CardTerminateDestination(new CardTerminateDestination.InputData(cVar.e(2), cVar.d)), b.SOLID, null, false, 12)), null);
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        z zVarD = new pfm.h(new br6.a(this, deeplink, z, 9), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
