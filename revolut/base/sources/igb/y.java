package igb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f161157b;

    public /* synthetic */ y(int i, String str, jo3.a aVar) {
        if (3 != (i & 3)) {
            j1.f(w.f161155a.getDescriptor(), i, 3);
            throw null;
        }
        this.f161156a = str;
        this.f161157b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f161156a, yVar.f161156a) && Intrinsics.f(this.f161157b, yVar.f161157b);
    }

    public final int hashCode() {
        return this.f161157b.hashCode() + (this.f161156a.hashCode() * 31);
    }

    public y(jo3.a prizeAmount, String cashDrawDeeplink) {
        Intrinsics.checkNotNullParameter(cashDrawDeeplink, "cashDrawDeeplink");
        Intrinsics.checkNotNullParameter(prizeAmount, "prizeAmount");
        this.f161156a = cashDrawDeeplink;
        this.f161157b = prizeAmount;
    }
}
