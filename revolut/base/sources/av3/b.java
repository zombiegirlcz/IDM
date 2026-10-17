package av3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9886c;
    public final String d;

    public b(String title, String description, String primaryButtonTitle, String secondaryButtonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        Intrinsics.checkNotNullParameter(secondaryButtonTitle, "secondaryButtonTitle");
        this.f9884a = title;
        this.f9885b = description;
        this.f9886c = primaryButtonTitle;
        this.d = secondaryButtonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f9884a, bVar.f9884a) && Intrinsics.f(this.f9885b, bVar.f9885b) && Intrinsics.f(this.f9886c, bVar.f9886c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f9884a.hashCode() * 31, 31, this.f9885b), 31, this.f9886c);
    }
}
