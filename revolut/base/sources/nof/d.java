package nof;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f218025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f218026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i7 f218027c;

    public d(Clause title, Clause subtitle, i7 filter) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f218025a = title;
        this.f218026b = subtitle;
        this.f218027c = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f218025a.equals(dVar.f218025a) && this.f218026b.equals(dVar.f218026b) && Intrinsics.f(this.f218027c, dVar.f218027c);
    }

    public final int hashCode() {
        return this.f218027c.hashCode() + p.a.b(this.f218025a.hashCode() * 31, 31, this.f218026b);
    }
}
