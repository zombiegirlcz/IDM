package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272959b;

    public o0(String title, String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f272958a = title;
        this.f272959b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f272958a, o0Var.f272958a) && Intrinsics.f(this.f272959b, o0Var.f272959b);
    }

    public final int hashCode() {
        return this.f272959b.hashCode() + (this.f272958a.hashCode() * 31);
    }
}
