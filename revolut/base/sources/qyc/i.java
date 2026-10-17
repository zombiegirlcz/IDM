package qyc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f250275a;

    public i(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f250275a = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f250275a, ((i) obj2).f250275a);
    }

    public final int hashCode() {
        return this.f250275a.hashCode();
    }
}
