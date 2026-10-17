package puj;

import com.revolut.feature.address.models.Address;
import ip0.v7;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f239918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Address f239919c;
    public final String d;

    public f(String name, LocalDateTime date, Address address, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f239917a = name;
        this.f239918b = date;
        this.f239919c = address;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f239917a, fVar.f239917a) && Intrinsics.f(this.f239918b, fVar.f239918b) && Intrinsics.f(this.f239919c, fVar.f239919c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int i = v7.i(this.f239918b, this.f239917a.hashCode() * 31, 31);
        Address address = this.f239919c;
        int iHashCode = (i + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
