package ie;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160581b;

    public y(String str, String str2) {
        this.f160580a = str;
        this.f160581b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f160580a, yVar.f160580a) && Intrinsics.f(this.f160581b, yVar.f160581b);
    }

    public final int hashCode() {
        String str = this.f160580a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f160581b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("FirebaseInstallationId(fid=");
        sb6.append(this.f160580a);
        sb6.append(", authToken=");
        return j6.a.u(sb6, this.f160581b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
