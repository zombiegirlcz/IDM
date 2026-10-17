package vob;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f290932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f290933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f290934c;

    public e(hha.d plan, dj0.d gainedAmount, boolean z) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(gainedAmount, "gainedAmount");
        this.f290932a = plan;
        this.f290933b = gainedAmount;
        this.f290934c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f290932a, eVar.f290932a) && Intrinsics.f(this.f290933b, eVar.f290933b) && this.f290934c == eVar.f290934c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f290934c) + v7.c(this.f290932a.hashCode() * 31, 31, this.f290933b);
    }
}
