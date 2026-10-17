package ao3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7897c;

    public a() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f7895a, aVar.f7895a) && Intrinsics.f(this.f7896b, aVar.f7896b);
    }

    public final int hashCode() {
        String str = this.f7895a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7896b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public a(String str, String str2) {
        this.f7895a = str;
        this.f7896b = str2;
        this.f7897c = str2 == null ? "" : str2;
    }
}
