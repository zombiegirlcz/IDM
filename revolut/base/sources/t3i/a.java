package t3i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f267785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f267786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f267787c;

    public a(String language, String region, String model) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f267785a = language;
        this.f267786b = region;
        this.f267787c = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f267785a, aVar.f267785a) && Intrinsics.f(this.f267786b, aVar.f267786b) && Intrinsics.f(this.f267787c, aVar.f267787c);
    }

    public final int hashCode() {
        return this.f267787c.hashCode() + p.a.c(this.f267785a.hashCode() * 31, 31, this.f267786b);
    }
}
