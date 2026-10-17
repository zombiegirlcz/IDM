package n36;

import com.revolut.feature.defi.common.models.dto.TokenAmountDto;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f211897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TokenAmountDto f211898b;

    public /* synthetic */ q(int i, a0 a0Var, TokenAmountDto tokenAmountDto) {
        if (3 != (i & 3)) {
            j1.f(o.f211896a.getDescriptor(), i, 3);
            throw null;
        }
        this.f211897a = a0Var;
        this.f211898b = tokenAmountDto;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f211897a, qVar.f211897a) && Intrinsics.f(this.f211898b, qVar.f211898b);
    }

    public final int hashCode() {
        return this.f211898b.hashCode() + (this.f211897a.hashCode() * 31);
    }
}
