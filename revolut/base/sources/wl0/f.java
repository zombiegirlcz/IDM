package wl0;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f298350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f298351c;
    public final TextView d;

    public f(String title, String authError, String lockedError, TextView titleView) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(authError, "authError");
        Intrinsics.checkNotNullParameter(lockedError, "lockedError");
        Intrinsics.checkNotNullParameter(titleView, "titleView");
        this.f298349a = title;
        this.f298350b = authError;
        this.f298351c = lockedError;
        this.d = titleView;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f298349a, fVar.f298349a) && Intrinsics.f(this.f298350b, fVar.f298350b) && Intrinsics.f(this.f298351c, fVar.f298351c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f298349a.hashCode() * 31, 31, this.f298350b), 31, this.f298351c);
    }
}
