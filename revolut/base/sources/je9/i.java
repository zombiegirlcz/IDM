package je9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements od0.e {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f173247a;

    public i(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f173247a = storage;
    }

    @Override // od0.e
    public final void clear() {
        this.f173247a.I0("TIP_CLOSE_ATTEMPTS_KEY");
    }
}
