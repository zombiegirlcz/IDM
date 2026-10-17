package in0;

import com.google.gson.reflect.TypeToken;
import ijj.r;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f162573g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f162574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b70.e f162575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pn0.c f162576c;
    public final CoroutineScope d;
    public final re0.c e;
    public final e0m.b f;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f162573g = kotlin.time.c.g(100, pkm.e.MILLISECONDS);
    }

    public d(j memoryCache, ue0.c storage, b70.e accessibilityDataProvider, fn0.a securityGuardianInteractor, pn0.c signatureProvider, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(accessibilityDataProvider, "accessibilityDataProvider");
        Intrinsics.checkNotNullParameter(securityGuardianInteractor, "securityGuardianInteractor");
        Intrinsics.checkNotNullParameter(signatureProvider, "signatureProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f162574a = memoryCache;
        this.f162575b = accessibilityDataProvider;
        this.f162576c = signatureProvider;
        this.d = coroutineScope;
        re0.d dVar = new re0.d(memoryCache, storage);
        im3.e eVar = new im3.e(10);
        r rVar = new r(17);
        r rVar2 = new r(18);
        e6d.f fVar = new e6d.f(this, null, 26);
        Type type = new TypeToken<Boolean>() { // from class: com.revolut.core.security.screen.AccessibilityServicesTrustManagerImpl$special$$inlined$invoke$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.e = new re0.c(dVar, eVar, type, rVar, rVar2, fVar);
        this.f = new e0m.b(new ie7.a(this, 3));
    }

    @Override // e0m.d
    public final void init() {
        this.f.init();
    }
}
