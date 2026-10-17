package m4l;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f202773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f202774b;

    public m(l section, ArrayList childGroups) {
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(childGroups, "childGroups");
        this.f202773a = section;
        this.f202774b = childGroups;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f202773a == mVar.f202773a && this.f202774b.equals(mVar.f202774b);
    }

    public final int hashCode() {
        return this.f202774b.hashCode() + (this.f202773a.hashCode() * 31);
    }
}
