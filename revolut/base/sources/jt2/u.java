package jt2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class u {

    @NotNull
    private static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fnc.s f178335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f178336b;

    public u(fnc.s commonSection, g itemsSection, vu.b cdnProvider) {
        Intrinsics.checkNotNullParameter(commonSection, "commonSection");
        Intrinsics.checkNotNullParameter(itemsSection, "itemsSection");
        Intrinsics.checkNotNullParameter(cdnProvider, "cdnProvider");
        this.f178335a = commonSection;
        this.f178336b = itemsSection;
    }
}
