package cl;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class g implements Serializable {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24915b;

    public g(String str, String str2) {
        this.f24914a = str;
        this.f24915b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f24914a, gVar.f24914a) && Intrinsics.f(this.f24915b, gVar.f24915b);
    }

    public final int hashCode() {
        String str = this.f24914a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f24915b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return j6.a.s("SDKTokenUrl(baseUrl=", this.f24914a, ", authUrl=", this.f24915b, ")");
    }
}
