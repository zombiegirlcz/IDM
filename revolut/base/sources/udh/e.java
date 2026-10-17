package udh;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f279205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f279206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f279207c;

    public e(dj0.d borrowingLimit, dj0.d buyingPower, a aVar) {
        Intrinsics.checkNotNullParameter(borrowingLimit, "borrowingLimit");
        Intrinsics.checkNotNullParameter(buyingPower, "buyingPower");
        this.f279205a = borrowingLimit;
        this.f279206b = buyingPower;
        this.f279207c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f279205a, eVar.f279205a) && Intrinsics.f(this.f279206b, eVar.f279206b) && this.f279207c == eVar.f279207c;
    }

    public final int hashCode() {
        int iC = v7.c(this.f279205a.hashCode() * 31, 31, this.f279206b);
        a aVar = this.f279207c;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }
}
