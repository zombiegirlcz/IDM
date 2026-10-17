package h93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f150096c;

    public b(String title, String description, a action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f150094a = title;
        this.f150095b = description;
        this.f150096c = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f150094a, bVar.f150094a) && Intrinsics.f(this.f150095b, bVar.f150095b) && Intrinsics.f(this.f150096c, bVar.f150096c);
    }

    public final int hashCode() {
        return this.f150096c.hashCode() + p.a.c(this.f150094a.hashCode() * 31, 31, this.f150095b);
    }
}
