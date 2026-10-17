package bd9;

import com.revolut.feature.onboarding.impl.user_migration.data.network.UserMigrationService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w4l.f;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserMigrationService f14541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f14542b;

    public c(UserMigrationService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f14541a = service;
        this.f14542b = new f(new b7d.c(this, 19), null, null, null, null, null, null, null, 254);
    }
}
