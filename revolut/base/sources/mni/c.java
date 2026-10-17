package mni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f207513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f207514c;

    public c(String str, String hint, b otpMethod) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(otpMethod, "otpMethod");
        this.f207512a = str;
        this.f207513b = hint;
        this.f207514c = otpMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f207512a, cVar.f207512a) && Intrinsics.f(this.f207513b, cVar.f207513b) && this.f207514c == cVar.f207514c;
    }

    public final int hashCode() {
        String str = this.f207512a;
        return this.f207514c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f207513b);
    }
}
