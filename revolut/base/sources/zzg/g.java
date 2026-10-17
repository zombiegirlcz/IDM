package zzg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f326735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f326736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f326737c;
    public final String d;

    public g(List instruments, f dataSource, String str, String str2) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f326735a = instruments;
        this.f326736b = dataSource;
        this.f326737c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f326735a, gVar.f326735a) && this.f326736b == gVar.f326736b && Intrinsics.f(this.f326737c, gVar.f326737c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f326736b.hashCode() + (this.f326735a.hashCode() * 31)) * 31;
        String str = this.f326737c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
