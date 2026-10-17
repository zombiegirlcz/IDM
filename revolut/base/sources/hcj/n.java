package hcj;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f150913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f150914b;

    public n(int i, ArrayList addresses) {
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        this.f150913a = addresses;
        this.f150914b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f150913a.equals(nVar.f150913a) && this.f150914b == nVar.f150914b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f150914b) + (this.f150913a.hashCode() * 31);
    }
}
