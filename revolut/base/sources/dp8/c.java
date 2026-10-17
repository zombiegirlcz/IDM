package dp8;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f116840c;
    public final String d;
    public final DateTime e;
    public final d f;

    public c(String juniorId, String name, dj0.d reward, String str, DateTime dateTime, d frequency) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.f116838a = juniorId;
        this.f116839b = name;
        this.f116840c = reward;
        this.d = str;
        this.e = dateTime;
        this.f = frequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f116838a, cVar.f116838a) && Intrinsics.f(this.f116839b, cVar.f116839b) && Intrinsics.f(this.f116840c, cVar.f116840c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && this.f == cVar.f;
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(this.f116838a.hashCode() * 31, 31, this.f116839b), 31, this.f116840c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        DateTime dateTime = this.e;
        return this.f.hashCode() + ((iHashCode + (dateTime != null ? dateTime.hashCode() : 0)) * 31);
    }
}
