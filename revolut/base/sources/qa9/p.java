package qa9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.b f243997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kbb.c f243998b;

    public p(n8b.b countryUtils, kbb.c termsProviderFactory) {
        Intrinsics.checkNotNullParameter(countryUtils, "countryUtils");
        Intrinsics.checkNotNullParameter(termsProviderFactory, "termsProviderFactory");
        this.f243997a = countryUtils;
        this.f243998b = termsProviderFactory;
    }
}
