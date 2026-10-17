package cv3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f109254c;
    public final String d;

    public e(String title, String description, h type, String icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f109252a = title;
        this.f109253b = description;
        this.f109254c = type;
        this.d = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f109252a, eVar.f109252a) && Intrinsics.f(this.f109253b, eVar.f109253b) && this.f109254c == eVar.f109254c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f109254c.hashCode() + p.a.c(this.f109252a.hashCode() * 31, 31, this.f109253b)) * 31);
    }
}
