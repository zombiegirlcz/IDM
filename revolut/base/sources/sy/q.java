package sy;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f266553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable f266554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f266555c;

    public q(Clause detectorResultsInfo, Iterable rects, p navBar) {
        Intrinsics.checkNotNullParameter(detectorResultsInfo, "detectorResultsInfo");
        Intrinsics.checkNotNullParameter(rects, "rects");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        this.f266553a = detectorResultsInfo;
        this.f266554b = rects;
        this.f266555c = navBar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f266553a.equals(qVar.f266553a) && Intrinsics.f(this.f266554b, qVar.f266554b) && this.f266555c.equals(qVar.f266555c);
    }

    @Override // sy.u
    public final p f() {
        return this.f266555c;
    }

    public final int hashCode() {
        return this.f266555c.hashCode() + ((this.f266554b.hashCode() + (this.f266553a.hashCode() * 31)) * 31);
    }
}
