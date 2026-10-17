package psf;

import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import gc0.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    public static final C1323a Companion = new C1323a();

    /* JADX INFO: renamed from: psf.a$a, reason: collision with other inner class name */
    public static final class C1323a {
        private C1323a() {
        }
    }

    public static BridgeDestination a() {
        od0.a aVar = od0.a.f224253a;
        return new BridgeDestination(c.f(new FaqFeatureConfig.Starter(od0.a.e() ? "bae6380c-0b11-4f47-b05a-479d75d9dfa5" : "f37e7958-73be-4cad-8def-1730cb1898a8", 2)));
    }
}
