package r40;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f251336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f251337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f251338c;
    public final boolean d;

    public h(Data activeChats, Data resolvedChats, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(activeChats, "activeChats");
        Intrinsics.checkNotNullParameter(resolvedChats, "resolvedChats");
        this.f251336a = activeChats;
        this.f251337b = resolvedChats;
        this.f251338c = z;
        this.d = z3;
    }

    public static h a(h hVar, Data activeChats, Data resolvedChats, boolean z, int i) {
        if ((i & 1) != 0) {
            activeChats = hVar.f251336a;
        }
        if ((i & 2) != 0) {
            resolvedChats = hVar.f251337b;
        }
        boolean z3 = (i & 4) != 0 ? hVar.f251338c : false;
        if ((i & 8) != 0) {
            z = hVar.d;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(activeChats, "activeChats");
        Intrinsics.checkNotNullParameter(resolvedChats, "resolvedChats");
        return new h(activeChats, resolvedChats, z3, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f251336a, hVar.f251336a) && Intrinsics.f(this.f251337b, hVar.f251337b) && this.f251338c == hVar.f251338c && this.d == hVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(kii.e.c(this.f251337b, this.f251336a.hashCode() * 31, 31), 31, this.f251338c);
    }
}
