package mv3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f209116b;

    public d(String text, c action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f209115a = text;
        this.f209116b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f209115a, dVar.f209115a) && this.f209116b == dVar.f209116b;
    }

    public final int hashCode() {
        return this.f209116b.hashCode() + (this.f209115a.hashCode() * 31);
    }
}
