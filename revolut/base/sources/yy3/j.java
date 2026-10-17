package yy3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f317780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f317781c;
    public final ArrayList d;

    public j(String title, String description, String buttonTitle, ArrayList methods) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(methods, "methods");
        this.f317779a = title;
        this.f317780b = description;
        this.f317781c = buttonTitle;
        this.d = methods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f317779a, jVar.f317779a) && Intrinsics.f(this.f317780b, jVar.f317780b) && Intrinsics.f(this.f317781c, jVar.f317781c) && this.d.equals(jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f317779a.hashCode() * 31, 31, this.f317780b), 31, this.f317781c);
    }
}
