package vn3;

import cli.j;
import com.revolut.feature.cooldown_checker.api.UserActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserActivity f290739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f290740b;

    public d(UserActivity userActivity, long j2) {
        Intrinsics.checkNotNullParameter(userActivity, "userActivity");
        this.f290739a = userActivity;
        this.f290740b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f290739a == dVar.f290739a && this.f290740b == dVar.f290740b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f290740b) + (this.f290739a.hashCode() * 31);
    }
}
