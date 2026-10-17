package jr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f177788a;

    public /* synthetic */ h0(int i, u1 u1Var) {
        if (1 == (i & 1)) {
            this.f177788a = u1Var;
        } else {
            qlm.j1.f(f0.f177785a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f177788a, ((h0) obj2).f177788a);
    }

    public final int hashCode() {
        return this.f177788a.hashCode();
    }

    public h0(u1 userInputDto) {
        Intrinsics.checkNotNullParameter(userInputDto, "userInputDto");
        this.f177788a = userInputDto;
    }
}
