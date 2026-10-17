package af;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3803b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f3802a = str;
        this.f3803b = arrayList;
    }

    public static a a(String str, ArrayList arrayList) {
        return new a(str, arrayList);
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f3802a.equals(aVar.f3802a) && this.f3803b.equals(aVar.f3803b);
    }

    public final int hashCode() {
        return ((this.f3802a.hashCode() ^ 1000003) * 1000003) ^ this.f3803b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f3802a + ", usedDates=" + this.f3803b + "}";
    }
}
