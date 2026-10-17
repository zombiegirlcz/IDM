package bxf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19676b;

    public d(String id10, String value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f19675a = id10;
        this.f19676b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f19675a, dVar.f19675a) && Intrinsics.f(this.f19676b, dVar.f19676b);
    }

    public final int hashCode() {
        return this.f19676b.hashCode() + (this.f19675a.hashCode() * 31);
    }
}
