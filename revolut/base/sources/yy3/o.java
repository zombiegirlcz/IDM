package yy3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f317785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f317786c;

    public o(String title, a1 icon, m action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f317784a = title;
        this.f317785b = icon;
        this.f317786c = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f317784a, oVar.f317784a) && this.f317785b == oVar.f317785b && Intrinsics.f(this.f317786c, oVar.f317786c);
    }

    public final int hashCode() {
        return this.f317786c.hashCode() + ((this.f317785b.hashCode() + (this.f317784a.hashCode() * 31)) * 31);
    }
}
