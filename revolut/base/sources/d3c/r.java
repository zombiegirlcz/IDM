package d3c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111059c;

    public r(String iconResKey, String title, String description) {
        Intrinsics.checkNotNullParameter(iconResKey, "iconResKey");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f111057a = iconResKey;
        this.f111058b = title;
        this.f111059c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f111057a, rVar.f111057a) && Intrinsics.f(this.f111058b, rVar.f111058b) && Intrinsics.f(this.f111059c, rVar.f111059c);
    }

    public final int hashCode() {
        return this.f111059c.hashCode() + p.a.c(this.f111057a.hashCode() * 31, 31, this.f111058b);
    }
}
