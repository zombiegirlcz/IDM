package l80;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f192762a;

    public c(t70.g localization, qd0.b languageProvider, f90.b pluralFormatter, e dateProvider) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(pluralFormatter, "pluralFormatter");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f192762a = languageProvider;
    }
}
