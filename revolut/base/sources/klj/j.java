package klj;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f185639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f185640b;

    public j(Clause title, Clause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f185639a = title;
        this.f185640b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f185639a, jVar.f185639a) && Intrinsics.f(this.f185640b, jVar.f185640b);
    }

    public final int hashCode() {
        return this.f185640b.hashCode() + (this.f185639a.hashCode() * 31);
    }
}
