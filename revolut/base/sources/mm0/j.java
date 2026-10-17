package mm0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass f207110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f207111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f207112c;
    public final String d;
    public final String e;

    public j(KClass type, String value, Long l2, String str, String owner) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f207110a = type;
        this.f207111b = value;
        this.f207112c = l2;
        this.d = str;
        this.e = owner;
    }

    public final Long a() {
        return this.f207112c;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final KClass d() {
        return this.f207110a;
    }

    public final String e() {
        return this.f207111b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f207110a, jVar.f207110a) && Intrinsics.f(this.f207111b, jVar.f207111b) && Intrinsics.f(this.f207112c, jVar.f207112c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f207110a.hashCode() * 31, 31, this.f207111b);
        Long l2 = this.f207112c;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
