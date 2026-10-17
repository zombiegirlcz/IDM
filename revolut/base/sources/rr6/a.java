package rr6;

import ip0.v7;
import java.time.LocalDateTime;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f256696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f256697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f256698c;
    public final LocalDateTime d;

    public a(ArrayList tiers, dj0.d boosterLimit, dj0.d currentCycleSaleVolume, LocalDateTime currentCycleEndDate) {
        Intrinsics.checkNotNullParameter(tiers, "tiers");
        Intrinsics.checkNotNullParameter(boosterLimit, "boosterLimit");
        Intrinsics.checkNotNullParameter(currentCycleSaleVolume, "currentCycleSaleVolume");
        Intrinsics.checkNotNullParameter(currentCycleEndDate, "currentCycleEndDate");
        this.f256696a = tiers;
        this.f256697b = boosterLimit;
        this.f256698c = currentCycleSaleVolume;
        this.d = currentCycleEndDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f256696a.equals(aVar.f256696a) && this.f256697b.equals(aVar.f256697b) && this.f256698c.equals(aVar.f256698c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f256696a.hashCode() * 31, 31, this.f256697b), 31, this.f256698c);
    }
}
