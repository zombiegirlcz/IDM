package cea;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f23446a;

    public h(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f23446a = intent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f23446a, ((h) obj2).f23446a);
    }

    public final int hashCode() {
        return this.f23446a.hashCode();
    }
}
