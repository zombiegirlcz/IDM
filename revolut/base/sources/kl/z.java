package kl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class z extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f185253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f185254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f185255c;

    public z(int i, int i2, Long l2) {
        this.f185253a = i;
        this.f185254b = i2;
        this.f185255c = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f185253a == zVar.f185253a && this.f185254b == zVar.f185254b && Intrinsics.f(this.f185255c, zVar.f185255c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f185254b, Integer.hashCode(this.f185253a) * 31, 31);
        Long l2 = this.f185255c;
        return iB + (l2 == null ? 0 : l2.hashCode());
    }

    public final String toString() {
        StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("ShowWaitingMessages(titleId=", this.f185253a, this.f185254b, ", subTitleId=", ", delayInMs=");
        sbW.append(this.f185255c);
        sbW.append(")");
        return sbW.toString();
    }
}
