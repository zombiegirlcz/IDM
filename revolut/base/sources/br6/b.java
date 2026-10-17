package br6;

import com.revolut.core.backend_flow.api.navigation.BackendFlowDestination;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.util.Set;
import jf0.c;
import kotlin.collections.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import q06.h;
import sri.m;
import ue0.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements tq6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f17933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f17934b;

    public b(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f17933a = navigator;
        String[] elements = {"form", "app-form"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f17934b = d.y0(elements);
    }

    public static FeatureCommand b(c cVar) {
        return new FeatureCommand(new KompotOverlayFeatureConfig(new BackendFlowDestination(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, cVar.e(2), cVar.d, null, 4)), yhi.b.SOLID, (Integer) null, 12));
    }

    @Override // jf0.d, q06.k
    public final boolean a(c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return this.f17934b.contains(deeplink.e(1));
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        return new h(new BridgeDestination(b(cVar)), new q06.b(ibb.c.f160140a, null));
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        z zVarD = new pfm.h(new a(this, deeplink, z, 0), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return e.F(zVarD, Boolean.FALSE);
    }
}
