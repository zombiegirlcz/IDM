package ly8;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f200752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f200753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f200754c;

    public f(Activity activity, boolean z, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f200752a = activity;
        this.f200753b = z;
        this.f200754c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f200752a, fVar.f200752a) && this.f200753b == fVar.f200753b && Intrinsics.f(this.f200754c, fVar.f200754c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f200752a.hashCode() * 31, 31, this.f200753b);
        String str = this.f200754c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
