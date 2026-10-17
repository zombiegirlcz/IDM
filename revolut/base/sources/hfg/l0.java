package hfg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f151863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f151865c;

    public l0(ArrayList flights, String str, k0 k0Var) {
        Intrinsics.checkNotNullParameter(flights, "flights");
        this.f151863a = flights;
        this.f151864b = str;
        this.f151865c = k0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return this.f151863a.equals(l0Var.f151863a) && Intrinsics.f(this.f151864b, l0Var.f151864b) && Intrinsics.f(this.f151865c, l0Var.f151865c);
    }

    public final int hashCode() {
        int iHashCode = this.f151863a.hashCode() * 31;
        String str = this.f151864b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        k0 k0Var = this.f151865c;
        return iHashCode2 + (k0Var != null ? k0Var.hashCode() : 0);
    }
}
