package hld;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f153441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls0.e f153442b;

    public c(f01.a uiKitResources, uld.b urlTypeChecker) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(urlTypeChecker, "urlTypeChecker");
        this.f153441a = uiKitResources;
        this.f153442b = new ls0.e(0);
    }
}
