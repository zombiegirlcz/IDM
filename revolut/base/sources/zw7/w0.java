package zw7;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f325859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325860b;

    public w0(v0 code, String name) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f325859a = code;
        this.f325860b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return this.f325859a == w0Var.f325859a && Intrinsics.f(this.f325860b, w0Var.f325860b);
    }

    public final int hashCode() {
        return this.f325860b.hashCode() + (this.f325859a.hashCode() * 31);
    }
}
