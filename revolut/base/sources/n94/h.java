package n94;

import kotlin.jvm.internal.Intrinsics;
import my3.p;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f213570b;

    public h(String debtId, p form) {
        Intrinsics.checkNotNullParameter(debtId, "debtId");
        Intrinsics.checkNotNullParameter(form, "form");
        this.f213569a = debtId;
        this.f213570b = form;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f213569a, hVar.f213569a) && Intrinsics.f(this.f213570b, hVar.f213570b);
    }

    public final int hashCode() {
        return this.f213570b.hashCode() + (this.f213569a.hashCode() * 31);
    }
}
