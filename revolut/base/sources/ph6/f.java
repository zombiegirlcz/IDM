package ph6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f236230c;

    public f(String title, String str, ArrayList accounts) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        this.f236228a = title;
        this.f236229b = str;
        this.f236230c = accounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f236228a, fVar.f236228a) && Intrinsics.f(this.f236229b, fVar.f236229b) && this.f236230c.equals(fVar.f236230c);
    }

    public final int hashCode() {
        int iHashCode = this.f236228a.hashCode() * 31;
        String str = this.f236229b;
        return this.f236230c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
