package xzg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f309973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f309974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f309975c;
    public final List d;

    public c0(b0 timeSpan, List mostTraded, List mostBought, List mostSold) {
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(mostTraded, "mostTraded");
        Intrinsics.checkNotNullParameter(mostBought, "mostBought");
        Intrinsics.checkNotNullParameter(mostSold, "mostSold");
        this.f309973a = timeSpan;
        this.f309974b = mostTraded;
        this.f309975c = mostBought;
        this.d = mostSold;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f309973a == c0Var.f309973a && Intrinsics.f(this.f309974b, c0Var.f309974b) && Intrinsics.f(this.f309975c, c0Var.f309975c) && Intrinsics.f(this.d, c0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f309973a.hashCode() * 31, 31, this.f309974b), 31, this.f309975c);
    }
}
