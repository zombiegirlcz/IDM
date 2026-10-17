package kf8;

import com.revolut.feature.address.models.Address;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f183321c;
    public final LinkedHashMap d;
    public final Address e;
    public final i f;

    public e(String individualId, String firstName, String lastName, LinkedHashMap linkedHashMap, Address address, i serviceType) {
        Intrinsics.checkNotNullParameter(individualId, "individualId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        this.f183319a = individualId;
        this.f183320b = firstName;
        this.f183321c = lastName;
        this.d = linkedHashMap;
        this.e = address;
        this.f = serviceType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f183319a.equals(eVar.f183319a) && Intrinsics.f(this.f183320b, eVar.f183320b) && Intrinsics.f(this.f183321c, eVar.f183321c) && this.d.equals(eVar.d) && Intrinsics.f(this.e, eVar.e) && this.f == eVar.f;
    }

    public final int hashCode() {
        int iE = r6.b.e(this.d, p.a.c(p.a.c(this.f183319a.hashCode() * 31, 31, this.f183320b), 31, this.f183321c), 31);
        Address address = this.e;
        return this.f.hashCode() + ((iE + (address == null ? 0 : address.hashCode())) * 31);
    }
}
