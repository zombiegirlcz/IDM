package rua;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f257508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f257509b;

    public d(c name, Map account) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(account, "account");
        this.f257508a = name;
        this.f257509b = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f257508a, dVar.f257508a) && Intrinsics.f(this.f257509b, dVar.f257509b);
    }

    public final int hashCode() {
        return this.f257509b.hashCode() + (this.f257508a.hashCode() * 31);
    }
}
