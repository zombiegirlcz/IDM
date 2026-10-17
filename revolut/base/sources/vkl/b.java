package vkl;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f289986a;

    public b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f289986a = intent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f289986a, ((b) obj2).f289986a);
    }

    public final int hashCode() {
        return this.f289986a.hashCode();
    }
}
