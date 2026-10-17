package iw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f168895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f168896b;

    public j(Clause name, Clause value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f168895a = name;
        this.f168896b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f168895a.equals(jVar.f168895a) && this.f168896b.equals(jVar.f168896b);
    }

    public final int hashCode() {
        return this.f168896b.hashCode() + (this.f168895a.hashCode() * 31);
    }
}
