package tsk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f274146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f274147b;

    public d(g state, h uiState) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        this.f274146a = state;
        this.f274147b = uiState;
    }

    public static d a(d dVar, g state, h uiState, int i) {
        if ((i & 1) != 0) {
            state = dVar.f274146a;
        }
        if ((i & 2) != 0) {
            uiState = dVar.f274147b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        return new d(state, uiState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f274146a, dVar.f274146a) && Intrinsics.f(this.f274147b, dVar.f274147b);
    }

    public final int hashCode() {
        return this.f274147b.hashCode() + (this.f274146a.hashCode() * 31);
    }
}
