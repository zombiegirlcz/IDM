package zvc;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325646a;

    public e(String ssid) {
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        this.f325646a = ssid;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f325646a, ((e) obj2).f325646a);
    }

    public final int hashCode() {
        return this.f325646a.hashCode();
    }
}
