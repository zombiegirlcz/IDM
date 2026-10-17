package y49;

import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f310832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f310833b;

    public b(n instrument, e position) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f310832a = instrument;
        this.f310833b = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f310832a, bVar.f310832a) && Intrinsics.f(this.f310833b, bVar.f310833b);
    }

    public final int hashCode() {
        return this.f310833b.hashCode() + (this.f310832a.hashCode() * 31);
    }
}
