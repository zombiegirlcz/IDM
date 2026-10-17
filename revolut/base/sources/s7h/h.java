package s7h;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f260829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f260830b;

    public /* synthetic */ h(int i, jo3.a aVar, jo3.a aVar2) {
        if (3 != (i & 3)) {
            j1.f(f.f260828a.getDescriptor(), i, 3);
            throw null;
        }
        this.f260829a = aVar;
        this.f260830b = aVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f260829a, hVar.f260829a) && Intrinsics.f(this.f260830b, hVar.f260830b);
    }

    public final int hashCode() {
        return this.f260830b.hashCode() + (this.f260829a.hashCode() * 31);
    }

    public h(jo3.a totalAmount, jo3.a completedAmount) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(completedAmount, "completedAmount");
        this.f260829a = totalAmount;
        this.f260830b = completedAmount;
    }
}
