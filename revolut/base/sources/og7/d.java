package og7;

import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f225050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f225051b;

    public d(h navbarMenuProvider, t1 navbarBackButtonProvider) {
        Intrinsics.checkNotNullParameter(navbarMenuProvider, "navbarMenuProvider");
        Intrinsics.checkNotNullParameter(navbarBackButtonProvider, "navbarBackButtonProvider");
        this.f225050a = navbarMenuProvider;
        this.f225051b = navbarBackButtonProvider;
    }
}
