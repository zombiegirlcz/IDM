package og7;

import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.c f225047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f225048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1 f225049c;

    public b(thf.c transactionCategoryResourcesMapper, h navbarMenuProvider, t1 navbarBackButtonProvider) {
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(navbarMenuProvider, "navbarMenuProvider");
        Intrinsics.checkNotNullParameter(navbarBackButtonProvider, "navbarBackButtonProvider");
        this.f225047a = transactionCategoryResourcesMapper;
        this.f225048b = navbarMenuProvider;
        this.f225049c = navbarBackButtonProvider;
    }
}
