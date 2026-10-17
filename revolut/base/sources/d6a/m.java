package d6a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5a.c f111477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f111478b;

    public m(v5a.c paymentsMigrationInteractor) {
        Intrinsics.checkNotNullParameter(paymentsMigrationInteractor, "paymentsMigrationInteractor");
        this.f111477a = paymentsMigrationInteractor;
        this.f111478b = ta6.a.a(0);
    }
}
