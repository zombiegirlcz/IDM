package khj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f184146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184147b;

    public c(List options, String selectedOptionId) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(selectedOptionId, "selectedOptionId");
        this.f184146a = options;
        this.f184147b = selectedOptionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f184146a, cVar.f184146a) && Intrinsics.f(this.f184147b, cVar.f184147b);
    }

    public final int hashCode() {
        return this.f184147b.hashCode() + (this.f184146a.hashCode() * 31);
    }
}
