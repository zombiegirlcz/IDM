package x15;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f302304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f302305b;

    public w(List loans, v application) {
        Intrinsics.checkNotNullParameter(loans, "loans");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f302304a = loans;
        this.f302305b = application;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f302304a, wVar.f302304a) && Intrinsics.f(this.f302305b, wVar.f302305b);
    }

    public final int hashCode() {
        return this.f302305b.hashCode() + (this.f302304a.hashCode() * 31);
    }
}
