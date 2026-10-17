package svi;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f265920a;

    public i(Map weeklySchedule) {
        Intrinsics.checkNotNullParameter(weeklySchedule, "weeklySchedule");
        this.f265920a = weeklySchedule;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f265920a, ((i) obj2).f265920a);
    }

    public final int hashCode() {
        return this.f265920a.hashCode();
    }
}
