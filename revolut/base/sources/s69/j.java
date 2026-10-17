package s69;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f260172a;

    public j(DateTime dateTime) {
        this.f260172a = dateTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f260172a, ((j) obj2).f260172a);
    }

    public final int hashCode() {
        DateTime dateTime = this.f260172a;
        if (dateTime == null) {
            return 0;
        }
        return dateTime.hashCode();
    }
}
