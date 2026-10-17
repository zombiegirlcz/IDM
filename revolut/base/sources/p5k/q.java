package p5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f233177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f233178b;

    public q(dj0.d dailyAmount, String str) {
        Intrinsics.checkNotNullParameter(dailyAmount, "dailyAmount");
        this.f233177a = dailyAmount;
        this.f233178b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f233177a, qVar.f233177a) && Intrinsics.f(this.f233178b, qVar.f233178b);
    }

    public final int hashCode() {
        int iHashCode = this.f233177a.hashCode() * 31;
        String str = this.f233178b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
