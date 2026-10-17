package rc;

import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f253180b;

    public w(String str, Set set) {
        this.f253179a = str;
        this.f253180b = set;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof w) {
            w wVar = (w) obj2;
            String str = wVar.f253179a;
            String str2 = this.f253179a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f253180b.equals(wVar.f253180b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f253179a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f253180b.hashCode();
    }

    public final String toString() {
        return j6.a.w(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.f253179a, ", verdictOptOut=", this.f253180b.toString(), "}");
    }
}
