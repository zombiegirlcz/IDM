package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272968b;

    public o4(String title, String message) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f272967a = title;
        this.f272968b = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj2;
        return Intrinsics.f(this.f272967a, o4Var.f272967a) && Intrinsics.f(this.f272968b, o4Var.f272968b);
    }

    public final int hashCode() {
        return this.f272968b.hashCode() + (this.f272967a.hashCode() * 31);
    }
}
