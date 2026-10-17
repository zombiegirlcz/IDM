package bm3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q06.l;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f16761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f80.a f16762b;

    public c(l deeplinkRouter, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f16761a = deeplinkRouter;
        this.f16762b = uriHelper;
    }
}
