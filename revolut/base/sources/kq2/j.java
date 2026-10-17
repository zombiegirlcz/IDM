package kq2;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f188320c;

    public j(String str, String str2, Instant instant) {
        this.f188318a = str;
        this.f188319b = str2;
        this.f188320c = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f188318a, jVar.f188318a) && Intrinsics.f(this.f188319b, jVar.f188319b) && Intrinsics.f(this.f188320c, jVar.f188320c);
    }

    public final int hashCode() {
        String str = this.f188318a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f188319b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Instant instant = this.f188320c;
        return iHashCode2 + (instant != null ? instant.hashCode() : 0);
    }
}
