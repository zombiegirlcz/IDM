package fva;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f138394b;

    public d(String str, f fVar) {
        this.f138393a = str;
        this.f138394b = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f138393a, dVar.f138393a) && Intrinsics.f(this.f138394b, dVar.f138394b);
    }

    public final int hashCode() {
        String str = this.f138393a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        f fVar = this.f138394b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }
}
