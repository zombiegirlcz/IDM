package cci;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23122c;
    public final String d;
    public final String e;

    public j(String id10, String title, String icon, String imageName, List purposes) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        this.f23120a = id10;
        this.f23121b = purposes;
        this.f23122c = title;
        this.d = icon;
        this.e = imageName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f23120a, jVar.f23120a) && Intrinsics.f(this.f23121b, jVar.f23121b) && Intrinsics.f(this.f23122c, jVar.f23122c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.d(this.f23120a.hashCode() * 31, 31, this.f23121b), 31, this.f23122c), 31, this.d);
    }
}
