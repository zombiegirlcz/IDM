package z3d;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f319251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f319252c;
    public final boolean d;

    public d(String id10, String name, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f319250a = id10;
        this.f319251b = name;
        this.f319252c = items;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f319250a, dVar.f319250a) && Intrinsics.f(this.f319251b, dVar.f319251b) && this.f319252c.equals(dVar.f319252c) && this.d == dVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f319252c, p.a.c(this.f319250a.hashCode() * 31, 31, this.f319251b), 31);
    }
}
