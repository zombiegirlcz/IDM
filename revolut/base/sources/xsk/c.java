package xsk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f308554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f308555b;

    public c(f fVar, g uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        this.f308554a = fVar;
        this.f308555b = uiState;
    }

    public static c a(c cVar, f fVar, g uiState, int i) {
        if ((i & 1) != 0) {
            fVar = cVar.f308554a;
        }
        if ((i & 2) != 0) {
            uiState = cVar.f308555b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        return new c(fVar, uiState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f308554a, cVar.f308554a) && Intrinsics.f(this.f308555b, cVar.f308555b);
    }

    public final int hashCode() {
        f fVar = this.f308554a;
        return this.f308555b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31);
    }
}
