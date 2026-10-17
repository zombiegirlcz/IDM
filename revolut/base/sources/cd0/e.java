package cd0;

import kotlin.jvm.internal.Intrinsics;
import xl2.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f23145b;

    public e(String screenId, h0 item) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f23144a = screenId;
        this.f23145b = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f23144a, eVar.f23144a) && Intrinsics.f(this.f23145b, eVar.f23145b);
    }

    public final int hashCode() {
        return this.f23145b.hashCode() + (this.f23144a.hashCode() * 31);
    }
}
