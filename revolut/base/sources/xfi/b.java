package xfi;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f305429a;

    public b(DateTime dateTime) {
        this.f305429a = dateTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f305429a, ((b) obj2).f305429a);
    }

    public final int hashCode() {
        DateTime dateTime = this.f305429a;
        if (dateTime == null) {
            return 0;
        }
        return dateTime.hashCode();
    }
}
