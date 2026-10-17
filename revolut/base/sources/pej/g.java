package pej;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f235391a;

    public g(Intent resultIntent) {
        Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
        this.f235391a = resultIntent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f235391a, ((g) obj2).f235391a);
    }

    public final int hashCode() {
        return this.f235391a.hashCode();
    }
}
