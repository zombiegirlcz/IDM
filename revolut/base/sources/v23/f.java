package v23;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f285630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f285631b;

    public f(List suggestedNames, String str) {
        Intrinsics.checkNotNullParameter(suggestedNames, "suggestedNames");
        this.f285630a = suggestedNames;
        this.f285631b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f285630a, fVar.f285630a) && Intrinsics.f(this.f285631b, fVar.f285631b);
    }

    public final int hashCode() {
        int iHashCode = this.f285630a.hashCode() * 31;
        String str = this.f285631b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
