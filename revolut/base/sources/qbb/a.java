package qbb;

import fk3.b;
import kotlin.jvm.internal.Intrinsics;
import ui0.d;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f244171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f244172b;

    public a(b configurationRepository, d currentVersion) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(currentVersion, "currentVersion");
        this.f244171a = configurationRepository;
        this.f244172b = currentVersion;
    }
}
