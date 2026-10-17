package kk9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zh9.i0;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f184532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f184533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f184534c;
    public final dj0.d d;

    public g(i0 management, List instalmentsInProgress, dj0.d availableBalance) {
        Intrinsics.checkNotNullParameter(management, "management");
        Intrinsics.checkNotNullParameter(instalmentsInProgress, "instalmentsInProgress");
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        this.f184532a = management;
        this.f184533b = instalmentsInProgress;
        this.f184534c = availableBalance;
        this.d = management.f322286b.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f184532a, gVar.f184532a) && Intrinsics.f(this.f184533b, gVar.f184533b) && Intrinsics.f(this.f184534c, gVar.f184534c);
    }

    public final int hashCode() {
        return this.f184534c.hashCode() + p.a.d(this.f184532a.hashCode() * 31, 31, this.f184533b);
    }
}
