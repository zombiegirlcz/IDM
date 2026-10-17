package tyd;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f275555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f275556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f275557c;

    public d(DateTime selectedStartDate, DateTime selectedEndDate, c launchMode) {
        Intrinsics.checkNotNullParameter(selectedStartDate, "selectedStartDate");
        Intrinsics.checkNotNullParameter(selectedEndDate, "selectedEndDate");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.f275555a = selectedStartDate;
        this.f275556b = selectedEndDate;
        this.f275557c = launchMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f275555a, dVar.f275555a) && Intrinsics.f(this.f275556b, dVar.f275556b) && this.f275557c == dVar.f275557c;
    }

    public final int hashCode() {
        return this.f275557c.hashCode() + m72.b.f(this.f275556b, this.f275555a.hashCode() * 31, 31);
    }
}
