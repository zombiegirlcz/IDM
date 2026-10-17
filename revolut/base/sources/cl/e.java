package cl;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class e implements Serializable {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f24911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f24913c;
    public final String d;

    public e(g gVar, String str, j jVar, String str2) {
        this.f24911a = gVar;
        this.f24912b = str;
        this.f24913c = jVar;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f24911a, eVar.f24911a) && Intrinsics.f(this.f24912b, eVar.f24912b) && Intrinsics.f(this.f24913c, eVar.f24913c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        g gVar = this.f24911a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        String str = this.f24912b;
        int iHashCode2 = (this.f24913c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "SDKTokenPayload(urls=" + this.f24911a + ", uuid=" + this.f24912b + ", payload=" + this.f24913c + ", issuer=" + this.d + ")";
    }
}
