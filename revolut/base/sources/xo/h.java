package xo;

import com.revolut.core.backend_flow.api.navigation.BackendFlowDestination;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ui0.d f307538a;

    public h(ui0.d appVersion, ui0.f versionCode, vo.a formIdProvider) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(versionCode, "versionCode");
        Intrinsics.checkNotNullParameter(formIdProvider, "formIdProvider");
        this.f307538a = appVersion;
    }

    public final Map a() {
        return r0.k(new Pair("appVersion", this.f307538a.b()), new Pair("buildNumber", String.valueOf(1030151101)), new Pair("state", "created"), new Pair("platform", "Android"));
    }

    public final KompotOverlayFeatureConfig b() {
        return new KompotOverlayFeatureConfig(new BackendFlowDestination(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, od0.a.e() ? "7771e06c-c299-44e1-84f8-74ef4ca87dca" : "43ca975b-0e72-41e8-9300-d63091c2a0d0", a(), null, 4)), yhi.b.SOLID, (Integer) null, 12);
    }
}
