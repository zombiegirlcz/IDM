package drk;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117168c;
    public final g d;
    public final ArrayList e;

    public f(String id10, String title, String type, g gVar, ArrayList subItems) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(subItems, "subItems");
        this.f117166a = id10;
        this.f117167b = title;
        this.f117168c = type;
        this.d = gVar;
        this.e = subItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f117166a, fVar.f117166a) && Intrinsics.f(this.f117167b, fVar.f117167b) && this.f117168c.equals(fVar.f117168c) && Intrinsics.f(this.d, fVar.d) && this.e.equals(fVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f117166a.hashCode() * 31, 31, this.f117167b), 31, this.f117168c);
        g gVar = this.d;
        return this.e.hashCode() + ((iC + (gVar == null ? 0 : gVar.hashCode())) * 31);
    }
}
