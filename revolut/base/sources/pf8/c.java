package pf8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final of8.a f235507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f235508b;

    public c(of8.a state, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f235507a = state;
        this.f235508b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f235507a == cVar.f235507a && this.f235508b == cVar.f235508b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f235508b) + (this.f235507a.hashCode() * 31);
    }
}
