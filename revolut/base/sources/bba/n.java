package bba;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8a.a f14209a;

    public n(yca.o transferInputKeyScreenDialogProvider, i8a.a aliasResolveErrorDialogProvider) {
        Intrinsics.checkNotNullParameter(transferInputKeyScreenDialogProvider, "transferInputKeyScreenDialogProvider");
        Intrinsics.checkNotNullParameter(aliasResolveErrorDialogProvider, "aliasResolveErrorDialogProvider");
        this.f14209a = aliasResolveErrorDialogProvider;
    }
}
