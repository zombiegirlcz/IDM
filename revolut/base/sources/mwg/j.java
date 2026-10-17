package mwg;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f209466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f209467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f209468c;
    public final dj0.d d;
    public final dj0.d e;

    public j(DateTime start, DateTime end2, dj0.d netSell, dj0.d dVar, dj0.d cumulative) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(netSell, "netSell");
        Intrinsics.checkNotNullParameter(cumulative, "cumulative");
        this.f209466a = start;
        this.f209467b = end2;
        this.f209468c = netSell;
        this.d = dVar;
        this.e = cumulative;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f209466a, jVar.f209466a) && Intrinsics.f(this.f209467b, jVar.f209467b) && Intrinsics.f(this.f209468c, jVar.f209468c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iC = v7.c(m72.b.f(this.f209467b, this.f209466a.hashCode() * 31, 31), 31, this.f209468c);
        dj0.d dVar = this.d;
        return this.e.hashCode() + ((iC + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }
}
