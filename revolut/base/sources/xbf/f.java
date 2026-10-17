package xbf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.u;
import yhm.j;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements mbf.c {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f304074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f304075b;

    public f(kbf.a specificAddOnInteractor, u persistentFieldProvider) {
        Intrinsics.checkNotNullParameter(specificAddOnInteractor, "specificAddOnInteractor");
        Intrinsics.checkNotNullParameter(persistentFieldProvider, "persistentFieldProvider");
        this.f304074a = persistentFieldProvider;
        this.f304075b = j.b(new wp0.b(this, 26));
    }
}
