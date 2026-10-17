package tvc;

import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.api.navigation.SecurityDelayType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecurityDelayType f274745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f274746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f274747c;

    public d(SecurityDelayType type, boolean z, Data securityDelayInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(securityDelayInfo, "securityDelayInfo");
        this.f274745a = type;
        this.f274746b = z;
        this.f274747c = securityDelayInfo;
    }

    public static d a(d dVar, Data securityDelayInfo, int i) {
        SecurityDelayType type = dVar.f274745a;
        boolean z = (i & 2) != 0 ? dVar.f274746b : true;
        if ((i & 4) != 0) {
            securityDelayInfo = dVar.f274747c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(securityDelayInfo, "securityDelayInfo");
        return new d(type, z, securityDelayInfo);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f274745a, dVar.f274745a) && this.f274746b == dVar.f274746b && Intrinsics.f(this.f274747c, dVar.f274747c);
    }

    public final int hashCode() {
        return this.f274747c.hashCode() + j6.a.c(this.f274745a.hashCode() * 31, 31, this.f274746b);
    }
}
