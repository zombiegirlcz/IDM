package iyl;

import hyl.m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f169795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f169796c;
    public final List d;
    public final String e;

    public d(String str, m mVar, List activeCountries, List markers, String str2) {
        Intrinsics.checkNotNullParameter(activeCountries, "activeCountries");
        Intrinsics.checkNotNullParameter(markers, "markers");
        this.f169794a = str;
        this.f169795b = mVar;
        this.f169796c = activeCountries;
        this.d = markers;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f169794a, dVar.f169794a) && Intrinsics.f(this.f169795b, dVar.f169795b) && Intrinsics.f(this.f169796c, dVar.f169796c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        String str = this.f169794a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        m mVar = this.f169795b;
        int iD = p.a.d(p.a.d((iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31, 31, this.f169796c), 31, this.d);
        String str2 = this.e;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
