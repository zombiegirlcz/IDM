package cv3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dx4.a f109274b;

    public w(String text, dx4.a action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f109273a = text;
        this.f109274b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f109273a, wVar.f109273a) && Intrinsics.f(this.f109274b, wVar.f109274b);
    }

    public final int hashCode() {
        return this.f109274b.f120542a.hashCode() + (this.f109273a.hashCode() * 31);
    }
}
