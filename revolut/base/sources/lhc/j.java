package lhc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195246b;

    public /* synthetic */ j(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(h.f195244a.getDescriptor(), i, 3);
            throw null;
        }
        this.f195245a = str;
        this.f195246b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f195245a, jVar.f195245a) && Intrinsics.f(this.f195246b, jVar.f195246b);
    }

    public final int hashCode() {
        String str = this.f195245a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f195246b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public j(String str) {
        this.f195245a = "OPEN_URL";
        this.f195246b = str;
    }
}
