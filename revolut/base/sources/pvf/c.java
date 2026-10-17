package pvf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import org.jetbrains.annotations.NotNull;
import pgk.f;
import yhm.j;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70.a f240060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y80.a f240061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f240062c;
    public final ue0.c d;
    public final Lazy e;

    public c(z70.a contextProvider, y80.a permissionProvider, e dateProvider, b notificationBuilder, ue0.c storage) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f240060a = contextProvider;
        this.f240061b = permissionProvider;
        this.f240062c = notificationBuilder;
        this.d = storage;
        this.e = j.b(new f(this, 24));
    }
}
