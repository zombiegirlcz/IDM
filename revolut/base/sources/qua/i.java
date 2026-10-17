package qua;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDateTime;
import tof.k3;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f249301c;
    public final k3 d;

    public i(String str, String str2, LocalDateTime localDateTime, k3 category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f249299a = str;
        this.f249300b = str2;
        this.f249301c = localDateTime;
        this.d = category;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f249299a, iVar.f249299a) && Intrinsics.f(this.f249300b, iVar.f249300b) && Intrinsics.f(this.f249301c, iVar.f249301c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        String str = this.f249299a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f249300b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDateTime localDateTime = this.f249301c;
        return this.d.f272879a.hashCode() + ((iHashCode2 + (localDateTime != null ? localDateTime.hashCode() : 0)) * 31);
    }
}
