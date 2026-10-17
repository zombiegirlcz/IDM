package lha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f195219c;
    public final o d;
    public final String e;

    public k(String id10, String userId, String contactCode, o role, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(contactCode, "contactCode");
        Intrinsics.checkNotNullParameter(role, "role");
        this.f195217a = id10;
        this.f195218b = userId;
        this.f195219c = contactCode;
        this.d = role;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f195217a, kVar.f195217a) && Intrinsics.f(this.f195218b, kVar.f195218b) && Intrinsics.f(this.f195219c, kVar.f195219c) && this.d == kVar.d && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f195217a.hashCode() * 31, 31, this.f195218b), 31, this.f195219c)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
