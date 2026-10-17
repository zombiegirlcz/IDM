package yu3;

import dx4.c1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f316868c;

    public a(c1 icon, String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f316866a = title;
        this.f316867b = description;
        this.f316868c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f316866a, aVar.f316866a) && Intrinsics.f(this.f316867b, aVar.f316867b) && Intrinsics.f(this.f316868c, aVar.f316868c);
    }

    public final int hashCode() {
        return this.f316868c.hashCode() + p.a.c(this.f316866a.hashCode() * 31, 31, this.f316867b);
    }
}
