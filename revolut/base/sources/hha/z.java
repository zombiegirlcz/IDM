package hha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes5.dex */
public final class z implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Period f152375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f152376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152377c;
    public final h0 d;

    public z(Period duration, DateTime dateTime, String str, h0 h0Var) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f152375a = duration;
        this.f152376b = dateTime;
        this.f152377c = str;
        this.d = h0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f152375a, zVar.f152375a) && Intrinsics.f(this.f152376b, zVar.f152376b) && Intrinsics.f(this.f152377c, zVar.f152377c) && this.d == zVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f152375a.hashCode() * 31;
        DateTime dateTime = this.f152376b;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        String str = this.f152377c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        h0 h0Var = this.d;
        return iHashCode3 + (h0Var != null ? h0Var.hashCode() : 0);
    }
}
