package igb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f161133b;

    public /* synthetic */ h(int i, String str, jo3.a aVar) {
        if (3 != (i & 3)) {
            j1.f(f.f161124a.getDescriptor(), i, 3);
            throw null;
        }
        this.f161132a = str;
        this.f161133b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f161132a, hVar.f161132a) && Intrinsics.f(this.f161133b, hVar.f161133b);
    }

    public final int hashCode() {
        return this.f161133b.hashCode() + (this.f161132a.hashCode() * 31);
    }

    public h(jo3.a prizeAmount, String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(prizeAmount, "prizeAmount");
        this.f161132a = deeplink;
        this.f161133b = prizeAmount;
    }
}
