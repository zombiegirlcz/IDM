package by7;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import zw7.w0;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f19775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19777c;

    public h(w0 reason, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f19775a = reason;
        this.f19776b = z;
        this.f19777c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f19775a, hVar.f19775a) && this.f19776b == hVar.f19776b && this.f19777c == hVar.f19777c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19777c) + j6.a.c(this.f19775a.hashCode() * 31, 31, this.f19776b);
    }
}
