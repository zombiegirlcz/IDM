package g08;

import a0e.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zw7.r0;
import zw7.s0;
import zw7.t0;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yx7.h f139368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f139369b;

    public o(yx7.h petImageBuilder, yx7.k petStatusUiBuilder, w petAgeProvider) {
        Intrinsics.checkNotNullParameter(petImageBuilder, "petImageBuilder");
        Intrinsics.checkNotNullParameter(petStatusUiBuilder, "petStatusUiBuilder");
        Intrinsics.checkNotNullParameter(petAgeProvider, "petAgeProvider");
        this.f139368a = petImageBuilder;
        this.f139369b = petAgeProvider;
    }

    public static boolean a(s0 s0Var) {
        if (s0Var instanceof r0) {
            return ((r0) s0Var).f325845l == t0.ACTIVE;
        }
        if (s0Var.equals(s0.a.f325852a)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
