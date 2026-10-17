package xr6;

import kotlin.jvm.internal.Intrinsics;
import xr6.p;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends p.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f308286a;

    public s(t status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f308286a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f308286a == ((s) obj2).f308286a;
    }

    public final int hashCode() {
        return this.f308286a.hashCode();
    }
}
