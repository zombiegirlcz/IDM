package fu6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import nr6.w;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f138086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f138087b;

    public h(w payments, ArrayList receipts) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(receipts, "receipts");
        this.f138086a = payments;
        this.f138087b = receipts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f138086a, hVar.f138086a) && this.f138087b.equals(hVar.f138087b);
    }

    public final int hashCode() {
        return this.f138087b.hashCode() + (this.f138086a.hashCode() * 31);
    }
}
