package kl7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185312b;

    public e2(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f185311a = title;
        this.f185312b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj2;
        return Intrinsics.f(this.f185311a, e2Var.f185311a) && Intrinsics.f(this.f185312b, e2Var.f185312b);
    }

    public final int hashCode() {
        return this.f185312b.hashCode() + (this.f185311a.hashCode() * 31);
    }
}
