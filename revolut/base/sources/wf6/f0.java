package wf6;

import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements ke6.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f296986a;

    public f0(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f296986a = navigator;
    }

    public static NaviCommand b(jf0.c cVar) {
        return kotlin.text.d0.W(cVar.e(2)) ? DummyCommand.f98635a : new FeatureCommand(new ExternalAccountsFeatureConfig.LinkSuccess(cVar.e(2), Intrinsics.f(cVar.d.get("success"), "true")));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "institution-auth-relink");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(new BridgeDestination(b(cVar)), null);
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        pfm.z zVarD = new pfm.h(new v3e.t(this, deeplink, 20), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
