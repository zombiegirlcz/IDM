package fv4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f138340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f138341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f138342c;

    public q(p toolbar, o tabs) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f138340a = toolbar;
        this.f138341b = tabs;
        this.f138342c = f0.f322471a;
    }

    @Override // cli.p
    public final List c() {
        return this.f138342c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f138340a, qVar.f138340a) && Intrinsics.f(this.f138341b, qVar.f138341b);
    }

    public final int hashCode() {
        return this.f138341b.hashCode() + (this.f138340a.hashCode() * 31);
    }
}
