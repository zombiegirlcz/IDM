package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113529c;

    public e1(String title, String assetUri, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(assetUri, "assetUri");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f113527a = title;
        this.f113528b = assetUri;
        this.f113529c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f113527a, e1Var.f113527a) && Intrinsics.f(this.f113528b, e1Var.f113528b) && Intrinsics.f(this.f113529c, e1Var.f113529c);
    }

    public final int hashCode() {
        return this.f113529c.hashCode() + p.a.c(this.f113527a.hashCode() * 31, 31, this.f113528b);
    }
}
