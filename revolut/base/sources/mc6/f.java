package mc6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f204279a;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f204279a, ((f) obj2).f204279a);
    }

    public final int hashCode() {
        return this.f204279a.hashCode();
    }

    public f(Data donationSchedule) {
        Intrinsics.checkNotNullParameter(donationSchedule, "donationSchedule");
        this.f204279a = donationSchedule;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
