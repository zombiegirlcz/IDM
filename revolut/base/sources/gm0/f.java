package gm0;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f144736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f144737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f144738c;
    public final AtomicBoolean d;

    public f(dm0.c deviceIdConfig, ue0.c storage, Map deviceIdRepositories) {
        Intrinsics.checkNotNullParameter(deviceIdConfig, "deviceIdConfig");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(deviceIdRepositories, "deviceIdRepositories");
        this.f144736a = storage;
        this.f144737b = deviceIdRepositories;
        this.f144738c = yhm.j.a(this, new androidx.lifecycle.b(this, 19));
        this.d = new AtomicBoolean();
    }
}
