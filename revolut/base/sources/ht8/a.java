package ht8;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f155330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f155331b;

    public a(List docs, b citizenship) {
        Intrinsics.checkNotNullParameter(docs, "docs");
        Intrinsics.checkNotNullParameter(citizenship, "citizenship");
        this.f155330a = docs;
        this.f155331b = citizenship;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f155330a, aVar.f155330a) && Intrinsics.f(this.f155331b, aVar.f155331b);
    }

    public final int hashCode() {
        return this.f155331b.f297794a.hashCode() + (this.f155330a.hashCode() * 31);
    }
}
