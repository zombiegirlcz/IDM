package fr2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137382b;

    public f(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f137381a = title;
        this.f137382b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f137381a, fVar.f137381a) && Intrinsics.f(this.f137382b, fVar.f137382b);
    }

    public final int hashCode() {
        return this.f137382b.hashCode() + (this.f137381a.hashCode() * 31);
    }
}
