package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272666b;

    public c4(String str, String str2) {
        this.f272665a = str;
        this.f272666b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj2;
        return Intrinsics.f(this.f272665a, c4Var.f272665a) && Intrinsics.f(this.f272666b, c4Var.f272666b);
    }

    public final int hashCode() {
        String str = this.f272665a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f272666b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
