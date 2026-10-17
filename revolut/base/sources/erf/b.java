package erf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f128653a;

    public b(i etaCalculator) {
        Intrinsics.checkNotNullParameter(etaCalculator, "etaCalculator");
        this.f128653a = etaCalculator;
    }
}
