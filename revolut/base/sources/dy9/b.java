package dy9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f121079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f121080c;

    public b(String id10, c type, List settings) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f121078a = id10;
        this.f121079b = type;
        this.f121080c = settings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f121078a, bVar.f121078a) && this.f121079b == bVar.f121079b && Intrinsics.f(this.f121080c, bVar.f121080c);
    }

    public final int hashCode() {
        return this.f121080c.hashCode() + ((this.f121079b.hashCode() + (this.f121078a.hashCode() * 31)) * 31);
    }
}
