package rs0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f256905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f256906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f256907c;
    public final Clause d;
    public final Clause e;
    public final Clause f;

    public c(Clause open, Clause close, Clause high, Clause low, Clause volume, Clause change) {
        Intrinsics.checkNotNullParameter(open, "open");
        Intrinsics.checkNotNullParameter(close, "close");
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(volume, "volume");
        Intrinsics.checkNotNullParameter(change, "change");
        this.f256905a = open;
        this.f256906b = close;
        this.f256907c = high;
        this.d = low;
        this.e = volume;
        this.f = change;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f256905a, cVar.f256905a) && Intrinsics.f(this.f256906b, cVar.f256906b) && Intrinsics.f(this.f256907c, cVar.f256907c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.a(p.a.a(p.a.a(p.a.a(this.f256905a.hashCode() * 31, 31, this.f256906b), 31, this.f256907c), 31, this.d), 31, this.e);
    }
}
