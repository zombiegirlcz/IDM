package vzi;

import h30.l;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f293537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f293538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f293539c;
    public final boolean d;

    public a(b category, xi0.b currency, LinkedHashMap attributes, boolean z) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f293537a = category;
        this.f293538b = currency;
        this.f293539c = attributes;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f293537a == aVar.f293537a && Intrinsics.f(this.f293538b, aVar.f293538b) && this.f293539c.equals(aVar.f293539c) && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + r6.b.e(this.f293539c, l.j(this.f293538b, this.f293537a.hashCode() * 31, 31), 31);
    }
}
