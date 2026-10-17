package rr6;

import ip0.v7;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f256729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f256730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f256731c;
    public final dj0.d d;

    public q(dj0.d plan, dj0.d booster, LocalDateTime dueDate) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(booster, "booster");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        this.f256729a = plan;
        this.f256730b = booster;
        this.f256731c = dueDate;
        this.d = pyd.c.O(plan, booster);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f256729a, qVar.f256729a) && Intrinsics.f(this.f256730b, qVar.f256730b) && Intrinsics.f(this.f256731c, qVar.f256731c);
    }

    public final int hashCode() {
        return this.f256731c.hashCode() + v7.c(this.f256729a.hashCode() * 31, 31, this.f256730b);
    }
}
