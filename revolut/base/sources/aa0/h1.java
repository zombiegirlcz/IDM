package aa0;

import java.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalTime f2733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2734b;

    public h1(LocalTime localTime, String str) {
        this.f2733a = localTime;
        this.f2734b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.f2733a, h1Var.f2733a) && Intrinsics.f(this.f2734b, h1Var.f2734b);
    }

    public final int hashCode() {
        LocalTime localTime = this.f2733a;
        int iHashCode = (localTime == null ? 0 : localTime.hashCode()) * 31;
        String str = this.f2734b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
