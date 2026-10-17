package eh3;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f125717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f125718b;

    public l(Data checklistCollection, boolean z) {
        Intrinsics.checkNotNullParameter(checklistCollection, "checklistCollection");
        this.f125717a = checklistCollection;
        this.f125718b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f125717a, lVar.f125717a) && this.f125718b == lVar.f125718b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125718b) + (this.f125717a.hashCode() * 31);
    }
}
