package ly6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f200709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f200710c;

    public e(boolean z, List reminders) {
        Intrinsics.checkNotNullParameter(reminders, "reminders");
        this.f200709b = z;
        this.f200710c = reminders;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f200709b == eVar.f200709b && Intrinsics.f(this.f200710c, eVar.f200710c);
    }

    public final int hashCode() {
        return this.f200710c.hashCode() + (Boolean.hashCode(this.f200709b) * 31);
    }
}
