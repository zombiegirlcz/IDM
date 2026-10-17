package jel;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f173493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yel.b f173494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f173495c;

    public l(int i, yel.b bVar, boolean z) {
        this.f173493a = i;
        this.f173494b = bVar;
        this.f173495c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f173493a == lVar.f173493a && Intrinsics.f(this.f173494b, lVar.f173494b) && this.f173495c == lVar.f173495c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f173493a) * 31;
        yel.b bVar = this.f173494b;
        return Boolean.hashCode(this.f173495c) + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
