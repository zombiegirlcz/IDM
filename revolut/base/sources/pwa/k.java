package pwa;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f240367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240368b;

    public k(String str, ArrayList invites) {
        Intrinsics.checkNotNullParameter(invites, "invites");
        this.f240367a = invites;
        this.f240368b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f240367a.equals(kVar.f240367a) && Intrinsics.f(this.f240368b, kVar.f240368b);
    }

    public final int hashCode() {
        int iHashCode = this.f240367a.hashCode() * 31;
        String str = this.f240368b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
