package un8;

import com.revolut.feature.junior_settings.impl.services.JuniorSettingsSignInService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th6.p;
import umd.n;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorSettingsSignInService f281373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f281374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f281375c;

    public k(JuniorSettingsSignInService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f281373a = service;
        this.f281374b = memoryCache;
        this.f281375c = storage;
        Continuation continuation = null;
        new x4l.c(new p(this, continuation, 8), new um7.d(this, 6), new n(this, 3), new uf0.d(this, continuation, 22), new sne.e(this, continuation, 13));
    }
}
