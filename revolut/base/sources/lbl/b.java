package lbl;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;
import sil.c;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f193708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f193709b;

    public b(d incomeAmount, c frequency) {
        Intrinsics.checkNotNullParameter(incomeAmount, "incomeAmount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.f193708a = incomeAmount;
        this.f193709b = frequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f193708a, bVar.f193708a) && this.f193709b == bVar.f193709b;
    }

    public final int hashCode() {
        return this.f193709b.hashCode() + (this.f193708a.hashCode() * 31);
    }
}
