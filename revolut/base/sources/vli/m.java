package vli;

import com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import wp5.y;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements jf0.d, q06.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f290473a;

    public m(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f290473a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "stories") && !Intrinsics.f(cVar.d.get("version"), "2");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        Regex regex = jf0.f.f173632a;
        return new q06.h(new BridgeDestination(new FeatureCommand(new RemoteStoriesFeatureConfig.Deeplink(u.c(jf0.f.a(cVar.f173627a))))), new q06.b(ibb.c.f160140a, null));
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new a6j.b(this, deeplink, z, 18), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
