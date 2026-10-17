package fo3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f136807b;

    public f(String walletId, ArrayList pocketUpdates) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(pocketUpdates, "pocketUpdates");
        this.f136806a = walletId;
        this.f136807b = pocketUpdates;
    }

    public final List a() {
        return this.f136807b;
    }

    public final String b() {
        return this.f136806a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f136806a, fVar.f136806a) && this.f136807b.equals(fVar.f136807b);
    }

    public final int hashCode() {
        return this.f136807b.hashCode() + (this.f136806a.hashCode() * 31);
    }
}
