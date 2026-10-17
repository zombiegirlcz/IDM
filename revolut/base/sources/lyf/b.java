package lyf;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f200817c;

    public b(String id10, String name, ArrayList experiences) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        this.f200815a = id10;
        this.f200816b = name;
        this.f200817c = experiences;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f200815a, bVar.f200815a) && Intrinsics.f(this.f200816b, bVar.f200816b) && this.f200817c.equals(bVar.f200817c);
    }

    public final int hashCode() {
        return this.f200817c.hashCode() + p.a.c(this.f200815a.hashCode() * 31, 31, this.f200816b);
    }
}
