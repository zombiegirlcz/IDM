package xr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f308262b;

    public i(String str, h scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        this.f308261a = str;
        this.f308262b = scheme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f308261a, iVar.f308261a) && this.f308262b == iVar.f308262b;
    }

    public final int hashCode() {
        String str = this.f308261a;
        return this.f308262b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
