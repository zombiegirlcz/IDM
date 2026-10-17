package nif;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215786c;
    public final Map d;

    public f(String str, String str2, String str3, Map map) {
        this.f215784a = str;
        this.f215785b = str2;
        this.f215786c = str3;
        this.d = map;
    }

    public final Map a() {
        return this.d;
    }

    public final String b() {
        return this.f215785b;
    }

    public final String c() {
        return this.f215784a;
    }

    public final String d() {
        return this.f215786c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f215784a, fVar.f215784a) && Intrinsics.f(this.f215785b, fVar.f215785b) && Intrinsics.f(this.f215786c, fVar.f215786c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        String str = this.f215784a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f215785b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f215786c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map map = this.d;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }
}
