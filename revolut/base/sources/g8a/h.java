package g8a;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f141306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f141307c;
    public final Boolean d;

    public h(String str, dj0.d dVar, LocalDate localDate, Boolean bool) {
        this.f141305a = str;
        this.f141306b = dVar;
        this.f141307c = localDate;
        this.d = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f141305a, hVar.f141305a) && Intrinsics.f(this.f141306b, hVar.f141306b) && Intrinsics.f(this.f141307c, hVar.f141307c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        String str = this.f141305a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        dj0.d dVar = this.f141306b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        LocalDate localDate = this.f141307c;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }
}
