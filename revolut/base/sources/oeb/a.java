package oeb;

import cli.j;
import java.time.LocalTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalTime f224568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f224569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f224570c;

    public a(LocalTime selectedTime, List timeValues, int i) {
        Intrinsics.checkNotNullParameter(selectedTime, "selectedTime");
        Intrinsics.checkNotNullParameter(timeValues, "timeValues");
        this.f224568a = selectedTime;
        this.f224569b = timeValues;
        this.f224570c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f224568a, aVar.f224568a) && Intrinsics.f(this.f224569b, aVar.f224569b) && this.f224570c == aVar.f224570c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f224570c) + p.a.d(this.f224568a.hashCode() * 31, 31, this.f224569b);
    }
}
