package ke7;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70.a f183047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f183048b;

    public y(z70.a contextProvider) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f183047a = contextProvider;
        this.f183048b = yhm.j.b(new k98.a(this, 4));
    }
}
