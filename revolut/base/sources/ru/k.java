package ru;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f257370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f257371b;

    public k(dj0.d totalReward, ArrayList invitees) {
        Intrinsics.checkNotNullParameter(totalReward, "totalReward");
        Intrinsics.checkNotNullParameter(invitees, "invitees");
        this.f257370a = totalReward;
        this.f257371b = invitees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f257370a, kVar.f257370a) && this.f257371b.equals(kVar.f257371b);
    }

    public final int hashCode() {
        return this.f257371b.hashCode() + (this.f257370a.hashCode() * 31);
    }
}
