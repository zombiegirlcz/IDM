package em0;

import dm0.d;
import kotlin.jvm.internal.Intrinsics;
import mli.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NotNull
    private static final a Companion = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f127558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f127559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ih0.b f127560c;
    public final i90.b d;

    public b(d deviceIdRepository, e userLogoutInteractor, ih0.b remoteConfig, i90.b uuidUtils) {
        Intrinsics.checkNotNullParameter(deviceIdRepository, "deviceIdRepository");
        Intrinsics.checkNotNullParameter(userLogoutInteractor, "userLogoutInteractor");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.f127558a = deviceIdRepository;
        this.f127559b = userLogoutInteractor;
        this.f127560c = remoteConfig;
        this.d = uuidUtils;
    }
}
