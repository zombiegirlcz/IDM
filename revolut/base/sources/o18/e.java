package o18;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f221351a;

    public e(ArrayList notifications) {
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        this.f221351a = notifications;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f221351a.equals(((e) obj2).f221351a);
    }

    public final int hashCode() {
        return this.f221351a.hashCode();
    }
}
