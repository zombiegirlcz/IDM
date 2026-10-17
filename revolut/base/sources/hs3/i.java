package hs3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements k, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f154896b;

    public i(String postRequestPath, h hVar) {
        Intrinsics.checkNotNullParameter(postRequestPath, "postRequestPath");
        this.f154895a = postRequestPath;
        this.f154896b = hVar;
    }

    @Override // hs3.k
    public final h O() {
        return this.f154896b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f154895a, iVar.f154895a) && Intrinsics.f(this.f154896b, iVar.f154896b);
    }

    public final int hashCode() {
        int iHashCode = this.f154895a.hashCode() * 31;
        h hVar = this.f154896b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
