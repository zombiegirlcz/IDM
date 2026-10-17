package pf9;

import kotlin.jvm.internal.Intrinsics;
import of9.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f235537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nm1.b f235538b;

    public g(k commonProvider, nm1.b boletoFinderItemsProvider) {
        Intrinsics.checkNotNullParameter(commonProvider, "commonProvider");
        Intrinsics.checkNotNullParameter(boletoFinderItemsProvider, "boletoFinderItemsProvider");
        this.f235537a = commonProvider;
        this.f235538b = boletoFinderItemsProvider;
    }
}
