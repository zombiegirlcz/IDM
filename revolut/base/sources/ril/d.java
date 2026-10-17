package ril;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f254593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f254594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f254595c;
    public final String d;

    public d(c name, String str, List dataPoints, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
        this.f254593a = name;
        this.f254594b = str;
        this.f254595c = dataPoints;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f254593a == dVar.f254593a && Intrinsics.f(this.f254594b, dVar.f254594b) && Intrinsics.f(this.f254595c, dVar.f254595c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f254593a.hashCode() * 31;
        String str = this.f254594b;
        int iD = p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f254595c);
        String str2 = this.d;
        return Boolean.hashCode(false) + j6.a.c((iD + (str2 == null ? 0 : str2.hashCode())) * 31, 31, false);
    }
}
