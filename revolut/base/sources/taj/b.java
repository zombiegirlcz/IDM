package taj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f269343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f269344c;

    public b(String title, String description, String icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f269342a = title;
        this.f269343b = description;
        this.f269344c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f269342a, bVar.f269342a) && Intrinsics.f(this.f269343b, bVar.f269343b) && Intrinsics.f(this.f269344c, bVar.f269344c);
    }

    public final int hashCode() {
        return this.f269344c.hashCode() + p.a.c(this.f269342a.hashCode() * 31, 31, this.f269343b);
    }
}
