package iuj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0j.m f168646a;

    public s(d0j.m type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f168646a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f168646a == ((s) obj2).f168646a;
    }

    public final int hashCode() {
        return this.f168646a.hashCode();
    }
}
