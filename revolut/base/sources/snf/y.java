package snf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f264604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f264605b;

    public y(b bVar, b bVar2) {
        this.f264604a = bVar;
        this.f264605b = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f264604a, yVar.f264604a) && Intrinsics.f(this.f264605b, yVar.f264605b);
    }

    public final int hashCode() {
        b bVar = this.f264604a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        b bVar2 = this.f264605b;
        return iHashCode + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
