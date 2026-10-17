package a2l;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f908c;

    public i(c icon, Instant instant, String str) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f906a = icon;
        this.f907b = instant;
        this.f908c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f906a, iVar.f906a) && Intrinsics.f(this.f907b, iVar.f907b) && Intrinsics.f(this.f908c, iVar.f908c);
    }

    public final int hashCode() {
        int iHashCode = this.f906a.f896a.hashCode() * 31;
        Instant instant = this.f907b;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        String str = this.f908c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
