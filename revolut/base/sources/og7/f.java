package og7;

import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f225052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f225053b;

    public f(h navbarMenuProvider, t1 navbarBackButtonProvider) {
        Intrinsics.checkNotNullParameter(navbarMenuProvider, "navbarMenuProvider");
        Intrinsics.checkNotNullParameter(navbarBackButtonProvider, "navbarBackButtonProvider");
        this.f225052a = navbarMenuProvider;
        this.f225053b = navbarBackButtonProvider;
    }
}
