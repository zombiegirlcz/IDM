package n36;

import com.revolut.feature.defi.common.models.dto.TokenAmountDto;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f211904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TokenAmountDto f211905b;

    public /* synthetic */ w(int i, b0 b0Var, TokenAmountDto tokenAmountDto) {
        if (3 != (i & 3)) {
            j1.f(u.f211903a.getDescriptor(), i, 3);
            throw null;
        }
        this.f211904a = b0Var;
        this.f211905b = tokenAmountDto;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f211904a, wVar.f211904a) && Intrinsics.f(this.f211905b, wVar.f211905b);
    }

    public final int hashCode() {
        return this.f211905b.hashCode() + (this.f211904a.hashCode() * 31);
    }
}
