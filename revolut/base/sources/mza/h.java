package mza;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f210740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f210741b;

    public h(a buttonsOrientation, b bVar) {
        Intrinsics.checkNotNullParameter(buttonsOrientation, "buttonsOrientation");
        this.f210740a = buttonsOrientation;
        this.f210741b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f210740a == hVar.f210740a && this.f210741b == hVar.f210741b;
    }

    public final int hashCode() {
        int iHashCode = this.f210740a.hashCode() * 31;
        b bVar = this.f210741b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
