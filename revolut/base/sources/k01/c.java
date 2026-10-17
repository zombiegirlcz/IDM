package k01;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f179898a;

    public c(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f179898a = intent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f179898a, ((c) obj2).f179898a);
    }

    public final int hashCode() {
        return this.f179898a.hashCode();
    }
}
