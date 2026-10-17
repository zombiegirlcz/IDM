package gzc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148050c;
    public final String d;

    public z(String title, String message, String buttonTitle, String icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f148048a = title;
        this.f148049b = message;
        this.f148050c = buttonTitle;
        this.d = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f148048a, zVar.f148048a) && Intrinsics.f(this.f148049b, zVar.f148049b) && Intrinsics.f(this.f148050c, zVar.f148050c) && Intrinsics.f(this.d, zVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f148048a.hashCode() * 31, 31, this.f148049b), 31, this.f148050c);
    }
}
