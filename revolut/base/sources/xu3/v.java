package xu3;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f308945c;
    public final List d;
    public final q e;

    public v(String title, String description, t icon, List tags, q action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f308943a = title;
        this.f308944b = description;
        this.f308945c = icon;
        this.d = tags;
        this.e = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f308943a, vVar.f308943a) && Intrinsics.f(this.f308944b, vVar.f308944b) && Intrinsics.f(this.f308945c, vVar.f308945c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d((this.f308945c.hashCode() + p.a.c(this.f308943a.hashCode() * 31, 31, this.f308944b)) * 31, 31, this.d);
    }
}
