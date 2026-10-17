package uwb;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f283610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c90.c f283611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Pair f283612c;

    public i(fkg.a barcodeGenerator, c90.c uiResources, c90.a colorProvider) {
        Intrinsics.checkNotNullParameter(barcodeGenerator, "barcodeGenerator");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(colorProvider, "colorProvider");
        this.f283610a = barcodeGenerator;
        this.f283611b = uiResources;
    }
}
