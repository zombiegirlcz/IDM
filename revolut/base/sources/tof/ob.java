package tof;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class ob extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f272974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f272975b;

    public ob(DateTime startedDate, boolean z) {
        Intrinsics.checkNotNullParameter(startedDate, "startedDate");
        this.f272974a = startedDate;
        this.f272975b = z;
    }

    public final boolean a() {
        return this.f272975b;
    }

    public final DateTime b() {
        return this.f272974a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj2;
        return Intrinsics.f(this.f272974a, obVar.f272974a) && this.f272975b == obVar.f272975b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f272975b) + (this.f272974a.hashCode() * 31);
    }
}
