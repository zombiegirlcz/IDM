package eel;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f125227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f125228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f125229c;
    public final i d;
    public final h e;

    public e(List points, long j2, long j3, i valueType, h hVar) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        this.f125227a = points;
        this.f125228b = j2;
        this.f125229c = j3;
        this.d = valueType;
        this.e = hVar;
    }

    public static e a(e eVar, ArrayList points, long j2, int i) {
        if ((i & 2) != 0) {
            j2 = eVar.f125228b;
        }
        long j3 = eVar.f125229c;
        i valueType = eVar.d;
        h hVar = eVar.e;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        return new e(points, j2, j3, valueType, hVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f125227a, eVar.f125227a) && this.f125228b == eVar.f125228b && this.f125229c == eVar.f125229c && this.d == eVar.d && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + a0.d.c(a0.d.c(this.f125227a.hashCode() * 31, 31, this.f125228b), 31, this.f125229c)) * 31;
        h hVar = this.e;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
