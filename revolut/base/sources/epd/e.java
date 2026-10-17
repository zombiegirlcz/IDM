package epd;

import aii.r;
import kotlin.jvm.internal.Intrinsics;
import tof.i3;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3 f128162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f128163b;

    public e(i3 i3Var, d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f128162a = i3Var;
        this.f128163b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f128162a, eVar.f128162a) && this.f128163b == eVar.f128163b;
    }

    public final int hashCode() {
        i3 i3Var = this.f128162a;
        return this.f128163b.hashCode() + ((i3Var == null ? 0 : i3Var.hashCode()) * 31);
    }
}
