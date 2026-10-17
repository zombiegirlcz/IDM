package yr0;

import android.view.View;
import aw0.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f316085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f316086b;

    public p(View anchor, b0 position) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f316085a = anchor;
        this.f316086b = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f316085a, pVar.f316085a) && this.f316086b == pVar.f316086b;
    }

    public final int hashCode() {
        return this.f316086b.hashCode() + (this.f316085a.hashCode() * 31);
    }
}
