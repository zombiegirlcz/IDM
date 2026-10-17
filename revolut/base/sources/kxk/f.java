package kxk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f190599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f190600b;

    public f() {
        this(0);
    }

    public static f a(f fVar, Data schedules, j scheduleSelection, int i) {
        if ((i & 1) != 0) {
            schedules = fVar.f190599a;
        }
        if ((i & 2) != 0) {
            scheduleSelection = fVar.f190600b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(schedules, "schedules");
        Intrinsics.checkNotNullParameter(scheduleSelection, "scheduleSelection");
        return new f(schedules, scheduleSelection);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f190599a, fVar.f190599a) && this.f190600b == fVar.f190600b;
    }

    public final int hashCode() {
        return this.f190600b.hashCode() + (this.f190599a.hashCode() * 31);
    }

    public f(Data schedules, j scheduleSelection) {
        Intrinsics.checkNotNullParameter(schedules, "schedules");
        Intrinsics.checkNotNullParameter(scheduleSelection, "scheduleSelection");
        this.f190599a = schedules;
        this.f190600b = scheduleSelection;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, false, 7, null), j.MAIN_ASSET);
    }
}
