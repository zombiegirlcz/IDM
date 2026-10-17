package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class m1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f272924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f272925b;

    public m1(DateTime dateTime, u0 u0Var) {
        this.f272924a = dateTime;
        this.f272925b = u0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Intrinsics.f(this.f272924a, m1Var.f272924a) && this.f272925b == m1Var.f272925b;
    }

    public final int hashCode() {
        DateTime dateTime = this.f272924a;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        u0 u0Var = this.f272925b;
        return iHashCode + (u0Var != null ? u0Var.hashCode() : 0);
    }
}
