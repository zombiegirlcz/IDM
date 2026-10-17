package e71;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f123018c;

    public a(String title, String description, wi0.b targetCountry) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(targetCountry, "targetCountry");
        this.f123016a = title;
        this.f123017b = description;
        this.f123018c = targetCountry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f123016a, aVar.f123016a) && Intrinsics.f(this.f123017b, aVar.f123017b) && Intrinsics.f(this.f123018c, aVar.f123018c);
    }

    public final int hashCode() {
        return this.f123018c.f297794a.hashCode() + p.a.c(this.f123016a.hashCode() * 31, 31, this.f123017b);
    }
}
