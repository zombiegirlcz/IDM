package jt2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vu.g f178337a;

    public w(vu.b cdnProvider, vu.g resourceProvider) {
        Intrinsics.checkNotNullParameter(cdnProvider, "cdnProvider");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.f178337a = resourceProvider;
    }
}
