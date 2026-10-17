package d3c;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f111030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f111031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f111032c;

    public h0(i0 key, i0 i0Var, ArrayList items) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f111030a = key;
        this.f111031b = i0Var;
        this.f111032c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f111030a, h0Var.f111030a) && Intrinsics.f(this.f111031b, h0Var.f111031b) && this.f111032c.equals(h0Var.f111032c);
    }

    public final int hashCode() {
        int iHashCode = this.f111030a.hashCode() * 31;
        i0 i0Var = this.f111031b;
        return this.f111032c.hashCode() + ((iHashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31);
    }
}
