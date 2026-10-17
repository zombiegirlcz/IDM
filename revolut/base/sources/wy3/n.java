package wy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f301084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f301085c;

    public n(String title, String description, m primaryButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.f301083a = title;
        this.f301084b = description;
        this.f301085c = primaryButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f301083a, nVar.f301083a) && Intrinsics.f(this.f301084b, nVar.f301084b) && Intrinsics.f(this.f301085c, nVar.f301085c);
    }

    public final int hashCode() {
        return this.f301085c.f301082a.hashCode() + p.a.c(this.f301083a.hashCode() * 31, 31, this.f301084b);
    }
}
