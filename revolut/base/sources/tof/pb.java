package tof;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class pb extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f272998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f272999b;

    public pb(DateTime startedDate, boolean z) {
        Intrinsics.checkNotNullParameter(startedDate, "startedDate");
        this.f272998a = startedDate;
        this.f272999b = z;
    }

    public final boolean a() {
        return this.f272999b;
    }

    public final DateTime b() {
        return this.f272998a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pb)) {
            return false;
        }
        pb pbVar = (pb) obj2;
        return Intrinsics.f(this.f272998a, pbVar.f272998a) && this.f272999b == pbVar.f272999b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f272999b) + (this.f272998a.hashCode() * 31);
    }
}
