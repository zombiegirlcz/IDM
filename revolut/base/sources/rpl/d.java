package rpl;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f256421a;

    public d(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f256421a = intent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f256421a, ((d) obj2).f256421a);
    }

    public final int hashCode() {
        return this.f256421a.hashCode();
    }
}
