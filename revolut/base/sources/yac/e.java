package yac;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f312009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f312010b;

    public e(List transactions, q extraData) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f312009a = transactions;
        this.f312010b = extraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f312009a, eVar.f312009a) && Intrinsics.f(this.f312010b, eVar.f312010b);
    }

    public final int hashCode() {
        return this.f312010b.hashCode() + (this.f312009a.hashCode() * 31);
    }
}
