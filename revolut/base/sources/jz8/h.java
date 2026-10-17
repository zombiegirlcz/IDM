package jz8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f179618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f179619b;

    public h(f category, List courses) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(courses, "courses");
        this.f179618a = category;
        this.f179619b = courses;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f179618a, hVar.f179618a) && Intrinsics.f(this.f179619b, hVar.f179619b);
    }

    public final int hashCode() {
        return this.f179619b.hashCode() + (this.f179618a.hashCode() * 31);
    }
}
