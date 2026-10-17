package uka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280716b;

    public /* synthetic */ d(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(b.f280714a.getDescriptor(), i, 3);
            throw null;
        }
        this.f280715a = str;
        this.f280716b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f280715a, dVar.f280715a) && Intrinsics.f(this.f280716b, dVar.f280716b);
    }

    public final int hashCode() {
        int iHashCode = this.f280715a.hashCode() * 31;
        String str = this.f280716b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
