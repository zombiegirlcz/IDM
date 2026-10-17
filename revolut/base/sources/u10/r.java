package u10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276324b;

    public r(String title, String tag2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        this.f276323a = title;
        this.f276324b = tag2;
    }

    public final String a() {
        return this.f276324b;
    }

    public final String b() {
        return this.f276323a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f276323a, rVar.f276323a) && Intrinsics.f(this.f276324b, rVar.f276324b);
    }

    public final int hashCode() {
        return this.f276324b.hashCode() + (this.f276323a.hashCode() * 31);
    }
}
