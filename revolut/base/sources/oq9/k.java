package oq9;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f227834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f227835c;
    public final ArrayList d;

    public k(String name, long j2, String currency, ArrayList payerIds) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(payerIds, "payerIds");
        this.f227833a = name;
        this.f227834b = j2;
        this.f227835c = currency;
        this.d = payerIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f227833a, kVar.f227833a) && this.f227834b == kVar.f227834b && Intrinsics.f(this.f227835c, kVar.f227835c) && this.d.equals(kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(a0.d.c(this.f227833a.hashCode() * 31, 31, this.f227834b), 31, this.f227835c);
    }
}
