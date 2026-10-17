package g57;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od0.i f140668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fs6.e f140669b;

    public f(od0.i vatReminder, fs6.e vatReminderOptions) {
        Intrinsics.checkNotNullParameter(vatReminder, "vatReminder");
        Intrinsics.checkNotNullParameter(vatReminderOptions, "vatReminderOptions");
        this.f140668a = vatReminder;
        this.f140669b = vatReminderOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f140668a, fVar.f140668a) && Intrinsics.f(this.f140669b, fVar.f140669b);
    }

    public final int hashCode() {
        return this.f140669b.hashCode() + (this.f140668a.hashCode() * 31);
    }
}
