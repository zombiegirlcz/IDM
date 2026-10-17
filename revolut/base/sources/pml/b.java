package pml;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f237646a;

    public b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f237646a = intent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f237646a, ((b) obj2).f237646a);
    }

    public final int hashCode() {
        return this.f237646a.hashCode();
    }
}
